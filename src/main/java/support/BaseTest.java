package support;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import webDrivers.DriverFactory;
import webDrivers.DriverManager;
import webDrivers.Drivers;

public class BaseTest extends DriverFactory {

    @BeforeClass
    public static void setUp() {
        driver = getBrower(Drivers.CHROME);
        DriverManager.setDriver(driver);
        DriverManager.getDriver();
//        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() {
        DriverManager.quit();
    }

}
