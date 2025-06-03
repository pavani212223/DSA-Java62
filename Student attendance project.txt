import java.util.ArrayList;
import java.util.Scanner;
class Student {
     int id;
     String name;
     int attendanceCount;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.attendanceCount = 0; 
    }
    void markAttendance() {
        attendanceCount++;
    }
    void displayStudent() {
        System.out.println("ID: " + id + ", Name: " + name + ", Attendance: " + attendanceCount);
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "pavani Reddy"));
        students.add(new Student(2, "Mohan Redddy"));
        students.add(new Student(3, "Sarada"));
        students.add(new Student(4, "kusuma"));
        students.add(new Student(5, "Hema"));
        students.add(new Student(6, "navya"));
        students.add(new Student(7, "Babul"));
        students.add(new Student(8, "Suvarana"));
        students.add(new Student(9, "Gowthami"));
        students.add(new Student(10, "Sanvii"));
        students.add(new Student(11, "Chandrika"));
        students.add(new Student(12, "Abhi"));
        students.add(new Student(13, "Suki"));
        students.add(new Student(14, "Divya"));
        students.add(new Student(15, "Pavan"));
        students.add(new Student(16, "Arun"));
        students.add(new Student(17, "Naveen"));
        students.add(new Student(18, "kedhari"));
        students.add(new Student(19, "Thambra"));
        students.add(new Student(20, "pav"));
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Mark Attendance");
            System.out.println("2. Display Attendance Records");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Enter student ID to mark attendance");
                 int id = scanner.nextInt();
                if (id > 0 && id <= students.size()) {
                    students.get(id - 1).markAttendance();
                    System.out.println("Attendance marked for " + students.get(id - 1).name);
                } else {
                    System.out.println("Invalid ID!");
                }
            } else if (choice == 2) {
                System.out.println("\nStudent Attendance Records:");
                for (Student student : students) {
                    student.displayStudent();
                }
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice! Try again.");
            }
        }
        scanner.close();
    }
 }