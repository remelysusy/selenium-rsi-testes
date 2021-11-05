package RsiTelaInicial;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import Compartilhado.DSL;


public class TestPaginaPrincipal {
	
	private WebDriver driver;
	private DSL dsl;
	
	@Before
	public void inicializa() {
		 driver = new FirefoxDriver();
		 dsl = new DSL(driver);
		 driver.get("https://rsitecnologia.com.br");
		
	}
	
	@After
	public void finaliza(){
		driver.quit();
	}
	
	
    @Test
    public void AbrirSiteRsi() {
       
        dsl.ClicarBotao(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[1]/a"));
        dsl.ClicarBotao(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a"));
        dsl.ClicarBotao(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));
        Assert.assertTrue(dsl.pegarTitulo().contains("RSI Tecnologia - O Mundo digital em um clique!"));
   } 

}
