package soal2;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        LinkedList<Negara> negaraList = new LinkedList<>();
        HashMap<Integer, String> namabulanMap = new HashMap<>();
        namabulanMap.put(1, "Januari");
        namabulanMap.put(2, "Februari");
        namabulanMap.put(3, "Maret");
        namabulanMap.put(4, "April");
        namabulanMap.put(5, "Mei");
        namabulanMap.put(6, "Juni");
        namabulanMap.put(7, "Juli");
        namabulanMap.put(8, "Agustus");
        namabulanMap.put(9, "September");
        namabulanMap.put(10, "Oktober");
        namabulanMap.put(11, "November");
        namabulanMap.put(12, "Desember");

        for (int i = 1; i <= n; i++) {
            String nama = sc.nextLine();
            String Kepemimpinan = sc.nextLine();
            String namaPemimpin = sc.nextLine();
            int tanggalKemerdekaan = 0;
            int bulanKemerdekaan = 0;
            int tahunKemerdekaan = 0;

            if (!Kepemimpinan.equals("monarki")) {
                tanggalKemerdekaan = sc.nextInt();
                bulanKemerdekaan = sc.nextInt();
                tahunKemerdekaan = sc.nextInt();
                sc.nextLine();
            }

            Negara negara= new Negara(nama, Kepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            negaraList.add(negara);
        }

        for (Negara negara : negaraList) {
            String nama = negara.getNama();
            String jenisKepemimpinan = negara.getKepemimpinan();
            String namaPemimpin = negara.getNamaPemimpin();
            int tanggalKemerdekaan = negara.getTanggalKemerdekaan();
            int bulanKemerdekaan = negara.getBulanKemerdekaan();
            int tahunKemerdekaan = negara.getTahunKemerdekaan();

            if (jenisKepemimpinan.equals("monarki")) {
                jenisKepemimpinan = "Raja";

                System.out.println("Negara " + nama + " mempunyai " + jenisKepemimpinan + " bernama " + namaPemimpin + "\n");
            } else if (jenisKepemimpinan.equals("presiden")) {
                jenisKepemimpinan = "Presiden";
                String namaBulan = namabulanMap.get(bulanKemerdekaan);
                System.out.println("Negara " + nama + " mempunyai " + jenisKepemimpinan + " bernama " + namaPemimpin);
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + " " + namaBulan + " " + tahunKemerdekaan + "\n");
            } else {

                jenisKepemimpinan = "Perdana Menteri";
                String namaBulan = namabulanMap.get(bulanKemerdekaan);
                System.out.println("Negara " + nama + " mempunyai " + jenisKepemimpinan + " bernama " + namaPemimpin);
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + " " + namaBulan + " " + tahunKemerdekaan + "\n");

            }
        }
    }
}