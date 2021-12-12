package lecture7TestSecond;

import lecture7.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("BeforeGroups");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod");
    }
    @AfterGroups
    public void afterGroups(){
        System.out.println("AfterGroups");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClasss");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite");
    }


   // @Test (expectedExceptions = NullPointerException.class)
    //@Test (enabled = false)

    //тести незалежать один від одного
    @Test(priority = 1)
    public void testSum() {
        Assert.assertEquals(calculator.sum(4, 6), 10);

    }
    @Test(groups = {"a","b"})
    public void testSum2() {
        Assert.assertEquals(calculator.sum(4, 7), 11);

    }

    //залежність тесту один від одного
//    @Test(dependsOnMethods = "testSum2")
//    public void testSum() {
//        Assert.assertEquals(calculator.sum(4, 7), 11);
//}
//    @Test()
//    public void testSum2() {
//        Assert.assertEquals(calculator.sum(4, 7), 12);
//    }

}