package OOP;

public class Test {
    public static void main(String[] args) {
        ClassObj classObj1 = new ClassObj();
        classObj1.name = "A A M Khalid Hasan";
        classObj1.Gender = "Male";
        classObj1.phone = 1773015669;

        System.out.println("Name = "+classObj1.name);
        System.out.println("Gender = "+classObj1.Gender);
        System.out.println("Phone = "+classObj1.phone);
        System.out.println("\n");

        ClassObj classObj2 = new ClassObj();

        classObj2.name = "Asif Abdullah";
        classObj2.Gender = "Male";
        classObj2.Address = " 43/2 Dhanmondi,Dhaka";
        classObj2.phone = 1755124847;

        System.out.println("Name = "+classObj2.name);
        System.out.println("Gender = "+ classObj2.Gender);
        System.out.println("Address = "+ classObj2.Address);
        System.out.println("Phone = "+classObj2.phone);
    }

}
