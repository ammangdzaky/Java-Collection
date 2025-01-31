package masalah_immutable;

import java.util.List;

public class MutableApp {

    public static void main(String[] args) {

        Person asep = new Person("Asep");
        asep.setHobbies("Ngoding");
        asep.setHobbies("turu");

        Person jamal = new Person("Jamal");
        jamal.setHobbies("main ml");
        jamal.setHobbies("say omagaad five time");

        doSomething(asep.getHobbies());
        doSomething(jamal.getHobbies());

        System.out.println("Hobi asep :");
        for(String hobby : asep.getHobbies()) {
            System.out.println(hobby);
        }

        System.out.println("\nHobi jamal :");
        for(String hobby : jamal.getHobbies()) {
            System.out.println(hobby);
        }

        // seharusnya mereka masing2 hanya punya duah hobby tapi ada heker cuy

    }

    // problem ketika ada org autis kaccca kacca kode
    static void doSomething(List<String> hobbies){
        hobbies.add("aku heker");
    }
}
