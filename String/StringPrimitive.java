package string_package;

public class StringPrimitive {
    public static void main(String[] args) {

        double i = 100;
        String x = Double.toString(i);
        System.out.println("S = "+x);

        boolean b = true;
        String s = Boolean.toString(b);
        System.out.println("S = "+s);
    }
}
