package stepdefinitions;


//  08_DataTable .feature clasıyla bagli   ve /OrangeHRMLoginPage clasiyla bagli
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.OrangeHRMLoginPage;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class OrangeHRMStepDefinitions {
    @Given("kullanici HRMLogin sayfasina gider")
    public void kullaniciHRMLoginSayfasinaGider() {

        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");
    }

    @When("kullanici  valid credentials girer")
    public void kullaniciCredentialsGirer(DataTable table) {

    //    List<List<String>> data=table.asLists();
    //    for(List<String> satir: data){
  //  for(String hucre: satir){
   //     System.out.println(hucre+ "-  ");
   // }
   //         System.out.println();
    //    }

        // 2 YOL
   /*   String username=  table.cell(1,0);
      String password=  table.cell(1,1);

        System.out.println(username+" "+password);*/


        //  3YOL

     /*   int rowCount=table.height();
        int colCount=table.width();

        for (int i = 1; i <rowCount ; i++) {
            for (int j = 0; j <colCount ; j++) {
                System.out.println(table.cell(i,j));
            }
        }*/
        OrangeHRMLoginPage lp=new OrangeHRMLoginPage(Driver.getDriver());

        List<Map<String, String>> data=table.asMaps(String.class,  String .class);
        for(Map<String, String> maps:data){
            String userId=maps.get("admin_id");
            String userPassword=maps.get("admin_pass");

            lp.typeUserName(userId);
            lp.typePassword(userPassword);
            lp.clickLogin();
            System.out.println(maps);//{admin_id=Admin, admin_pass=admin123
        }
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));

    }

    @When("kullanici invalid credentials girer")
    public void kullaniciInvalidCredentialsGirer(DataTable table) {

        OrangeHRMLoginPage lp=new OrangeHRMLoginPage(Driver.getDriver());

        List<List<String>> DATA=table.asLists();

        for (int row = 1; row< table.height() ; row++) { //ROWLARI DONER  1 den basliyoruz cunku 0 satirda basliklar var .onlari ellemiyoruz
            String username=table.cell(row,0);//0 sutun
            String password=table.cell(row,1);//1 sutun
            String errorMessage=table.cell(row,2);// 2 sutun

            //1 sutunsa id ler   2. sutunda passwordlar   3 sutunda error messaj var (index 0 dan baslar 0,1,2)

            lp.typeUserName(username);
            lp.typePassword(password);
            lp.clickLogin();
            lp.verifyErrMessageContains(errorMessage);

        }
    }
}