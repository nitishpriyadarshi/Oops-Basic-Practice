package Encapsulation;

public class EncapsulationExample {
    // Encapsulation means binding variable and methods in a single unit
    // We can achieve security
    // We can achieve data hiding.

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(21);
        person.setName("Amit");
//        person.personDetails();
        System.out.println(person.getAge()); // 0 // 21
        System.out.println(person.getName()); // null // Amit
    }
}
