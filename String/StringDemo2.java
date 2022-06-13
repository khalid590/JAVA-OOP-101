package string_package;

import java.util.Locale;

public class StringDemo2 {
    public static void main(String[] args) {
        String firstname = "Khalid";
        String lastname = " Hasan ";

        String Fullname = firstname.concat(lastname);
        System.out.println(Fullname + 25);

        String uppername = Fullname.toUpperCase();
        System.out.println(uppername);

        String lowercase = Fullname.toLowerCase();
        System.out.println(lowercase);


        boolean b = firstname.startsWith("K");
        System.out.println(b);

        boolean c = lastname.endsWith(" ");
        System.out.println(c);

        String[] names = {"Khalid", "Asif", "Abdullah"};

        for (String x : names){
            System.out.println(x);
        }

    }
}
