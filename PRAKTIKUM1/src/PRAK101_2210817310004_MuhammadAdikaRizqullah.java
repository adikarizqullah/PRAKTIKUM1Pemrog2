import java.util.Scanner;

public class PRAK101_2210817310004_MuhammadAdikaRizqullah {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String NamaLengkap = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String TempatLahir = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int TanggalLahir = input.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int BulanLahir = input.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int TahunLahir = input.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int TinggiBadan = input.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        double BeratBadan = input.nextDouble();

        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        System.out.println("Nama Lengkap " + NamaLengkap + ", Lahir di " + TempatLahir + " pada Tanggal "
                + TanggalLahir + " " + namaBulan[BulanLahir - 1] + " " + TahunLahir);
        System.out.println("Tinggi Badan " + TinggiBadan + " cm dan Berat Badan " + BeratBadan + " kilogram");
    }}