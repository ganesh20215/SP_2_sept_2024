package testng.basicsoftestng;

import org.testng.annotations.*;

public class AnnotationExample {

    @AfterSuite
    public void afterSuiteDemo(){
        System.out.println("After Suit");
    }

    @BeforeSuite
    public void beforeSuiteDemo(){
        System.out.println("Before Suit");
    }

    @AfterTest
    public void afterTestDemo(){
        System.out.println("After Test");
    }

    @BeforeTest
    public void beforeTestDemo(){
        System.out.println("Before Test");
    }

    @AfterClass
    public void afterClassDemo(){
        System.out.println("After class");
    }

    @BeforeClass
    public void beforeClassDemo(){
        System.out.println("Before class");
    }

    @AfterMethod
    public void postAction(){
        System.out.println("After Method");
    }

    @BeforeMethod
    public void PreRequsite(){
        System.out.println("Before Method");
    }

    @Test(groups = "smoke")
    public void testCase1(){
        System.out.println("Test Case 1");
    }

    @Test
    public void testCase2(){
        System.out.println("Test Case 2");
    }
}
