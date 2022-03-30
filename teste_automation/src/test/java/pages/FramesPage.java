package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class FramesPage extends BasePage {

	private By frameEscrita = By.xpath("/html/body/section/div/div/div/input");

	public void menuFrames() {
		abrirUrl("http://demo.automationtesting.in/Frames.html");
	}

	public void frameEscrita() {
		iframe();
		escrever(frameEscrita, "Mateus Carvalho Rodrigues");
	}
}