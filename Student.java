package Inheritance.Has_a_rel;

public class Student {
    String studentName;
    int age;
    String city;

    College c;  // Entity reference of college (student "has-a" reference to college)

    public Student(String studentName, int age, String city, College c) {
        this.studentName = studentName;
        this.age = age;
        this.city = city;
        this.c = c; // Associate College with Student
        c.admission();
        c.examination();    
    }

    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);

        System.out.println("\nCollege Details:");
        c.displayDetails();
    }

    public static void main(String[] args) {

        College college = new College("MU", "Mandsaur", "CSE", "B.Tech");
        // Student student = new Student("Naman", 21, "Mds", new College("MU", "Mandsaur", "CSE", "B.Tech"));
        Student student = new Student("Naman", 21, "Mds", college);
        student.displayDetails();
    }
}
