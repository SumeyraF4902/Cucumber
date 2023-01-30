package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


    @Before
    public void setup(){
        System.out.println("Before methodu calisti");
    }

    @After
    public void teardown(){
        System.out.println("After methodu calisti");
    }

}