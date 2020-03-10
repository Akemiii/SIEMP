package br.gov.caixa.siemp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends BasePage{

	public MenuPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Menu
	//Xpath Ex. //*[contains(text(), '')]
	
	@FindBy(xpath = "//*[contains(text(), 'Serviços')]")
	public WebElement MENU_PRINCIPAL;
	
	@FindBy(id = "dashboardRural")
	public WebElement MENU_CREDITO_RURAL;	
	
	@FindBy(xpath = "/html/body/div[3]/form/fieldset/div[2]/div/label[3]")
	public WebElement MENU_CONSULTA_PROPOSTA;
		
	@FindBy(id = "numero")
	public WebElement CAMPO_NUMERO;
	
	@FindBy(id = "btnConsultar")
	public WebElement BTN_CONSULTAR;
	
	@FindBy(xpath = "//*[@class = 'btn-group']//*[@class = 'btn btn-mini btnEditar']")
	public WebElement BTN_MINI_EDITAR;
	
	
	@FindBy(xpath = "//*[contains(text(), 'Crédito Comercial')]")
	public WebElement MENU_CREDITO_COMERCIAL;
	
	@FindBy(xpath = "//*[contains(text(), 'Construcard')]")
	public WebElement MENU_COMERCIAL_CONSTRUCARD;
	
	@FindBy(xpath = "//*[contains(text(), 'Veículos')]")
	public WebElement MENU_COMERECIAL_VEICULOS;
	
	@FindBy(xpath = "//*[contains(text(), 'Consultar Propostas Construcard')]")
	public WebElement CONSULTAR_PROPOSTAS_CONSTRUCARD;
	
	//Utilizar para não mudar para outro menu
	@FindBy(xpath = "//*[contains(text(), 'Manutenção de Contrato SIEMP')]")
	public WebElement MANUTENCAO_CONTRATO_SIEMP;
	
	@FindBy(xpath = "//*[contains(text(), 'Simular Proposta Veículo')]")
	public WebElement SIMULAR_PROPOSTA_VEICULO;
	
	@FindBy(xpath = "//*[contains(text(),'Consultar Proposta Veículos')]")
	public WebElement CONSULTAR_PROPOSTA_VEICULOS;
	

}
