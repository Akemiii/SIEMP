package br.gov.caixa.siemp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(id = "ajaxStatus")
	public WebElement ajaxLoad;
	
	@FindBy(id =  "crwizard_wizardBtnNext")
	public WebElement BTN_NEXT;
	
	
}
