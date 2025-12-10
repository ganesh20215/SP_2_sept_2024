package testng.basicsoftestng;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;
import testng.listner.IRetryListnerDemo;

public class PriorityExample {

    @Test
    public void caseX(){
        System.out.println("Case X");
    }

    @Test(priority = 2)
    public void caseK(){
        System.out.println("Case K");
    }

    @Test(priority = 3)
    public void caseB(){
        System.out.println("Case B");
        Assert.assertTrue(false);
    }

    @Test(priority = 4)
    public void caseQ(){
        System.out.println("Case Q");
    }

    @Test(priority = 'A')
    public void caseA(){
        System.out.println("Case A");
    }
}
