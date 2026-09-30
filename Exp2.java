import java.util.Scanner;

abstract class Employee {

    static String companyName = "Firefox";
    public String department;
    private int salary;
    protected String designation;
    String location;

    // Constructor
    Employee(String department, String designation, String location) {
        this.department = department;
        this.designation = designation;
        this.location = location;
    }

    // Set salary
    void setSalary(int salary) {
        this.salary = salary;
    }

    // Get salary
    void getSalary() {
        System.out.println("Salary: " + salary);
    }

    // Abstract method
    abstract void displayRole();
}

class Developer extends Employee {

    // Constructor
    Developer(String department, String designation, String location) {
        super(department, designation, location);
    }

    // Overriding abstract method
    void displayRole() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Department: " + department);
        super.getSalary();
        System.out.println("Designation: " + designation);
        System.out.println("Location: " + location);
    }
}

class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department: ");
        String department = sc.next();

        System.out.print("Enter designation: ");
        String designation = sc.next();

        System.out.print("Enter location: ");
        String location = sc.next();

        System.out.print("Enter salary: ");
        int salary = sc.nextInt();

        Developer d = new Developer(department, designation, location);

        d.setSalary(salary);
        d.displayRole();

        sc.close();
    }}