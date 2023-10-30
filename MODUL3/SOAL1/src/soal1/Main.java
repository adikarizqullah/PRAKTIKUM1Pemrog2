package soal1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dadu dadu2 = new Dadu();
        int masukkan = input.nextInt();

        dadu2.setInput(masukkan);
        dadu2.acakNilai();
    }
}