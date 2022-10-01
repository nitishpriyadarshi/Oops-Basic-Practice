package ParametrizedConstructor;

public class A {
    int x,y;
    A(int a,int b)//parametrized

    {
      x=a; y=b;
    }
    void show()
    {
        System.out.println(x+" "+y);
    }
}
class B
{
    public static void main(String[] args) {
        A r=new A(100,200);
        r.show();
    }

}
