package praktikum2.soal3;

public class Pegawai {
    //Karena case sensitive maka perlu diubah untuk nama class menjadi Pegawai, karenaa jika classnya bernama employee maka tidak bisa dijalankan
    public String nama;

    public String asal;
    // Perlu mengubah tipe data char menjadi tipe data String untuk asal, dalam kasus ini, asal harus bertipe data String karena ingin menyimpan tipe data string seperti "Kingdom of Orvel"
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    public void setJabatan(String j) {
        this.jabatan = j;
    }
    // Perlu memperbaiki parameter metode setJabatan, mendeklarasikan metode setJabatan tanpa parameter, tetapi seharusnya metode ini menerima parameter dalam bentuk string j

    public int getUmur() {
        return umur;
    }
    // Perlu penambahan metode getUmur karena tidak ada metode yang memanggil umur karyawan, jadi kita perlu memanggil method getUmur
}
