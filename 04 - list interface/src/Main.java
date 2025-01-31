/**
 - List adalah struktur data collection yg memiliki sifat berikut:
    > element di list bisa diduplikat, artinya bisa memasukkan data yang sama
    > data list berurutan sesuai dengan posisi kita memasukkan data
    > list memiliki index, sehingga kita bisa menggunakan nomor index untuk mendapatkan element di list
 - di java, ada beberapa implementasi list dan kita bisa memilih sesui kebutuhan kita
 */

/**
 List:
 1. ArrayList class
 2. Linked list class
 */

/**
 ARRAYLIST CLASS
 - arraylist adalah implementasi dari list menggunakan array
 - default kapasitas array di ArrayList adalah 10
 - namun ketika kita memasukkan data dan array sudah penuh, maka secara otomatis ArrayList akan membuat array baru dengan
 kapasitas baru dengan ukuran kapasitas lama + data baru
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 LINKED LIST
 Berbeda dengan ArrayList yang menyimpan elemen dalam blok memori yang bersebelahan, LinkedList menyimpan elemen dalam
 node yang memiliki referensi ke elemen berikutnya. Setiap node di dalam linked list memiliki dua bagian utama:
 - Data → Nilai yang disimpan.
 - Pointer (Referensi) → Alamat dari node berikutnya dalam list.
 */

public class Main {
    public static void main(String[] args) {

        List<String> waifus = new ArrayList<>();
//        List<String> waifus = new LinkedList<>();

        waifus.add("Tsukasa Tsukoyomi");
        waifus.add("Mikasa Ackerman");
        waifus.add("Nino Nakano");

        System.out.println(waifus.get(2));

        waifus.set(2, "Miku Nakano");

        System.out.println(waifus.get(2));

        waifus.remove(0);
//        waifus.remove("Tsukasa Tsukoyomi");  -> bisa juga begini

        System.out.println(waifus.toString());


        List<String> number = new ArrayList<>(100);  // default 10



    }
}