
public class Burung {

    int umurBurung;

    public Burung(String nama) {
        System.out.println("Nama burung: " + nama);
    }

    public void aturumur(int umur) {
        umurBurung = umur;
    }

    public int ambilumur() {
        System.out.println("umur Burung: " + umurBurung + "tahun");
        return umurBurung;
    }

    public static void main(String[] args) {
        Burung burung1 = new Burung("Kakatua");
        burung1.aturumur(5);
        burung1.ambilumur();
        System.out.println("Nilai  variabel: " + burung1.umurBurung);
    }
}
