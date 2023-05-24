package com.exam2;
class AgeNotWithinRange extends Exception{
    public AgeNotWithinRange(String message){
        super(message);
    }
}
class NamenotValid extends Exception{
    public NamenotValid(String message){
        super(message);
    }

}
class Student1{
    int rollno;
    String name;
    int age;
    String course;
   public  Student1(int rollno,String name,int age,String course) throws AgeNotWithinRange,NamenotValid{
       this.rollno=rollno;
       this.name=name;
       this.age=age;
       this.course=course;

       if(age<15 || age>21){
           throw new AgeNotWithinRange("Age is not within the range");
       }
       if(!isValidName(name)){
           throw new NamenotValid("Name is not valid");
       }
       System.out.println("Name: "+name);
       System.out.println("Rollno: "+rollno);
       System.out.println("Age: "+age);
       System.out.println(course);

   }
    public boolean isValidName(String name){
        return name.matches("^[a-zA-Z ]+$");

    }



}
public class UserException {
    public static void main(String[] args) {
        try {
            Student1 obj = new Student1(12,"Bh",25,"Eng");
        } catch (AgeNotWithinRange e) {
            System.out.println(e.getMessage());
        } catch (NamenotValid e) {
            System.out.println(e.getMessage());
        }

    }
}
