package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DatepickerPage;
import pages.FramesPage;
import pages.RegisterPage;
import pages.SliderPage;

public class StepsAutomationDemoSite {

	private DatepickerPage datapickerPage = new DatepickerPage();
	private FramesPage framesPage = new FramesPage();
	private RegisterPage registerPage = new RegisterPage();
	private SliderPage sliderPage = new SliderPage();

	@Given("que o usuario acesse o site Automation Demo Site")
	public void que_o_usuario_acesse_o_site_Automation_Demo_Site() {
		registerPage.abrirRegister();
	}

	@When("acessar o menu Register")
	public void acessar_o_menu_Register() {
		registerPage.menuRegister();
	}

	@When("acessar o menu Switch > Frames")
	public void acessar_o_menu_Switch_Frames() {
		framesPage.menuFrames();
	}

	@When("acessar o menu Widgets > Datapicker")
	public void acessar_o_menu_Widgets_Datapicker() {
		datapickerPage.menuDatepicker();
	}

	@When("acessar o menu Widgets > Slider")
	public void acessar_o_menu_Widgets_Slider() {
		sliderPage.menuSlider();
	}

	@When("preencher o formulario com dados validos")
	public void preencher_o_formulario_com_dados_validos() {
		registerPage.inserirDadosRegister();
	}

	@When("clicar em submit")
	public void clicar_em_submit() {
		registerPage.clicarSubmit();
	}

	@Then("o formulario e enviado com sucesso")
	public void o_formulario_e_enviado_com_sucesso() {
		
	}

	@Then("o usuario deve escrever no frame")
	public void o_usuario_deve_escrever_no_frame() {
		framesPage.frameEscrita();
	}

	@Then("preencher a data de nascimento nos dois campos de calendario")
	public void preencher_a_data_de_nascimento_nos_dois_campos_de_calendario() {
		datapickerPage.inserirDatePickerDisabled();
		datapickerPage.inserirDatePickerEnabled();
	}

	@Then("o usuario deve movimentar cinquenta por cento da barra")
	public void o_usuario_deve_movimentar_cinquenta_por_cento_da_barra() {
		sliderPage.movimentarSlider();
	}

}
