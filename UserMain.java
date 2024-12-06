/**
 * This package contains classes that demonstrate the "is-a" relationship in inheritance.
 */
package Inheritance.Is_a_rel;

/**
 * Represents a User with an ID and a name.
 */
class User{
    int id;
    String name;
    
    public User(int id, String name){
        this.id = id;
        this.name = name;
    }

    /**
     * Displays the information of an employee including their name and ID.
     */
    public void displayEmployeeInfo(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee ID: "+id);
    }
}

/**
 * Represents an Employee who is a User with additional salary information.
 */
class Employee extends User{
    double salary;
    double annualSalary;

    
    public Employee(int id,String name,double salary){
        super(id,name);
        this.salary= salary;
    }

    /**
     * Calculates the annual salary based on the monthly salary.
     *
     * @return The annual salary calculated as 12 times the monthly salary.
     */
    public double calculateAnnualSalary(){
        this.annualSalary = 12*salary;
        return annualSalary;
    }

    /**
     * Displays the details of an employee including name, ID, and annual salary.
     */
    public void displayEmployeeAnnualSalary(){
        System.out.println("_______ Employee Details _______");
        System.out.println("Employee Name: "+name);
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Annual Salary: "+annualSalary);
        System.out.println("********************************");
    }

}


/**
 * The UserMain class contains the main method to demonstrate the usage of the Employee class.
 */
public class UserMain {
    /**
     * The main method creates two Employee objects, calculates their annual salaries,
     * and displays the information.
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        Employee emp1 = new Employee(1001,"Sunny",10000.00);
        emp1.calculateAnnualSalary();
        emp1.displayEmployeeAnnualSalary();

        Employee emp2 = new Employee(1002,"Ravi",20000.00);
        emp2.calculateAnnualSalary();
        emp2.displayEmployeeAnnualSalary();
    }
}
