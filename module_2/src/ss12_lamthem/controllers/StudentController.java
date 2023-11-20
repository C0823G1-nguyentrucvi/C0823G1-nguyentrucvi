package ss12_lamthem.controllers;

import ss12_lamthem.models.Student;
import ss12_lamthem.service.IStudentService;
import ss12_lamthem.service.StudentService;

import java.util.List;

public class StudentController {
    private static IStudentService iStudentService =new StudentService();
    public void addStudent(Student student) {
        iStudentService.addStudent(student);
    }

    public List<Student> getAll() {
        return iStudentService.getAll();
    }
}
