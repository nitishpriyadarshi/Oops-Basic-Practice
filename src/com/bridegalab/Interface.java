package com.bridegalab;

    interface IN1 {
        final int a = 10;
        default void display()
        {
            System.out.println("Interface example");
        }
    }

    // A class that implements the interface.
    class TestClass implements IN1
    {
        // Driver Code
        public static void main (String[] args)
        {
            TestClass t = new TestClass();
            t.display();
        }
    }


