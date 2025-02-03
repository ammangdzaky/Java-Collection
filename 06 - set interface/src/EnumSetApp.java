import java.util.EnumSet;

public class EnumSetApp {

    public static enum Hari{
        SENIN, SELASA, RABU, KAMIS, JUMAT, SABTU, AHAD
    }

    public static enum Gender{
        MALE, FEMALE
    }

    public static void main(String[] args) {

        // mengambil sebagian dari enum class
        EnumSet<Hari> hari = EnumSet.of(Hari.SENIN, Hari.RABU, Hari.AHAD);

        // mengambil semua dari enum class
        EnumSet<Gender> gender = EnumSet.allOf(Gender.class);

        System.out.println("enum hari");
        for (Hari hariHari: hari){
            System.out.println(hariHari);
        }

        System.out.println();

        System.out.println("enum gender");
        for (var genderGender : gender){
            System.out.println(genderGender);
        }
    }
}
