package RsiOrcamento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Compartilhado.DSL;

public class FormularioOrcamentopage {

	private DSL dsl;

	public FormularioOrcamentopage(WebDriver driver) {
		dsl = new DSL(driver);
	}


	public void BotaoParaAcessarOrcamento() {
		dsl.ClicarBotao(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[6]/a"));
	}

	public void SetNomeOrcamento(String nome) {
		dsl.Escreve(By.xpath("//*[@id=\"tf-orcamento\"]/div/div/div/form/div[1]/div[2]/div/input"), nome);
	}

	public void SetEamilOrcamento(String email) {
		dsl.Escreve(By.xpath("//*[@id=\"tf-orcamento\"]/div/div/div/form/div[1]/div[1]/div/input"), email);
	}

	public void setCargoOrcamento(String cargo) {
		dsl.Escreve(By.xpath("//*[@id=\"tf-orcamento\"]/div/div/div/form/div[1]/div[3]/div/input"), cargo);

	}

	public void setComboOrcamento(String valor) {
		dsl.selecionarCombo(By.id("slOque"), valor);

	}

	public void setTextare(String texto) {
		dsl.Escreve(By.xpath("//*[@id=\"tf-orcamento\"]/div/div/div/form/div[2]/textarea"), texto);

	}

	public void EnviarOrcamento() {
		dsl.ClicarBotao(By.xpath("//*[@id=\"tf-orcamento\"]/div/div/div/form/button[1]"));
	}

	
	public String obterTextodaJaneladeConfirmacao() {
		return dsl.obterConteudo(By.xpath("/html/body/div[1]/div/div"));
	}

}
