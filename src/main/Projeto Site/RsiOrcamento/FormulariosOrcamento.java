package RsiOrcamento;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FormulariosOrcamento {

	private WebDriver driver;
	private FormularioOrcamentopage page;

	/** ANTES **/

	@Before
	public void inicializa() {
		
	 driver = new FirefoxDriver();
	 driver.get("https://rsitecnologia.com.br");
	 page = new FormularioOrcamentopage(driver);

	}

	/** DEPOIS **/

	@After
	public void finaliza() {
		driver.quit();
	}
	

	/*********** TELA FORMULARIO ORÇAMENTO ****************/

	@Test
	public void FormOrcamento() throws InterruptedException {

		page.BotaoParaAcessarOrcamento();
		page.SetNomeOrcamento("Remely Susy Arruda de Andrade");
		page.SetEamilOrcamento("Remelysusy@hotmail.com");
		page.setCargoOrcamento("Analista de Sistemas");
		page.setComboOrcamento("site");
		page.setTextare("SOLICITAÇÃO FEITA PELO SELENIUM DRIVER E JUNIT!");
		page.EnviarOrcamento();

		Thread.sleep(5000);
		Assert.assertTrue(page.obterTextodaJaneladeConfirmacao().contains("Orçamento enviado com sucesso!"));

	    }
	}
