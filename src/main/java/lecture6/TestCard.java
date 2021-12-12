package lecture6;

public class TestCard {
    public static void main(String[] args) {

        String cvv = Card.VISA.cvv;
        System.out.println(cvv);  //виводиться cvv VISA

        String cvv2 = Card.MASTER.cvv;
        System.out.println(cvv2); //виводиться cvv  MASTER
    }
}
