package ge.automation.pages;

import ge.automation.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
        super(driver);
    }
    private By usernameFiled = By.id("user-name");
    private By passwordFiled = By.id("password");
    private By loginButton = By.id("login-button");
    public void login(String username, String password){
        enterText(usernameFiled, username);
        enterText(passwordFiled, password);
        waitforElementToBeClickable(loginButton);
        clickToElement(loginButton);
    }
    public String getLoginButtonTextColor(){
        return getCssValue(loginButton, "color");
    }
}
