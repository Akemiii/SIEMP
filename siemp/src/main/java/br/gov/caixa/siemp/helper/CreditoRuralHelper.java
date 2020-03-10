package br.gov.caixa.siemp.helper;

import org.openqa.selenium.WebDriver;
import br.gov.caixa.siemp.pages.CreditoRuralPage;
import io.qameta.allure.Step;

public class CreditoRuralHelper extends BaseHelper{

	CreditoRuralPage crPage;
	
	public CreditoRuralHelper(WebDriver driver) {
		super(driver);
		crPage = new CreditoRuralPage(driver);
	}


	@Step("Incluir Crédito Rural")
	public void IncluirCreditoRural() {
		EsperarSegundos(50000);
		ClicarBotao(crPage.BTN_INCLUIR_CREDITO);
	}
	
	//Parte 1
	public void VerificarFormularioProponente() {
		VerificarElementoExiste(crPage.INPUT_TIPO_PESSOA_FISICA);
	}
	
	@Step("Selecionar pessoa física")
	public void SelecionarPessoaFisica() {
		SelecionarRadio(crPage.INPUT_TIPO_PESSOA_FISICA);
	}
	
	@Step("Preencher campo cpf")
	public void PreencherCampoCpf(String campoCpf) {
		VerificarClienteInadiplente(crPage.BTN_CONFIRMAR);
		PreencherCampo(crPage.INPUT_CAMPO_CPF, campoCpf);
		saveScreenshotPNG(driver);
	}
	
	@Step("Consultar Proponente")
	public void ConsultarProponente() {
		ClicarBotaoInterativo(crPage.BTN_CONSULTAR_CPF);
	}
	
	public void VerificarCampoTempoExperiencia() {
		VerificarElementoExiste(crPage.CAMPO_TEMPO_EXPERIENCIA);
	}
	
	@Step("Preencher campo experiência")
	public void PreencherCampoExperiencia(String tempoExperiencia) {
		PreencherCampo(crPage.CAMPO_TEMPO_EXPERIENCIA, tempoExperiencia);
	}
	
	@Step("Selecionar beneficiario")
	public void SelecionarTipoBeneficiario(String tipoBeneficiario) {
		SelecionarItemPorTexto(crPage.SELECT_TIPO_BENEFICIARIO, tipoBeneficiario);
	}
	
	@Step("Selecionar categoria emitente")
	public void SelecionarCategoriaEmitente(String categoriaEmitente) {
		SelecionarItemPorTexto(crPage.SELECT_CATEGORIA_EMITENTE, categoriaEmitente);
	}
	
	@Step("Selecionar agencia conta principal")
	public void SelecionarAgenciaContaPrincipal() {
		ScrollToElement(300);
		SelecionarItemPorIndex(crPage.SELECT_AGENCIA_PRINCIPAL, 1);
		saveScreenshotPNG(driver);
	}
	
	@Step("Preencher campo codigo agencia")
	public void  PreencherCampoCodigoAgencia(String codigoAgencia) {
		ScrollToElement(900);
		PreencherCampo(crPage.CODIGO_AGENCIA, codigoAgencia);
	}
	
	@Step("Preencher campo codigo avaliação")
	public void PreencherCampoCodigoAvaliacao(String codigoAvaliacao) {
		PreencherCampo(crPage.CODIGO_AVALIACAO, codigoAvaliacao);
	}
	
	@Step("Preencher campo rating")
	public void PreencherCampoRating(String rating) {
		PreencherCampo(crPage.RATING, rating);
		saveScreenshotPNG(driver);
	}
	
	public void RecuperarDadosAvaliacao() {
		ClicarBotao(crPage.BTN_RECUPERAR);
	}
	
	//Parte 2
	@Step("Consultar tecnico")
	public void ConsultarTecnico() {
		ClicarBotao(crPage.BTN_CONSULTAR_TECNICO);
	}
	
	@Step("Selecionar tecnico")
	public void SelecionarTecnico() {
		EsperarSegundos(1000);
		ClicarBotao(crPage.SELECIONAR_TECNICO);
		EsperarSegundos(1000);
		ScrollToElement(1500);
		EsperarSegundos(2000);
	}
	
