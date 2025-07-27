import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseTest {

    WebDriver webDriver;

    @BeforeSuite
    public void initDriver() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @Test
    public void googleTest() {
        webDriver.get("https://google.com");
    }
}
