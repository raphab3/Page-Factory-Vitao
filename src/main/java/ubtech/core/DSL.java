package ubtech.core;



import static ubtech.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL{
		
	public void preencherCampo(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
	public void preencherCampoEnter(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
		element.sendKeys(Keys.ENTER);
	}
	
	public void clickButton(WebElement element) {
		element.click();
	}
	
	public void validarMensagem(String value, String element) {
		 Assert.assertEquals(value,  element);
	}
	
	public void selecionarCombo(WebElement element, String value) {
		Select combo = new Select(element);
		combo.selectByVisibleText(value);
	}
	
	public void deselecionarCombo(WebElement element, String value) {
		Select combo = new Select(element);
		combo.deselectByVisibleText(value);
	}
	
	public void pressKey(WebElement element) {
		element.sendKeys(Keys.RETURN);
	}
	

	public void clickJavaScript(WebElement element) {
		((JavascriptExecutor)getDriver()).executeScript("arguments[0].click()", element);
	}
	
}
