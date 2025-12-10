package testng.basicsoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {

    @Test
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }

    @Test(dependsOnMethods = "verifyLogin")
    public void verifyHomeDashboard(){
        System.out.println("Verify Home Dashboard");
    }

    @Test
    public void verifyAccountCreation(){
        System.out.println("Verify Account Creation");
    }
}