	//Parte 3
	@Step("Selecionar tipo proposta")
	public void SelecionarTipoProposta(Integer tipoProposta) {
		tipoProposta++;
		SelecionarItemPorIndex(crPage.SELECT_TIPO_PROPOSTA, tipoProposta);
	}
	
	@Step("Incluir Empreendimento")
	public void IncluirEmpreendimento() {
		EsperarSegundos(1000);
		ClicarBotao(crPage.BTN_INCLUIR_EMPREENDIMENTO);
		EsperarSegundos(1000);
	}
	
	@Step("Selecionar modalidade")
	public void SelecionarModalidade(Integer modalidade) {
		SelecionarItemPorIndex(crPage.SELECT_MODALIDADE, modalidade);
	}
	
	@Step("Selecionar produto")
	public void SelecionarProduto(Integer produto) {
		SelecionarItemPorIndex(crPage.SELECT_PRODUTO, produto);
	}
	
	@Step("Selecionar variedade")
	public void SelecionarVariedade(Integer variedade) {
		SelecionarItemPorIndex(crPage.SELECT_VARIEDADE, variedade);
	}
	
	@Step("Selecionar Cesta")
	public void SelecionarCesta(Integer cesta) {
		SelecionarItemPorIndex(crPage.SELECT_CESTA, cesta);
	}
	
	@Step("Selecionar zoneamento")
	public void SelecionarZoneamento(Integer zoneamento) {
		SelecionarItemPorIndex(crPage.SELECT_ZONEAMENTO, zoneamento);
	}
	
	@Step("Selecionar consorcio")
	public void SelecionarConsorcio(Integer consorcio) {
		SelecionarItemPorIndex(crPage.SELECT_CONSORCIO, consorcio);
		saveScreenshotPNG(driver);
	}
	
	@Step("Consultar empreendimento")
	public void ConsultarEmpreendimento() {
		ClicarBotao(crPage.CONSULTAR_EMPREENDIMENTO);
		EsperarSegundos(2000);
		ScrollToElement(400);
	}
	
	//Dados complementares
	@Step("Selecionar origem recursos")
	public void SelecionarOrigemRecursos(Integer origemRecursos) {
		EsperarSegundos(2000);
		SelecionarItemPorIndex(crPage.SELECT_ORIGEM_RECURSOS,origemRecursos);
		EsperarSegundos(1000);
	}
	
	@Step("Selecionar Produto Siemp")
	public void SelecionarProdutoSiemp(Integer produtoSiemp) {
		SelecionarItemPorIndex(crPage.SELECT_PRODUTOS_SIEMP, produtoSiemp);
	}
	
	@Step("Selecionar Natureza IOF")
	public void SelecionarNaturezaIOF(Integer naturezaIOF) {
		SelecionarItemPorIndex(crPage.SELECT_NATUREZA_IOF, naturezaIOF);
	}
	
	@Step("Preencher INP valor total")
	public void PreencherInpValorTotal(String inpValor) {
		PreencherCampo(crPage.INP_VALOR_TOTAL, inpValor);
	}
	
	@Step("Preencher INP pretendido financiamento")
	public void PreencherInpPretendidoFinanciamento(String inpPretendido) {
		PreencherCampo(crPage.INP_VALOR_PRETENDIDO_FINANCIAMENTO, inpPretendido);
	}
	
	@Step("Preencher INP taxa financiamento empreendimento")
	public void PreencherInpTaxaFinanciamentoEmpreendimento(String inpTaxa) {
		PreencherCampo(crPage.INP_TAXA_FINANCIAMENTO_EMPREENDIMENTO, inpTaxa);
		saveScreenshotPNG(driver);
		ScrollToElement(200);
	}
	
	
	//Localização
	@Step("Selecionar UF")
	public void SelectUF(String uf) {
		SelecionarItemPorTexto(crPage.SELECT_UF, uf);
	}
	
