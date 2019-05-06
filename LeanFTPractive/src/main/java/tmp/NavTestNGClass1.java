package tmp;

import org.testng.annotations.*;

public class NavTestNGClass1 {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("BeforeClass");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("AfterClass");
    }
    @BeforeTest
    public static void beforeTest(){
        System.out.println("BeforeTest");
    }
    @AfterTest
    public static void afterTest(){
        System.out.println("AfterTest");
    }
    @BeforeMethod
    public static void beforeMethod(){
        System.out.println("BeforeMethod");
    }
    @AfterMethod
    public static void afterMethod(){
        System.out.println("AfterMethod");
    }
    @BeforeSuite
    public static void beforeSuite(){
        System.out.println("BeforeSuite");
    }
    @AfterSuite
    public static void afterSuite(){
        System.out.println("AfterSuite");
    }

    @Test
    public static void test1(){
        System.out.println("This is the test");
    }

    @Test
    public static void test2(){
        System.out.println("This is the test2");
    }



}
