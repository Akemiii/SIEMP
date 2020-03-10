package br.gov.caixa.siemp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	//TODO:: Separar todos os web elements para as devidas classes
	
	@FindBy(id = "username")
	public WebElement USERNAME;
	
	@FindBy(id = "password")
	public WebElement PASSWORD;
	
	@FindBy(id = "kc-login")
	public WebElement BTN_LOGIN;
	
	@FindBy(className = "brand")
	public WebElement NOME_SISTEMA;
		
	
	//TODO:: Refactor later...
	@FindBy(id = "numero")
	public WebElement LOADING_TESTE;
	
	@FindBy(xpath = "//*[@class='modal-backdrop fade in']")
	public WebElement MODAL_FADE_IND;
	
	
}
