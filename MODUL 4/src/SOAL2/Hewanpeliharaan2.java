package SOAL2;

public class Hewanpeliharaan2 {
    private String nama;
    private String ras;
    public Hewanpeliharaan2(String r, String n) {
        this.nama = n;
        this.ras = r;
    }
    public void display() {
        System.out.println("Detail Hewan Peliharaan : \n Nama Hewan Peliharaanku adalah : "+nama+" \ndengan ras : "+ras);
    }
}