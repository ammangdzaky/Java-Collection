/**
 - NavigableSet adalah turunan dari SortedSet
 - NavigableSet menambahkan method-method untuk melakukan navigasi pencarian element, seperti mencari element yang lebih besar dari,
 kurang dari, membalikkan ururtan set, dan lain-lain
 */



/**
 METHOD

 lower(E e) : Mengembalikan elemen terbesar yang lebih kecil dari elemen yang diberikan, atau null jika tidak ada.
 floor(E e) : Mengembalikan elemen terbesar yang lebih kecil atau sama dengan elemen yang diberikan, atau null jika tidak ada.
 ceiling(E e) : Mengembalikan elemen terkecil yang lebih besar atau sama dengan elemen yang diberikan, atau null jika tidak ada.
 higher(E e) : Mengembalikan elemen terkecil yang lebih besar dari elemen yang diberikan, atau null jika tidak ada.
 pollFirst() : Menghapus dan mengembalikan elemen pertama (terkecil) dalam set, atau null jika kosong.
 pollLast() : Menghapus dan mengembalikan elemen terakhir (terbesar) dalam set, atau null jika kosong.
 descendingSet() : Mengembalikan tampilan set dalam urutan terbalik.
 descendingIterator() : Mengembalikan iterator yang menelusuri elemen dalam urutan terbalik.
 subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) : Mengembalikan subset elemen dalam rentang yang ditentukan dengan opsi inklusif.
 headSet(E toElement, boolean inclusive) : Mengembalikan subset elemen yang lebih kecil dari elemen yang diberikan dengan opsi inklusif.
 tailSet(E fromElement, boolean inclusive) : Mengembalikan subset elemen yang lebih besar dari atau sama dengan elemen yang diberikan dengan opsi inklusif.

 */

/**
 membuat NavigableSet

 Collections.emptyNavigableSet()            : membuat immutable set kosong
 Collections.unmodifiableNavigableSet(set)  : mengubah mutable set menjadi immutable
 */

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {

        NavigableSet<String> waifus = new TreeSet<>();
        waifus.addAll(Set.of("Tsukasa", "Mikasa", "Miku"));
        System.out.println(waifus.toString());

        // KODE : membalikkan set
        NavigableSet<String> reverse = waifus.descendingSet();
        System.out.println(reverse.toString());

        // KODE : mengambil sebagian
        NavigableSet<String> miku = waifus.headSet("Miku", true); // artinya dari kepala ke miku, true jika ingin agar miku jga diambil dan false jika tidak ingn miku jga diambil
        System.out.println(miku.toString());
        NavigableSet<String> miku2 = waifus.tailSet("Miku", false);
        System.out.println(miku2.toString());
    }
}