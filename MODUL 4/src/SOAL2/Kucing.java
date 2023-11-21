package SOAL2;

public class Kucing extends Hewanpeliharaan2{
    private String WarnaBulu;
    public Kucing(String r, String n, String w) {
        super(r, n);
        this.WarnaBulu = w;
    }
    public void displayDetailKucing(){
        super.display();
        System.out.println("Memiliki warna bulu : " + WarnaBulu);
    }
}