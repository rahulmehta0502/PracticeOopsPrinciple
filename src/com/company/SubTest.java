package com.company;

abstract class Test {
    public static void main(String[] args) {
        System.out.println("hello");
        Test test = new SubTest();
        test.m1();
    }

    public abstract void m1();

}

public class SubTest extends Test {

    @Override
    public void m1() {
        System.out.println("World");
    }
}




