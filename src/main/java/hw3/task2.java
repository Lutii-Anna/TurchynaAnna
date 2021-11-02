//Задача 2:
//        Є загадка “If I drink, I die. If I eat, I am fine. What am I?”
//        Відповідь на питання треба ввести з консолі;
//        Є три спроби відповісти на питання, після чого програма закінчуєтся;
//        Якщо ввести “Fire”, в консоль віводится “Great!” та закінчуется цикл
//        Якщо ввести “I don’t know”, в консоль виводиться “Answer: Fire”  та закінчується цикл
//        Інша відповідь, то виводиться в консоль “Think again” та продовжується цикл

package hw3;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        System.out.println("If I drink, I die. If I eat, I am fine. What am I?");
        String a = "Fire";
        String b = "I don't know";
        int i = 1;
        while (i <= 3) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your answer:");
            String answer = scan.nextLine();
            if (answer.equals(a)) {
                System.out.println("Great");
                break;
            }
            if ((answer.equals(b))) {
                System.out.println("Answer: Fire");
                break;
            }
            else {
                System.out.println("Think again");
                i++;
            }
        }
    }
}
