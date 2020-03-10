package br.gov.caixa.siemp.utils;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import br.gov.caixa.siemp.utils.Properties.DriverType;

public class DriverFactory {
	
	public static WebDriver driver;
	static String path = System.getProperty("user.dir");
	
	public static void quitDriver(WebDriver driver) {
		driver.quit();
		driver = null;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	@SuppressWarnings("deprecation")
	public WebDriver getDriver(DriverType Browser) {
		switch (Browser) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver", path + "\\resources\\chromedriver.exe");
			/*
			 * Proxy pc = new Proxy(); pc.setNoProxy(""); DesiredCapabilities capc = new
			 * DesiredCapabilities(); capc.setCapability(CapabilityType.PROXY, pc);
			 */
			
			return driver = new ChromeDriver();
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver", path + "\\resources\\geckodriver.exe");
			Proxy pf = new Proxy(); 
			pf.setNoProxy(""); 
			DesiredCapabilities capf = new DesiredCapabilities();
			capf.setAcceptInsecureCerts(true);
			capf.setCapability(CapabilityType.PROXY, pf);
			return driver = new FirefoxDriver(capf);
		case IE:
			System.setProperty("webdriver.ie.driver", path + "\\resources\\IEDriverServer.exe");

			return driver = new  InternetExplorerDriver();
			default:
				System.out.println("\nDriver n�o informado ou inexistente!\n");
				break;
		}
		return DriverFactory.driver;
	}

}
