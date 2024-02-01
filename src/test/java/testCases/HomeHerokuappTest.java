package testCases;

import framework.data.DataClass;
import org.testng.annotations.Test;
import framework.support.BaseTest;
import tasks.HomeHerokuappTask;
import framework.webDrivers.webDrivers.DriverManager;

public class HomeHerokuappTest extends BaseTest {
    private HomeHerokuappTask homeHerokuappTask;

    @Test
    public void addRemoveElementTest() throws InterruptedException {
        homeHerokuappTask = new HomeHerokuappTask(DriverManager.getDriver());
        DriverManager.getDriver().get("https://the-internet.herokuapp.com/");
        homeHerokuappTask.addRemoveElement();
    }
    @Test(dataProvider = "loginWithCSV", dataProviderClass = DataClass.class)
    public void loginTest(String user, String password) throws InterruptedException {
        System.out.println("User: " + user + " - Password: " + password);
        homeHerokuappTask = new HomeHerokuappTask(DriverManager.getDriver());
        DriverManager.getDriver().get("https://the-internet.herokuapp.com/");
        homeHerokuappTask.formAuthentication(user, password);
        Thread.sleep(5000);
    }
}
