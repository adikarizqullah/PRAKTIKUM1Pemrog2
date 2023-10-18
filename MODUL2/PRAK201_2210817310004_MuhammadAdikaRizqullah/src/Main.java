public class Main {

    public static void main(String[] args) {
        Buah apel = new Buah("Apel", 0.4, 7000.0, 700000, 40);
        apel.KetBuah();

        Buah mangga = new Buah("Mangga", 0.2, 3500.0, 262500, 15.0);
        mangga.KetBuah();

        Buah alpukat = new Buah("Alpukat", 0.25, 10000.0, 480000.00, 12.0);
        alpukat.KetBuah();
    }
}
