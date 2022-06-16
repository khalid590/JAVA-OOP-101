package OOP.Inheritance;

class Animal{

    void eat(){
        System.out.println("Animal is Eating");
    }

    void sleep(){
        System.out.println("Animal is Sleeping");
    }

    void move(){
        System.out.println("Animal is Moving");
    }

}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is Barking");
    }

}


public class TestInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        dog.move();
        dog.sleep();
    }

}
