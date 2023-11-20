package ss12_lamthem.repository;

import ss12_lamthem.models.Student;

import java.util.ArrayList;
import java.util.List;

public interface IStudentRepository {
    
    void addStudent(Student student);

    List<Student> getAll();
}
