package lecture8.lucky;

//        int[] array1 = {15, 8, 24, 41, 9, 84};
//        Random random = new Random();
//        int index = random.nextInt(array1.length);


public class Lucky {
    public static boolean checkInteger(int[] array1, int index) throws WrongTypeException, LenghtArrayException, NegativeValueException, CustomLengthException {
        {
            if (array1 == null)
                throw new WrongTypeException();
            if (index > array1.length)
                throw new LenghtArrayException();
            if (index < 0)
                throw new NegativeValueException();
            if (array1.length != 6)
                throw new CustomLengthException();

            int indexRandom = array1[index];
            if ((indexRandom % 2) == 0) {
                System.out.println("I am lucky");
                return true;
            }
            System.out.println("Run again");
            return false;
        }
    }
}


