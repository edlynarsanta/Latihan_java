public class Kendaraan {
    private String merk;
    private String tipe;
    private int kecepatan;

    // Konstruktor
    public Kendaraan(String merk, String tipe, int kecepatan) {
        this.merk = merk;
        this.tipe = tipe;
        this.kecepatan = Math.max(kecepatan, 0); // Pastikan kecepatan tidak negatif
    }

    // Metode untuk menampilkan informasi kendaraan
    public void tampilkanInfo() {
        System.out.println("Merk: " + merk + ", Tipe: " + tipe + ", Kecepatan: " + kecepatan + " km/jam");
    }

    // Metode untuk menambah kecepatan
    public void tambahKecepatan(int km) {
        if (km > 0) {
            kecepatan += km;
            System.out.println(merk + " menambah kecepatan menjadi " + kecepatan + " km/jam.");
        } else {
            System.out.println("Penambahan kecepatan harus positif.");
        }
    }

    // Metode untuk mengurangi kecepatan
    public void kurangiKecepatan(int km) {
        if (km > 0) {
            kecepatan = Math.max(kecepatan - km, 0);
            System.out.println(merk + " mengurangi kecepatan menjadi " + kecepatan + " km/jam.");
        } else {
            System.out.println("Pengurangan kecepatan harus positif.");
        }
    }

    // Metode untuk menghentikan kendaraan
    public void berhenti() {
        kecepatan = 0;
        System.out.println("Kendaraan telah berhenti.");
    }

    // Metode main untuk menjalankan program
    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan("Toyota", "Mobil", 60);
        mobil.tampilkanInfo();
        mobil.tambahKecepatan(20);
        mobil.kurangiKecepatan(30);
        mobil.berhenti();
        mobil.tampilkanInfo();

        System.out.println();
        
        Kendaraan motor = new Kendaraan("Yamaha", "Motor", 40);
        motor.tampilkanInfo();
        motor.tambahKecepatan(30);
        motor.kurangiKecepatan(40);
        motor.berhenti();
        motor.tampilkanInfo();
    }
}
