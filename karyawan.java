
public class karyawan {

    public static void main(String[] args) {
        karyawan kar1 = new karyawan("Andi");
        kar1.umurkaryawan(30);
        kar1.poskar("Manager");
        kar1.gajikar(2500000);
        kar1.tampilKar();
    }

    String nama;
    int umur;
    String posisi;
    double gaji;

    public karyawan(String nama) {
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

}
