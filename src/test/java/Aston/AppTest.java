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

public class AppTest{
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

     @Test
     public void testCheckRefillTitle(){
        WebElement refillBlock = driver.findElement(By.className("pay__wrapper"));
        String blockTitle = refillBlock.getText();
        Assertions.assertTrue(blockTitle.contains("Онлайн пополнение\n" + "без комиссии"));
    }

    @Test
    public void testCheckLogos(){
        WebElement logos = driver.findElement(By.className("pay__partners"));
        Assertions.assertTrue(logos.isDisplayed());
    }

    @Test
    public void testCheckButtonContinue() {
        WebElement inputPhone = driver.findElement(By.id("connection-phone"));
        WebElement inputSum = driver.findElement(By.id("connection-sum"));
        WebElement buttonContinue = driver.findElement(By.cssSelector("#pay-connection > button"));
        inputPhone.click();
        inputPhone.sendKeys("297777777");
        inputSum.click();
        inputSum.sendKeys("300");
        buttonContinue.click();
    }

    @Test
    public void testCheckLink(){

        WebElement link = driver.findElement(By.linkText("Подробнее о сервисе"));
        link.click();
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertNotEquals(url, currentUrl);
 }

    @AfterEach
    public void testClose(){
        driver.quit();
   }
}





