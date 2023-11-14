package ss7_mvc.service;

import ss2_loop_array.Student;
import ss7_mvc.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService {
    private final StudentRepositoryImpl repository = new StudentRepositoryImpl();

    @Override
    public Student[] findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Student student) {
        repository.save(student);
    }
}
