package base;

import driver.DriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        DriverFactory.initDriver();
        DriverFactory.getDriver().get("https://example.com/login");
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
