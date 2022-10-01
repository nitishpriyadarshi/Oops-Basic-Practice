package Abstract;
//Implementing Abstract Methods
  //      If the abstract class includes any abstract method, then all the child classes inherited from the abstract superclass must provide the implementation of the abstract method.//
abstract class Animal {
    abstract void makeSound();

    public void eat() {
        System.out.println("I can eat.");
    }
}

class Dog extends Animal {

    // provide implementation of abstract method
    public void makeSound() {
        System.out.println("Bark bark");
    }
}

class Main {
    public static void main(String[] args) {

        // create an object of Dog class
        Dog d1 = new Dog();

        d1.makeSound();
        d1.eat();
    }
}
//In the above example, we have created an abstract class Animal.
// The class contains an abstract method makeSound() and a non-abstract method eat().
//We have inherited a subclass Dog from the superclass Animal.
// Here, the subclass Dog provides the implementation for the abstract method makeSound().
//We then used the object d1 of the Dog class to call methods makeSound() and eat().