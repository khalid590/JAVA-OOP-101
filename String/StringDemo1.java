package string_package;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "Khalid Hasan";
        String s2 = new String("khalid Hasan");
        char [] s3 = {'K','H', 'A', 'L', 'I', 'D'};
        System.out.println(s3);

        System.out.println("Short Name: "+s1);
        System.out.println("Full Name: "+s2);

        int len = s2.length();
        System.out.println("Total lenght = "+len);

        if (s1.equalsIgnoreCase(s2)){
            System.out.println("Equlas");
        }
        else{
            System.out.println("Not Equals");
        }

        boolean b = s1.isEmpty();
        System.out.println("It is: "+b);
    }
}
