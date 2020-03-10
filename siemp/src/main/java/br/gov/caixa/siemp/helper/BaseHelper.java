package br.gov.caixa.siemp.helper;

import org.openqa.selenium.WebDriver;

import br.gov.caixa.siemp.pages.BasePage;
import br.gov.caixa.siemp.utils.InternetBanking;
import io.qameta.allure.Step;

public class BaseHelper extends InternetBanking{

	BasePage basePage;

	public BaseHelper(WebDriver driver) {
		super(driver);
		basePage = new BasePage(driver);
	}

	public void Pausa() {
		EsperarSegundos(30000);
		
	}
	
	//Botão next
	@Step("Clicar Proximo passo")
	public void ProximoPasso() {
		EsperarSegundos(2000);
		ScrollToElement(2000);
		ClicarBotao(basePage.BTN_NEXT);
	}
	
	@Step("Envelhecer contrato")
	public void EnvelhecerContratoMes(String contrato, int meses) {
		EnvelhecerContratoPorMes(contrato, meses);
	}
	
}
