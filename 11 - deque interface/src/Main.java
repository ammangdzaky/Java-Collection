/**
 - deque singkatan dari double ended queue, artinya yang bisa beroperasi dari depan atau belakang
 - jiaka pada queue, operasi yg didukung adalah FIFO, namun pada deque, tidak hanya FIFO, namun juga LIFO (last in first out)
 - bisa dibilang deque adalah implementasi struktur data antrian dan stack (tumpukan)
 */

import java.util.ArrayDeque;
import java.util.Deque;

/**
 method (baca cuy spaya brotak sengku)

 addFirst(E e) : Menambahkan elemen ke awal deque, melempar IllegalStateException jika penuh.
 addLast(E e) : Menambahkan elemen ke akhir deque, melempar IllegalStateException jika penuh.
 offerFirst(E e) : Menambahkan elemen ke awal deque, mengembalikan false jika penuh.
 offerLast(E e) : Menambahkan elemen ke akhir deque, mengembalikan false jika penuh.
 removeFirst() : Menghapus dan mengembalikan elemen pertama, melempar NoSuchElementException jika kosong.
 removeLast() : Menghapus dan mengembalikan elemen terakhir, melempar NoSuchElementException jika kosong.
 pollFirst() : Menghapus dan mengembalikan elemen pertama, mengembalikan null jika kosong.
 pollLast() : Menghapus dan mengembalikan elemen terakhir, mengembalikan null jika kosong.
 getFirst() : Mengembalikan elemen pertama tanpa menghapusnya, melempar NoSuchElementException jika kosong.
 getLast() : Mengembalikan elemen terakhir tanpa menghapusnya, melempar NoSuchElementException jika kosong.
 peekFirst() : Mengembalikan elemen pertama tanpa menghapusnya, mengembalikan null jika kosong.
 peekLast() : Mengembalikan elemen terakhir tanpa menghapusnya, mengembalikan null jika kosong.
 removeFirstOccurrence(Object o) : Menghapus kemunculan pertama elemen tertentu, mengembalikan false jika tidak ditemukan.
 removeLastOccurrence(Object o) : Menghapus kemunculan terakhir elemen tertentu, mengembalikan false jika tidak ditemukan.
 push(E e) : Menambahkan elemen ke awal deque (sama seperti addFirst).
 pop() : Menghapus dan mengembalikan elemen pertama (sama seperti removeFirst).
 descendingIterator() : Mengembalikan iterator untuk traversing dari belakang ke depan.
 iterator() : Mengembalikan iterator untuk traversing dari depan ke belakang.

 */

public class Main {
    public static void main(String[] args) {

        Deque<String> weapons = new ArrayDeque<>();

        weapons.offerFirst("sacrifical");
        weapons.offerFirst("favonious");
        weapons.offerFirst("pjws");
        weapons.offerFirst("skyward");

        System.out.println(weapons.toString() + '\n');

        // mengembalikan dan menghapus dari belakang
        for (var weap = weapons.pollLast(); weap != null; weap = weapons.pollLast()){
            System.out.println(weap);
        }

        //------------------------------------------------------------------------
        // KODE : antrian (masuk dari belakang, keluar lewat depan)
        System.out.println('\n' + "KODE ANTRIAN");

        Deque<String> pyro = new ArrayDeque<>();
        // masuk dari belakang
        System.out.println("masuk : ");
        pyro.offerLast("Arlechino");
        pyro.offerLast("Mavuika");
        pyro.offerLast("Hu tao");
        System.out.println(pyro.toString());
        // keluar dari depan
        System.out.println("Keluar : ");
        for (String chara = pyro.pollFirst(); chara != null; chara = pyro.pollFirst()) {
            System.out.println(chara);
        }



        //--------------------------------------------------------------------
        // KODE : tumpukan (masuk dari belakang, diambil dari belakang)
        System.out.println('\n' + "KODE TUMPUKAN");

        Deque<String> electro = new ArrayDeque<>();
        // masuk dari belakang
        System.out.println("masuk : ");
        electro.offerLast("Clorinde");
        electro.offerLast("Raiden");
        electro.offerLast("Candace");
        System.out.println(electro.toString());
        // keluar dari depan
        System.out.println("Keluar : ");
        for (String character = electro.pollLast(); character != null; character = electro.pollLast()){
            System.out.println(character);
        }


    }
}