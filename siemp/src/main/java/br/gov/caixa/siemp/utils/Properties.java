package br.gov.caixa.siemp.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Properties {
	
	private static java.util.Properties config = new java.util.Properties();
	private static String creditoRural = "creditoRural.ini";

	public static enum DriverType {
		CHROME,
		FIREFOX,
		IE;
	}
	
	//Crédito rural
	public static String username;
	public static String password;
	public static String cpf;
	public static String qtdParcelas;
	public static String parcelado;
	public static String periodicidade;
	public static String dataVctoPrimeiraParc;
	public static String tempoExperiencia;
	public static String tipoProposta;
	public static String fonteRecursos;
	public static String valorTotalEmpreendimento;
	public static String valorPretendidoFinanciamento;
	
	
	//
	
	
	
	public void Init() {
		//Ler o arquivo de configuração
		try {
			
			//Credito rural
			config.load(new FileInputStream(creditoRural));
			
			username = config.getProperty("username");
			password = config.getProperty("password");
			
			qtdParcelas = config.getProperty("qtdParcelas");
			parcelado = config.getProperty("parcelado");
			cpf = config.getProperty("cpf");
			periodicidade = config.getProperty("periodicidade");
			dataVctoPrimeiraParc = config.getProperty("dataVctoPrimeiraParc");
			tempoExperiencia =  config.getProperty("tempoExperiencia");
			tipoProposta = config.getProperty("tipoProposta");
			fonteRecursos = config.getProperty("fonteRecursos");
			valorTotalEmpreendimento = config.getProperty("valorTotalEmpreendimento");
			valorPretendidoFinanciamento = config.getProperty("valorPretendidoFinanciamento");
			
			
			//
			
			
			
			
		} catch (IOException ex) {
			//Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
			System.out.println("Error - " + ex.toString());
		}
	}
	
	public WebDriver iniciarDriver(DriverType browser) {

		Init();
		
		WebDriver driver;
		driver = new DriverFactory().getDriver(browser);
		driver.manage().window().maximize();
		return driver;
	}
	
	
	
	
}
