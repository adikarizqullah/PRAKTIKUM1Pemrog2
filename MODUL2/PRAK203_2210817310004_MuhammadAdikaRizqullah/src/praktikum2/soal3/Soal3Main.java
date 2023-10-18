package praktikum2.soal3;

public class Soal3Main {

    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");

        p1.umur = 17;
        //Ditambahkan atribut umur yang bervalue 17 untuk memanggil atribut umur

        System.out.println("Nama: " + p1.getNama());

        // Mencetak getAsal()
        System.out.println("Asal: " + p1.getAsal());

        // Mencetak langsung atribut jabatan
        System.out.println("Jabatan: " + p1.jabatan);

        // Mencetak langsung atribut umur dan mencetak kata tahun, penambahan kata tahun untuk mencetak kata tahun untuk menyesuaikan output yang disuruh
        System.out.println("Umur: " + p1.umur + " tahun ");
        }
}
