package com.exam2;

public class Tester {
    public static void main(String[] args) {

Adder obj = new Adder();
        System.out.println("My superclass is : Artihmetic");
        System.out.println("Addition of two number is "+obj.add(43,12));
    }
}
class Arithmetic{
    public int add(int a ,int b){
        return a+b;
    }
}
class Adder extends Arithmetic{

}