	@Step("Selecionar Municipio")
	public void SelectMunicipio(String municipio) {
		SelecionarItemPorTexto(crPage.SELECT_MUNICIPIO, municipio);
		saveScreenshotPNG(driver);
		ScrollToElement(200);
	}
	
	//Propriedades do empreendimento
	@Step("Clicar vincular propriedade")
	public void BtnVincularPropriedade() {
		ClicarBotao(crPage.BTN_VINCULAR_PROPRIEDADE);
	}
	
	@Step("Preencher INP codigo registro")
	public void InpCodigoRegistro(String inpRegistro) {
		PreencherCampo(crPage.INP_CODIGO_REGISTRO, inpRegistro);
	}
	
	@Step("Preencher INP area utilizada")
	public void InpAreaUtilizada(String inpAreaUtilizada) {
		PreencherCampo(crPage.INP_AREA_UTILIZADA, inpAreaUtilizada);
	}
	
	@Step("Preencher INP numcar")
	public void InpNumCar(String inpNumCar) {
		PreencherCampo(crPage.NUM_CAR, inpNumCar);
	}
	
	@Step("Preencher INP cpf proprietario")
	public void InpCpfProprietario(String inpCpfProprietario) {
		PreencherCampo(crPage.INP_CPF_PROPRETARIO, inpCpfProprietario);
	}
	
	@Step("Preencher INP nome propriedade")
	public void InpNomePropriedade(String nomePropriedade) {
		PreencherCampo(crPage.INP_NOME_PROPRIEDADE, nomePropriedade);
	}
	
	@Step("Preencher INP area total")
	public void InpAreaTotal(String inpAreaTotal) {
		PreencherCampo(crPage.INP_AREA_TOTAL, inpAreaTotal);
	}
	
	@Step("Preencher roteiro acesso")
	public void TxtRoteiroAcesso(String roteiroAcesso) {
		PreencherCampo(crPage.TXT_ROTEIRO_ACESSO, roteiroAcesso);
		saveScreenshotPNG(driver);
	}
	
	@Step("Clicar incluir imovel")
	public void BtnIncluirImovel() {
		ClicarBotao(crPage.BTN_INCLUIR_IMOVEL);
	}
	
	@Step("Clicar salvar empreendimento")
	public void BtnAbrirModalSalvarEmpreendimento() {
		EsperarSegundos(2000);
		ScrollToElement(400);
		ScrollToElement(1000);
		ClicarBotao(crPage.BTN_ABRIR_MODAL_SALVAR_EMPREENDIMENTO);
		EsperarSegundos(1000);
		ScrollToElement(700);
	}
	
	//Parte 5
	@Step("Clicar incluir analise documental")
	public void BtnIncluirAnaliseDocumental() {
		ScrollToElement(600);
		ClicarBotao(crPage.BTN_ENVIAR_ANALISE_DOCUMENTAL);
		EsperarSegundos(2000);
		ScrollToElement(700);
	}
	
	@Step("Selecionar itens de conferencia")
	public void CheckListConformidade() {
		EsperarSegundos(1000);
		SelecionarItens(crPage.SELECT_CONFERENCIA1);
		ScrollToElement(400);
	}	
	
	@Step("Clicar aprovar enviar...")
	public void BtnAprovarEnviar() {
		ClicarBotao(crPage.BTN_APROVAR_ENVIAR);
		ScrollToElement(1400);
	}
	
	
	//Parte6
	@Step("Clicar iniciar analise")
	public void BtnIniciarAnalise(){
		ScrollToElement(400);
		ClicarBotao(crPage.BTN_INICIAR_ANALISE_TECNICA);
		ScrollToElement(400);
	}
	
	@Step("Clicar Selecionar empreendimento")
	public void BtnSelecionarEmpreendimento() {
		EsperarSegundos(1000);
		ClicarBotao(crPage.BTN_SELECIONAR_EMPREENDIMENTO);
	}
	
	@Step("Selecionar integração")
	public void SelectIntegracao(String integracao) {
		SelecionarItemPorValue(crPage.SELECT_INTEGRACAO, integracao);
	}
	
