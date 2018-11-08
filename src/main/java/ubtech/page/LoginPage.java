package ubtech.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ubtech.core.BasePage;

public class LoginPage extends BasePage{
	
	@FindBy(id = "username")
	private WebElement usuario;
	
	@FindBy(id = "password")
	private WebElement senha;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/form/div[3]/button")
	private WebElement signIn;
	
	public void setUsuario(String value) {
		dsl.preencherCampo(usuario, value);
	}
	public void setSenha(String value) {
		dsl.preencherCampo(senha, value);
	}
	public void clickEntrar() {
		dsl.clickButton(signIn);
	}

}
