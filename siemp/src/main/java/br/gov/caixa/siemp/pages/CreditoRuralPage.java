package br.gov.caixa.siemp.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreditoRuralPage extends BasePage{

	public CreditoRuralPage(WebDriver driver) {
		super(driver);
	}
	
	//Incluir proposta
	@FindBy(id = "btnIncluir")
	public WebElement BTN_INCLUIR_CREDITO;
	
	@FindBy(id = "divIdentificadorProponente")
	public WebElement INDETIFICADOR_PROPONENTE;
	
	//Parte 1
		@FindBy(id = "formProponente")
		public WebElement FORM_PROPONENTE;
		
		@FindBy(id = "tipoPessoaFisica")
		public WebElement INPUT_TIPO_PESSOA_FISICA;
		
		@FindBy(id = "numeroCPF")
		public WebElement INPUT_CAMPO_CPF;
		
		@FindBy(id = "btnConsultarCpf")
		public WebElement BTN_CONSULTAR_CPF;
		
		@FindBy(xpath = "//*[contains(text(), 'Nome Proponente:')]")
		public WebElement NOME_PROPONENTE;
		
		@FindBy(id = "txtTempoExperiencia")
		public WebElement CAMPO_TEMPO_EXPERIENCIA;
		
		@FindBy(id = "slcTpBeneficiario")
		public WebElement SELECT_TIPO_BENEFICIARIO;
		
		@FindBy(id = "comboCategoriaEmitente")
		public WebElement SELECT_CATEGORIA_EMITENTE;
		
		@FindBy(id = "comboConta")
		public WebElement SELECT_AGENCIA_PRINCIPAL;
		
		@FindBy(id = "unidadeAgencia")
		public WebElement CODIGO_AGENCIA;
		
		@FindBy(id = "txtCodigoAvaliacao")
		public WebElement CODIGO_AVALIACAO;
		
		@FindBy(id =  "txtRating")
		public WebElement RATING;
		
		@FindBy(id = "btnRecuperar")
		public WebElement BTN_RECUPERAR;
		

		//Parte 2
		@FindBy(xpath = "//*[@class='controls resultado']//*[@class='controls resultado']")
		public WebElement NUMERO_PROPOSTA;
		
		@FindBy(id = "btnConsultar")
		public WebElement BTN_CONSULTAR_TECNICO;
		
		@FindBy(xpath = "//*[@class='btn-group']//*[@class='btn btn-mini btnConsultarEmpresa SELECIONAR_TECNICO']")
		public WebElement SELECIONAR_TECNICO;
		
		//Parte 3
		@FindBy(id =  "selectTipoDeProposta")
		public WebElement SELECT_TIPO_PROPOSTA;
		
		@FindBy(id = "btnIncluirEmpreendimento")
		public WebElement BTN_INCLUIR_EMPREENDIMENTO;
		
		@FindBy(id = "selectModalidade")
		public WebElement SELECT_MODALIDADE;
		
		@FindBy(id = "selectProduto")
		public WebElement SELECT_PRODUTO;
		
		@FindBy(id  = "selectVariedade")
		public WebElement SELECT_VARIEDADE;
		
		@FindBy(id = "selectCesta")
		public WebElement SELECT_CESTA;
		
		@FindBy(id = "selectZoneamento")
		public WebElement SELECT_ZONEAMENTO;
			
		@FindBy(id = "selectConsorcio")
		public WebElement SELECT_CONSORCIO;
		
		@FindBy(id = "consultarEmpreendimento")
		public WebElement CONSULTAR_EMPREENDIMENTO;
		

		//dados complementares
		@FindBy(id = "selectOrigemDeRecursos")
		public WebElement SELECT_ORIGEM_RECURSOS;
		
		@FindBy(id = "selectProdutoSiemp")
		public WebElement SELECT_PRODUTOS_SIEMP;
		
		@FindBy(id = "selectNaturezaIOF")
		public WebElement SELECT_NATUREZA_IOF;
		
		@FindBy(id = "inpValorTotal")
		public WebElement INP_VALOR_TOTAL;
		
		@FindBy(id = "inpValorPretendidoFinanciamento")
		public WebElement INP_VALOR_PRETENDIDO_FINANCIAMENTO;
		
		@FindBy(id = "inpTaxaFinanciamentoEmpreendimento")
		public WebElement INP_TAXA_FINANCIAMENTO_EMPREENDIMENTO;
		
		//Localização
		@FindBy(id = "selectUf")
		public WebElement SELECT_UF;
		
		@FindBy(id = "selectMunicipio")
		public WebElement SELECT_MUNICIPIO;
		
		//Propriedades do empreendimento
		@FindBy(id = "btnVincularPropriedade")
		public WebElement BTN_VINCULAR_PROPRIEDADE;
		
		@FindBy(id = "inpCodigoRegistro")
		public WebElement INP_CODIGO_REGISTRO;
		
		@FindBy(id = "inpAreaUtilizada")
		public WebElement INP_AREA_UTILIZADA;
		
		@FindBy(id = "numCar")
		public WebElement NUM_CAR;
		
		@FindBy(id = "inpCpfProptr")
		public WebElement INP_CPF_PROPRETARIO;
		
		@FindBy(id = "inpNomePropriedade")
		public WebElement INP_NOME_PROPRIEDADE;
		
		@FindBy(id = "inpAreaTotal")
		public WebElement INP_AREA_TOTAL;
		
		@FindBy(id = "txtRoteiroAcesso")
		public WebElement TXT_ROTEIRO_ACESSO;
		
		@FindBy(id = "btnIncluirImovel")
		public WebElement BTN_INCLUIR_IMOVEL;
		
		//Salvar
		@FindBy(id = "btnAbrirModalSalvarEmpreendimento")
		public WebElement BTN_ABRIR_MODAL_SALVAR_EMPREENDIMENTO;
		
		//Parte 5
		@FindBy(id = "btnEnviarAnalise")
		public WebElement BTN_ENVIAR_ANALISE_DOCUMENTAL;
		
		@FindBy(id = "selectConferencia1")
		public List<WebElement> SELECT_CONFERENCIA1;
		
		@FindBy(id = "btnAprovarEnviar")
		public WebElement BTN_APROVAR_ENVIAR;
		
		//Parte 6
		@FindBy(id = "btnIniciarAnaliseTecnica")
		public WebElement BTN_INICIAR_ANALISE_TECNICA;
		
		
		@FindBy(xpath = "//*[@class='btn-group']//*[@class='btn btn-mini btnSelecionar']")
		public WebElement BTN_SELECIONAR_EMPREENDIMENTO;
		
		@FindBy(id = "selectIntegracao")
		public WebElement SELECT_INTEGRACAO;
		
		@FindBy(id = "selectIrrigacao")
		public WebElement SELECT_IRRIGACAO;
		
		@FindBy(id = "selectProducao")
		public WebElement SELECT_PRODUCAO;
		
		@FindBy(id  = "inpQtdProducao")
		public WebElement INP_QTD_PRODUCAO;
		
		@FindBy(id = "selectAgricultura")
		public WebElement SELECT_AGRICULTURA;
		
		@FindBy(id = "selectGraoSemente")
		public WebElement SELECT_GRAO_SEMENTE;
		
		@FindBy(id = "selectCultivo")
		public WebElement SELECT_CULTIVO;
		
		@FindBy(id = "inpAreaProducao")
		public WebElement INP_AREA_PRODUCAO;
		
		@FindBy(id = "dataInicioPlantio")
		public WebElement DATA_INICIO_PLANTIO;
		
		@FindBy(id = "dataInicioColheita")
		public WebElement DATA_INICIO_COLHEITA;
		
		@FindBy(id = "dataFimPlantio")
		public WebElement DATA_FIM_PLANTIO;
		
		@FindBy(id = "dataFimColheita")
		public WebElement DATA_FIM_COLHEITA;
		
		@FindBy(id = "btnIncluirDadosUtilizacao")
		public WebElement BTN_INCLUIR_DADOS_UTILIZACAO;
		
		@FindBy(id = "selectFase")
		public WebElement SELECT_FASE;
		
		@FindBy(id = "inpValor")
		public WebElement INP_VALOR;
		
		@FindBy(id = "inpValorMaximoFinanciavel")
		public WebElement INP_VALOR_MAXIMO_FINANCIAVEL;
		
		@FindBy(id = "dataLiberacao")
		public WebElement DATA_LIBERACAO;
		
		@FindBy(id = "btnSalvarDadosUtilizacao")
		public WebElement BTN_SALVAR_DADOS_UTILIZACAO;
		
		@FindBy(id = "tipoReembolsoParcelaUnica")//A vista
		public WebElement TIPO_REEMBOLSO_PARCELA_UNICA;
		
		@FindBy(id = "tipoReembolsoParcelado")//Parcelado
		public WebElement TIPO_REEMBOLSO_PARCELADO;	
		
		@FindBy(id = "selectPeriodicidade")
		public WebElement SELECT_PERIODICIDADE;

		@FindBy(id = "inpQtdParcelasReembolso")
		public WebElement INP_QTD_PARCELAS_REEMBOLSO;
		
		@FindBy(id = "dtReembolsoParc")
		public WebElement DATA_REEMBOLSO_PARC;
		
		@FindBy(id = "dataMaximaReembolso")
		public WebElement DATA_MAXIMA_REEMBOLSO;
		
		@FindBy(id = "dataVctoPrimeiraParcAmortizacao")
		public WebElement DATA_VCTO_PRIMEIRA_PARC_AMORTIZACAO;
		
		@FindBy(id = "btnSalvarDadosEmpreendimento")
		public WebElement BTN_SALVAR_DADOS_EMPREENDIMENTO;
		
		@FindBy(id = "btnAprovarTecnica")
		public WebElement BTN_APROVAR_TECNICA;
		
		//BTN NEXT
		@FindBy(id =  "crwizard_wizardBtnNext")
		public WebElement BTN_NEXT;
		
		//Cliente inadiplente
		@FindBy(id = "MDLconfirmacao_21")
		public WebElement MDL_CONFIRMACAO;
		
		@FindBy(id = "btnConfirmar")
		public WebElement BTN_CONFIRMAR;
			
		//Parte 8
		@FindBy(id = "btnIniciarAnaliseCronogramas")
		public WebElement BTN_INICIAR_ANALISE_CRONOGRAMAS;
		
		@FindBy(xpath = "//*[@class='btn-group']//*[@class='btn btn-mini btnSelecionar']")
		public WebElement BTN_SELECIONAR_CRONOGRAMA;
		
		@FindBy(xpath = "//*[@class='nomeDestinatario']")
		public WebElement NOME_DESTINATARIO;
		
		@FindBy(id = "selectDestinatario")
		public WebElement SELECT_DESTINATARIO;
		
		@FindBy(id = "selectCocli")
		public WebElement SELECT_CO_CLI;
		
		@FindBy(id = "selectConta")
		public WebElement SELECT_CONTA;
		
		@FindBy(id = "btnSalvarDestinatario")
		public WebElement BTN_SALVAR_DESTINATARIO;
		
		@FindBy(id =  "dtReembolsoUnico")
		public WebElement DT_REEMBOLSO_UNICO;
		
		@FindBy(id = "btnSalvarCronograma")
		public WebElement BTN_SALVAR_CRONOGRAMA;
		
		//Parte 9
		@FindBy(xpath = "//*[@class='btn-group']//*[@class='btn btn-mini btnSelecionar']")
		public WebElement BTN_SELECIONAR_GARANTIA;
		
		@FindBy(id = "btnIncluirGarantia")
		public WebElement BTN_INCLUIR_GARANTIA;
		
		@FindBy(id = "comboModalidadeGarantia")
		public WebElement COMBO_MODALIDADE_GARANTIA;
		
		@FindBy(id = "comboTipoGarantia")
		public WebElement COMBO_TIPO_GARANTIA;
		
		@FindBy(id = "txtValorGarantia")
		public WebElement TXT_VALOR_GARANTIA;
		
		@FindBy(id = "btnSalvarGarantiaDyn")
		public WebElement BTN_SALVAR_GARANTIA_DYN;
		
		//Parte 10
		@FindBy(xpath = "//*[@class='btn-group']//*[@class='btn btn-mini btnSelecionar']")
		public WebElement BTN_SELECIONAR_SEGURO;
		
		@FindBy(id = "btnIncluiSeguroAgricola")
		public WebElement BTN_INCLUI_SEGURO_AGRICOLA;
		
		@FindBy(id = "slcOrigemSeguro")
		public WebElement SLC_ORIGEM_SEGURO;
		
		@FindBy(xpath = "//*[@class='controls']//*[@class='radio inline']")
		public WebElement SEGURO_NAO_OBRIGATORIO;
		
		@FindBy(id = "btnGrava")
		public WebElement BTN_GRAVA_SEGURO;
		
		@FindBy(id = "btnInformaCodigo")
		public WebElement BTN_INFORMA_CODIGO;
		
		//Parte 11
		@FindBy(id = "codigoRefAgricola")
		public WebElement CODIGO_REF_AGRICOLA;	
		
		@FindBy(id = "btnEnviarAnalise")
		public WebElement BTN_ENVIAR_ANALISE_NEGOCIAL;
		
		//Parte 12
		@FindBy(id = "btnIniciarFinalizacao")
		public WebElement BTN_INICIAR_FINALIZACAO;
		
		@FindBy(id  = "selectInstrumentoCredito")
		public WebElement SELECT_INSTRUMENTO_CREDITO;
		
		@FindBy(id = "btnCalcularProposta")
		public WebElement BTN_CALCULAR_PROPOSTA;
		
		@FindBy(id = "btnEnviarSicor")
		public WebElement BTN_ENVIAR_SICOR;
		
		@FindBy(id = "btnAtualizarPagina")
		public WebElement BTN_ATUALIZAR_PAGINA;
		
		@FindBy(id = "btnImprimirContrato")
		public WebElement BTN_IMPRIMIR_CONTRATO;
		
		@FindBy(id = "aFecharModal")
		public WebElement BTN_FECHAR_MODAL;
		
		@FindBy(id = "btnEnviarConformidade")
		public WebElement BTN_ENVIAR_CONFORMIDADE;
		
		@FindBy(id = "idConfirmacaoDocumento")
		public WebElement ID_CONFIRMACAO_DOCUMENTO;
		
		@FindBy(id = "btnConfirmarConformidade")
		public WebElement BTN_CONFIRMAR_CONFORMIDADE;
		
		@FindBy(xpath = "/html/body/div[3]/div/div[2]/div[1]/div/form/div[12]/fieldset/div[1]/div/div/a")
		public WebElement INP_NOME_ARQUIVO;
		
		@FindBy(id  = "btnAnexarArquivoFinalizacao")
		public WebElement BTN_ANEXAR_ARQUIVO_FINALIZACAO;
		
		//Next page
		@FindBy(id = "selectProcesso")
		public WebElement SELECT_PROCESSO;
		
		@FindBy(id  = "txaJustificativa")
		public WebElement TXA_JUSTIFICATIVA;
		
		@FindBy(id = "btnSolicitarProcesso")
		public WebElement BTN_SOLICITAR_PROCESSO;
	
		//Lupa
		@FindBy(xpath = "//*[@class='btn btn-mini btnDetalhar']")
		public WebElement ICON_DETALHAR;
		
		@FindBy(xpath = "//*[@class='btn btn-mini btnAlterar']")
		public WebElement ICON_ALTERAR;
		
		@FindBy(id = "comboSituacao")
		public WebElement SELECT_SITUACAO;
		
		@FindBy(id = "btnSalvarAlteracao")
		public WebElement BTN_SALVAR_ALTERACAO;
		
		@FindBy(xpath = "//*[@id= 'gridEmpreendimentosProcessos']//tbody/tr/td[2]")
		public WebElement NUMERO_CONTRATO;
		
		@FindBy(id = "crwizard_step_12")
		public  WebElement STEP_12;
		
}