	@Step("Selecionar irrigação")
	public void SelectIrrigacao(String irrigacao) {
		SelecionarItemPorValue(crPage.SELECT_IRRIGACAO, irrigacao);
	}
	
	@Step("Selecionar produção")
	public void SelectProducao(String producao) {
		SelecionarItemPorValue(crPage.SELECT_PRODUCAO, producao);
	}
	
	@Step("Preencher inp quantidade produção")
	public void InpQtdProducao(String inpProducao){
		PreencherCampo(crPage.INP_QTD_PRODUCAO, inpProducao);
	}
	
	@Step("Selecionar agricultura")
	public void SelectAgricultura(String agricultura) {
		SelecionarItemPorValue(crPage.SELECT_AGRICULTURA, agricultura);
	}
	
	@Step("Selecionar grão semente")
	public void SelectGraoSemente(String graoSemente) {
		SelecionarItemPorValue(crPage.SELECT_GRAO_SEMENTE, graoSemente);
	}
	
	@Step("Selecionar cultivo")
	public void SelectCultivo(String cultivo) {
		SelecionarItemPorValue(crPage.SELECT_CULTIVO, cultivo);
	}
	
	@Step("Preencher inp área produção")
	public void InpAreaProducao(String areaProducao) {
		PreencherCampo(crPage.INP_AREA_PRODUCAO, areaProducao);
	}
	
	@Step("Preencher data inicio plantio")
	public void DataInicioPlantio(String inicioPlantio) {
		PreencherCampo(crPage.DATA_INICIO_PLANTIO, inicioPlantio);
	}
	
	@Step("Preencher data inicio colheita")
	public void DataInicioColheita(String inicioColheita) {
		PreencherCampo(crPage.DATA_INICIO_COLHEITA, inicioColheita);
	}
	
	@Step("Preencher data fim plantio")
	public void DataFimPlantio(String fimPlantio) {
		PreencherCampo(crPage.DATA_FIM_PLANTIO, fimPlantio);
	}
	
	@Step("Preencher data fim colheita")
	public void DataFimColheita(String fimColheita) {
		PreencherCampo(crPage.DATA_FIM_COLHEITA, fimColheita);
	}
	
	@Step("Clicar incluir dados utilização")
	public void BtnIncluirDadosUtilizacao() {
		ScrollToElement(200);
		ClicarBotao(crPage.BTN_INCLUIR_DADOS_UTILIZACAO);
	}
	
	@Step("Selecionar fase")
	public void SelecionarFase(String fase) {
		SelecionarItemPorValue(crPage.SELECT_FASE, fase);
	}
	
	@Step("Preencher inp valor")
	public void PreencherInpValor(String inpValor) {
		PreencherCampo(crPage.INP_VALOR, inpValor);
	}
	
	@Step("Preencher inp valor maximo financiavel")
	public void PreencherInpValorMaximoFinanciavel(String valorMaximoFinanciavel) {
		PreencherCampo(crPage.INP_VALOR_MAXIMO_FINANCIAVEL, valorMaximoFinanciavel);
	}
	
	@Step("Preencher data liberação")
	public void DataLiberacao() {
		PreencherCampo(crPage.DATA_LIBERACAO, RecuperarDataAtual());
	}
	
	@Step("Preencher data maximo reembolso")
	public void DataMaximoReembolso() {
		PreencherCampo(crPage.DATA_MAXIMA_REEMBOLSO, "15032020");
	}
	
	@Step("Clicar salvar dados utilização")
	public void BtnSalvarDadosUtilizacao() {
		ClicarBotao(crPage.BTN_SALVAR_DADOS_UTILIZACAO);
	}
	
	@Step("Clicar salvar dados empreendimento")
	public void BtnSalvarDadosEmpreendimento() {
		ClicarBotao(crPage.BTN_SALVAR_DADOS_EMPREENDIMENTO);
	}
	
	@Step("Clicar aprovar técnica")
	public void BtnAprovarTecnica() {
		ScrollToElement(1000);
		ClicarBotao(crPage.BTN_APROVAR_TECNICA);
	}
	
