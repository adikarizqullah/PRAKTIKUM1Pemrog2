import java.util.Scanner;

public class PRAK105_2210817310004_MuhammadAdikaRizqullah {
    public static void main(String[] args) {

        final double PHI = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double jarijari = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();

        double Volume = PHI * Math.pow(jarijari, 2) * tinggi;

        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan %n", jarijari);
        System.out.printf("tinggi %.1f cm adalah %.3f m3%n", tinggi, Volume);
    }}