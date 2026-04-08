import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void loginTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/login");

        driver.findElement(By.id("username")).sendKeys("test_user");
        driver.findElement(By.id("password")).sendKeys("password123");
        driver.findElement(By.id("loginBtn")).click();

        driver.quit();
    }
}

