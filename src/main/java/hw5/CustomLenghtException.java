package hw5;

public class CustomLenghtException extends Exception implements Print {

    @Override
    public void print() {
        System.out.println("CustomLenghtException");

    }
}
