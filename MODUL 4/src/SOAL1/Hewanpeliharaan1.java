package SOAL1;
import java.util.Scanner;

public class Hewanpeliharaan1 {
    private String Nama;
    private String Ras;
    public Hewanpeliharaan1() {}

    public Hewanpeliharaan1(String r, String n) {
        this.Ras = r;
        this.Nama = n;
    }

    public String getNama() {
        return Nama;
    }

    public String getRas() {
        return Ras;
    }

    public void display() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nama Hewan Peliharaan: ");
        String NamaHewan = input.nextLine();
        System.out.print("Ras: ");
        String JenisRas = input.nextLine();
        Hewanpeliharaan1 hewan1 = new Hewanpeliharaan1(JenisRas, NamaHewan);
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah :  " + hewan1.getNama() + "\nDengan ras : " + hewan1.getRas());
    }
}