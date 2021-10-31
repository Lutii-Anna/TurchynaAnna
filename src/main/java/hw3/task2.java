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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your answer: ");
        String answer = sc.nextLine();
            switch (answer) {
                case "Fire":
                    System.out.println("Great!");
                    break;

                case "I don’t know":
                    System.out.println("Answer: Fire");
                    break;

                case "":
                    System.out.println("Think again");
                    break;
        }
    }
}
