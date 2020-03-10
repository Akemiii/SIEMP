package br.gov.caixa.siemp.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import br.gov.caixa.siemp.helper.CreditoRuralHelper;
import br.gov.caixa.siemp.helper.LoginHelper;
import br.gov.caixa.siemp.helper.MenuHelper;
import br.gov.caixa.siemp.helper.VeiculosHelper;
import br.gov.caixa.siemp.utils.Properties;
import br.gov.caixa.siemp.utils.Properties.DriverType;
import br.gov.caixa.siemp.utils.TestListener;
import io.qameta.allure.Description;

@Listeners({TestListener.class})
public class SIFEC extends AbstractTest{
	
	//Variaveis para inicialização do arquivo de configuração
	private String username;
	private String password;
	private String cpf;
	private String tempoExperiencia;
	private String tipoBeneficiario = "Aquicultor";
	private String categoriaEmitente = "MEDIO PRODUTOR";
//	private String agenciaContaPrincipal = "0002001000478588";
	private String codigoAgencia = "0974";
	private String codigoAvaliacao = "123456789";
	private String rating = "AA";
	private String tecnicoResponsavel = "51515151522";
	private String numeroProposta = "";
	//private String taxaJuros = "5,5";
	private String codigoVerificacaoInicio = "0000000000000000";
	private String codigoVerificacaoFim = "00000000001";
	private Integer tipoProposta;
	private String qtdParcelas;
	private String parcelado;
	private String periodicidade;
	private String dataVctoPrimeiraParc;	
//	private Integer modalidade;
//	private Integer produto;
//	private Integer variedade;
//	private Integer cesta;
//	private Integer zoneamento;
//	private Integer consorcio;
	private Integer fonteRecursos;
	private String valorTotalEmpreendimento;
	private String valorPretendidoFinanciamento;

	//Helper
	LoginHelper loginHelper;
	MenuHelper menuHelper;
	CreditoRuralHelper crHelper;
	VeiculosHelper veiculosHelper;

