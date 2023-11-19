package ss7_mvc.controller;

import ss2_loop_array.Student;
import ss7_mvc.service.StudentService;
import ss7_mvc.service.StudentServiceImpl;

import java.util.Scanner;

public class StudentController {
    private static final StudentService service =new StudentServiceImpl();
    public  static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int select=0;
        do{
            System.out.println("---Student Manager---");
            System.out.println("1.List");
            System.out.println("2.Add new student");
            System.out.println("3.Edit...");
            System.out.println("9.Exit");
            System.out.println("Please input number: ");
            select =Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    Student[] studentList=service.findAll();
                    for (Student student: studentList) {
                        System.out.println(student);

                    }
                    break;
                case 2:
                    System.out.println("input id:");
                    int id=Integer.parseInt(scanner.nextLine());
                    System.out.println("Input name: ");
                    String name=scanner.nextLine();
                    System.out.println("Input point: ");
                    double point =Double.parseDouble(scanner.nextLine());
                    Student student =new Student(id, name, point);
                    service.save(student);
                    break;
                case 9:
                    System.exit(0);
            }
        }while (true);
    }

    }

