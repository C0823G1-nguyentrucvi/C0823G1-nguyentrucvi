package ss7_mvc.service;

import ss2_loop_array.Student;

public interface StudentService {
    Student[] findAll();
    void save(Student student);
}
