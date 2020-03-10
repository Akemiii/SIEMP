package br.gov.caixa.siemp.helper;

import org.openqa.selenium.WebDriver;
import br.gov.caixa.siemp.pages.LoginPage;
import io.qameta.allure.Step;

public class LoginHelper extends BaseHelper{
	
	private LoginPage loginPage;

	public LoginHelper(WebDriver driver) {
		super(driver);
		loginPage = new LoginPage(driver);
	}
	
	//TODO:: Separar todos os métodos em suas classes
	
	//Login
	@Step("Preencher campo de usuário")
	public void PreencherCampoUsuario(String username) {
		PreencherCampo(loginPage.USERNAME, username);
	}
	
	@Step("Preencher campo de senha")
	public void PreencherCampoSenha(String password) {
		PreencherCampo(loginPage.PASSWORD, password);
	}
	
	@Step("Efetuar login")
	public void EfetuarLogin() {
		ClicarBotaoInterativo(loginPage.BTN_LOGIN);
	}
	
	public void EsperarLoading() {
		EsperarLoading(loginPage.ajaxLoad);
	}
	
	@Step("Verificar se login foi efetuado com sucesso")
	public void VerificarLogin() {
		VerificarElementoExiste(loginPage.NOME_SISTEMA);
		saveScreenshotPNG(driver);
	}

	
}
