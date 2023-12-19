
package Lamp_Student;


public class Student {
    
    String name;
    int roll_no;
}

class Ans{
    public static void main(String [] args){
        Student studyante = new Student();
        studyante.name = "Janine Grace P. Suello";
        studyante.roll_no = 20221637;
        System.out.println("My name is " + studyante.name + " and my ID number is " + studyante.roll_no);
    }
}
