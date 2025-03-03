// Abstract class

abstract class Kendaraan {

String nama;

// Constructor

public Kendaraan(String nama) {

this.nama = nama;

}

// Method abstrak (harus diimplementasikan oleh subclass)

abstract void bergerak();

// Method konkret (bisa langsung digunakan)

public void info() {

System.out.println(nama + " adalah kendaraan.");

}

}

// Subclass yang mengimplementasikan method abstrak

class Mobil extends Kendaraan {

public Mobil(String nama) {

super(nama);

}

// Implementasi method abstrak

@Override

void bergerak() {

System.out.println(nama + " bergerak dengan roda.");

}

}

class Kapal extends Kendaraan {

public Kapal(String nama) {

super(nama);

}

// Implementasi method abstrak

@Override

void bergerak() {

System.out.println(nama + " bergerak di air.");

}

}

// Main class untuk menjalankan program

public class AbstraksiDemo {

public static void main(String[] args) {

Kendaraan mobil = new Mobil("Toyota");

Kendaraan kapal = new Kapal("Titanic");

mobil.info();

mobil.bergerak();

kapal.info();

kapal.bergerak();

}

}
