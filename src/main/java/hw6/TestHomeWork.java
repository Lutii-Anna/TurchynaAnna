package hw6;

public class TestHomeWork {
    public static void main(String[] args) {
        System.out.println(DayOfWeek.FRIDAY);

        DayOfWeek d = DayOfWeek.FRIDAY;
        System.out.println(d.ordinal());

        String d1 = DayOfWeek.FRIDAY.name;
        System.out.println(d1);
    }
}
