package br.gov.caixa.siemp.tests;

import org.openqa.selenium.WebDriver;
import br.gov.caixa.siemp.utils.DriverFactory;
import br.gov.caixa.siemp.utils.Properties;
import br.gov.caixa.siemp.utils.Properties.DriverType;

public abstract class AbstractTest {
	
	protected WebDriver driver;
	private DriverType driverType;
	private String URLTQS = "http://sifec.tqs.desenvolvimento.extracaixa/";
	private String URLDES = "http://sifec.desenvolvimento.extracaixa/";
	private String URLSIEMPLEGADO = "http://siemp2.tqs.desenvolvimento.extracaixa/siemp/indexfullscreen.jsp";

	public DriverType getDriverType() {
		return driverType;
	}
	
	public void getDriver(DriverType type) {
		driverType = type;
		this.driver = new Properties().iniciarDriver(this.getDriverType());
	}

	public void KillDriver() {
		DriverFactory.quitDriver(this.driver);
	}
	
	public void Open() {
		if(driverType == DriverType.IE) {
			this.driver.get(URLSIEMPLEGADO);			
		}else if(driverType == DriverType.FIREFOX) {
			this.driver.get(URLTQS);
		}else {
			
		}
		
	}
	
	public void InitialPage() {
		if(driverType == DriverType.IE) {
			this.driver.get(URLSIEMPLEGADO);			
		}else if(driverType == DriverType.FIREFOX) {
			this.driver.get(URLTQS);
		}else {
			
		}
	}
	
	public abstract void Init();
	
	public abstract void TearDown();
	
	public abstract void SuiteInit();
	
	public abstract void SuiteTearDown();
	
}
