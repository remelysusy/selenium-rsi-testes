package Rsi.Contato;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

    public class FormularioContato {
    	
    	private WebDriver driver;
    	private FormularioContatopage page;
    	
    	/** ANTES **/

    	@Before
    	public void inicializa() {
    		
    		driver = new FirefoxDriver();
    		driver.get("https://rsitecnologia.com.br");
    		page = new FormularioContatopage(driver);

    	}

    	/** DEPOIS **/

    	@After
    	public void finaliza() {
    		driver.quit();
    	}

	        

	/*********** TELA FORMULARIO CONTATO ****************/

	@Test
	public void FormContato() throws InterruptedException {
		page.BotaoParaAcessarContato();
		page.SetEmailContato("remelysusya58@gmail.com");
		page.SetNomeContato("Remely Susy");
		page.setTextare("SOLICITAÇÃO DE CONTATO FEITA PELO SELENIUM DRIVER E JUNIT.");
		page.EnviarContato();
		
		Thread.sleep(5000);
		Assert.assertTrue(page.obterTextodaJaneladeconfirmacaocontato().contains("E-mail enviado com sucesso!"));
	}
	

}


