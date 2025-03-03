// Mendefinisikan interface Hewan
interface Hewan {
    void bersuara();
}

// Kelas Kucing mengimplementasikan interface Hewan
class Kucing implements Hewan {
    @Override
    public void bersuara() {
        System.out.println("Meong... Meong...");
    }
}

// Kelas Anjing mengimplementasikan interface Hewan
class Anjing implements Hewan {
    @Override
    public void bersuara() {
        System.out.println("Guk... Guk...");
    }
}

// Kelas utama untuk menjalankan program
public class class6 {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();

        kucing.bersuara(); // Output: Meong... Meong...
        anjing.bersuara(); // Output: Guk... Guk...
    }
}
