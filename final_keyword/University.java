package OOP.final_keyword;

public class University {
    final String University_Name = "Daffodil International University";
    final int fees; //Blank Final Variable

    University(){
        fees = 37500;
    }

    void display(){
        System.out.printf("\n");
        System.out.println("University Name = "+University_Name);
        System.out.println("University Fees = "+fees);
    }

}
