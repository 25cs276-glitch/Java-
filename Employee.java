package employee;

public class Employee {
    int empid;
    String employeeName;
    double salary;

    public Employee(int empid, String employeeName, double salary) {
        this.empid = empid;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + salary);
    }
}