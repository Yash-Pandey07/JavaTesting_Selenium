package part1.com.saucedemo.pages;

import org.openqa.selenium.*;

public class LoginPage extends BasePage{
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("#login_button_container h3");
    //private By errorMessage = By.xpath("//*[@id=\"login_button_container\"]/div/form/h3");

    public void setUsername(String username) {
        set(usernameField , username);
    }
    public void setPassword(String password){
        set(passwordField, password);
    }
    public ProductsPage clickLoginButton() {
        click(loginButton);
        return new ProductsPage();
    }

    public ProductsPage logintoApplication(String username , String password){
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    public String getErrorMessage() {
        return find(errorMessage).getText();
    }
}
