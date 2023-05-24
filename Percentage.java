package com.exam2;

public class Percentage {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();
        obj.A(30,54,75);
        obj1.B(89,94,54,87);

    }
}
class A{

    public float A(int a, int b , int c){
        float percentage = ((a+b+c)*100)/300;
        if(  a>100 || b>100 || c>100 ){
            System.out.println("Invalid inputs");
        }else{
            System.out.println("Percentage of A : "+percentage);
        }

        return percentage;
    }
}
class B {
    public float B(int x, int y, int z, int w){
        float percentage = ((x+y+z+w)*100)/400;
        if( x>100 || y>100 || z>100 || w>100){
            System.out.println("Invalid inputs");
        }else {
            System.out.println("Percentage of B is : "+percentage);
        }
        return percentage;
    }
}
