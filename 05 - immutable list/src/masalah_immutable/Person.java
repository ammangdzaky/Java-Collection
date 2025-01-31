package masalah_immutable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Person {

    private String name;
    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public void setHobbies(String hobby) {
        hobbies.add(hobby);
    }

    public List<String> getHobbies() {
        return hobbies;
        // ubah return diatas agar returnnya immutable list agar tidak bisa diakses
//        return Collections.unmodifiableList(hobbies);
    }
}
