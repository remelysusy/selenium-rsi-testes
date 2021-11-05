package Rsi.Contato;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Compartilhado.DSL;

public class FormularioContatopage {
	
	private DSL dsl;
	
	public FormularioContatopage(WebDriver driver){
		dsl = new DSL(driver);
		
	}

	public void BotaoParaAcessarContato() {
		dsl.ClicarBotao(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[7]/a"));
	}
	
	public void SetEmailContato(String email) {
		dsl.Escreve(By.xpath("//*[@id=\"tf-contact\"]/div/div/div/form/div[1]/div[1]/div/input"), email);
		
	}
	
	public void SetNomeContato(String nome) {
		dsl.Escreve(By.xpath("//*[@id=\"tf-contact\"]/div/div/div/form/div[1]/div[2]/div/input"), nome);
	}
	
	public void setTextare(String texto) {
	   dsl.Escreve(By.xpath("//*[@id=\"tf-contact\"]/div/div/div/form/div[2]/textarea"), texto);
	}
	
	public void EnviarContato() {
		dsl.ClicarBotao(By.xpath("//*[@id=\"tf-contact\"]/div/div/div/form/button "));
		
	}
	
	 public String obterTextodaJaneladeconfirmacaocontato() {
		return dsl.obterConteudo(By.className("modal-body"));
	}
}
