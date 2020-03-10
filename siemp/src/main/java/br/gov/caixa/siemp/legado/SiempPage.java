package br.gov.caixa.siemp.legado;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.gov.caixa.siemp.pages.BasePage;


public class SiempPage extends BasePage {
	
	public SiempPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[3]/td[3]/table/tbody/tr[3]/td[3]/input")
	public WebElement USUARIO;	
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[3]/td[3]/table/tbody/tr[4]/td[3]/input[1]")
	public WebElement PASSWORD;
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[3]/td[3]/table/tbody/tr[4]/td[3]/input[2]")
	public WebElement BTN_LOGIN;
	
	@FindBy(id = "hel2")
	public WebElement MENU_CONTRATO;
	
	@FindBy(id = "lnk25")
	public WebElement MENU_CONTRATO_PAGAMENTO;
	
	@FindBy(id = "lnk43")
	public WebElement MENU_CONTRATO_PAGAMENTO_AMORTIZAR_SALDO;
	
	@FindBy(id = "lnk40")
	public WebElement MENU_CONTRATO_PAGAMENTO_ANTECIPACAO_PAGAMENTO;
	
	@FindBy(xpath = "/html/body/table/tbody/tr[3]/td/table[2]/tbody/tr[2]/td[2]/table[2]/tbody/tr/td[3]/input")
	public WebElement RADIO_NUMERO_CONTRATO;
	
	@FindBy(xpath = "/html/body/table/tbody/tr[3]/td/table[2]/tbody/tr[2]/td[2]/table[2]/tbody/tr/td[6]/input")
	public WebElement CAMPO_PESQUISA;
	
	@FindBy(xpath = "/html/body/table/tbody/tr[3]/td/table[2]/tbody/tr[3]/td[1]/table/tbody/tr[3]/td[1]/table/tbody/tr/td[2]/input[2]")
	public WebElement BTN_PESQUISAR;
	
	@FindBy(id = "lnk42")
	public WebElement MENU_CONTRATO_PAGAMENTO_EXTRATO;
	
	@FindBy(id = "lnk41")
	public WebElement MENU_CONTRATO_PAGAMENTO_ANTECIPACAO_PRAZO;
	
	@FindBy(xpath = "//*[@id='colecao']/tbody/tr/td[1]/a")
	public WebElement SELECIONAR_CONTRATO;
	
	@FindBy(name = "gerarParcelaAmortizacaoHelper.coTipoAmortizacao")
	public WebElement SELECT_TIPO_AMORTIZACAO;	

	@FindBy(className = "valor")
	public List<WebElement> SALDO_DEVEDOR;
	
	@FindBy(name = "gerarParcelaAmortizacaoHelper.vrParcelaAmortizacao")
	public WebElement INPUT_AMORTIZACAO;
	
	@FindBy(id = "btnDebito")
	public WebElement BOTAO_DEBITO;
	
	@FindBy(id = "btnAmortizarSaldo")
	public WebElement BTN_AMORTIZAR_SALDO;
	
	public void SwitchToFrame() {
		driver.switchTo().frame("principal");
	}
	
	@FindBy(id = "el31")
	public WebElement BTN_ESTORNO;

	@FindBy(id = "el44")
	public WebElement BTN_DISPENSA_ENCARGOS;
	
	
	
	
	
}
