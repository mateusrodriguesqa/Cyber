package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class SliderPage extends BasePage {

	private By slider = By.xpath("/html/body/section/div/div/div/input");

	public void menuSlider() {
		abrirUrl("http://demo.automationtesting.in/Slider.html");
	}

	public void movimentarSlider() {
		slider(slider,50,"slider");
	}
}
