package core;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	private static WebDriverWait wait;
	
	public void abrirUrl(String url) {
		getDriver().get(url);
	}

	// Metodo para clicar
	public void clicar(By elemento) {
		wait = new WebDriverWait(getDriver(), 10); // espera por dez sengundos
		wait.until(ExpectedConditions.elementToBeClickable(elemento));
		wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
		getDriver().findElement(elemento).click();
	}

	// Metodo para escrever
	public void escrever(By elemento, String texto) {
		getDriver().findElement(elemento).sendKeys(texto);
	}

	// Metodo para escrever devagar
	public void escreverSlow(By elemento, String texto) {

	}

	// Metodo para limpar campo
	public void limparCampo(By elemento) {
		getDriver().findElement(elemento).clear();
	}

	// Metodo para selecionar Combo
	public void selecionarcombo(By elemento, String valor) {
		Select selecionar = new Select(getDriver().findElement(elemento));
		selecionar.selectByVisibleText(valor);
	}

	// Metodo para obter texto
	public String obterTexto(By elemento) {
		return getDriver().findElement(elemento).getText();
	}

	// Metodo para aguardar
	public void aguarda(int milissegundos) {
		try {
			Thread.sleep(milissegundos);
		} catch (Exception e) {
			System.out.println("Erro ao aguardar");
		}
	}

	public void iframe() {
		getDriver().switchTo().frame("singleframe");
	}

	public void slider(By by, Integer number, String description) {
		try {
			new Actions(getDriver()).dragAndDropBy(getDriver().findElement(by), number, 0).build().perform();

		} catch (Exception e) {
			System.out.println("Erro ao aguardar");
		}
	}
}
