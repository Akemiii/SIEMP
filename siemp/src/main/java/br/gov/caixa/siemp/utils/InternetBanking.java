package br.gov.caixa.siemp.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import br.gov.caixa.siemp.query.Query;
import io.qameta.allure.Attachment;


public class InternetBanking {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	protected Actions action;
	protected JavascriptExecutor js;
	private final long TIME_WAIT_IN_SECONDS = 35; 
	private DB db;
	
	public InternetBanking(WebDriver driver) {
		
		this.driver = driver;
		wait = new WebDriverWait(this.driver, TIME_WAIT_IN_SECONDS);
		action = new Actions(driver);
		js = (JavascriptExecutor) driver;
		db = new DB();
	}
	
	protected void PreencherCampo(WebElement element, String texto) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
		element.sendKeys(texto);
	}
	
	protected void SwitchToAlertAccept() {
		EsperarSegundos(1500);
		driver.switchTo().alert().accept();
	}
	
	protected void PreencherCampoComAction(WebElement element, String texto) {
		wait.until(ExpectedConditions.visibilityOf(element));
		ClicarComAction(element);
		element.sendKeys(texto);
	}
	
	protected void ClicarBotao(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		System.out.println("Clicar no botão " + element.getText());
		try {
			element.click();	
		}catch(Exception e) {
			System.out.println("Sistema não conseguiu clicar no botão");
		}
	}
	
	protected void DescerTelaClicarElemento(WebElement element) {
		Point location = element.getLocation();

		int xCoord = location.getX();
		int yCoord = location.getY();
		
		Actions actions =  new Actions(driver);
		
		actions.moveToElement(element, xCoord, yCoord).click().build().perform();

		EsperarSegundos(1000);
	}

	
	protected void ClicarBotaoVisivel(WebElement element) {
			wait.until(ExpectedConditions.visibilityOf(element));
			element.click();
		
	}
	
	protected void ClicarBotaoInterativo(WebElement element) {
			VerificarBotaoClicavel(element);
			element.click();
	}
	
	protected void SelecionarRadio(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
			VerificarRadioClicavel(element);
			element.click();
	}
	
	protected void EsperarLoading(WebElement element) {
		
		wait.until(ExpectedConditions.visibilityOf(element));
		
		while(element.isDisplayed()) {
			EsperarSegundos(1000);
		}
		
		
	}
	
	protected void VerificarElementoExiste(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	protected void EsperarSegundos(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	protected void VerificarCampoInterativo(WebElement element) {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
	}
	
	protected void VerificarBotaoClicavel(WebElement element) {
			wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	protected void VerificarRadioClicavel(WebElement element) {
			wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	//ComboBox - Usar para selecionar um item em uma dropbox por texto
	protected void SelecionarItemPorTexto(WebElement element, String texto) {
		wait.until(ExpectedConditions.visibilityOf(element));
		Select select = new Select(element);
		select.selectByVisibleText(texto);
	}
	
	//ComboBox - Usar para selecionar um item em uma dropbox por index
	protected void SelecionarItemPorIndex(WebElement element, int index) {
		wait.until(ExpectedConditions.visibilityOf(element));
		Select select = new Select(element);
		
		select.selectByIndex(index);
	}
	
	//ComboBox - Usar para selecionar um item em uma dropbox por value
	protected void SelecionarItemPorValue(WebElement element, String value) {
		wait.until(ExpectedConditions.visibilityOf(element));
		Select select = new Select(element);
		
		select.selectByValue(value);
	}
	
	//Esperar elemento sair da tela
	protected void EsperarElementoSairTela(WebElement element) {
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	//Action, clicar em um botão com um objeto que sobrepoem
	protected void ClicarComAction(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		action.moveToElement(element).click().perform();	
	}
	
	protected void ScrollToElement(int value) {
		js.executeScript("window.scrollBy(0,"+ value +")");
	}
	
	protected String RecuperarTexto(WebElement element) {
		return element.getText();
	}
	
	//Take screenshot
	@Attachment(value = "Page screenshot", type = "image/png")
	public byte[] saveScreenshotPNG(WebDriver driver) {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}
	
	public void SelecionarItens(List<WebElement> lista) {
		for(int i = 0; i < lista.size(); i++) {
			EsperarSegundos(500);
			SelecionarItemPorValue(lista.get(i), "1");
		}
	}
	
	protected void VerificarClienteInadiplente(WebElement element) {
		try {
			element.click();
		}catch (Exception e) {
			System.out.println("Cliente não está inadiplente!");
		}
	}
	
	protected String RecuperarDataAtual() {
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		Date diaAtual = new Date();
		return sdf.format(diaAtual);
	}

	protected void ClicarRadioButton(WebElement element) {
		element.click();
	}
	
	//Mover para o elemento
	protected void MoverParaElemento(WebElement element) {
		action.moveToElement(element).perform();
	}
	
	protected void UploadArquivo(WebElement element, String arquivo) {
		element.click();
		 Robot robot;
		 
		    StringSelection stringSelection = new StringSelection(arquivo);
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		    
		try {
			robot = new Robot();
	        EsperarSegundos(2000);
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        EsperarSegundos(2000);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        
			
		} catch (AWTException e) {
			e.printStackTrace();
		}

		//element.sendKeys(arquivo);
	}
	
	protected void EnvelhecerContratoPorMes(String contrato, int meses) {
		 db.CreateConnection();
		 
		 db.Update(Query.EnvelhecerLiberacao(contrato, meses));
		 db.Update(Query.EnvelhecerReembolso(contrato, meses));
		 db.Update(Query.EnvelhecerContrato(contrato, meses));
		 
		 
		 db.CloseConnection();
	}
	
	protected void AvaliacaoRisco(String contrato) {
		db.CreateConnection();
		EsperarSegundos(1000);
		db.Insert(Query.AvaliacaoRiscoFaseContrato(contrato));
		EsperarSegundos(2500);
		db.Update(Query.AvaliacaoRiscoContrato(contrato));
		EsperarSegundos(2500);
		db.Update(Query.AvaliacaoRiscoETPAFRMO(contrato));
		EsperarSegundos(1500);
		db.CloseConnection();
	}
	
	protected void Gravame(String contrato) {
		db.CreateConnection();
		EsperarSegundos(1000);
		db.Insert(Query.GravameFaseContrato(contrato));
		EsperarSegundos(2500);
		db.Update(Query.GravameETPAFRMO(contrato));
		EsperarSegundos(1500);
		db.CloseConnection();
	}
	
	protected void ConfirmarAlerta() {
		try {
	        Robot robot = new Robot();
	        EsperarSegundos(2000);
	        robot.keyPress(KeyEvent.VK_TAB);
	        EsperarSegundos(2000);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        EsperarSegundos(2000);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        EsperarSegundos(2000);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        
		} catch (AWTException e) {
		        e.printStackTrace();
		}
	}
	
}