	@Step("Preencher informações da parcela")
	public void FormaPagamento(String parcelado, String qtdParcelas, String periodicidade, String dataVctoPrimeiraParc) {
		
		if(parcelado.toUpperCase().equals("SIM")) {
			BtnParcelado(qtdParcelas, periodicidade);
			DataVctoPrimeiraParc(dataVctoPrimeiraParc);
		}else {
			BtnParcelaUnica();
			DataMaximoReembolso();
		}
		saveScreenshotPNG(driver);
	}
	
	@Step("Clicar parcela única")
	public void BtnParcelaUnica() {
		EsperarSegundos(2000);
		ScrollToElement(500);
		ClicarRadioButton(crPage.TIPO_REEMBOLSO_PARCELA_UNICA);
	}
	
	@Step("Clicar parcelado")
	public void BtnParcelado(String qtdParcelas, String periodicidade) {
		EsperarSegundos(2000);
		ScrollToElement(500);
		ClicarRadioButton(crPage.TIPO_REEMBOLSO_PARCELADO);
		
		PreencherCampo(crPage.INP_QTD_PARCELAS_REEMBOLSO, qtdParcelas);
		SelecionarItemPorTexto(crPage.SELECT_PERIODICIDADE, periodicidade);
	}
	
	@Step("Preencher data vencimento primeira parcela")
	public void DataVctoPrimeiraParc(String texto) {
		PreencherCampo(crPage.DATA_VCTO_PRIMEIRA_PARC_AMORTIZACAO, texto);
		saveScreenshotPNG(driver);
	}
	
	//TODO:: implementar contrato parcelado
	
	//Parte 8
	@Step("Clicar iniciar analise cronogramas")
	public void BtnIniciarAnaliseCronogramas() {
		ClicarBotao(crPage.BTN_INICIAR_ANALISE_CRONOGRAMAS);
	}
	
	@Step("Clicar selecionar cronograma")
	public void BtnSelecionarCronograma() {
		ClicarBotao(crPage.BTN_SELECIONAR_CRONOGRAMA);
	}
	
	@Step("Clicar adicionar destinatario")
	public void BtnAdicionarDestinatario() {
		ClicarBotao(crPage.NOME_DESTINATARIO);
	}
	
	@Step("Selecionar tipo conta destinatario")
	public void SelecionarTipoContaDestinatario() {
		SelecionarItemPorValue(crPage.SELECT_DESTINATARIO, "1");
	}
	
	@Step("Selecionar conta cliente")
	public void SelecionarCoCli() {
		SelecionarItemPorValue(crPage.SELECT_CO_CLI, "0");
	}
	
	@Step("Selecionar conta")
	public void SelecionarConta() {
		SelecionarItemPorValue(crPage.SELECT_CONTA, "0");
	}	
	
	@Step("Clicar salvar destinatario")
	public void BtnSalvarDestinatario() {
		ClicarBotao(crPage.BTN_SALVAR_DESTINATARIO);
	}
	
	@Step("Preencher data reembolso")
	public void PreencherDataReembolso(String parcelado) {
		EsperarSegundos(1000);
		ScrollToElement(1000);
		if(parcelado.toUpperCase().equals("SIM")) {
			DataReembolsoParcela();
		}else {
			DataReembolsoUnico();
		}
		saveScreenshotPNG(driver);
	}
	
	@Step("Preencher data reembolso parcela")
	public void DataReembolsoParcela() {
		PreencherCampo(crPage.DATA_REEMBOLSO_PARC, "15");
	}
	
	@Step("Preencher data reembolso único")
	public void DataReembolsoUnico() {
		PreencherCampo(crPage.DT_REEMBOLSO_UNICO, "15032020");
	}
	
	@Step("Clicar salvar cronograma")
	public void BtnSalvarCronograma() {
		ClicarBotao(crPage.BTN_SALVAR_CRONOGRAMA);
	}
	
	
	//Parte 9
	@Step("Clicar selecionar garantia")
	public void BtnSelecionarGarantia() {
		ClicarBotao(crPage.BTN_SELECIONAR_GARANTIA);
	}
	
