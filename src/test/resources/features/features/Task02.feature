Feature: Google da arama testi
  Scenario:  Google da aranılan kelimeyi tittle doğrulama
    Given Google sayfasına gidilir
    When Selenium kelimesini aratılır
    Then Selenium kelimesinin geçtiğini title da doğrular
