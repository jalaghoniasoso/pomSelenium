package ge.automation.tests;
import ge.automation.BaseTest;
import ge.automation.pages.InventoryPage;
import ge.automation.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestClass extends BaseTest {
    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Url does not match");

        InventoryPage inventoryPage = new InventoryPage(driver);
        String expectedHeadetText = "Products";
        String actualHeaderText = inventoryPage.getInventoryHeaderText();
        Assert.assertEquals(actualHeaderText, expectedHeadetText);
    }
    @Test
    public void testLoginButtonTextColor(){
        LoginPage loginPage = new LoginPage(driver);
        String expectedColor = "rgba(19, 35, 34, 1)";
        String actualColor = loginPage.getLoginButtonTextColor();
        Assert.assertEquals(actualColor, expectedColor);
    }
}