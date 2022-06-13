package string_package;

public class StringDemo4 {
    public static void main(String[] args) {
        String s2 = "This is my Country";
        System.out.println(s2);
        String s1 = s2.replace('i', 'k');
        System.out.println(s1);

        String[] s3 = s1.split(" ");
        for(String x : s3){
            System.out.println(x);
        }

    }
}