	@Step("Clicar incluir garantia")
	public void BtnIncluirGarantia() {
		EsperarSegundos(2000);
		ClicarBotao(crPage.BTN_INCLUIR_GARANTIA);
	}
	
	@Step("Selecionar modalidade garantia")
	public void ComboModalidadeGarantia() {
		SelecionarItemPorTexto(crPage.COMBO_MODALIDADE_GARANTIA, "Hipoteca de Imóvel Rural ou Terreno Urbano - Primeiro Grau");
	}
	
	@Step("Selecionar tipo garantia")
	public void ComboTipoGarantia() {
		SelecionarItemPorTexto(crPage.COMBO_TIPO_GARANTIA, "0564 - Hipoteca - Primeiro grau - Outros tipos de imóveis");
	}
	
	@Step("Preencher valor garantia")
	public void TxtValorGarantia() {
		PreencherCampo(crPage.TXT_VALOR_GARANTIA, "15000000");
	}
	
	@Step("Clicar salvar garantia")
	public void BtnSalvarGarantiaDyn() {
		ClicarBotao(crPage.BTN_SALVAR_GARANTIA_DYN);
	}
	
	//Parte 10
	@Step("Clicar selecionar seguro")
	public void BtnSelecionarSeguro() {
		ClicarBotao(crPage.BTN_SELECIONAR_SEGURO);
	}
	
	@Step("Clicar inclui seguro agricola")
	public void BtnIncluiSeguroAgricola() {
		ClicarBotao(crPage.BTN_INCLUI_SEGURO_AGRICOLA);
	}
	
	@Step("Selecionar origem seguro")
	public void SlcOrigemSeguro() {
		SelecionarItemPorTexto(crPage.SLC_ORIGEM_SEGURO, "Sem seguro");
	}
	
	@Step("Clicar seguro não ogrigatório")
	public void SeguroNaoObrigatorio() {
		EsperarSegundos(2000);
		ClicarRadioButton(crPage.SEGURO_NAO_OBRIGATORIO);
	}
	
	@Step("Clicar gravar seguro")
	public void GravaSeguro() {
		ClicarBotao(crPage.BTN_GRAVA_SEGURO);
	}
	
	@Step("Clicar informa código")
	public void BtnInformaCodigo() {
		EsperarSegundos(1000);
		ScrollToElement(1000);
		EsperarSegundos(1000);
		ClicarBotao(crPage.BTN_INFORMA_CODIGO);
	}
	
	//Parte 11
	@Step("Preencher código ref agricola")
	public void CodigoRefAgricola(String texto) {
		PreencherCampo(crPage.CODIGO_REF_AGRICOLA, texto);
		saveScreenshotPNG(driver);
	}
	
	@Step("Clicar enviar analise negocial")
	public void BtnEnviarAnaliseNegocial() {
		ClicarBotao(crPage.BTN_ENVIAR_ANALISE_NEGOCIAL);
	}
	
	
	//Parte 12 
	@Step("Clicar iniciar finalização")
	public void BtnIniciarFinalizacao() {
		EsperarSegundos(1000);
		ClicarBotao(crPage.BTN_INICIAR_FINALIZACAO);
	}
	
	@Step("Selecionar instrumento crédito")
	public void SelectInstrumentoCredito() {
		EsperarSegundos(1000);
		ScrollToElement(300);
		SelecionarItemPorValue(crPage.SELECT_INSTRUMENTO_CREDITO, "1");
	}
	
	@Step("Clicar calcular proposta")
	public void BtnCalcularProposta() {
		ScrollToElement(200);
		ClicarBotao(crPage.BTN_CALCULAR_PROPOSTA);
		ScrollToElement(500);
	}
	
	@Step("Clicar enviar sicor")
	public void BtnEnviarSicor() {
		EsperarSegundos(1000);
		ScrollToElement(1000);
		ClicarBotao(crPage.BTN_ENVIAR_SICOR);
	}
	
