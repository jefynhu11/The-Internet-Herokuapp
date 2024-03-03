package framework.support;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import framework.webDrivers.webDrivers.DriverFactory;
import framework.webDrivers.webDrivers.DriverManager;
import framework.webDrivers.webDrivers.Drivers;

public class BaseTest extends DriverFactory {
    @BeforeClass
    public static void setUp() {
        DriverManager.setDriver(getBrower(Drivers.CHROME));
    }

    @AfterClass
    public static void tearDown() {
        DriverManager.quit();
    }

}
