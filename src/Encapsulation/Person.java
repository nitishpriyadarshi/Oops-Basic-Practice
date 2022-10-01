package Encapsulation;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void personDetails(){
        System.out.println(name);
        System.out.println(age);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age + ", ";
    }
}
