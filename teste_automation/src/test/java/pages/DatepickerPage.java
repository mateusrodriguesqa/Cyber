package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class DatepickerPage extends BasePage {

	private By datePickerDisabled = By.id("datepicker1");
	private By datePickerEnabled = By.id("datepicker2");
	private By dateDayDisabled = By.xpath("/html/body/div/table/tbody/tr[1]/td[3]/a");
	private By dateDayEnabled = By.xpath("/html/body/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]/a");

	public void menuDatepicker() {
		abrirUrl("http://demo.automationtesting.in/Datepicker.html");
	}

	public void inserirDatePickerDisabled() {
		clicar(datePickerDisabled);
		clicar(dateDayDisabled);
	}

	public void inserirDatePickerEnabled() {
		clicar(datePickerEnabled);
		clicar(dateDayEnabled);
	}
}
