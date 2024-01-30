package tasks;

import appObjects.HomeHerokuappAppObject;
import org.openqa.selenium.WebDriver;

public class HomeHerokuappTask {

    private final WebDriver driver;

    private final HomeHerokuappAppObject homeHerokuappAppObject;

    public HomeHerokuappTask(WebDriver driver) {
        this.driver = driver;
        homeHerokuappAppObject = new HomeHerokuappAppObject(driver);
    }

}
