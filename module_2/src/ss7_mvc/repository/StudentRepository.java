package ss7_mvc.repository;

import ss2_loop_array.Student;

public interface StudentRepository {
    Student[] findAll();
    void save(Student student);
}
