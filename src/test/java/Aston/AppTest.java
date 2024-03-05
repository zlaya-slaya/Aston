package Aston;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.containsString;
import java.util.regex.Pattern;

public class AppTest {
    @Test
    public void testGetRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("/get")
                .then().log().all()
                .assertThat()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-amzn-trace-id", containsString("Root="))
                .body("headers.accept", equalTo("*/*"))
                .body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"));
    }

    @Test
    public void testPostRawText() {
        given()
                .baseUri("https://postman-echo.com")
                .body("{\n    \"test\": \"value\"\n}")
                .when()
                .post("/post")
                .then().log().all()
                .assertThat()
                .statusCode(200)
                .body("data", equalTo("{\n    \"test\": \"value\"\n}"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-amzn-trace-id", containsString("Root="))
                .body("headers.content-length", equalTo("23"))
                .body("headers.content-type", containsString("text/plain"))
                .body("headers.accept", equalTo("*/*"))
                .body("json", equalTo(null))
                .body("url", equalTo("https://postman-echo.com/post"));
    }

    @Test
    public void testPostFormData() {
        given()
                .baseUri("https://postman-echo.com")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .header("Content-Type", "application/x-www-form-urlencoded; charset=utf-8")
                .when()
                .post("/post")
                .then().log().all()
                .assertThat()
                .statusCode(200)
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.host", equalTo("postman-echo.com"))
                .and().body("headers.x-amzn-trace-id", containsString("Root="))
                .body("headers.content-length", equalTo("19"))
                .body("headers.accept", equalTo("*/*"))
                .body("json.foo1", equalTo("bar1"))
                .body("json.foo2", equalTo("bar2"))
                .body("url", equalTo("https://postman-echo.com/post"));
    }

    @Test
    public void testPutRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain")
                .body("This is expected to be sent back as part of response body.")
                .when()
                .put("/put")
                .then().log().all()
                .assertThat()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-amzn-trace-id", containsString("Root="))
                .body("headers.content-length", equalTo("58"))
                .body("headers.content-type", containsString("text/plain"))
                .body("headers.accept", equalTo("*/*"))
                .body("json", equalTo(null))
                .body("url", equalTo("https://postman-echo.com/put"));
    }

    @Test
    public void testPatchRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain")
                .body("This is expected to be sent back as part of response body.")
                .when()
                .patch("/patch")
                .then().log().all()
                .assertThat()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-amzn-trace-id", containsString("Root="))
                .body("headers.content-length", equalTo("58"))
                .body("headers.content-type", containsString("text/plain"))
                .body("headers.accept", equalTo("*/*"))
                .body("json", equalTo(null))
                .body("url", equalTo("https://postman-echo.com/patch"));
    }

    @Test
    public void testDeleteRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain")
                .body("This is expected to be sent back as part of response body.")
                .when()
                .delete("/delete")
                .then().log().all()
                .assertThat()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-amzn-trace-id", containsString("Root="))
                .body("headers.content-length", equalTo("58"))
                .body("headers.content-type", containsString("text/plain"))
                .body("headers.accept", equalTo("*/*"))
                .body("json", equalTo(null))
                .body("url", equalTo("https://postman-echo.com/delete"));
    }
}

