Feature: Google Arama Feature
              // parameterizesteps definitionsdosyasina bagli
  Background:
  Given Kullanici google sayfasindadir

    Scenario: cucumber search
      When Kullanici  "cucumber" arattiginda
      Then Kullanici tittle de "cucumber " gormelidir


