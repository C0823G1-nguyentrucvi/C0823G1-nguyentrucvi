package ss12_lamthem.repository;

import ss12_lamthem.common.FileReadWrite;
import ss12_lamthem.models.Student;
import ss17_string_regex.bai_1.Name;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Student> studentList = new ArrayList<>();
    private static final FileReadWrite fileReadWrite = new FileReadWrite();

    @Override
    public List<Student> findAll() {
        return fileReadWrite.readStudent();
    }

    @Override
    public void addStudent(Student student) {
        studentList = fileReadWrite.readStudent();
        studentList.add(student);
        fileReadWrite.writeStudent(studentList);

    }


    @Override
    public void delete(Student code) {
        studentList = fileReadWrite.readStudent();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getCode().equals(code)) {
                studentList.remove(studentList.get(i));
            }
        }
        fileReadWrite.writeStudent(studentList);
    }


    @Override
    public Student findByName(String code) {
        studentList = fileReadWrite.readStudent();
        for (Student student : studentList) {
            if (student.getCode().equals(code)) {
                return student;
            }
        }
        return null;
    }

}
