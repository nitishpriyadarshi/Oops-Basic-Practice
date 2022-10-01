//Class And Object//

package com.bridegalab;

public class Demo {
    int a=10;
    String b="nitish";
    void show()
    {
        System.out.println(a+" "+b);
    }
}
class Test {
    public static void main(String[] args) {
        Demo r = new Demo();
        r.show();
    }
}
