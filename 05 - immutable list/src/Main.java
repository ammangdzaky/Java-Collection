/**
 - secara default, list di java baik itu ArrayList maupun LinkedList datanya bersifat mutable (bisa diubah)
 - di java mendukung pembuatan immutable list, artinya tidak bisa diubah lagi
 - sekali list dibuat, datanya tidak bisa dibuat lagi, alias final
 - tapi ingat, data list-nya tidak bisa diubah, bukan reference object elementnnya. Kalau misal kita memebuat immutable list berisikan data person,
 field data person tetap bisa diubah, tapi isi elemen dari immutable list tidak bisa diubah lagi
 - ini cocok ketika kasus-kasus misal, tidak sembarang code yg boleh mengubah element di list
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 method

 - Collections.emptyList()              : membuat immuatble list kosong
 - Collections.singletonList(e)         : membuat immutable list berisi 1 element
 - Collections.unmodifiableList(list)   : mengubah mutable list menjadi immuatble
 - List.of(e...)                        : membuat immutable list dari element-element
 */


public class Main {
    public static void main(String[] args) {

        List<String> omagad = Collections.singletonList("OOOOMAGAAD");
//        omagad.set(0, "Suki");   eror
//        omagad.remove(0);         eror
//        omagad.add("suki");       eror
        var get = omagad.get(0);
        System.out.println(get);
    }
}