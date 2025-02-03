/**
 - set adalah salah satu collection yg berisikan elemen-elemen yg unik, atau tidak boleh duplicate
 - set tidak memiliki index seperti di list, oleh karena itu tidak ada jaminan data yang baru di set itu akan terurut sesuai dengan waktu kita memasukkan data ke set
 - set tidak memiliki method baru, jadi hanya menggunakan method yang ada di interface parent-nya, yaitu Collection dan Iterable
 - karena tidak memiliki index, untuk mengambil data di set kita juga harus melakukan iterasi satu per satu
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 HashSet vs LinkedHashSet
 - di belakang HashSet dan LinkedHashSet sebenrnya sama-sama ada hash table, dimana data disimpan dalam sebuah hash
 table dengan mengkalkulasi hashCode() function
 - yang membedakan adalah, HashSet tidak menjamin data terurut sesuai dengan waktu kita menambahkan data, sedangkan LinkedHashSet
 menjamin data terurut sesuai dengan waktu kita menambahkan data
 - urutan data di linkedHashSet bisa dijaga karena dibelakangnya menggunakan double linked list
 */

/**
 Enum Set
 - EnumSet adalah set yg element datanya hrus enum
 - karena data enum itu unik, sehingga sangat cocok menggunakan Set dibandingkan List
 */


public class Main {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("lapu-lapu");
        names.add("lapu-lapu");
        names.add("minotaur");
        names.add("natalia");
        for (String name : names) {
            System.out.println(name);
        }  // datanya tidak terjamin berurutan, selain itu jika ada yg sama maka yg diterima hanya satu

        System.out.println();

        Set<String> waifus = new LinkedHashSet<>();
        waifus.add("Tsukasa Tsukoyomi");
        waifus.add("Tsukasa Tsukoyomi");
        waifus.add("Miku Nakano");
        waifus.add("Mikasa Ackerman");
        for (String waifu : waifus){
            System.out.println(waifu);
        }   // datanya pasti berurutan, selain itu jika ada yg sama maka yg diterima hanya satu (tidak boleh duplikat)
    }
}