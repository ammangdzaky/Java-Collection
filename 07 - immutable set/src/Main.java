/**
 - sama seperti list, set pun memiliki tipe data immuatble
 - cara pembuatan immutable set di Java mirip dengan pembuatan immutable list
 */

import java.util.Set;

/**
 method

 - Collections.emptySet()              : membuat immuatble set kosong
 - Collections.singleton(e)         : membuat immutable set berisi 1 element
 - Collections.unmodifiableSet(set)   : mengubah mutable set menjadi immuatble
 - Set.of(e...)                        : membuat immutable set dari element-element
 */

public class Main {
    public static void main(String[] args) {

        Set<String> name = Set.of("Abdurrahman", "Dzaky", "Safrullah");

//        name.add("omagad");       eror
//        name.remove("Dzaky");     eror

    }
}