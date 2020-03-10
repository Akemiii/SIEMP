package br.gov.caixa.siemp.helper;

import org.openqa.selenium.WebDriver;

import br.gov.caixa.siemp.pages.MenuPage;
import io.qameta.allure.Step;

public class MenuHelper extends BaseHelper{

	private MenuPage menuPage;
	
	public MenuHelper(WebDriver driver) {
		super(driver);
		menuPage = new MenuPage(driver);
	}
	
	//Menu
	@Step("Selecionar menu principal")
	public void MenuPrincipal() {
		EsperarSegundos(40000);
		ClicarBotaoInterativo(menuPage.MENU_PRINCIPAL);
	}
	
	@Step("Selecionar Crédito Rural")
	public void MenuCreditoRural() {
		EsperarSegundos(500);
		ClicarBotaoInterativo(menuPage.MENU_CREDITO_RURAL);
	}
	
	@Step("Selecionar Crédito Comercial")
	public void MenuCreditoComercial() {
		EsperarSegundos(500);
		MoverParaElemento(menuPage.MENU_CREDITO_COMERCIAL);
	}
	
	public void ManutencaoContratoSiemp() {
		EsperarSegundos(500);
		MoverParaElemento(menuPage.MANUTENCAO_CONTRATO_SIEMP);
	}
	
	@Step("Selecionar Crédito Construcard")
	public void MenuConstrucard() {
		EsperarSegundos(500);
		MoverParaElemento(menuPage.MENU_COMERCIAL_CONSTRUCARD);
	}
	
	@Step("Selecionar Crédito Veículos")
	public void MenuVeiculos() {
		EsperarSegundos(500);
		MoverParaElemento(menuPage.MENU_COMERECIAL_VEICULOS);
	}
	
	@Step("Consultar Propostas Construcard")
	public void ConsultarPropostasConstrucard() {
		EsperarSegundos(500);
		ClicarBotao(menuPage.CONSULTAR_PROPOSTAS_CONSTRUCARD);
	}
	
	@Step("Selecionar Simular proposta veículo")
	public void SelecionarSimularPropostaVeiculo() {
		EsperarSegundos(500);
		MoverParaElemento(menuPage.SIMULAR_PROPOSTA_VEICULO);
	}
	
	@Step("Simular proposta veículo")
	public void SimularPropostaVeiculo() {
		ClicarBotao(menuPage.SIMULAR_PROPOSTA_VEICULO);
		EsperarSegundos(18000);
	}
	
	@Step("Consultar proposta veículos")
	public void ConsultarPropostaVeiculos() {
		ClicarBotao(menuPage.CONSULTAR_PROPOSTA_VEICULOS);
	}
	
	public void MenuConsultaProposta() {
		EsperarSegundos(50000);
		ClicarRadioButton(menuPage.MENU_CONSULTA_PROPOSTA);
	}
	
	public void PreencherCampoNumero(String proposta){
		PreencherCampo(menuPage.CAMPO_NUMERO, proposta);
	}
	
	public void BtnConsultarProposta() {
		ClicarBotao(menuPage.BTN_CONSULTAR);
	}
	
	public void EditarProposta() {
		EsperarSegundos(1000);
		ScrollToElement(300);
		ClicarBotao(menuPage.BTN_MINI_EDITAR);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
