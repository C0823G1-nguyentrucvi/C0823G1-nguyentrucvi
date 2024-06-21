package ss12_lamthem.service;

import ss12_lamthem.models.Student;
import ss12_lamthem.repository.IStudentRepository;
import ss12_lamthem.repository.StudentRepository;

import java.util.List;

public class StudentService implements IStudentService {
    private static IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public List<Student> findAll() {
        return iStudentRepository.findAll();
    }

    @Override
    public void addStudent(Student student) {
        iStudentRepository.addStudent(student);
    }

    @Override
    public void delete(Student code) {
        iStudentRepository.delete(code);
    }

    @Override
    public Student findByName(String code) {
        return iStudentRepository.findByName(code);
    }
}
