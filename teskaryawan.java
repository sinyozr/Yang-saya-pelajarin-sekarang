// Nama file: teskaryawan.java

public class teskaryawan {

    public static void main(String[] args) {
        // Membuat objek dari class karyawan
        karyawan karsatu = new karyawan("Joni");
        karyawan kardua = new karyawan("Budi");

        // Mengatur data karsatu
        karsatu.umurkaryawan(25);
        karsatu.poskar("Cyber Security Engineer");
        karsatu.gajikar(250000000);
        // Memanggil method tampilKar() yang ada di file karyawan.java
        karsatu.tampilKar();

        // Mengatur data kardua
        kardua.umurkaryawan(26);
        kardua.poskar("Data Analyst");
        kardua.gajikar(1000000);
        // Memanggil method tampilKar() yang ada di file karyawan.java
        kardua.tampilKar();
    }
    String nama;
    int umur;
    String posisi;
    double gaji;

    public teskaryawan(String nama) {
        this.nama = nama;
    }

    public void umurkaryawan(int umurkaryawan) {
        umur = umurkaryawan;
    }

    public void poskar(String poskar) {
        posisi = poskar;
    }

    public void gajikar(double gajikar) {
        gaji = gajikar;
    }

    public void tampilKar() {
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Umur Karyawan: " + umur + " tahun");
        System.out.println("Posisi Karyawan: " + posisi);
        System.out.println("Gaji Karyawan: Rp " + gaji);

    }

    // Method 'tampilaknKaryawan()' yang error tadi HAPUS dari sini
}
