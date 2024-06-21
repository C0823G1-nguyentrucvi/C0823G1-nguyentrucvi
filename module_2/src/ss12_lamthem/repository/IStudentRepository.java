package ss12_lamthem.repository;

import ss12_lamthem.models.Student;

import java.util.List;

public interface IStudentRepository {


    List<Student> findAll();

    void addStudent(Student student);


    void delete(Student code);


    Student findByName(String code);

}
