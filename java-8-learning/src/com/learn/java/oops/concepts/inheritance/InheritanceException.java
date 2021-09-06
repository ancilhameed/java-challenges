package com.learn.java.oops.concepts.inheritance;


class A1
{
    void m1() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("In m1 A, with exception ArrayIndexOutOfBoundsException");
    }
}
class B1 extends A1
{
    void m1() throws IndexOutOfBoundsException
    {
        System.out.println("In m1 B, with exception IndexOutOfBoundsException ");
    }
}
public class InheritanceException {
 
    public static void main(String[] args) {
        A1 a=new B1();
        a.m1();
    }
}