	//@Ignore
	@Test(description = "Gerar massa de teste para o crédito rural")
	@Description("Modelo de criação de massa de dados para homologações de demandas de manutenção de sistemas – SIEMP – Crédito Rural")
	public void CreditoRuralMassaTeste() {
				
		//Executar o login no sistema
		loginHelper.PreencherCampoUsuario(username);
		loginHelper.PreencherCampoSenha(password);
		loginHelper.EfetuarLogin();
		loginHelper.EsperarLoading();
		loginHelper.VerificarLogin();
		
		//Selecionar o menu Crédito rural
		menuHelper.MenuPrincipal();
		menuHelper.MenuCreditoRural();
		
		//loginHelper.EsperarLoading();
		crHelper.IncluirCreditoRural();
		
		//Parte 1
		crHelper.VerificarFormularioProponente();
		crHelper.SelecionarPessoaFisica();
		crHelper.PreencherCampoCpf(cpf);
		crHelper.ConsultarProponente();
		crHelper.VerificarCampoTempoExperiencia();
		crHelper.PreencherCampoExperiencia(tempoExperiencia);
		crHelper.SelecionarTipoBeneficiario(tipoBeneficiario);
		crHelper.SelecionarCategoriaEmitente(categoriaEmitente);
		crHelper.SelecionarAgenciaContaPrincipal();
		crHelper.PreencherCampoCodigoAgencia(codigoAgencia);
		crHelper.PreencherCampoCodigoAvaliacao(codigoAvaliacao);
		crHelper.PreencherCampoRating(rating);
		crHelper.ProximoPasso();
		
		//Parte 2
		crHelper.PreencherCampoCpf(tecnicoResponsavel);
		crHelper.ConsultarTecnico();
		//System.out.println(loginHelper.RecuperarNumeroContrato());
		numeroProposta = crHelper.RecuperarNumeroProposta();
		crHelper.SelecionarTecnico();
		crHelper.ProximoPasso();
		
		//Parte 3
		
		crHelper.SelecionarTipoProposta(tipoProposta);

		//Incluir empreendimento
		crHelper.IncluirEmpreendimento();
		crHelper.SelecionarModalidade(1);
		crHelper.SelecionarProduto(1);
		crHelper.SelecionarVariedade(1);
		crHelper.SelecionarCesta(1);
		crHelper.SelecionarZoneamento(1);
		crHelper.SelecionarConsorcio(1);
		crHelper.ConsultarEmpreendimento();
		
		//dados complementares
		crHelper.SelecionarOrigemRecursos(fonteRecursos);
		crHelper.SelecionarProdutoSiemp(1);
		crHelper.SelecionarNaturezaIOF(1);
		crHelper.PreencherInpValorTotal(valorTotalEmpreendimento);
		crHelper.PreencherInpPretendidoFinanciamento(valorPretendidoFinanciamento);
		crHelper.PreencherInpTaxaFinanciamentoEmpreendimento("550");
		
		//Localização
		crHelper.SelectUF("DF");
		crHelper.SelectMunicipio("BRASILIA");
		
		//Propriedades do empreendimento
		crHelper.BtnVincularPropriedade();
		crHelper.InpCodigoRegistro("123456789");
		crHelper.InpAreaUtilizada("10000");
		crHelper.InpNumCar("DF111111111111111111111111111111111111111");
		crHelper.InpCpfProprietario("00032017839");
		crHelper.InpNomePropriedade("teste");
		crHelper.InpAreaTotal("10000");
		crHelper.TxtRoteiroAcesso("teste");
		crHelper.BtnIncluirImovel();
		
		//Salvar empreendimento
		crHelper.BtnAbrirModalSalvarEmpreendimento();
		crHelper.ProximoPasso();
		
		//Parte 4
		crHelper.ProximoPasso();
		
		
		//Parte 5
		crHelper.BtnIncluirAnaliseDocumental();
		crHelper.CheckListConformidade();
		crHelper.BtnAprovarEnviar();
		
		crHelper.ProximoPasso();
		
		//Parte 6
		crHelper.BtnIniciarAnalise();
		crHelper.BtnSelecionarEmpreendimento();
		
		crHelper.SelectIntegracao("0");
		crHelper.SelectIrrigacao("0");
		crHelper.SelectProducao("0");
		crHelper.SelectAgricultura("0");
		crHelper.SelectGraoSemente("0");
		crHelper.SelectCultivo("0");
		crHelper.InpQtdProducao("10000000");
		crHelper.InpAreaProducao("10000");
		crHelper.DataInicioPlantio("01012020");
		crHelper.DataInicioColheita("01022020");
		crHelper.DataFimPlantio("01022020");
		crHelper.DataFimColheita("25022020");
		
		//Incluir dados utilização
		crHelper.BtnIncluirDadosUtilizacao();
		crHelper.SelecionarFase("1");
		crHelper.PreencherInpValor("10000000");
		crHelper.PreencherInpValorMaximoFinanciavel("10000000");
		crHelper.DataLiberacao();
		crHelper.BtnSalvarDadosUtilizacao();
		crHelper.FormaPagamento(parcelado, qtdParcelas, periodicidade, dataVctoPrimeiraParc);
		crHelper.BtnSalvarDadosEmpreendimento();
		
		crHelper.BtnAprovarTecnica();

		crHelper.ProximoPasso();
		
		//Parte 7
		crHelper.ProximoPasso();
		
		//Parte 8
		crHelper.BtnIniciarAnaliseCronogramas();
		crHelper.BtnSelecionarCronograma();
		crHelper.BtnAdicionarDestinatario();
		crHelper.SelecionarTipoContaDestinatario();
		crHelper.SelecionarCoCli();
		crHelper.SelecionarConta();
		crHelper.BtnSalvarDestinatario();		
		crHelper.PreencherDataReembolso(parcelado);
		crHelper.BtnSalvarCronograma();
		crHelper.ProximoPasso();

		//Parte 9
		crHelper.BtnSelecionarGarantia();
		crHelper.BtnIncluirGarantia();
		crHelper.ComboModalidadeGarantia();
		crHelper.ComboTipoGarantia();
		crHelper.TxtValorGarantia();
		crHelper.BtnSalvarGarantiaDyn();
		crHelper.ProximoPasso();
		
		//Parte 10
		crHelper.BtnSelecionarSeguro();
		crHelper.BtnIncluiSeguroAgricola();
		crHelper.SlcOrigemSeguro();
		crHelper.SeguroNaoObrigatorio();
		crHelper.GravaSeguro();
		
		crHelper.BtnInformaCodigo();
		crHelper.SlcOrigemSeguro();
		crHelper.SeguroNaoObrigatorio();
		crHelper.GravaSeguro();
		
		crHelper.ProximoPasso();
		
		//Parte 11
		//Criar código de validação
		String codigoValidacao = codigoVerificacaoInicio + numeroProposta + codigoVerificacaoFim;
		crHelper.CodigoRefAgricola(codigoValidacao);
		crHelper.BtnEnviarAnaliseNegocial();
		crHelper.ProximoPasso();		
		
		//Parte 12
		crHelper.BtnIniciarFinalizacao();
		crHelper.SelectInstrumentoCredito();
		crHelper.BtnCalcularProposta();
		crHelper.BtnEnviarSicor();
		crHelper.AtualizarPagina();
		crHelper.ImprimirContrato();
		crHelper.FecharModaContrato();
		crHelper.EnviarConformidade();
		crHelper.SelecionarConfirmacaoDocumento();
		crHelper.BtnConfirmarConformidade();
		crHelper.UploadInpArquivo("C:\\teste.pdf");
		crHelper.BtnAnexarArquivoFinalizacao();
		crHelper.ProximoPasso();
		//Parte processo
		crHelper.SelectProcesso();
		crHelper.TxaJustificativa();
		crHelper.BtnSolicitarProcesso();
		crHelper.BtnDetalharSolicitacao();
		crHelper.BtnAlterarSolicitacao();
		crHelper.SelecionarSituacao();
		crHelper.BtnSalvarAlteracao();	

		crHelper.Pausa();
	
		
				
	}
	
