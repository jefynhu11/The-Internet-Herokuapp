package appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeHerokuappAppObject {

    private final WebDriver driver;

    public HomeHerokuappAppObject (WebDriver driver) {
        this.driver = driver;
    }

    public WebElement addRemoveElementLink() {
        return driver.findElement(By.linkText("Add/Remove Elements"));
//        return this.driver.findElement(By.cssSelector("#content > ul > li:nth-child(2) > a"));
    }

    public WebElement formAuthenticationLink() {
        return driver.findElement(By.linkText("Form Authentication"));
    }

    public WebElement addElementButton() {
        return driver.findElement(By.cssSelector(".example button"));
    }
    public WebElement removeElementButton() {
        return driver.findElement(By.cssSelector(".example #elements button"));
    }

}