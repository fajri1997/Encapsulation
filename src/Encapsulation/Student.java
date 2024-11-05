package Encapsulation;

public class Student {

    private String name;
    private int age;
    private double gpa;


    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getGpaStatus() {
        if (gpa >= 3 && gpa <= 4) {
            return "Excellent";
        } else if (gpa >= 2.0 && gpa < 3.0) {
            return "Good";
        } else if (gpa > 0.0 && gpa < 2.0) {
            return "Needs Improvement.";

        } else {
            return "please put number between 0.0 and 4,0 ";
        }
    }


    public void setGpa(double gpa) {
        if (gpa < 0.0 || gpa > 4.0) {
            this.gpa = 0.0;
            System.out.println("Error: GPA must be between 0.0 and 4.0 ");

        } else {
            this.gpa = gpa;
        }

    }
}
