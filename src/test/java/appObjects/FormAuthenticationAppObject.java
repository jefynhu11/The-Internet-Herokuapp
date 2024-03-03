package appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormAuthenticationAppObject {

    private final WebDriver driver;

    public FormAuthenticationAppObject (WebDriver driver) {
        this.driver = driver;
    }

    public WebElement username() {
        return driver.findElement(By.id("username"));
    }

    public WebElement password() {
        return driver.findElement(By.id("password"));
    }

    public WebElement loginButton() {
        return driver.findElement(By.cssSelector("#login button"));
    }
}
