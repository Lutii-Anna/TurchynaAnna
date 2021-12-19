package lecture6;

public enum Season {
    WINTER("snow", 91),
    SUMMER("sun", 90),
    SPRING("8 mart", 90),
    AUTUMN("november", 93);
    String association;
    int days;

    Season(String association, int days) {
        this.association = association;
        this.days = days;
    }
}
