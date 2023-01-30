Feature: Google arama testi

  Scenario:Google da kelime arandiginda ilgili kelimeyi tittle da dogrulama
    Given Kullanici google sayfasina gider
    When Kullanici cucumber kelimesini arar
    Then Kullanici sayfada cucumber kelimesi gectigini dogrular