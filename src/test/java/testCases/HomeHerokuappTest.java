package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import support.BaseTest;
import tasks.HomeHerokuappTask;
import webDrivers.DriverManager;

public class HomeHerokuappTest extends BaseTest {
    private final WebDriver driver = DriverManager.getDriver();
    private final HomeHerokuappTask homeHerokuappTask = new HomeHerokuappTask(driver);

    @Test
    public void loginTest() throws InterruptedException {
        System.out.println("TESTE");
        DriverManager.getDriver().get("https://the-internet.herokuapp.com/");
        Thread.sleep(5000);
    }
}
