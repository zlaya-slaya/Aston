package Aston;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class PaymentTest{
    private WebDriver driver;
    private String url;

    @BeforeEach
    public void testSetup(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        url = "https://mts.by";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement cookie = driver.findElement(By.xpath("//button[@id= 'cookie-agree']"));
        cookie.click();
    }

    @BeforeEach
    public void testCheckButtonContinue() {
        WebElement inputPhone = driver.findElement(By.id("connection-phone"));
        WebElement inputSum = driver.findElement(By.id("connection-sum"));
        WebElement buttonContinue = driver.findElement(By.cssSelector("#pay-connection > button"));
        inputPhone.click();
        inputPhone.sendKeys("297777777");
        inputSum.click();
        inputSum.sendKeys("400");
        buttonContinue.click();
        WebElement iframe = driver.findElement(By.cssSelector("body > div.bepaid-app > div > iframe"));
        driver.switchTo().frame(iframe);
    }

    @Test
    public void testCheckSum(){
        WebElement sumOnHeader = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/app-header/header/div/div/div"));
        WebElement sumOnbutton = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/section/app-card-page/div/div[1]/button"));
        Assertions.assertTrue(sumOnHeader.getAttribute("innerText").contains("400"));
        Assertions.assertTrue(sumOnbutton.getAttribute("innerText").contains("400"));
    }

    @Test
    public void testCheckPhone(){
        WebElement paymentInfo = driver.findElement(By.cssSelector("body > app-root > div > div > app-payment-container > app-header > header > div > div > p"));
        Assertions.assertTrue(paymentInfo.getAttribute("innerText").contains("297777777"));
    }

    @Test
    public void testEmptyFieldsCard(){
        WebElement cardNumber = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/section/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[1]/label"));
        WebElement validity = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/section/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[1]/app-input/div/div/div[1]"));
        WebElement cvc = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/section/app-card-page/div/div[1]/app-card-input/form/div[1]/div[2]/div[3]/app-input/div/div/div[1]"));
        WebElement name = driver.findElement(By.xpath("/html/body/app-root/div/div/app-payment-container/section/app-card-page/div/div[1]/app-card-input/form/div[1]/div[3]/app-input/div/div/div[1]"));
        Assertions.assertTrue(cardNumber.getAttribute("innerText").contains("Номер карты"));
        Assertions.assertTrue(validity.getAttribute("innerText").contains("Срок действия"));
        Assertions.assertTrue(cvc.getAttribute("innerText").contains("CVC"));
        Assertions.assertTrue(name.getAttribute("innerText").contains("Имя держателя (как на карте)"));
    }

    @Test
    public void testCheckLogos(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement logos = driver.findElement(By.cssSelector("body > app-root > div > div > app-payment-container > section > app-card-page > div > div.card-page__card > app-card-input > form > div.card.ng-tns-c53-0 > div:nth-child(1) > app-input > div > div > div.icons-container.ng-tns-c47-1 > div"));
        Assertions.assertTrue(logos.isDisplayed());
    }

    @AfterEach
    public void testClose(){
        driver.quit();
    }
}
