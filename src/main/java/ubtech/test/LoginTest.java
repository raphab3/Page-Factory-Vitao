package ubtech.test;

import static ubtech.core.DriverFactory.getDriver;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import ubtech.core.BaseTest;
import ubtech.page.LoginPage;

public class LoginTest extends BaseTest{
	
	private LoginPage page;
	
	
	@Before
	public void start() {
		getDriver().get("https://virtual.unipe.br/ead/acessar/");
		page = PageFactory.initElements(getDriver(), LoginPage.class);
	}
	
	@Test
	public void loginUnipe() {
		page.setUsuario("1610015892");
		page.setSenha("ai voce me pegou");
		page.clickEntrar();
	}
	
	

}
