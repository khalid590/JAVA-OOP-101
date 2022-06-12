package OOP;

public class Test2 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.name = "A A M Khalid Hasan";
        teacher1.Gender = "Male";
        teacher1.Address = "Dhanmondi, Dhaka";
        teacher1.roadnumber = 43;
        teacher1.displayinformation();


        Teacher teacher2 = new Teacher();
        teacher2.University = "Daffodil International Univertsity";
        teacher2.phone = 1773015669;
        teacher2.displayinformation2();
    }
}
