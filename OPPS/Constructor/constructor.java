package Constructor;
//package OPPS;

public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student();

    }
}
    class Student{
        int age ;
        // Default/Non paramatarised Constructor
        Student(){
            System.out.println("This is a Constructor...");
        }

        // Paramaterised constructor
        Student(int age){
        System.out.println(age);
        }

        // copy Contructor
        Student(Student s1){
            this.s1 = s1;
            
        }
    }

