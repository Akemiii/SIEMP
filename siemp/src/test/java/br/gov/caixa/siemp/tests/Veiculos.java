package br.gov.caixa.siemp.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import br.gov.caixa.siemp.helper.LoginHelper;
import br.gov.caixa.siemp.helper.MenuHelper;
import br.gov.caixa.siemp.helper.VeiculosHelper;
import br.gov.caixa.siemp.utils.Properties;
import br.gov.caixa.siemp.utils.TestListener;
import br.gov.caixa.siemp.utils.Properties.DriverType;
import io.qameta.allure.Description;

@Listeners({TestListener.class})
public class Veiculos extends AbstractTest{

	private String username;
	private String password;
	
	LoginHelper loginHelper;
	MenuHelper menuHelper;
	VeiculosHelper veiculosHelper;
	
	
	String cnpj = "00360305000880";
	
	
	//TODO:: Verificar a correção do impedimento na proposta de veículos.
	@Test
	@Description(value = "")
	public void ConsultarFinanciamentoPF() {
		//Executar o login no sistema
		loginHelper.PreencherCampoUsuario(username);
		loginHelper.PreencherCampoSenha(password);
		loginHelper.EfetuarLogin();
		loginHelper.EsperarLoading();
		loginHelper.VerificarLogin();
		
		//Selecionar o menu Crédito rural
		menuHelper.MenuPrincipal();
		menuHelper.MenuCreditoComercial();
		menuHelper.ManutencaoContratoSiemp();
		menuHelper.MenuVeiculos();
		menuHelper.ConsultarPropostaVeiculos();
		veiculosHelper.BotaoIncluir();
		veiculosHelper.SelecionarDadosTipoPF();
		veiculosHelper.PreencherCampoCPF("98670778904");
		veiculosHelper.BotaoConsultar();
		veiculosHelper.BotaoAvancar();
		veiculosHelper.SelecionarProduto("7044-0000 FINANCIAMENTOS DE VEICULOS");
		veiculosHelper.SelecionarMatrizTaxa();
		veiculosHelper.SelecionarCategoria();
		veiculosHelper.SelecionarTipoVeiculo();
		veiculosHelper.SelecionarMarca();
		veiculosHelper.SelecionarModelo();
		veiculosHelper.SelecionarAnoModelo("2019");
		veiculosHelper.PreencherAnoFabricacao("2019");
		veiculosHelper.SelecionarUFLicenciamento("DISTRITO FEDERAL");
		veiculosHelper.PreencherValorVeiculo("18000000");
		veiculosHelper.TipoCalculoEntrada();
		veiculosHelper.PreencherValorEntrada("9000000");
		veiculosHelper.SelecionarNaturezaIOF(1);
		veiculosHelper.SelecionarNaturezaDespesasTerceiro(1);
		veiculosHelper.SelecionarDiaVencimentoPrestacao("15");
		veiculosHelper.SelecionarSeguroCaixa("nao");
		veiculosHelper.SelecionarClienteAposetado("nao");
		veiculosHelper.ClicarBotaoSimular();
		veiculosHelper.SelecionarNumeroParcelas("10");
		veiculosHelper.BotaoAvancar();
		String contrato = veiculosHelper.RecuperarNumeroContratoStep3();
		veiculosHelper.BotaoAvancar();
		veiculosHelper.AvaliarRisco(contrato);
		veiculosHelper.ClicarVoltar();
		veiculosHelper.BotaoAvancar();
		veiculosHelper.BotaoAvancar();
		//Dados Complementares
		veiculosHelper.SelecionarNumeroFormaPagamento();
		veiculosHelper.SelecionarComboConta();
		veiculosHelper.PreencherCodigoDocumentoAquisicao("1234567890");
		veiculosHelper.PreencherDataDocumentoAquisicao();
		veiculosHelper.PreencherCodigoChassi("9BVN26AA0CE600395");
		veiculosHelper.SelecionarRadioChassiNormal();
		veiculosHelper.PreencherRenavam("1234567890");
		veiculosHelper.SelecionarUFPlaca("DISTRITO FEDERAL");
		veiculosHelper.PreencherCodigoPlaca("ABC1234");
		veiculosHelper.SelecionarRadioRelacionamentoCaixaNao();
		veiculosHelper.SelecionarRadioPessoaFisica();
		veiculosHelper.PreencherCPFVendedor("51515151522");
		veiculosHelper.PreencherNomeRazaoSocial("Teste");
		veiculosHelper.SelectNumeroBanco("117 - ADVANCED CORRETORA");
		veiculosHelper.PreencherNumeroAgencia("2");
		veiculosHelper.PreencherNumeroConta("123456");
		veiculosHelper.PreencherNumeroDVConta("2");
		veiculosHelper.SelecionarTipoConta("Corrente");	
		veiculosHelper.BotaoAvancar();
		veiculosHelper.VerificarError();
		//Gravame
		veiculosHelper.AprovarGravame(contrato);
		veiculosHelper.BotaoAvancar();
		veiculosHelper.BotaoAvancar();
		//Impressão do contrato
		veiculosHelper.BotaoImpressaoContrato();
		veiculosHelper.SelecionarPrimeiraVia();
		veiculosHelper.BotaoConsultarImpressaoContrato();
		veiculosHelper.BotaoImprimirFechar();
		veiculosHelper.PreencherJustificativaAutorizacao("Teste");
		veiculosHelper.BotaoAutorizar();
		veiculosHelper.BotaoConfirmarAutorizacao();
		veiculosHelper.BotaoAvancar();
		
		veiculosHelper.Pausa();
		//Liberação de crédito
		
		
		
	}
	
