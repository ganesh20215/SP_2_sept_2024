package testng.basicsoftestng;

import org.testng.annotations.Test;

public class TestNGAttribute {

    @Test(invocationCount = 5000, invocationTimeOut = 1)
    public void caseT(){
        System.out.println("Case T");
    }

/*    @Test
    public void caseM(){
        System.out.println("Case M");
    }*/
}