	@Step("Atualizar pagina")
	public void AtualizarPagina() {
		EsperarSegundos(1500);
		ScrollToElement(1000);
		saveScreenshotPNG(driver);
		ClicarBotao(crPage.BTN_ATUALIZAR_PAGINA);
	}
	
	@Step("Imprimir contrato")
	public void ImprimirContrato() {
		EsperarSegundos(1000);
		ScrollToElement(1500);
		ClicarBotao(crPage.BTN_IMPRIMIR_CONTRATO);
	}
	
	@Step("Fechar modal imprimir contrato")
	public void FecharModaContrato() {
		ClicarBotao(crPage.BTN_FECHAR_MODAL);
	}
	
	@Step("Enviar Conformidade")
	public void EnviarConformidade() {
		EsperarSegundos(1000);
		ScrollToElement(1500);
		ClicarBotao(crPage.BTN_ENVIAR_CONFORMIDADE);
	}
	
	@Step("Selecionar confirmação de documentação")
	public void SelecionarConfirmacaoDocumento() {
		EsperarSegundos(5000);
		ScrollToElement(1000);
		ClicarRadioButton(crPage.ID_CONFIRMACAO_DOCUMENTO);
	}
	
	@Step("Confirmar conformidade")
	public void BtnConfirmarConformidade() {
		ClicarBotao(crPage.BTN_CONFIRMAR_CONFORMIDADE);
		ClicarBotao(crPage.BTN_CONFIRMAR);
	}
	
	@Step("Upload de arquivo")
	public void UploadInpArquivo(String arquivo) {
		EsperarSegundos(1000);
		ScrollToElement(1000);
		UploadArquivo(crPage.INP_NOME_ARQUIVO, arquivo);
		saveScreenshotPNG(driver);
	}
	
	@Step("Enviar anexo para finalização")
	public void BtnAnexarArquivoFinalizacao() {
		EsperarSegundos(8000);
		ClicarComAction(crPage.BTN_ANEXAR_ARQUIVO_FINALIZACAO);
		saveScreenshotPNG(driver);
		EsperarSegundos(10000);

	}
		
	//Next
	@Step("Selecionar o processo")
	public void SelectProcesso() {
		EsperarSegundos(10000);
		ScrollToElement(1500);
		SelecionarItemPorValue(crPage.SELECT_PROCESSO, "2");
	}
	
	@Step("Escrever a justificativa")
	public void TxaJustificativa() {
		PreencherCampo(crPage.TXA_JUSTIFICATIVA, "Teste");
	}
	
	@Step("Solicitar o processo")
	public void BtnSolicitarProcesso() {
		ClicarBotao(crPage.BTN_SOLICITAR_PROCESSO);
		ClicarBotao(crPage.BTN_CONFIRMAR);
	}
	
	@Step("Detalhar o processo")
	public void BtnDetalharSolicitacao() {
		EsperarSegundos(2000);
		ClicarBotao(crPage.ICON_DETALHAR);
	}
	
	@Step("Alterar solicitação")
	public void BtnAlterarSolicitacao() {
		EsperarSegundos(2500);
		ScrollToElement(200);
		ClicarBotao(crPage.ICON_ALTERAR);
	}
	
	@Step("Selecionar Situação")
	public void SelecionarSituacao() {
		SelecionarItemPorTexto(crPage.SELECT_SITUACAO, "AUTORIZADA");
	}
	
	@Step("Salvar Alteração")
	public void BtnSalvarAlteracao() {
		ClicarBotao(crPage.BTN_SALVAR_ALTERACAO);
		EsperarSegundos(2000);
		saveScreenshotPNG(driver);
	}

	public void SelecionarEtapa() {
		EsperarSegundos(5000);
		ScrollToElement(500);
		ClicarComAction(crPage.STEP_12);
	}
	
	@Step("Recupearar número do contrato")
	public String RecuperarNumeroContrato() {
		
		return crPage.NUMERO_CONTRATO.getText();
	}
	
	//Recuperar número do contrato
	@Step("Recuperar contrato/proposta")
	public String RecuperarNumeroProposta() {
		return RecuperarTexto(crPage.NUMERO_PROPOSTA);
	}
	
	

	
	
}
