import java.util.Scanner;

public class PRAK104_2210817310004_MuhammadAdikaRizqullah {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String TanganAbu = input.nextLine();

        System.out.print("Tangan Bagas: ");
        String TanganBagas = input.nextLine();

        String[] TanganBagasArr = TanganBagas.split(" ");
        String[] TanganAbuArr = TanganAbu.split(" ");

        int PoinAbu = 0;
        int PoinBagas = 0;
        for (int I = 0; I < 3; I++) {
            char TanganBagasRonde = TanganBagasArr[I].charAt(0);
            char TanganAbuRonde = TanganAbuArr[I].charAt(0);

            if (TanganAbuRonde == TanganBagasRonde) {
            } else if ((TanganAbuRonde == 'B' && TanganBagasRonde == 'G') ||
                    (TanganAbuRonde == 'G' && TanganBagasRonde == 'K') ||
                    (TanganAbuRonde == 'K' && TanganBagasRonde == 'B')) {
                PoinAbu++;
            } else {
                PoinBagas++;
            }
        }
        if (PoinAbu > PoinBagas) {
            System.out.println("Abu");
        } else if (PoinBagas > PoinAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }}