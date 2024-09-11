package stepDefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.BasePage;
import pages.InventoryPage;
import pages.LoginPage;

public class LoginSteps extends BasePage {
	
	LoginPage loginPage = new LoginPage();
	InventoryPage inventoryPage = new InventoryPage();
	
	@Dado("que estou na tela de login")
	public void inInLoginPage() {
		loginPage.isOnLoginPage();
	}
	
	@Quando("entro com credenciais validas")
	public void enterWithValidCredentials() {
		loginPage.fillUsername();
		loginPage.fillUserPassword();
		loginPage.clickBtnLogin();
	}
	
	@Entao("entro na pagina de inventario")
	public void enterInventoryPage() {
		isVisible(inventoryPage.btnLogout);
	}
	
	@Quando("entro com usuario invalido")
	public void enterWithInvalidUsername() {
		fillInput(loginPage.etUsername, loginPage.wrongUsername);
		loginPage.fillUserPassword();
		loginPage.clickBtnLogin();
	}
	
	@Entao("vejo a mensagem de erro")
	public void showErrorMessage() {
		System.out.println("Erro");
	}
	
	@Quando("entro com senha invalida")
	public void enterWithInvalidUserPassword() {
		loginPage.fillUsername();
		fillInput(loginPage.etUserPassword, "senha invalida");
		loginPage.clickBtnLogin();
	}
	
}
