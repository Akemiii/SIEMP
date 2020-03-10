package br.gov.caixa.siemp.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Attachment;

public class TestListener  implements ITestListener {

	@Attachment(value = "Page screenshot", type = "image/png")
	public byte[] saveScreenshotPNG(WebDriver driver) {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver = DriverFactory.getDriver();
		if(driver instanceof WebDriver) {
			saveScreenshotPNG(driver);
		}
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		WebDriver driver = DriverFactory.getDriver();
		if(driver instanceof WebDriver) {
			saveScreenshotPNG(driver);
		}
	}
	
}
