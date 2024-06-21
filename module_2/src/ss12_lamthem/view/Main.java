package ss12_lamthem.view;

import ss12_lamthem.controllers.StudentController;
import ss12_lamthem.models.Student;

import java.util.List;
import java.util.Scanner;

public class Main {
    private final Scanner scanner = new Scanner(System.in);
    private final StudentController studentController = new StudentController();

    public void StudentMenu() {
        int choice;
        while (true) {
            System.out.println("1.display" + "\n"
                    + "2.add" + "\n" +
                    "3.delete" + "\n" +
                    "4.edit" + "\n");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    delete();
                    break;
                case 4:

            }
        }
    }

    private void delete() {
        System.out.println("nhap tên muốn xóa");
        String code = scanner.nextLine();
        Student studentInput = StudentController.findByName(code);
        studentController.delete(studentInput);
        System.out.println("xóa thành công");
    }

    public void add() {
        System.out.println("name");
        String name = scanner.nextLine();
        System.out.println("code");
        String code = scanner.nextLine();
        System.out.println("old");
        int old = Integer.parseInt(scanner.nextLine());
        Student student = new Student(name, code, old);
        StudentController.addStudent(student);
    }

    private void display() {
        List<Student> students = this.studentController.findAll();
        this.display(students);


    }

    private void display(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
