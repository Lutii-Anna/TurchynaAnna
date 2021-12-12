package lecture6;

import java.util.ArrayList;

public class TestException {
    public static void main(String[] args) throws CustomException {
//        try {
//            FileWriter file = new FileWriter("text.txt");
//            file.close();
//            file.write("Hello my friend");
//        } catch (IOException e) {
//            System.out.println("Closed file " + e);
//        } finally {
//            System.out.println("File closed");
//        }

//        int a = 5;
//        int b = 0;
//        try {
//            int c = a / b;
//        } catch (ArithmeticException e) {
//         //   throw new CustomException();
//          //  System.out.println("can not / by 0");
//        }
//        System.out.println("work");


//        {
//            List<String> list = new ArrayList<>();
//            list.add("one");
//            list.add("two");
//            list.add("three");
//            list.add("four");

        //String s = list.get(0); //виводиться вказаний елемент list-a
        // String s = list.toString();  //виводяться всі елементи list-a
        //boolean s = list.contains("five");  //чи є в list-i "five"
        // boolean s = list.isEmpty();   // чи пустий список list-a
        // System.out.println(s);
//            for (int i = 0; i < list.size(); i++) {  // виводяться елементи list-a
//                System.out.println(list.get(i));
//            }
//            for (String s : list) {    // виводяться елементи list-a
//                System.out.println(s);


        {
            ArrayList list = new ArrayList();   // виведення списку list-a
            list.add("13");
            list.add("14");
            list.add("15");
            list.add("16");
            list.add(1, 222);
            System.out.println(list.size());
            list.remove(3);       // видалення елементу list-a
            System.out.println(list.size());
            System.out.println(list);   // виведення списку list-a
        }
    }
}