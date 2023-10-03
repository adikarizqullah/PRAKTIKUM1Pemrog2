import java.util.Scanner;

public class PRAK102_2210817310004_MuhammadAdikaRizqullah {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("");

        int AngkaAwal = input.nextInt();
        int JumlahDeret = 10;
        int I = 0;
        while (I <= JumlahDeret) {
            int angka = (AngkaAwal % 5 == 0) ? AngkaAwal / 5 - 1 : AngkaAwal;
            System.out.print(angka);
            if (I <= JumlahDeret - 1) {
                System.out.print(",");
            }
            AngkaAwal++;
            I++;
        }
    }}