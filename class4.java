// Abstract class
abstract class Kendaraan {
    String nama;
    int jumlahRoda;

    Kendaraan(String nama, int jumlahRoda) {
        this.nama = nama;
        this.jumlahRoda = jumlahRoda;
    }

    abstract void bergerak();

    void tampilkanInfo() {
        System.out.println(nama + " memiliki " + jumlahRoda + " roda.");
    }
}

// Subclass Toyota
class Toyota extends Kendaraan {
    Toyota() {
        super("Toyota", 4);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan mesin bensin.");
    }
}

// Subclass Honda
class Honda extends Kendaraan {
    Honda() {
        super("Honda", 2);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan mesin bensin.");
    }
}

// Interface
interface KendaraanListrik {
    void isiDaya();
}

// Implementasi Interface oleh Tesla
class TeslaModel3 extends Kendaraan implements KendaraanListrik {
    TeslaModel3() {
        super("Tesla Model 3", 4);
    }

    @Override
    void bergerak() {
        System.out.println(nama + " bergerak dengan motor listrik.");
    }

    @Override
    public void isiDaya() {
        System.out.println(nama + " sedang diisi daya.");
    }
}

// Main class
public class Main{
    public static void main(String[] args) {
        Kendaraan toyota = new Toyota();
        toyota.tampilkanInfo();
        toyota.bergerak();

        Kendaraan honda = new Honda();
        honda.tampilkanInfo();
        honda.bergerak();

        TeslaModel3 tesla = new TeslaModel3();
        tesla.tampilkanInfo();
        tesla.bergerak();
        tesla.isiDaya();
    }
}
