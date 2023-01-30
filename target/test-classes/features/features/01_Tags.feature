Feature: Taglerin Kullanimi   // tagsStepdefinitions a bagli   tags runnere bagli

  @smoke
  Scenario: Smoke test senaryosu
    Given Smoke test icin hazirliklar yapildi
    When Smoke test calistiginda
    Then Smoke test basarili olmali

  @regression
  Scenario: Regression test senaryosu
    Given Regression test icin hazirliklar yapildi
    When Regression test calistiginda
    Then Regression test basarili olmali
