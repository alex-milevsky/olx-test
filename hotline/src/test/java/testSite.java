import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testSite {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();driver.get("https://www.olx.ua/");
        driver.findElement(By.id("headerSearch")).sendKeys("телевизор samsung" + Keys.ENTER);
    }
}
