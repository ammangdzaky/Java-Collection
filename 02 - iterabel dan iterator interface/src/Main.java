import java.util.Iterator;
import java.util.List;

/**
 Iterable interface

 - iterable adalah parent untuk semua collection di java, keccuali map
 - iterable sendiri sangat sederhana, hanya digunakan agarc mendukung for-each loop
 - karena semua collection pasti implement iterable, secara otomatis maka semua collection di java mendukung perulangan for-each, jadi bukan cuma array
 */

/**
 Iterator interface


 - tidak ada magic di java, sebenarnya for each di iterable bisa terjadi karena ada method iterator() yang mengembalikan object iterator
 - iterator adalah interface yang ,endefenisikan cara kita melakukan mengakses element di colllection secara sequental
 - for-each sendiri muncul sejak java 5, sebelum java 5 untuk melakukan iterasi collection, biasanya dilakukan manual menggunakan iterator object
 */


public class Main {
    public static void main(String[] args) {

        Iterable<String> waifus = List.of("Tsukatsa Tsukoyomi", "Mikasa Ackerman", "Anju Emma");
        for(String waifu : waifus){
            System.out.println(waifu);
        }

        System.out.println("\n ITERATOR\n");

        // kode : iterator manual

        Iterator<String> iterator = waifus.iterator();
        while(iterator.hasNext()){
            var waif = iterator.next();
            System.out.println(waif);
        }

    }
}