package constructor;

public class Main {
    public static void main(String[] args) {
        Dog labradorobject = new Dog();
        labradorobject.bread ="labrador";
        labradorobject.color ="brown";
        labradorobject.age = 3;

        //defult constructor
        Dog pittbullObject = new Dog();
        pittbullObject.bread = "pitbull";
        pittbullObject.color = "black";
        pittbullObject.age = 4;

        //To initialize the object ,we use constructor
        //parameterisez constructor
        Dog huskyObject = new Dog("husky","white",6);
        System.out.println(huskyObject.bread);

    }
}
