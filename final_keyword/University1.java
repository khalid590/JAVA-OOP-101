package OOP.final_keyword;

public class University1 {
    final String Name = "A A M Khalid Hasan";//Final variable
    static final int fees; //Static Blank Final Variable

    static{
        fees = 37500;
    }

    void display(){
        System.out.printf("\n");
        System.out.println("Your Name = "+Name);
        System.out.println("University Fees = "+fees);
    }
}
