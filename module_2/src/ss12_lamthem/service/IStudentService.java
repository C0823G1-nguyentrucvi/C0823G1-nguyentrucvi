package ss12_lamthem.service;

import ss12_lamthem.models.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAll();

    void addStudent(Student student);

    void delete(Student code);

    Student findByName(String code);

}
