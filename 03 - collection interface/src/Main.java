/**
 - selain iterable interface, parent class semua collection di Java adalah collection
 - kalo iterable interface digunakan sebagai kontrak untuk meng-iterasi data secara sequential
 - collection merupakan kontrak untuk memanipulasi data collection, seperti menambah, menghapus dan mengecek isi data collection
 - tidak ada direct implementation untuk collection, karena collection nanti akan dibagi lagi menjadi List, Set, dan Queue
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 Beberapa method di collection

 add(E e) : Menambahkan elemen ke dalam koleksi.
 addAll(Collection<? extends E> c) : Menambahkan semua elemen dari koleksi lain.
 clear() : Menghapus semua elemen dalam koleksi.
 contains(Object o) : Mengecek apakah koleksi mengandung elemen tertentu.
 containsAll(Collection<?> c) : Mengecek apakah koleksi mengandung semua elemen dari koleksi lain.
 isEmpty() : Mengecek apakah koleksi kosong.
 iterator() : Mengembalikan iterator untuk menelusuri elemen dalam koleksi.
 remove(Object o) : Menghapus elemen tertentu dari koleksi.
 removeAll(Collection<?> c) : Menghapus semua elemen yang ada di koleksi lain dari koleksi ini.
 retainAll(Collection<?> c) : Menyisakan hanya elemen yang ada di koleksi lain, menghapus sisanya.
 size() : Mengembalikan jumlah elemen dalam koleksi.
 toArray() : Mengembalikan array yang berisi semua elemen dalam koleksi.
 toArray(T[] a) : Mengembalikan array yang berisi elemen koleksi dengan tipe yang ditentukan.
 spliterator() : Mengembalikan Spliterator untuk memproses elemen secara paralel.
 stream() : Mengembalikan stream dari elemen koleksi untuk operasi fungsional.
 parallelStream() : Mengembalikan stream paralel dari elemen koleksi untuk operasi fungsional.

 */


public class Main {
    public static void main(String[] args) {

        Collection<String> waifus = new ArrayList<>();

        // KODE : menambhakan data
        waifus.add("Tsukasa Tsukoyomi");
        waifus.add("Mikasa Ackerman");
        waifus.add("Kurome");
        waifus.addAll(List.of("Hinata Hyuga", "Itsuki Nakano", "apalaha"));

        for (String waifu : waifus) {
            System.out.println(waifu);
        }
        System.out.println(waifus.toString());

        // KODE : menghapus data
        waifus.remove("apalaha");
        waifus.removeAll(List.of("Hinata Hyuga", "Itsuki Nakano"));
        System.out.println();
        for (String waifu : waifus) {
            System.out.println(waifu);
        }
        System.out.println(waifus.toString());


        // KODE : mengecek apakah ada suatu data di collection
        System.out.println();
        System.out.println(waifus.contains("Kurome"));
        System.out.println(waifus.containsAll(List.of("Sakura beban", "Chitoge")));
    }
}