package ss7_mvc.repository;

import ss2_loop_array.Student;

public class StudentRepositoryImpl implements StudentRepository {
    private static final Student[] studentList;
    private static int size = 0;

    static {
        studentList = new Student[10];
        studentList[0] = new Student(1, "Nguyen Van A", 5.6);
        studentList[1] = new Student(2, "Nguyen Van B", 8.6);
        studentList[2] = new Student(3, "Nguyen Van C", 9.6);
        size = 3;
    }

    @Override
    public Student[] findAll() {
        Student[] students=new Student[size];
        System.arraycopy(studentList, 0, students, 0, size);
        return students;
    }

    @Override
    public void save(Student student) {
        studentList[size] = student;
        size++;
    }
}
