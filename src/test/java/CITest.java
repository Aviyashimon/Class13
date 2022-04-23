import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CITest {
    private static ChromeDriver driver;
    private final String word = "hello";

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "XXXXXXXXXXX");
        driver = new ChromeDriver();
        driver.get("https://dgotlieb.github.io/JavaCI/index.html");
    }

    @Test
    public void test01_enterText() {
        driver.findElement(By.id("XXXXXXXXXXXXX")).sendKeys(word);
    }

    @Test
    public void test02_clickButton() {
        driver.findElement(By.id("XXXXXXXXXXXXX")).click();
    }

    @Test
    public void test03_assertText() {
        WebElement divElement = driver.findElement(By.id("XXXXXXXXXXXXX"));
        Assert.assertEquals(divElement.getAttribute("value"), word);
    }

    @AfterClass
    public static void afterClass() {
        driver.quit();
    }
}
