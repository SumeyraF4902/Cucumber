 Feature:  Google Arama Feature


//Scenario Outline DDT (DATA DRİVER TEST) YAPMA YETENEGİNİ BİZE SAGLAR

   //Testimiz tabloda bulunan satir sayisi(ilk satir haric) kadar sirasiyla her bir satirdaki verilerle calistirilir



   Scenario Outline:// senoryo taslak tir alttaki verileri calistirir
     Given Kullanici google sayfasindadir
     When Kullanici  "<aranacakKelime>" arattiginda
     Then  Kullanici tittle de "<dogrulanacakKelime>" gormelidir

     Examples:
     | aranacakKelime | dogrulanacakKelime |
     |samsung            |samsung                 |
     |cucumber          |cucumber                |
     |selenium           |selenium                  |

