package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class RegisterPage extends BasePage {

	private By firstName = By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input");
	private By lastName = By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input");
	private By address = By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea");
	private By emailAddress = By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input");
	private By phone = By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input");
	private By gender = By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input");
	private By hobbies = By.id("checkbox2");
	private By languages = By.id("msdd");
	private By selectSkills = By.id("Skills");
	//private By country = By.id("countries");
	private By selectCountry = By.xpath("/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span");
	private By year = By.id("yearbox");
	private By month = By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select");
	private By day = By.id("daybox");
	private By password = By.id("firstpassword");
	private By confirmPassword = By.id("secondpassword");
	private By btnSubmit = By.id("submitbtn");
	
	public void abrirRegister() {
		abrirUrl("http://demo.automationtesting.in/Register.html");
	}
	
	public void menuRegister() {
		abrirUrl("http://demo.automationtesting.in/Register.html");
	}

	public void inserirDadosRegister() {
		escrever(firstName, "Mateus");
		escrever(lastName, "Rodrigues");
		escrever(address, "Teste Cyber");
		escrever(emailAddress, "mateusrodrigues.qa@outlook.com");
		escrever(phone, "1146148449");
		clicar(gender);
		clicar(hobbies);
		selecionarcombo(languages, "English");
		selecionarcombo(selectSkills, "Android");
		// selecionarcombo(country);
		selecionarcombo(selectCountry, "United States of America");
		selecionarcombo(year, "1999");
		selecionarcombo(month, "March");
		selecionarcombo(day, "27");
		escrever(password, "teste123");
		escrever(confirmPassword, "teste123");
	}
	
	public void clicarSubmit() {
		clicar(btnSubmit);	
	}
}
