package Encapsulation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 30 ,3.2);

//
//        System.out.println("Name: " + student.getName());
//        System.out.println("Age: " + student.getAge());
//        System.out.println("GPA: " + student.getGpaStatus());

        System.out.println("********************************************");


        student.setName("Alice al-kuwaiti");
        student.setAge(31);
        student.setGpa(2);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("GPA: " + student.getGpaStatus());
        System.out.println("********************************************");

    }
    }
