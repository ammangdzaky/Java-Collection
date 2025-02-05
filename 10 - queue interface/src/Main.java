/**
 - queue adalah implementasi dari struktur data Antrian atau FIFO (first in first out)
 */

/**
 method

 add(E e) : Menambahkan elemen ke antrian, melempar IllegalStateException jika kapasitas penuh.
 offer(E e) : Menambahkan elemen ke antrian, mengembalikan false jika kapasitas penuh.
 remove() : Menghapus dan mengembalikan elemen pertama, melempar NoSuchElementException jika kosong.
 poll() : Menghapus dan mengembalikan elemen pertama, mengembalikan null jika kosong.
 element() : Mengembalikan elemen pertama tanpa menghapusnya, melempar NoSuchElementException jika kosong.
 peek() : Mengembalikan elemen pertama tanpa menghapusnya, mengembalikan null jika kosong.

 */

import java.util.*;

/**
 ArrayDeque vs LinkedList vs ProrityQueue
 - ArrayDeque menggunakan array sebagai implementasi queue-nya
 - LinkedList mengguaakn double linked list sebagai impelementasi queue-nya
 - PriorityQueue menggunakan array sebagai impelemntasi queue-nya, namun diurutkan menggunakan Comparable atau Comparator
 */

public class Main {
    public static void main(String[] args) {

//        Queue<String> waifus = new PriorityQueue<>();
//        Queue<String> waifus = new LinkedList<>();
        Queue<String> waifus = new ArrayDeque<>();


        waifus.addAll(List.of("Mikasa Ackerman", "Miku Nakano", "Tsukasa Tsukoyomi"));

        for (String waifu = waifus.poll(); waifu != null ; waifu = waifus.poll()){  // menga,bil dan menghapus element dari depan / head
            System.out.println(waifu);
        }

        System.out.println('\n' + waifus.toString());
        System.out.println(waifus.size());

    }
}