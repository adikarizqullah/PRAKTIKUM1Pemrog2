package SOAL2;

public class Anjing extends Hewanpeliharaan2 {
    private String WARNABULU;
    private String[] KEMAMPUAN;
    public Anjing(String r, String n, String Warnabulu, String[] kemampuan) {
        super(r, n);
        this.WARNABULU = Warnabulu;
        this.KEMAMPUAN = kemampuan;
    }
    public void displayDetailAnjing(){
        super.display();
        System.out.print("Memiliki kemampuan : ");
        for (String i : KEMAMPUAN){
            System.out.print(i+" ");
        }
    }
}