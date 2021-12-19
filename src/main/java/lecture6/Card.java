package lecture6;

public enum Card {
    VISA("NUMBER","DATE","123","BIN"),
    MASTER("NUMBER","DATE","456","BIN");

    String number;
    String date;
    String cvv;
    String bin;

    Card(String number, String date, String cvv, String bin) {
        this.number = number;
        this.date = date;
        this.cvv = cvv;
        this.bin = bin;
    }
}
