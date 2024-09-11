package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
	
	public String username = "standard_user";
	public String wrongUsername = "Robson Hamilton";
	
	public final By etUsername = By.id("user-name");
	public final By etUserPassword = By.id("password");
	public final By btnLogin = By.name("login-button");

	public void fillUsername() {
		fillInput(etUsername, username);
	}

	public void fillUserPassword() {
		fillInput(etUserPassword, "secret_sauce");
	}
	
	public void clickBtnLogin() {
		click(btnLogin);
	}
	
	public void isOnLoginPage() {
		driver.get("https://www.saucedemo.com/");
		isVisible(btnLogin);
	}
	
}
