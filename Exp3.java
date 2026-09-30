import java.util.Scanner;

class Console {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student id: ");
        int studentId = sc.nextInt();

        sc.nextLine(); // Consume newline

        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter student department: ");
        String department = sc.nextLine();

        System.out.print("Enter student age: ");
        int age = sc.nextInt();

        System.out.print("Enter student percentage: ");
        double percentage = sc.nextDouble();

        System.out.println("\n------ Student Details ------");

        System.out.println("Student Id: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + age);
        System.out.println("Student Department: " + department);
        System.out.println("Percentage: " + percentage);

        sc.close();
    }
}