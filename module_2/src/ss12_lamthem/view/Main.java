package ss12_lamthem.view;

import ss12_lamthem.controllers.StudentController;
import ss12_lamthem.models.Student;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    private static StudentController studentController=new StudentController();
    public static void main(String[] args) {
        do {
            System.out.println("chức năng");
            System.out.println("1. thêm học sinh");
            System.out.println("2. sửa học sinh");
            System.out.println("3. hiển thị danh sách học sinh");
            System.out.println("4. xóa học sinh");
            System.out.println("5. thoát");
            System.out.println("vui lòng chọn ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    addStudent();
                    break;
                case 2:
                case 3:
                    displayStudent();
                    break;
                case 4:
                case 5:
                    System.exit(5);

            }
        }while (true);

    }

    private static void displayStudent() {
        List<Student> students =studentController.getAll();
        for (Student student: students){
            System.out.println(student);
        }
    }

    private static void addStudent() {
        System.out.println("nhập id");
        String id=scanner.nextLine();
        System.out.println("nhập tên");
        String name=scanner.nextLine();
        System.out.println("nhập ngày");
        String date=scanner.nextLine();
        System.out.println("nhập phòng");
        String room=scanner.nextLine();
        System.out.println("nhập điểm");
        Double point= Double.valueOf((scanner.nextLine()));
        studentController.addStudent(new Student(id,name,date,room,point));

    }

}
