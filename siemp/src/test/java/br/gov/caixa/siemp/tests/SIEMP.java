package br.gov.caixa.siemp.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import br.gov.caixa.siemp.legado.SiempHelper;
import br.gov.caixa.siemp.utils.TestListener;
import br.gov.caixa.siemp.utils.Properties.DriverType;
import io.qameta.allure.Description;

@Listeners({TestListener.class})
public class SIEMP extends AbstractTest{
	
	
	//Legado
	SiempHelper siemp;
	
//	@Ignore
	@Test
	@Description(value = "Amortização/Liquidação antecipada da dívida")
	public void AmortizacaoLiquidacao() {
		
		siemp.DigitarUsuario();
		siemp.DigitarSenha();
		siemp.ClicarLogin();
		siemp.MenuContrato();
		siemp.MenuContratoPagamento();
		siemp.MenuContratoPagamentoAmortizarSaldo();
		siemp.SelecionarRadioContrato();
		siemp.PreencherCampoPesquisa("252612");
		siemp.BotaoPesquisar();
		siemp.SelecionarContrato();
		//Total
		//Parcial Distribuindo
		siemp.SelecionarTipoAmortizacao("Total");
		siemp.BotaoAmortizarSaldo();
		siemp.BotaoDebito();
		siemp.AceitarAlerta();
	}
	
	@Ignore
	@Test
	@Description(value = "Liquidação de Contrato e Baixa de garantias (se for o caso)")
	public void LiquidacaoContrato() {
		siemp.DigitarUsuario();
		siemp.DigitarSenha();
		siemp.ClicarLogin();
		siemp.MenuContrato();
		siemp.MenuContratoPagamento();
		siemp.MenuContratoPagamentoAmortizarSaldo();
		siemp.SelecionarRadioContrato();
		siemp.PreencherCampoPesquisa("252612");
		siemp.BotaoPesquisar();
		siemp.SelecionarContrato();
		siemp.PreencherValorTotalAmortizacao();
		siemp.BotaoAmortizarSaldo();
		siemp.BotaoDebito();
		siemp.AceitarAlerta();
	}
	
	//TODO: Entregar até 18/03/2020
	@Test
	public void Estorno() {
		siemp.DigitarUsuario();
		siemp.DigitarSenha();
		siemp.ClicarLogin();
		siemp.MenuContrato();
		siemp.MenuEstorno();
		siemp.SelecionarRadioContrato();
		siemp.PreencherCampoPesquisa("267691");
		siemp.BotaoPesquisar();
		siemp.SelecionarContrato();
		
		
		
		
		
	}
	
	@Test
	public void CancelamentoParcial() {
		
	}
	
	@Test
	public void CancelamentoTotal() {
		
	}
	
	@Test
	public void Carencia() {
		
	}
	
	@Test
	public void PagamentoParcelaJuros() {
		
	}
	
	@BeforeTest
	public void Init() {		
		InitialPage();
	}
	
	@AfterTest
	public void TearDown() {
		//Implements
	}

	@BeforeSuite
	public void SuiteInit() {
		getDriver(DriverType.IE);
		Open();
		
		siemp = new SiempHelper(driver);
		
	}

	@AfterSuite
	public void SuiteTearDown( ) {
		KillDriver();
		
	}

}
