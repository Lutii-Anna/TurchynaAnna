package lecture8.lucky;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LuckyTestNG {
    Lucky lucky = new Lucky();


// тест через DataProvider
    @DataProvider
    public Object[][] IntegerLuckyDataProvider() {
        int[] array1 = {15, 18, 224, 461, 19, 684};
        int[] array2 = {145, 863, 284, 410, 941, 814};
        int[] array3 = {175, 858, 247, 431, 917, 845};
        int[] array4 = {15, 8, 24, 41, 9, 84};
        return new Object[][]{
                {array1, 3, false},
                {array2, 4, false},
                {array3, 5, false},
                {array4, 2, true},
        };
    }

    @Test(dataProvider = "IntegerLuckyDataProvider" )
    public void isIntegerLucky(int[] array, int index, boolean result) throws
            LenghtArrayException, CustomLengthException, WrongTypeException, NegativeValueException {
        Assert.assertEquals(lucky.checkInteger(array, index), result);
    }

// тест для Lucky 2
//    @Test
//    public void isIntegerLucky() throws LenghtArrayException,CustomLengthException,WrongTypeException,NegativeValueException{
//        int[]  array2 = {15, 8, 24, 41, 9, 84};
//        Assert.assertEquals(lucky.checkInteger(array2, 2), true);
//    }
}
