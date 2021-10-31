//Задача 1:
//        Дано масив {15, 8, 24, 41, 9, 84}.
//        Необхідно отримати випадкове число з масива.
//        Якщо число парне, вивести напис “I am lucky”,
//        в протилежному випадку “Run again”.

package hw3;
import java.util.Random;
public class task1 {
    public task1(){}
    public static void main (String[]args){
        int[] n = new int[]{15, 8, 24, 41, 9, 84};
        new Random();
        int a = (int) Math.floor(Math.random() * (double) n.length);
        System.out.println(n[a]);
        if (n[a] % 2 == 0) {
            System.out.println("I am lucky");
        } else if (n[a] % 2 != 0) {
            System.out.println("Run again");
        }
    }
}