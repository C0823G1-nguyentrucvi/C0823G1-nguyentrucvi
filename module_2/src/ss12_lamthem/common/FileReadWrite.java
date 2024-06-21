package ss12_lamthem.common;

import ss12_lamthem.models.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReadWrite {
    private static final String FILE = "src/ss12_lamthem/data/file.csv";

    private static List<String> readFileStudent(String FILE) {
        List<String> strings = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                strings.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    public List<Student> readStudent() {
        List<Student> studentList = new ArrayList<>();
        List<String> students = readFileStudent(FILE);
        String[] temp;
        for (String string : students) {
            temp = string.split(",");
            String name = temp[0];
            String code = temp[1];
            int old = Integer.parseInt(temp[2]);
            Student student = new Student(name, code, old);
            studentList.add(student);
        }
        return studentList;
    }

    private static List<String> writeFile(String file, List<String> stringList) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : stringList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public void writeStudent(List<Student> students) {
        List<String> strings = new ArrayList<>();
        for (Student student : students) {
            strings.add(student.toLine());
        }
        writeFile(FILE, strings);
    }


}
