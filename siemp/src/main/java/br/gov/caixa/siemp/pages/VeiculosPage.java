package br.gov.caixa.siemp.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VeiculosPage extends BasePage{

	public VeiculosPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "tipoPessoaSimulacaoPF")
	public WebElement TIPO_PESSOA_SIMULACAO_PF;
	
	@FindBy(id = "tipoPessoaSimulacaoPJ")
	public WebElement TIPO_PESSOA_SIMULACAO_PJ;

	@FindBy(id = "dtNascimento")
	public WebElement DATA_NASCIMENTO;
	
	@FindBy(id = "divSpanSelectProduto")
	public WebElement SELECT_PRODUTO;
	
	@FindBy(id = "matrizTaxa_chosen")
	public WebElement SELECT_MATRIZ_TAXA;
	
	@FindBy(xpath = "//*[@id = 'matrizTaxa_chosen']//*[@class='chosen-drop']//*[@class='chosen-results']//*[contains(text(), 'MATRIZ ESPECIAL VEICULOS')]")
	public WebElement MATRIZ_TAXA;
	
	@FindBy(id = "numeroCategoria_chosen")
	public WebElement SELECT_NUMERO_CATEGORIA;
	
	@FindBy(xpath = "//*[@id = 'numeroCategoria_chosen']//*[@class='chosen-drop']//*[@class='chosen-results']//*[@class='active-result']")
	public WebElement NUMERO_CATEGORIA;
	
	@FindBy(id = "numeroDominioTipoVeiculos_chosen")
	public WebElement SELECT_TIPO_VEICULOS;
	
	@FindBy(id = "numeroMarca_chosen")
	public WebElement SELECT_MARCA;
	
	@FindBy(id = "numeroModelo_chosen")
	public WebElement SELECT_NUMERO_MODELO;
	
	@FindBy(xpath = "//*[@id = 'numeroModelo_chosen']//*[@class='chosen-drop']//*[@class='chosen-results']//*[@class='active-result'][29]")
	public WebElement NUMERO_MODELO;
		
	public WebElement PRODUTO_FINANCIAMENTO_VEICULOS(String param) {
		//Variavel vazia
		WebElement element;
		
		//Xpath para achar o elemento
		String xpath = "//*[@id = 'cboProduto_chosen']//*[@class='chosen-drop']//*[@class='chosen-results']//*[contains(text(),'"+param+"')]";
		
		//Procurar o elemento e salvar na variavel
		//element = driver.findElement(By.xpath(xpath));
		
		element = driver.findElement(ByXPath.xpath(xpath));
		
		//Retornar o elemento
		return element;
	}

	public WebElement TIPO_VEICULOS(String param) {
		WebElement element;
		
		String xpath = "//*[@id = 'numeroDominioTipoVeiculos_chosen']//*[@class='chosen-drop']//*[@class='chosen-results']//*[contains(text(),'"+param+"')]";
		
		element = driver.findElement(ByXPath.xpath(xpath));
		
		return element;
	}
	
	public WebElement MARCA(String param) {
		WebElement element;
		
		String xpath = "//*[@id = 'numeroMarca_chosen']//*[@class='chosen-drop']//*[@class='chosen-results']//*[contains(text(),'"+param+"')]";
		
		element = driver.findElement(ByXPath.xpath(xpath));
		
		return element;
	}
	
	@FindBy(id = "anoModelo_chosen")
	public WebElement SELECT_ANO_MODELO;
	
	public WebElement ANO_MODELO(String param) {
		WebElement element;
		
		String xpath = "//*[@id = 'anoModelo_chosen']//*[@class='chosen-drop']//*[@class='chosen-results']//*[contains(text(),'"+param+"')]";
		
		element = driver.findElement(ByXPath.xpath(xpath));
		
		return element;
	}
	
	@FindBy(id = "anoFabricacao")
	public WebElement ANO_FABRICACAO;
	
	@FindBy(id = "ufDetran_chosen")
	public WebElement SELECT_UF_LICENCIAMENTO;
	
	public WebElement UF_LICENCIAMENTO(String param) {
		WebElement element;
		
		String xpath = "//*[@id = 'ufDetran_chosen']//*[@class='chosen-drop']//*[@class='chosen-results']//*[contains(text(),'"+param+"')]";
		
		element = driver.findElement(ByXPath.xpath(xpath));
		
		return element;
	}
	
	@FindBy(id = "valorMedioVeiculo")
	public WebElement VALOR_MEDIO_VEICULO;
	
	@FindBy(id = "valorVeiculo")
	public WebElement VALOR_VEICULO;

	@FindBy(id = "tipoCalculoEntrada")
	public WebElement TIPO_CALCULO_ENTRADA;
	
	@FindBy(id = "tipoCalculoFinanciar")
	public WebElement TIPO_CALCULO_FINANCIAR;
	
	@FindBy(id = "valorEntrada")
	public WebElement VALOR_ENTRADA;
	
	@FindBy(id = "valorContrato")
	public WebElement VALOR_CONTRATO;
	
	@FindBy(id = "naturezaIof")
	public WebElement SELECT_NATUREZA_IOF;
	
	@FindBy(id = "naturezaDespesasTerceiro")
	public WebElement SELECT_NATUREZA_DESPESAS_TERCEIRO;
	
	@FindBy(id = "diaVencimentoPrestacao_chosen")
	public WebElement SELECT_DIA_VENCIMENTO_PRESTACAO;
	
	@FindBy(xpath = "/html/body/div[3]/form/div/div/div[2]/div[1]/div[2]/fieldset/div[1]/div[24]/div/label[2]/input")
	public WebElement SEGURO_AUTO_CAIXA_SEGUROS_NAO;
	
	@FindBy(xpath = "/html/body/div[3]/form/div/div/div[2]/div[1]/div[2]/fieldset/div[1]/div[24]/div/label[1]/input")
	public WebElement SEGURO_AUTO_CAIXA_SEGUROS_SIM;
	
	@FindBy(xpath = "/html/body/div[3]/form/div/div/div[2]/div[1]/div[2]/fieldset/div[1]/div[26]/div/label[1]/input")
	public WebElement CLIENTE_APOSENTADO_SIM;
	
	@FindBy(xpath = "/html/body/div[3]/form/div/div/div[2]/div[1]/div[2]/fieldset/div[1]/div[26]/div/label[2]/input")
	public WebElement CLIENTE_APOSENTADO_NAO;
	
	@FindBy(xpath = "/html/body/div[3]/form/div/div/div[2]/div[1]/div[2]/fieldset/div[1]/div[27]/div/button")
	public WebElement BOTAO_SIMULAR;
	
	public WebElement DIA_VENCIMENTO_PRESTACAO(String param) {
		WebElement element;
		
		String xpath = "//*[@id = 'diaVencimentoPrestacao_chosen']//*[@class='chosen-drop']//*[@class='chosen-results']//*[contains(text(),'"+param+"')]";
		
		element = driver.findElement(ByXPath.xpath(xpath));
		
		return element;
	}
	
	
	@FindBy(xpath = "/html/body/div[3]/form/div/div/div[2]/div[1]/div[2]/fieldset/div[1]/div[4]/div/label[1]/input")
	public WebElement RELACIONAMENTO_PV;
	
	@FindBy(xpath = "/html/body/div[3]/form/div/div/div[2]/div[1]/div[2]/fieldset/div[1]/div[4]/div/label[2]/input")
	public WebElement RELACIONAMENTO_SR;
	
	@FindBy(xpath = "/html/body/div[3]/form/div/div/div[2]/div[1]/div[2]/fieldset/div[1]/div[5]/div/label[1]/input")
	public WebElement PORTE_EMPRESA_MPE;
	
	@FindBy(xpath = "/html/body/div[3]/form/div/div/div[2]/div[1]/div[2]/fieldset/div[1]/div[5]/div/label[2]/input")
	public WebElement PORTE_EMPRESA_MGE;
	
	@FindBy(id = "qtdVeiculos")
	public WebElement QUANTIDADE_VEICULOS;
	
	@FindBy(id = "percentualAmortizacao")
	public WebElement PERCENTUAL_AMORTIZACAO;
	
	
	@FindBy(id = "btnIncluir")
	public WebElement BOTAO_INCLUIR;
	
	@FindBy(xpath = "/html/body/div[3]/form/div/div/div[2]/div[1]/div[1]/form/fieldset/div[1]/div[1]/div/div/label[1]/input")
	public WebElement SELECIONAR_TIPO_PF;
	
	@FindBy(xpath = "/html/body/div[3]/form/div/div/div[2]/div[1]/div[1]/form/fieldset/div[1]/div[1]/div/div/label[2]/input")
	public WebElement SELECIONAR_TIPO_PJ;
	
	@FindBy(id = "numeroCPF")
	public WebElement CAMPO_CPF;
	
	@FindBy(id = "numeroCNPJ")
	public WebElement CAMPO_CNPJ;
	
	@FindBy(xpath = "/html/body/div[3]/form/div/div/div[2]/div[1]/div[1]/form/fieldset/div[1]/div[2]/div/div/a")
	public WebElement BOTAO_CONSULTAR;
	
	@FindBy(id = "btnAvancar")
	public WebElement BOTAO_AVANCAR;
	
	@FindBy(id = "btnIncluirVeiculos")
	public WebElement BOTAO_INCLUIR_VEICULOS;
	
	
	@FindBy(id = "indicativoReplicacaoS")
	public WebElement INDICATIVO_REPLICACAO_S;
	
	@FindBy(id = "indicativoReplicacaoN")
	public WebElement INDICATIVO_REPLICACAO_N;
	
	@FindBy(id = "btnIncluirVeiculosPJ")
	public WebElement BOTAO_INCLUIR_VEICULOS_PJ;
	
	public WebElement SELECIONAR_VALOR_PARCELA(String param) { 
		WebElement element;
		
		String xpath = "/html/body/div[3]/form/div/div/div[2]/div[1]/div[2]/fieldset/div[2]/div[1]/table/tbody/tr[" + param + "]/td[4]/div/a";

		element = driver.findElement(By.xpath(xpath));
		
		return element;
	
	}
	
	@FindBy(id = "inpDesejaCustomizar")
	public WebElement INP_DESEJA_CUSTOMIZAR_SIM;
	
	@FindBy(id = "inpNaoDesejaCustomizar")
	public WebElement INP_DESEJA_CUSTOMIZAR_NAO;
	
	@FindBy(xpath = "/html/body/div[3]/form/div/div/div[2]/div[1]/div[4]/div[2]/div[3]/div[2]/span")
	public WebElement NUMERO_PROPOSTA;
	
	@FindBy(id = "btnSolicitarAvaliacao")
	public WebElement BOTAO_SOLICITAR_AVALIACAO;
	
	@FindBy(id = "numeroFormaPagamento")
	public WebElement NUMERO_FORMA_PAGAMENTO;
	
	@FindBy(id = "comboConta_chosen")
	public WebElement SELECT_AGENCIA_CONTA_PRINCIPAL;
	
	public WebElement AGENCIA_CONTA_PRINCIPAL(String param) {
		WebElement element;
		
		String xpath = "//*[@id = 'comboConta_chosen']//*[@class='chosen-drop']//*[@class='chosen-results']//*[contains(text(),'"+param+"')]";
		
		element = driver.findElement(ByXPath.xpath(xpath));
		
		return element;
	}
	
	public WebElement AGENCIA_CONTA_PRINCIPAL() {
		WebElement element;
		
		String xpath = "//*[@id = 'comboConta_chosen']//*[@class='chosen-drop']//*[@class='chosen-results']//*[@class='active-result'][2]";
		
		element = driver.findElement(ByXPath.xpath(xpath));
		
		return element;
	}
	
	@FindBy(xpath = "/html/body/div[3]/form/div/div/div[2]/div[1]/div[5]/fieldset/div[1]/div[2]/div/div/div/div/ul/li[2]")
	public WebElement AGENCIA_CONTA_PRINCIPAL2;
	
	@FindBy(id = "codigoDocumentoAquisicao0")
	public WebElement CODIGO_DOCUMENTO_AQUISICAO;

	@FindBy(id = "dataDocumentoAquisicao0")
	public WebElement DATA_EMISSAO_NOTA_FISCAL;
	
	@FindBy(id = "codigoChassi0")
	public WebElement CHASSI;
	
	@FindBy(xpath = "/html/body/div[3]/form/div/div/div[2]/div[1]/div[5]/fieldset/div[2]/div/div[4]/div/label[1]/input")
	public WebElement TIPO_CHASSI_NORMAL;
	
	@FindBy(xpath = "/html/body/div[3]/form/div/div/div[2]/div[1]/div[5]/fieldset/div[2]/div/div[4]/div/label[2]/input")
	public WebElement TIPO_CHASSI_REMARCADO;
	
	@FindBy(id = "numeroRenavan0")
	public WebElement RENAVAM;
	
	@FindBy(id = "ufPlaca0_chosen")
	public WebElement SELECT_UF_PLACA;
	
	public WebElement UF_PLACA(String param) {
		WebElement element;
		
		String xpath = "//*[@id = 'ufPlaca0_chosen']//*[@class='chosen-drop']//*[@class='chosen-results']//*[contains(text(),'"+param+"')]";
		
		element = driver.findElement(ByXPath.xpath(xpath));
		
		return element;
	}
	
	@FindBy(id = "codigoPlaca0")
	public WebElement CODIGO_PLACA;
	
	@FindBy(id = "optSimRelaciCaixa")
	public  WebElement RELACIONAMENTO_CAIXA_SIM;
	
	@FindBy(id = "optNaoRelaciCaixa")
	public WebElement RELACIONAMENTO_CAIXA_NAO;

	
	@FindBy(id = "rdPessoaFisica")
	public WebElement RD_PESSOA_FISICA;
	
	@FindBy(id = "rdPessoaJuridica")
	public WebElement RD_PESSOA_JURIDICA;
	
	@FindBy(id = "numeroCPFVendedor")
	public WebElement NUMERO_CPF_VENDEDOR;
	
	@FindBy(id = "numeroCNPJVendedor")
	public WebElement NUMERO_CNPJ_VENDEDOR;
	
	@FindBy(id = "nomeRazaoSocial")
	public WebElement NOME_RAZAO_SOCIAL;

	@FindBy(id = "numeroBanco_chosen")
	public WebElement SELECT_NUMERO_BANCO;
	
	public WebElement NUMERO_BANCO(String param) {
		WebElement element;
		
		String xpath = "//*[@id = 'numeroBanco_chosen']//*[@class='chosen-drop']//*[@class='chosen-results']//*[contains(text(),'"+param+"')]";
		
		element = driver.findElement(ByXPath.xpath(xpath));
		
		return element;
	}
	
	@FindBy(id = "numeroAgencia")
	public WebElement NUMERO_AGENCIA;
	
	@FindBy(id = "numeroConta")
	public WebElement NUMERO_CONTA;
	
	@FindBy(id = "numeroDVConta")
	public WebElement NUMERO_DV_CONTA;
	
	@FindBy(id = "numeroTipoConta")
	public WebElement SELECT_TIPO_CONTA;
	
	@FindBy(xpath = "/html/body/div[3]/form/div/div/div[2]/div[1]/div[3]/div/div[3]/div[2]/span")
	public WebElement CONTRATO_STEP3;
	
	@FindBy(id = "btnVoltar")
	public WebElement BOTAO_VOLTAR;
	
	@FindBy(id = "btnImpressaoContrato")
	public  WebElement BOTAO_IMPRESSAO_CONTRATO;
	
	@FindBy(xpath = "//*[@id = 'dvOpImpressao']//*[@class='radio inline']//*[@name = 'tipoImpressao']")
	public WebElement PRIMEIRA_VIA;
	
	@FindBy(id = "btnConsultarImpressaoContrato")
	public WebElement BOTAO_CONSULTAR_IMPRESSAO_CONTRATO;
	
	@FindBy(id = "btnFechar")
	public WebElement BOTAO_FECHAR;
	
	@FindBy(id = "btnDetalharMsg")
	public List<WebElement> MENSAGEM_ERRO_SISTEMA;
	
	@FindBy(id = "justificativaAutorizacao")
	public WebElement JUSTIFICATIVA_AUTORIZACAO;
	
	@FindBy(id = "btnAutorizar")
	public WebElement BOTAO_AUTORIZAR;
	
	@FindBy(id = "btnConfirmar")
	public WebElement BOTAO_CONFIRMAR;
	
	
	
	
	
	
	
	
	
	
	
	
}
