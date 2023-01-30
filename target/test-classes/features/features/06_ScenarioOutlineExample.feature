Feature:  Amazon Search Feature


//amoazonstepdefinitions--amazonhomepage ve amazonsearchpage   claslarina bagli

  Scenario Outline:  Kullanici aratacagi kelimeyi sonuclarda gormelidir
    Given Kullanici amazon sitesine gider
    When Kullanici amazonda "<kelime>" aratir
    Then Kullanici arama sonuclarinda "<kelime>" gormelidir
    And Kullanici browseri kapatir

    Examples:
    |kelime|
    |mac   |
    |windows|
    |linux|