	//Caso para teste
	@Ignore
	@Test
	public void EnvelhecerContrato() {
		//267650 
		//Evelhecer contrato

		loginHelper.EnvelhecerContratoMes("267674", 6);
		
		
	}
	
	
	//caso de teste para gerar massa construcard
	@Test
	@Ignore
	public void ContrucardMassaTeste() {
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
		menuHelper.MenuConstrucard();
		menuHelper.ConsultarPropostasConstrucard();
		menuHelper.Pausa();
	}
	

	
	//Annotations for teste
	
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
		crHelper = new CreditoRuralHelper(driver);
		veiculosHelper = new VeiculosHelper(driver);
		
		
		username = Properties.username;
		password = Properties.password;
		
		//Credito rural
		cpf = Properties.cpf;
		parcelado = Properties.parcelado;
		qtdParcelas = Properties.qtdParcelas;
		dataVctoPrimeiraParc = Properties.dataVctoPrimeiraParc;
		periodicidade = Properties.periodicidade;
		tempoExperiencia = Properties.tempoExperiencia;
		tipoProposta = Integer.parseInt(Properties.tipoProposta);
		fonteRecursos = Integer.parseInt(Properties.fonteRecursos);
		valorTotalEmpreendimento = Properties.valorTotalEmpreendimento;
		valorPretendidoFinanciamento = Properties.valorPretendidoFinanciamento;
		
		//Veiculos
		
		
	}

	@AfterSuite
	public void SuiteTearDown( ) {
		KillDriver();
		
	}
	

}