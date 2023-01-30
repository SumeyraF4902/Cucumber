Feature: Google Arama Test Feature//google stepDefinitionla calisir


  Background: Kullanici her senaryoda google sitesinde olacaktir
    Given Kullanici google sayfasindadir



  Scenario: Kullanici samsung aradiginda samsung gormelidir
    When Kullanici samsung kelimesini arar
    Then Kullanici sayfada samsung kelimesi gectigini dogrular

  Scenario: Kullanici cucumber aradiginda samsung gormelidir
    When Kullanici cucumber kelimesini arar
    Then Kullanici sayfada cucumber kelimesi gectigini dogrular

  Scenario: Kullanici selenium aradiginda samsung gormelidir
    When Kullanici selenium kelimesini arar
    Then Kullanici sayfada selenium kelimesi gectigini dogrular