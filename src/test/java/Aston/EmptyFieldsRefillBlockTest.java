package Aston;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmptyFieldsRefillBlockTest{
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
    public void testCheckFieldsCommunicationServices(){
        WebElement selectedService = driver.findElement(By.xpath("//*[@id=\'pay\']/option[1]"));
        WebElement inputPhone = driver.findElement(By.id("connection-phone"));
        WebElement inputSum = driver.findElement(By.id("connection-sum"));
        WebElement inputEmail = driver.findElement(By.id("connection-email"));
        String phonePlaceholder = inputPhone.getAttribute("placeholder");
        String sumPlaceholder = inputSum.getAttribute("placeholder");
        String emailPlaceholder = inputEmail.getAttribute("placeholder");
        Assertions.assertTrue(phonePlaceholder.contains("Номер телефона"));
        Assertions.assertTrue(sumPlaceholder.contains("Сумма"));
        Assertions.assertTrue(emailPlaceholder.contains("E-mail для отправки чека"));
    }

    @Test
    public void testCheckFieldsHomeInternet(){
        WebElement selectedService = driver.findElement(By.xpath("//*[@id=\'pay-section\']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button"));
        WebElement anotherService = driver.findElement(By.xpath("//*[@id=\'pay-section\']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]/p"));
        selectedService.click();
        anotherService.click();
        WebElement inputNumber = driver.findElement(By.id("internet-phone"));
        WebElement inputSum = driver.findElement(By.id("connection-sum"));
        WebElement inputEmail = driver.findElement(By.id("connection-email"));
        String NumberPlaceholder = inputNumber.getAttribute("placeholder");
        String sumPlaceholder = inputSum.getAttribute("placeholder");
        String emailPlaceholder = inputEmail.getAttribute("placeholder");
        Assertions.assertTrue(NumberPlaceholder.contains("Номер абонента"));
        Assertions.assertTrue(sumPlaceholder.contains("Сумма"));
        Assertions.assertTrue(emailPlaceholder.contains("E-mail для отправки чека"));

    }

    @Test
    public void testCheckFieldsInstallment() {
        WebElement selectedService = driver.findElement(By.xpath("//*[@id=\'pay-section\']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button"));
        WebElement anotherService = driver.findElement(By.xpath("//*[@id=\'pay-section\']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[3]/p"));
        selectedService.click();
        anotherService.click();
        WebElement inputScore = driver.findElement(By.id("score-instalment"));
        WebElement inputSum = driver.findElement(By.id("instalment-sum"));
        WebElement inputEmail = driver.findElement(By.id("instalment-email"));
        String ScorePlaceholder = inputScore.getAttribute("placeholder");
        String sumPlaceholder = inputSum.getAttribute("placeholder");
        String emailPlaceholder = inputEmail.getAttribute("placeholder");
        Assertions.assertTrue(ScorePlaceholder.contains("Номер счета на 44"));
        Assertions.assertTrue(sumPlaceholder.contains("Сумма"));
        Assertions.assertTrue(emailPlaceholder.contains("E-mail для отправки чека"));
    }

    @Test
    public void testCheckFieldsDebt() {
        WebElement selectedService = driver.findElement(By.xpath("//*[@id=\'pay-section\']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button"));
        WebElement anotherService = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[4]/p"));
        selectedService.click();
        anotherService.click();
        WebElement inputScore = driver.findElement(By.id("score-arrears"));
        WebElement inputSum = driver.findElement(By.id("arrears-sum"));
        WebElement inputEmail = driver.findElement(By.id("arrears-email"));
        String ScorePlaceholder = inputScore.getAttribute("placeholder");
        String sumPlaceholder = inputSum.getAttribute("placeholder");
        String emailPlaceholder = inputEmail.getAttribute("placeholder");
        Assertions.assertTrue(ScorePlaceholder.contains("Номер счета на 2073"));
        Assertions.assertTrue(sumPlaceholder.contains("Сумма"));
        Assertions.assertTrue(emailPlaceholder.contains("E-mail для отправки чека"));
    }

    @AfterEach
    public void testClose(){
        driver.quit();
    }
}
