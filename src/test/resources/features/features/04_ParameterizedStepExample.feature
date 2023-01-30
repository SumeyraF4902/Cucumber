Feature:  Paremetreli step kullanimi

  Scenario: Cucumber step definition (Cucumber Edition)
    Given  ilk sayi 5
    And ikinci sayi 3
    When  Bu sayilari + operatorune sokarsam
    Then sonuc 8 olmalidir


  Scenario Outline: Cucumber step definition(Cucumber Edition)
    Given ilk sayi <sayi1>
    And ikinci sayi <sayi2>
    When Bu sayilari <operator> operatorune sokarsam
    Then  sonuc <sonuc> olmalidir
    Examples:
      | sayi1 | sayi2 | operator | sonuc |
      | 5       | 2       |   -          | 3        |
      | 4       | 7       |    *         | 26      |
      | 9       | 2       |     /        | 4        |

Scenario: Cucumber Step Definition (RexEx Edition)
  Given Ismim "Sumeyra "
  #And Soyismim "Sari"
  #When Ehliyet Aldigimda
  #Then Ehliyetimde "Sumeyra Sari" yazmalidir