	@Ignore
	@Test
	public void SimularFinanciamentoCredFrotaLocadoraPJ() {
		//Produto
		//6331-0002 6331-002 - VEICULOS CREDFROTA LOCADORA
		
		//Executar o login no sistema
		loginHelper.PreencherCampoUsuario(username);
		loginHelper.PreencherCampoSenha(password);
		loginHelper.EfetuarLogin();
		loginHelper.EsperarLoading();
		loginHelper.VerificarLogin();
		
		//Selecionar o menu Crédito rural
		menuHelper.MenuPrincipal();
		menuHelper.MenuCreditoComercial();
		menuHelper.ManutencaoContratoSiemp();
		menuHelper.MenuVeiculos();
		menuHelper.SimularPropostaVeiculo();
		
		veiculosHelper.SelecionarTipoPJ();
		veiculosHelper.SelecionarProduto("6331-0002 6331-002 - VEICULOS CREDFROTA LOCADORA");
		veiculosHelper.SelecionarRelacionamentoSR();
		veiculosHelper.SelecionarPorteEmpresaMPE();
		veiculosHelper.SelecionarMatrizTaxa();
		veiculosHelper.SelecionarCategoria();
		veiculosHelper.SelecionarTipoVeiculo();
		veiculosHelper.SelecionarMarca();
		veiculosHelper.SelecionarModelo();
		veiculosHelper.SelecionarAnoModelo("2019");
		veiculosHelper.PreencherAnoFabricacao("2019");
		veiculosHelper.SelecionarUFLicenciamento("DISTRITO FEDERAL");
		veiculosHelper.PreencherValorVeiculo("18000000");
		veiculosHelper.PreencherQuantidadeVeiculos("10");
		veiculosHelper.TipoCalculoEntrada();
		veiculosHelper.PreencherValorEntrada("9000000"); 
		veiculosHelper.PreencherPercentualAmortizacao("2000");
		veiculosHelper.SelecionarNaturezaIOF(1);
		veiculosHelper.SelecionarDiaVencimentoPrestacao("15");
		veiculosHelper.ClicarBotaoSimular();
		
		veiculosHelper.Pausa();
	}
	
	@Ignore
	@Test
	public void SimularFinanciamentoCredFrotaPJ() {
		//Produto
		//6331-0000 6331-000 - VEICULOS CREDFROTA
		
		//Executar o login no sistema
		loginHelper.PreencherCampoUsuario(username);
		loginHelper.PreencherCampoSenha(password);
		loginHelper.EfetuarLogin();
		loginHelper.EsperarLoading();
		loginHelper.VerificarLogin();
		
		//Selecionar o menu Crédito rural
		menuHelper.MenuPrincipal();
		menuHelper.MenuCreditoComercial();
		menuHelper.ManutencaoContratoSiemp();
		menuHelper.MenuVeiculos();
		menuHelper.SimularPropostaVeiculo();
		
		veiculosHelper.SelecionarTipoPJ();
		veiculosHelper.SelecionarProduto("6331-0000 6331-000 - VEICULOS CREDFROTA");
		veiculosHelper.SelecionarRelacionamentoSR();
		veiculosHelper.SelecionarPorteEmpresaMPE();
		veiculosHelper.SelecionarMatrizTaxa();
		veiculosHelper.SelecionarCategoria();
		veiculosHelper.SelecionarTipoVeiculo();
		veiculosHelper.SelecionarMarca();
		veiculosHelper.SelecionarModelo();
		veiculosHelper.SelecionarAnoModelo("2019");
		veiculosHelper.PreencherAnoFabricacao("2019");
		veiculosHelper.SelecionarUFLicenciamento("DISTRITO FEDERAL");
		veiculosHelper.PreencherValorVeiculo("18000000");
		veiculosHelper.PreencherQuantidadeVeiculos("10");
		veiculosHelper.TipoCalculoEntrada();
		veiculosHelper.PreencherValorEntrada("9000000"); 
		veiculosHelper.PreencherPercentualAmortizacao("2000");
		veiculosHelper.SelecionarNaturezaIOF(1);
		veiculosHelper.SelecionarDiaVencimentoPrestacao("15");
		veiculosHelper.ClicarBotaoSimular();
		
		veiculosHelper.Pausa();
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
		getDriver(DriverType.FIREFOX);
		Open();
		loginHelper = new LoginHelper(driver);
		menuHelper = new MenuHelper(driver);
		veiculosHelper = new VeiculosHelper(driver);
		
		
		username = Properties.username;
		password = Properties.password;

		//Veiculos
		
		
	}
	
	@AfterSuite
	public void SuiteTearDown( ) {
		KillDriver();
		
	}
}
