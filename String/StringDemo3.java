package string_package;

public class StringDemo3 {
    public static void main(String[] args) {
        String country = "  Bangladesh is   my Country   ";
        System.out.println(country);
        String s2 = country.trim();
        System.out.println(s2);
        char ch = country.charAt(0);
        System.out.println(ch);

        int value = country.codePointAt(0);
        System.out.println(value);

        int position = country.indexOf("l");
        System.out.println(position);
    }
}
