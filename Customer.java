package com.exam2;

interface Account{
    void set(String name,int Accno,double balance);
    void display();
}
interface Person{
void store();
void disp();
}
 class Customer implements Account,Person {
    private String name;
    private  int Accno;
    private double balance;


    @Override
    public void set(String name,int Accno,double balance ) {
        this.name= name;
        this.Accno= Accno;
        this.balance=balance;

    }

    @Override
    public void display() {
        System.out.println("Name: "+name );
        System.out.println("Acc no : "+Accno);
        System.out.println("Balace: "+balance);

    }

    @Override
    public void store() {
        System.out.println("Storing info");

    }

    @Override
    public void disp() {
        System.out.println("Displaying info");

    }

     public static void main(String[] args) {
         Customer obj = new Customer();
         obj.set("Bhargav",484,500000);
         obj.store();
         obj.disp();
         obj.display();


     }
}
