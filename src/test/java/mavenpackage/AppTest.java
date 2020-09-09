package mavenpackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {
    
    @Test
    public void sampleTestMethod() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://wwwtest.fedex.com/en-jp/home.html");
        driver.findElement(By.id("fxg-dropdown-signIn")).click();
        driver.findElement(By.id("NavLoginUserId")).sendKeys("MAGICJP");
        driver.findElement(By.id("NavLoginPassword")).sendKeys("Test1234");
        System.out.println("Successful Run of Test Case");
        driver.quit();
    }
}
