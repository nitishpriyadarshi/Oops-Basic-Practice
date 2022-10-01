package constructor;

public class Dog {
    String bread;
    String color;
    int age;

    Dog() {System.out.println("Dog() constructor");}
    Dog(String bread1, String color, int age){
        bread = bread1;
        this.color = color;
        this.age = age;
    }
    void m1 (int age){
        System.out.println(age);
        System.out.println(this.age);
    }
}
