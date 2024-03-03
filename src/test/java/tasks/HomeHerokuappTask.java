package tasks;

import appObjects.FormAuthenticationAppObject;
import appObjects.HomeHerokuappAppObject;
import org.openqa.selenium.WebDriver;

public class HomeHerokuappTask {
    private final HomeHerokuappAppObject homeHerokuappAppObject;
    private final FormAuthenticationAppObject formAuthenticationAppObject;

    public HomeHerokuappTask(WebDriver driver) {
        homeHerokuappAppObject = new HomeHerokuappAppObject(driver);
        formAuthenticationAppObject = new FormAuthenticationAppObject(driver);
    }

    public void addRemoveElement() {
        homeHerokuappAppObject.addRemoveElementLink().click();
        homeHerokuappAppObject.addElementButton().click();
        homeHerokuappAppObject.removeElementButton().click();
    }

    public void formAuthentication(String user, String password) {
        homeHerokuappAppObject.formAuthenticationLink().click();
        formAuthenticationAppObject.username().sendKeys(user);
        formAuthenticationAppObject.password().sendKeys(password);
        formAuthenticationAppObject.loginButton().click();
    }
}