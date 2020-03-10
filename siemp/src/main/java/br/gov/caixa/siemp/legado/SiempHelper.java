package br.gov.caixa.siemp.legado;

import org.openqa.selenium.WebDriver;
import br.gov.caixa.siemp.helper.BaseHelper;
import io.qameta.allure.Step;

public class SiempHelper extends BaseHelper{
	
	SiempPage siemp;

	public SiempHelper(WebDriver driver) {
		super(driver);
		siemp = new SiempPage(driver);
	}

	
	@Step("Digitar usuário")
	public void DigitarUsuario() {
		EsperarSegundos(1000);
		siemp.SwitchToFrame();
		EsperarSegundos(1000);
		PreencherCampo(siemp.USUARIO, "f799508");
	}
	
	@Step("Digitar senha")
	public void DigitarSenha() {
		PreencherCampo(siemp.PASSWORD, "mai2020");
	}
	
	@Step("Clicar botão login")
	public void ClicarLogin() {
		ClicarBotao(siemp.BTN_LOGIN);
	}
	
	@Step("Selecionar menu contrato")
	public void MenuContrato() {
		EsperarSegundos(2000);
		ClicarBotao(siemp.MENU_CONTRATO);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar menu pagamento")
	public void MenuContratoPagamento() {
		ClicarBotao(siemp.MENU_CONTRATO_PAGAMENTO);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar menu amortizar saldo")
	public void MenuContratoPagamentoAmortizarSaldo() {
		MoverParaElemento(siemp.MENU_CONTRATO_PAGAMENTO_ANTECIPACAO_PAGAMENTO);
		MoverParaElemento(siemp.MENU_CONTRATO_PAGAMENTO_AMORTIZAR_SALDO);
		saveScreenshotPNG(driver);
		ClicarBotao(siemp.MENU_CONTRATO_PAGAMENTO_AMORTIZAR_SALDO);
		EsperarSegundos(3000);
	}
	
	
	public void AmortizarSaldo() {
		
		while(siemp.MENU_CONTRATO.isEnabled()){
		
			MenuContrato();
			MenuContratoPagamento();
			MenuContratoPagamentoAmortizarSaldo();
			
			EsperarSegundos(3000);
		}
	}
	
	@Step("Selecionar busca por contrato")
	public void SelecionarRadioContrato() {
		EsperarSegundos(1500);
		ClicarRadioButton(siemp.RADIO_NUMERO_CONTRATO);
	}
	
	@Step("Preencher o número do contrato")
	public void PreencherCampoPesquisa(String contrato) {
	
		EsperarSegundos(1000);
		
		PreencherCampo(siemp.CAMPO_PESQUISA, contrato);
		
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar o contrato")
	public void SelecionarContrato() {
		ClicarBotao(siemp.SELECIONAR_CONTRATO);
		saveScreenshotPNG(driver);
	}
	
	@Step("Clicar botão pesquisar")
	public void BotaoPesquisar() {
		ClicarBotao(siemp.BTN_PESQUISAR);
	}
	
	@Step("Selecionar o tipo de amortização")
	public void SelecionarTipoAmortizacao(String tipo) {
		SelecionarItemPorTexto(siemp.SELECT_TIPO_AMORTIZACAO, tipo);		
		if(tipo.equals("Parcial Distribuindo")) {
			PreencherValorParcialAmortizacao();
		}else if(tipo.equals("Total")) {
			//PreencherValorTotalAmortizacao();
		}
		saveScreenshotPNG(driver);
	}
	
	@Step("Solicitar liquidação total do contrato")
	public void SelecionarLiquidacaoTotal() {
		
	}
	
	public void PreencherValorTotalAmortizacao() {
		PreencherCampo(siemp.INPUT_AMORTIZACAO,  siemp.SALDO_DEVEDOR.get(6).getText());
	}
	
	@Step("Preencher valor parcial amortização")
	public void PreencherValorParcialAmortizacao() {
		
		String saldo =  siemp.SALDO_DEVEDOR.get(6).getText();
		
		System.out.println("Saldo devedor: "+ saldo);
		
		saldo = saldo.replaceAll("[.,]", "");
		
		int valor = Integer.parseInt(saldo) / 2;
		
		saldo = String.valueOf(valor);
		
		System.out.println("O saldo parcial para amortização é: " + saldo);
		
		PreencherCampo(siemp.INPUT_AMORTIZACAO, saldo);
	}
	
	@Step("Clicar botão amortizar saldo")
	public void BotaoAmortizarSaldo() {
		ClicarBotao(siemp.BTN_AMORTIZAR_SALDO);
		saveScreenshotPNG(driver);
	}
	
	@Step("Clicar botão debito")
	public void BotaoDebito() {
		ClicarBotao(siemp.BOTAO_DEBITO);
		saveScreenshotPNG(driver);
	}
	
	@Step("Confirmar")
	public void AceitarAlerta() {
		ConfirmarAlerta();
	}
	
	@Step("Selecionar menu estorno")
	public void MenuEstorno() {
		ClicarBotao(siemp.BTN_ESTORNO);
	}
	
	@Step("Selecionar menu encargos")
	public void MenuDispensaEncargos() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
