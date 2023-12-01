package case_study.common;

import case_study.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private final String FILE_PATH = "src/case_study/data/doc.csv";
    private List<Employee> employees;


    public List<Employee> readFile() {
        List<Employee> employees = new ArrayList<>();
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        String line;
        String[] temp;
        Employee employee;
        String code;
        String name;
        String date;
        int identity;
        int phoneNumber;
        String gmail;
        String level;
        String index;
        Double money;

        try {
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                code = temp[0];
                name = temp[1];
                date = temp[2];
                identity = Integer.parseInt(temp[3]);
                phoneNumber = Integer.parseInt(temp[4]);
                gmail = temp[5];
                level = temp[6];
                index = temp[7];
                money = Double.valueOf(temp[8]);
                employee = new Employee(code, name, date, identity, phoneNumber, gmail, level, index, money);
                employees.add(employee);
            }
        } catch (IOException e) {
            System.out.println("error");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("error");
                ;
            }
        }

        return employees;
    }

    public void writeFile() throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String data = "";
        for (Employee employee : employees) {
            data += employee.getCode() + "," + employee.getName() + "," + employee.getDate() + "," + employee.getIdentity() + "," + employee.getPhoneNumber() + "," + employee.getGmail() + "," + employee.getLevel() + "," + employee.getIndex() + "," + employee.getMoney();
        }
        bufferedWriter.write(data);
        bufferedWriter.close();
    }

}

