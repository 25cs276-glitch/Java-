import java.util.Scanner;
import employee.Employee;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee Id: ");
        int empid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter employee Salary: ");
        double salary = sc.nextDouble();

        sc.close();

        Employee e = new Employee(empid, name, salary);

        e.displayEmployee();
    }
}