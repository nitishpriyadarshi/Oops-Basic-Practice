package MethodOverriding;

public class Animal {
    void eat()
    {
        System.out.println("eat() method of base class");
        System.out.println("eating.");
    }
}

class Dog extends Animal {

    void eat()
    {
        System.out.println("eat() method of derived class");
        System.out.println("Dog is eating.");
    }
}

class MethodOverridingEx {

    public static void main(String args[])
    {
        Dog d1 = new Dog();
        Animal a1 = new Animal();

        d1.eat();
        a1.eat();

        Animal animal = new Dog();
        // eat() method of animal class is overridden by
        // base class eat()
        animal.eat();
    }
}
//we can see that a method eat() has overridden in the derived class name Dog that is already provided by the base class name Animal.
// When we create the instance of class Dog and call the eat() method,
// we see that only derived class eat() method run instead of base class method eat(),
// and When we create the instance of class Animal and call the eat() method,
// we see that only base class eat() method run instead of derived class method eat().