Feature: Google search test   ///googlestepdefinitions ve google runner e bagli  google searh page bagli

  Scenario: Google da bir kelime arandiginda ilgili kelimeyi barindiran sonuclar goruntulenmelidir
    Given Kullanici google sayfasindadir
    When Kullanici samsung kelimesini arar
    Then Kullanici sayfada samsung kelimesi gectigini dogrular