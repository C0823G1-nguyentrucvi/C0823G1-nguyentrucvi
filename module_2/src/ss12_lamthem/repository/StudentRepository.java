package ss12_lamthem.repository;

import ss12_lamthem.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements  IStudentRepository{
    private static List<Student> students = new ArrayList<>();
    static {
        students.add(new Student("2","trúc vi","2","2",4.0));
    }
    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public List<Student> getAll() {
        return students;
    }
}
