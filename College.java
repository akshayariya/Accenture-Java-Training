package Inheritance.Has_a_rel;

public class College {
    String collegeName;
    String city;
    String department;
    String degree;

    public College(String collegeName, String city, String department, String degree) {
        this.collegeName = collegeName;
        this.city = city;
        this.department = department;
        this.degree = degree;
    }

    public void displayDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("City: " + city);
        System.out.println("Department: " + department);
        System.out.println("Degree: " + degree);
    }

    public void admission() {
        System.out.println("Admission process is ongoing.");
    }

    public void examination() {
        System.out.println("Examinations are conducted as per schedule.");
    }
}
