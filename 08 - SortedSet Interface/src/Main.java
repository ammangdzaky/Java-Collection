/**
 - sorted set adalah turunan dari set, namun di SortedSet elemen-elemen yg dimasukkan ke dalam SortedSet akan otomatis diurutkan
 - jika element adalah turunan dari interface Comparable, maka secara otomatis akan diurutkan menggunakan comparable tersevut
 - jika element bukan turunan dari interface Comparable, maka kita bisa menggunakan Comparator untuk memberi tahu si SortedSet
 bagaimana cara mengurutkan element2-nya
 */

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 membuat immutable sorted set

 - Collections.emptySortedSet()             : membuat immuatble sorted set kosong
 - Collections.umodifiableSortedSet(set)    : mengubah mutable sorted set menjadi immuatble
 */


public class Main {
    public static void main(String[] args) {

        SortedSet<Person> sortedName = new TreeSet<Person>(new ComparatorName());
        sortedName.add(new Person("Sule", 20));
        sortedName.add(new Person("Abdi", 18));
        sortedName.add(new Person("Mamank", 21));
        for (Person person : sortedName) {
            System.out.println(person.toString());
        }

        System.out.println();

        SortedSet<Person> sortedAge = new TreeSet<>(new ComparatorAge().reversed()); // untuk membalik urutannya menggunakan reversed()
        sortedAge.add(new Person("Sule", 20));
        sortedAge.add(new Person("Abdi", 18));
        sortedAge.add(new Person("Mamank", 21));
        for (Person person : sortedAge) {
            System.out.println(person.toString());
        }

        // mengubah mutable SortedSet mrnjadi immutable
        SortedSet<Person> immutableSortedSet = Collections.unmodifiableSortedSet(sortedName);
        immutableSortedSet.add(new Person("Suki", 20));  // error

    }
}