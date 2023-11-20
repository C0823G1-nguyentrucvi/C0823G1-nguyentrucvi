package ss12_lamthem.service;

import ss12_lamthem.models.Student;
import ss12_lamthem.repository.IStudentRepository;
import ss12_lamthem.repository.StudentRepository;

import java.util.List;

public class StudentService implements IStudentService{
    private IStudentRepository iStudentRepository=new StudentRepository();
    @Override
    public void addStudent(Student student) {
        iStudentRepository.addStudent(student);
    }

    @Override
    public List<Student> getAll() {
        return iStudentRepository.getAll();
    }
}
