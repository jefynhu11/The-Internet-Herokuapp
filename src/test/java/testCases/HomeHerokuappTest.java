package testCases;

import framework.data.DataClass;
import org.testng.annotations.Test;
import framework.support.BaseTest;
import tasks.HomeHerokuappTask;
import framework.webDrivers.webDrivers.DriverManager;

public class HomeHerokuappTest extends BaseTest {
    private HomeHerokuappTask homeHerokuappTask;

    @Test
    public void addRemoveElementTest() {
        homeHerokuappTask = new HomeHerokuappTask(DriverManager.getDriver());
        DriverManager.getDriver().get("https://the-internet.herokuapp.com/");
        homeHerokuappTask.addRemoveElement();
    }
    @Test(dataProvider = "loginWithCSV", dataProviderClass = DataClass.class)
    public void loginTest(String user, String password) {
        homeHerokuappTask = new HomeHerokuappTask(DriverManager.getDriver());
        DriverManager.getDriver().get("https://the-internet.herokuapp.com/");
        homeHerokuappTask.formAuthentication(user, password);
    }
}
