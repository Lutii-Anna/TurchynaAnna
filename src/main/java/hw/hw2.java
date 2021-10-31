package hw;

import java.util.Scanner;

public class hw2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the building then the number of floors : ");
        double height = sc.nextDouble();
        int count = sc.nextInt();
        System.out.println("The height building " + height + "m and " + count + " floors");
    }
}