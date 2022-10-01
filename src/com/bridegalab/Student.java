package com.bridegalab;
// Simple Inheritance

public class Student { //super
    int roll,marks;
    String name;
    void input()
    {
        System.out.println("Enter roll name & marks");

    }
}
class nitish extends Student //subclass
{
    void disp()
    {
        roll =1;name="nitish";marks=90;
        System.out.println(roll+" "+name+" "+marks);

    }

    public static void main(String[] args) {
        nitish r=new nitish();
        r.input(); r.disp();
    }
}