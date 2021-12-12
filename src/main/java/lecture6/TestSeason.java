package lecture6;

public class TestSeason {
    public static void main(String[] args) {
//        System.out.println(Season.AUTUMN);
//        System.out.println(Season.SPRING);
//        System.out.println(Season.SUMMER);
//        System.out.println(Season.WINTER);

//        for (Season s: Season.values())
//            System.out.println(s);

//        Season s = Season.AUTUMN;
//        switch (s)
//        {
//            case AUTUMN:
//                System.out.println("It's autumn");
//                break;
//            case WINTER:
//                System.out.println("It's winter");
//                break;
//        }


//      Season s = Season.AUTUMN;
//        System.out.println(s.name());
//        System.out.println(s.ordinal());

        String s1 = Season.WINTER.association;
        System.out.println(s1);

        int days = Season.SUMMER.days;
        System.out.println(days);

    }
}
