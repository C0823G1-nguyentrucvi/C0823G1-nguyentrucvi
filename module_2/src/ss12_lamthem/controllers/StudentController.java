package ss12_lamthem.controllers;

import ss12_lamthem.models.Student;
import ss12_lamthem.service.IStudentService;
import ss12_lamthem.service.StudentService;

import java.util.List;

public class StudentController {
    private static IStudentService iStudentService = new StudentService();

    public static void addStudent(Student student) {
        iStudentService.addStudent(student);
    }

    public static Student findByName(String code) {
        return iStudentService.findByName(code);
    }


    public List<Student> findAll() {

        return iStudentService.findAll();
    }

    public void delete(Student code) {
        iStudentService.delete(code);
    }
}



