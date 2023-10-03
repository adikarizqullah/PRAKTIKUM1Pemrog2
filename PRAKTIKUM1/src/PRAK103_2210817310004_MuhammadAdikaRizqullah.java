import java.util.Scanner;

public class PRAK103_2210817310004_MuhammadAdikaRizqullah {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(" ");
        int N = input.nextInt();

        System.out.print(" ");
        int BilanganAwal = input.nextInt();
        int Baris = 1;
        int Bilangan = BilanganAwal;

        while (Baris <= N) {
            if (Bilangan % 2 != 0) {
                System.out.print(Bilangan);
                if (Baris < N) {
                    System.out.print(", ");
                }
                Baris++;
            }
            Bilangan++;
        }
    }}