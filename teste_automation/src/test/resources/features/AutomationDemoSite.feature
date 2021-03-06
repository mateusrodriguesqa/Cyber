@SuiteDeTeste
Feature: Validacoes Automation Demo Site

  @Cenario1
  Scenario: Envio de formulario ao acessar o menu de navegacao "Register"
    Given que o usuario acesse o site Automation Demo Site
    When acessar o menu Register
    And preencher o formulario com dados validos
    And clicar em submit
    Then o formulario e enviado com sucesso

  @Cenario2
  Scenario: Escrita no frame dentro do menu de navega??o "Switch > Frames"
    Given que o usuario acesse o site Automation Demo Site
    When acessar o menu Switch > Frames
    Then o usuario deve escrever no frame

  @Cenario3
  Scenario: Inserir data de nascimento dentro do menu de navega??o "Widgets > Datapicker"
    Given que o usuario acesse o site Automation Demo Site
    When acessar o menu Widgets > Datapicker
    Then preencher a data de nascimento nos dois campos de calendario

  @Cenario4
  Scenario: Movimentar 50% da barra no menu de navega??o "Widgets > Slider"
    Given que o usuario acesse o site Automation Demo Site
    When acessar o menu Widgets > Slider
    Then o usuario deve movimentar cinquenta por cento da barra
