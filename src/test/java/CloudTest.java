import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class CloudTest {
    private static RemoteWebDriver driver;

    @BeforeClass
    public static void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("username", "aviya");
        capabilities.setCapability("accessKey", "923b7082-1776-44c9-9718-851284522337");
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("platform", "Windows 10");
        capabilities.setCapability("version", "92");
        capabilities.setCapability("build", "Test1");
        capabilities.setCapability("name", "3-cross-browser");
        driver = new RemoteWebDriver(new URL("https://aviya:923b7082-1776-44c9-9718-851284522337@ondemand.us-west-1.saucelabs.com:443/wd/hub"), capabilities);
    }

    @Test
    public void simpleTest(){
        driver.get("https://translate.google.com");
        //driver.findElement(By.className("er8xn")).sendKeys("Hello");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}