package br.gov.caixa.siemp.helper;

import org.openqa.selenium.WebDriver;
import br.gov.caixa.siemp.pages.VeiculosPage;
import io.qameta.allure.Step;

public class VeiculosHelper extends BaseHelper{

	VeiculosPage vPage;
	
	public VeiculosHelper(WebDriver driver) {
		super(driver);
		vPage = new VeiculosPage(driver);
	}
	
	@Step("Selecionar tipo PF")
	public void SelecionarTipoPF() {
		SelecionarRadio(vPage.TIPO_PESSOA_SIMULACAO_PF);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar tipo PJ ")
	public void SelecionarTipoPJ() {
		SelecionarRadio(vPage.TIPO_PESSOA_SIMULACAO_PJ);
	}
	
	@Step("Preencher Data nascimneto")
	public void PreencherDataNascimento() {
		PreencherCampo(vPage.DATA_NASCIMENTO, "10101980");
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar Produto")
	public void SelecionarProduto(String produto) {
		EsperarSegundos(15000);
		ClicarBotao(vPage.SELECT_PRODUTO);
		EsperarSegundos(500);
		ClicarBotao(vPage.PRODUTO_FINANCIAMENTO_VEICULOS(produto));
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar Matriz de Taxa")
	public void SelecionarMatrizTaxa() {
		ClicarBotao(vPage.SELECT_MATRIZ_TAXA);
		EsperarSegundos(500);
		ClicarBotao(vPage.MATRIZ_TAXA);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar categoria")
	public void SelecionarCategoria() {
		ClicarBotao(vPage.SELECT_NUMERO_CATEGORIA);
		EsperarSegundos(500);
		ClicarBotao(vPage.NUMERO_CATEGORIA);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar tipo veiculo")
	public void SelecionarTipoVeiculo() {
		ClicarBotao(vPage.SELECT_TIPO_VEICULOS);
		EsperarSegundos(500);
		//Carro - Usado
		//Carro - Zero KM
		//Carro Ecoeficiente - Zero KM
		//Carro Híbrido - Zero KM
		ClicarBotao(vPage.TIPO_VEICULOS("Carro - Zero KM"));
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar marca")
	public void SelecionarMarca() {
		ClicarBotao(vPage.SELECT_MARCA);
		EsperarSegundos(500);
		//Ford
		//Nissan
		//Toyota
		//VW - VolksWagen
		ClicarBotao(vPage.MARCA("Ford"));
		saveScreenshotPNG(driver);
	}

	@Step("Selecionar modelo")
	public void SelecionarModelo() {
		ClicarBotao(vPage.SELECT_NUMERO_MODELO);
		EsperarSegundos(500);
		ClicarBotao(vPage.NUMERO_MODELO);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar ano modelo")
	public void SelecionarAnoModelo(String param) {
		ClicarBotao(vPage.SELECT_ANO_MODELO);
		EsperarSegundos(500);
		ClicarBotao(vPage.ANO_MODELO(param));
		saveScreenshotPNG(driver);
	}
	
	@Step("Preencher ano fabricação")
	public void PreencherAnoFabricacao(String param) {
		PreencherCampo(vPage.ANO_FABRICACAO, param);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar UF Licenciamento")
	public void SelecionarUFLicenciamento(String param) {
		ClicarBotao(vPage.SELECT_UF_LICENCIAMENTO);
		EsperarSegundos(500);
		ClicarBotao(vPage.UF_LICENCIAMENTO(param));
		saveScreenshotPNG(driver);
	}

	@Step("Preencher valor veiculo")
	public void PreencherValorVeiculo(String valor) {
				
		PreencherCampo(vPage.VALOR_VEICULO, valor);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar calculo entrada")
	public void TipoCalculoEntrada() {
		ClicarRadioButton(vPage.TIPO_CALCULO_ENTRADA);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar calculo financiar")
	public void TipoCalculoFinanciar() {
		ClicarRadioButton(vPage.TIPO_CALCULO_FINANCIAR);
		saveScreenshotPNG(driver);
	}
	
	@Step("Preencher valor entrada")
	public void PreencherValorEntrada(String valor) {
		
		PreencherCampoComAction(vPage.VALOR_ENTRADA, valor);
		saveScreenshotPNG(driver);
	}
	
	@Step("Preencher valor contrato")
	public void PreencherValorContrato(Integer param) {
		
		String valor = String.valueOf(param);
		PreencherCampo(vPage.VALOR_CONTRATO, valor);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar natureza IOF")
	public void SelecionarNaturezaIOF(Integer param) {
		ScrollToElement(200);
		SelecionarItemPorIndex(vPage.SELECT_NATUREZA_IOF, param);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar natureza depesas")
	public void SelecionarNaturezaDespesasTerceiro(Integer param) {
		ScrollToElement(200);
		SelecionarItemPorIndex(vPage.SELECT_NATUREZA_DESPESAS_TERCEIRO, param);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar dia vencimento prestação")
	public void SelecionarDiaVencimentoPrestacao(String param) {
		ScrollToElement(200);
		ClicarBotao(vPage.SELECT_DIA_VENCIMENTO_PRESTACAO);
		EsperarSegundos(500);
		ClicarBotao(vPage.DIA_VENCIMENTO_PRESTACAO(param));
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar seguro caixa")
	public void SelecionarSeguroCaixa(String param) {
		ScrollToElement(200);
		if(param.toLowerCase().equals("sim")) {
			SelecionarRadio(vPage.SEGURO_AUTO_CAIXA_SEGUROS_SIM);
		}else {
			SelecionarRadio(vPage.SEGURO_AUTO_CAIXA_SEGUROS_NAO);
		}
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar cliente aposentado")
	public void SelecionarClienteAposetado(String param) {
		ScrollToElement(200);
		if(param.toLowerCase().equals("sim")) {
			SelecionarRadio(vPage.CLIENTE_APOSENTADO_SIM);
		}else {
			SelecionarRadio(vPage.CLIENTE_APOSENTADO_NAO);
		}
		saveScreenshotPNG(driver);
	}
	
	@Step("Clicar botão simular")
	public void ClicarBotaoSimular() {
		ScrollToElement(200);
		ClicarBotao(vPage.BOTAO_SIMULAR);
	}
	
	@Step("Selecionar relacionamento PV")
	public void SelecionarRelacionamentoPV() {
		EsperarSegundos(1000);
		ClicarRadioButton(vPage.RELACIONAMENTO_PV);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar relacionamento SR")
	public void SelecionarRelacionamentoSR() {
		EsperarSegundos(1000);
		ClicarRadioButton(vPage.RELACIONAMENTO_SR);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar porte empresa MPE")
	public void SelecionarPorteEmpresaMPE() {
		EsperarSegundos(1000);
		ClicarRadioButton(vPage.PORTE_EMPRESA_MPE);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar porte empresa MGE")
	public void SelecionarPorteEmpresaMGE() {
		EsperarSegundos(1000);
		ClicarRadioButton(vPage.PORTE_EMPRESA_MGE);
		saveScreenshotPNG(driver);
	}
	
	@Step("Preencher quantidade veiculos")
	public void PreencherQuantidadeVeiculos(String param) {
		ScrollToElement(200);
		EsperarSegundos(500);
		PreencherCampo(vPage.QUANTIDADE_VEICULOS, param);
		saveScreenshotPNG(driver);
	}
	
	@Step("Preencher percentual amortização")
	public void PreencherPercentualAmortizacao(String param) {
		ScrollToElement(300);
		EsperarSegundos(500);
		PreencherCampo(vPage.PERCENTUAL_AMORTIZACAO, param);
		saveScreenshotPNG(driver);
	}
	
	@Step("Clicar Botão incluir")
	public void BotaoIncluir() {
		EsperarSegundos(40000);
		ClicarBotao(vPage.BOTAO_INCLUIR);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar dados tipo pj")
	public void SelecionarDadosTipoPJ() {
		EsperarSegundos(5000);
		SelecionarRadio(vPage.SELECIONAR_TIPO_PJ);
		saveScreenshotPNG(driver);
	}
	
	
	@Step("Selecionar dados tipo pf")
	public void SelecionarDadosTipoPF() {
		EsperarSegundos(5000);
		SelecionarRadio(vPage.SELECIONAR_TIPO_PF);
		saveScreenshotPNG(driver);
	}
	
	@Step("Preencher campo cpf")
	public void PreencherCampoCPF(String param) {
		PreencherCampo(vPage.CAMPO_CPF, param);
		saveScreenshotPNG(driver);
	}
	
	@Step("Preencher campo cnpj")
	public void PreencherCampoCNPJ(String param) {
		PreencherCampo(vPage.CAMPO_CNPJ, param);
		saveScreenshotPNG(driver);
	}
	
	@Step("Clicar botão consultar")
	public void BotaoConsultar() {
		EsperarSegundos(1000);
		ClicarBotao(vPage.BOTAO_CONSULTAR);
	}
	
	@Step("Clicar botão avançar")
	public void BotaoAvancar() {
		saveScreenshotPNG(driver);
		EsperarSegundos(10000);
		ScrollToElement(2500);
		EsperarSegundos(1000);
		ClicarBotao(vPage.BOTAO_AVANCAR);
	}
	
	
	@Step("Clicar botão adicionar veiculos")
	public void BotaoAdicionarVeiculos() {
		ClicarBotao(vPage.BOTAO_INCLUIR);
		saveScreenshotPNG(driver);
	}
	
	@Step("Não replicar veiculos")
	public void ReplicarVeiculosNao() {
		ClicarRadioButton(vPage.INDICATIVO_REPLICACAO_N);
		saveScreenshotPNG(driver);
	}
	
	@Step("Replicar veiculos")
	public void ReplicarVeiculosSim() {
		ClicarRadioButton(vPage.INDICATIVO_REPLICACAO_S);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar número parcelas")
	public void SelecionarNumeroParcelas(String param) {
		EsperarSegundos(10000);
		Integer valorToScroll = Integer.parseInt(param);
		valorToScroll = valorToScroll * 25 + 350;
		ScrollToElement(valorToScroll);
		EsperarSegundos(2000);
		ClicarBotao(vPage.SELECIONAR_VALOR_PARCELA(param));
		saveScreenshotPNG(driver);
	}
	
	@Step("Solicitação avaliação risco")
	public void SolicitarAvaliacaoRisco() {
		EsperarSegundos(1000);
		ClicarBotao(vPage.BOTAO_SOLICITAR_AVALIACAO);
		EsperarSegundos(15000);
	}
	
	@Step("Selecionar forma pagamento")
	public void SelecionarNumeroFormaPagamento() {
		EsperarSegundos(2000);
		SelecionarItemPorIndex(vPage.NUMERO_FORMA_PAGAMENTO, 1);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar conta")
	public void SelecionarComboConta() {
		EsperarSegundos(3000);
		ClicarBotao(vPage.SELECT_AGENCIA_CONTA_PRINCIPAL);
		EsperarSegundos(2000);
		ClicarBotao(vPage.AGENCIA_CONTA_PRINCIPAL2);
		saveScreenshotPNG(driver);
	}
	
	@Step("Preencher código aquisição")
	public void PreencherCodigoDocumentoAquisicao(String param) {
		EsperarSegundos(2000);
		PreencherCampo(vPage.CODIGO_DOCUMENTO_AQUISICAO, param);
		saveScreenshotPNG(driver);
	}
	
	@Step("Preencher data aquisição")
	public void PreencherDataDocumentoAquisicao() {
		PreencherCampo(vPage.DATA_EMISSAO_NOTA_FISCAL, RecuperarDataAtual());
		saveScreenshotPNG(driver);
	}
	
	@Step("Preencher código chassi")
	public void PreencherCodigoChassi(String param) {
		PreencherCampo(vPage.CHASSI, param);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar radio chassi normal")
	public void SelecionarRadioChassiNormal() {
		SelecionarRadio(vPage.TIPO_CHASSI_NORMAL);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar radio chassi remarcado")
	public void SelecionarRadioChassiRemarcado() {
		SelecionarRadio(vPage.TIPO_CHASSI_REMARCADO);
		saveScreenshotPNG(driver);
	}
	
	@Step("Preencher renavam")
	public void PreencherRenavam(String param) {
		PreencherCampo(vPage.RENAVAM, param);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar UF placa")
	public void SelecionarUFPlaca(String param) {
		ScrollToElement(200);
		EsperarSegundos(1000);
		ClicarBotao(vPage.SELECT_UF_PLACA);
		EsperarSegundos(500);
		ClicarBotao(vPage.UF_PLACA(param));
		saveScreenshotPNG(driver);
	}
	
	@Step("Preencher código placa")
	public void PreencherCodigoPlaca(String param) {
		ScrollToElement(200);
		EsperarSegundos(1000);
		PreencherCampo(vPage.CODIGO_PLACA, param);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar possui relacionamento caixa")
	public void SelecionarRadioRelacionamentoCaixaSim() {
		ScrollToElement(200);
		EsperarSegundos(1000);
		SelecionarRadio(vPage.RELACIONAMENTO_CAIXA_SIM);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar não possui relacionamento caixa")
	public void SelecionarRadioRelacionamentoCaixaNao() {
		ScrollToElement(200);
		EsperarSegundos(500);
		SelecionarRadio(vPage.RELACIONAMENTO_CAIXA_NAO);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar pessoa fisica")
	public void SelecionarRadioPessoaFisica() {
		ScrollToElement(200);
		EsperarSegundos(500);
		SelecionarRadio(vPage.RD_PESSOA_FISICA);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar pessoa juridica")
	public void SelecionarRadioPessoaJuridica() {
		ScrollToElement(200);
		EsperarSegundos(500);
		SelecionarRadio(vPage.RD_PESSOA_JURIDICA);
		saveScreenshotPNG(driver);
	}
	
	@Step("Preencher cpf vendedor")
	public void PreencherCPFVendedor(String param) {
		ScrollToElement(200);
		EsperarSegundos(500);
		PreencherCampo(vPage.NUMERO_CPF_VENDEDOR, param);
		saveScreenshotPNG(driver);
	}
	
	@Step("Preencher cnpj vendedor")
	public void PreencherCNPJVendedor(String param) {
		ScrollToElement(200);
		EsperarSegundos(500);
		PreencherCampo(vPage.NUMERO_CNPJ_VENDEDOR, param);
		saveScreenshotPNG(driver);
	}
	
	@Step("Preencher nome razão social")
	public void PreencherNomeRazaoSocial(String param) {
		ScrollToElement(200);
		EsperarSegundos(500);
		PreencherCampo(vPage.NOME_RAZAO_SOCIAL, param);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar banco")
	public void SelectNumeroBanco(String param) {
		ScrollToElement(200);
		EsperarSegundos(500);
		ClicarBotao(vPage.SELECT_NUMERO_BANCO);
		EsperarSegundos(500);
		ClicarBotao(vPage.NUMERO_BANCO(param));
		saveScreenshotPNG(driver);
	}
	
	@Step("Preencher número agencia")
	public void PreencherNumeroAgencia(String param) {
		ScrollToElement(200);
		EsperarSegundos(500);
		PreencherCampo(vPage.NUMERO_AGENCIA, param);
		saveScreenshotPNG(driver);
	}
	
	@Step("Preencher número conta")
	public void PreencherNumeroConta(String param) {
		ScrollToElement(200);
		EsperarSegundos(500);
		PreencherCampo(vPage.NUMERO_CONTA, param);
		saveScreenshotPNG(driver);
	}
	
	@Step("Preencher número DV conta")
	public void PreencherNumeroDVConta(String param) {
		ScrollToElement(200);
		EsperarSegundos(500);
		PreencherCampo(vPage.NUMERO_DV_CONTA, param);
		saveScreenshotPNG(driver);
	}
	
	@Step("Selecionar tipo conta")
	public void SelecionarTipoConta(String param) {
		ScrollToElement(200);
		EsperarSegundos(500);
		SelecionarItemPorTexto(vPage.SELECT_TIPO_CONTA, "Conta " + param);
		EsperarSegundos(10000);
		saveScreenshotPNG(driver);
	}
	
	public String RecuperarNumeroContratoStep3() {
		EsperarSegundos(8000);
		
		String contrato = vPage.CONTRATO_STEP3.getText().substring(0,6);
		
		System.out.println("Recuperar o contrato " + contrato);

		return contrato;
	}
	
	@Step("Aprovar gravame")
	public void AprovarGravame(String contrato) {
		EsperarSegundos(30000);
		Gravame(contrato);
		EsperarSegundos(3000);
		saveScreenshotPNG(driver);
	}
	
	@Step("Aprovar avaliação de risco")
	public void AvaliarRisco(String contrato) {
		EsperarSegundos(15000);
		AvaliacaoRisco(contrato);
		EsperarSegundos(3000);
	}
	
	public void ClicarVoltar() {
		EsperarSegundos(5000);
		ScrollToElement(1000);
		EsperarSegundos(1000);
		ClicarBotao(vPage.BOTAO_VOLTAR);
		EsperarSegundos(2000);
	}
	
	@Step("Clicar botão impressão contrato")
	public void BotaoImpressaoContrato() {
		EsperarSegundos(2000);
		ScrollToElement(2500);
		EsperarSegundos(1000);
		ScrollToElement(1000);
		EsperarSegundos(1000);
		ClicarBotao(vPage.BOTAO_IMPRESSAO_CONTRATO);
		saveScreenshotPNG(driver);
	}
	
	
	@Step("Selecionar primeira via")
	public void SelecionarPrimeiraVia() {
		EsperarSegundos(1000);
		ClicarRadioButton(vPage.PRIMEIRA_VIA);
		saveScreenshotPNG(driver);
	}
	
	@Step("Clicar botão confirmar impressão contrato")
	public void BotaoConsultarImpressaoContrato() {
		EsperarSegundos(1000);
		ClicarBotao(vPage.BOTAO_CONSULTAR_IMPRESSAO_CONTRATO);
		saveScreenshotPNG(driver);
	}
	
	@Step("Clicar botão fechar impressão")
	public void BotaoImprimirFechar() {
		ClicarBotao(vPage.BOTAO_FECHAR);
		saveScreenshotPNG(driver);
	}
	
	public void VerificarError() {
		EsperarSegundos(15000);
		if(vPage.MENSAGEM_ERRO_SISTEMA.size() > 0) {
			System.out.println("Erro ao gravar os dados complementares!");
			ClicarVoltar();
			BotaoAvancar();
			SelecionarNumeroFormaPagamento();
			SelecionarComboConta();
			BotaoAvancar();
		}else {
			System.out.println("Dados complementares gravado com sucesso!");
			ClicarVoltar();
		}
	}
	
	public void PreencherJustificativaAutorizacao(String param) {
		EsperarSegundos(2000);
		ScrollToElement(300);
		PreencherCampo(vPage.JUSTIFICATIVA_AUTORIZACAO, param);	
	}
	
	public void BotaoAutorizar() {
		EsperarSegundos(1000);
		ScrollToElement(200);
		ClicarBotao(vPage.BOTAO_AUTORIZAR);
	}
	
	public void BotaoConfirmarAutorizacao() {
		EsperarSegundos(1000);
		ClicarBotao(vPage.BOTAO_CONFIRMAR);
	}
	
	
	
	
	
	
}
