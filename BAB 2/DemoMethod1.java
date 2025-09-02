class Kotak {
    double panjang;
    double lebar;
    double tinggi;

    // Mendefinisikan method void (tidak mengembalikan nilai)
    void cetakVolume() {
        System.out.println("Volume kotak = " + (panjang * lebar * tinggi));
    }
}

class DemoMethod1 {
    public static void main(String[] args) {
        // Instansiasi objek
        Kotak k1 = new Kotak();
        Kotak k2 = new Kotak();
        Kotak k3 = new Kotak();

        // Mengisi data untuk objek k1
        k1.panjang = 4;
        k1.lebar = 3;
        k1.tinggi = 2;

        // Mengisi data untuk objek k2
        k2.panjang = 6;
        k2.lebar = 5;
        k2.tinggi = 4;

        // Mengisi data untuk objek k3
        k3.panjang = 8;
        k3.lebar = 7;
        k3.tinggi = 6;

        // Memanggil method cetakVolume() untuk masing-masing objek
        k1.cetakVolume();
        k2.cetakVolume();
        k3.cetakVolume();
    }
}