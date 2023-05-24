package com.exam2;
class Person2{
    String name;
    String lastname;
    public Person2(String name,String lastname){
        this.name=name;
        this.lastname=lastname;
    }
    public String getName(){
        return name;
    }
    public String getLastname(){
        return lastname;
    }

}
class Employee1 extends Person2{
   private int Employeeid;
   private String jobtitle;
    public Employee1(String name,String lastname,int Employeeid,String jobtitle){
        super(name,lastname);
        this.Employeeid=Employeeid;
        this.jobtitle=jobtitle;
    }

    public int getEmployeeid() {
        return Employeeid;
    }

    @Override
    public String getLastname() {
        return super.getLastname()  + " (" + jobtitle + ")";
    }
}

public class PersonEMP {
    public static void main(String[] args) {
        Employee1 obj = new Employee1("Bhargav","Kulkarni",1211,"CEO");
        System.out.println(obj.getName());
        System.out.println(obj.getLastname());
        System.out.println(obj.getEmployeeid());


    }
}
