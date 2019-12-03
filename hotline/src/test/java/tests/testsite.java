package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class testsite {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();driver.get("https://hotline.ua/");
        WebElement okButton = driver.findElement(By.cssSelector(".btn-graphite.m_b-md"));
        okButton.click();
        driver.manage().timeouts(). setScriptTimeout (10, TimeUnit.SECONDS);

        driver.findElement(By.id("searchbox")).sendKeys("телевизор" + Keys.ENTER);
        WebElement element1 = (WebElement) driver.findElements(By.linkText("СРАВНИТЬ ЦЕНЫ"));
        element1.click();
    }
}
