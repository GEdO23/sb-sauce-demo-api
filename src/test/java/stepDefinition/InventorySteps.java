package stepDefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import pages.InventoryPage;
import pages.LoginPage;

import java.time.Duration;

public class InventorySteps extends BasePage {
	
	LoginSteps loginSteps = new LoginSteps();
	InventoryPage inventoryPage = new InventoryPage();
	
	@Dado("que estou logado")
	public void isLoggedOn() {
		loginSteps.inInLoginPage();
		loginSteps.enterWithValidCredentials();
		loginSteps.enterInventoryPage();
	}
	
	@Quando("clico em logout")
	public void clickLogout() {
		click(inventoryPage.menu);
		click(inventoryPage.btnLogout);
	}
	
	@Entao("volto a tela de login")
	public void goBackToLoginPage() {
		loginSteps.showErrorMessage(); //Reaproveitando a mensagem de erro para mostrar que o usuário deslogou
	}
	
}
