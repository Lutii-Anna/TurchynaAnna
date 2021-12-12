package hw6;

public enum DayOfWeek {
    MONDAY("Понеділок"),
    TUESDAY("Вівторок"),
    WEDNESDAY("Середа"),
    THURSDAY("Четвер"),
    FRIDAY("П'ятниця"),
    SATURDAY("Субота"),
    SUNDAY("Неділя");

    String name;

    DayOfWeek(String name) {
        this.name = name();
    }
}