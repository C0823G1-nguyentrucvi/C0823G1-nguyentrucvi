package case_study.common;

import case_study.model.Customer;
import case_study.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileService {
    private final String FILE_EMPLOYEE_PATH = "src/case_study/data/employee.csv";
    private  final String FILE_CUSTOMER_PATH = "src/case_study/data/customer.csv";

    public List<Customer> readCustomers() {
        List<Customer> customers = new ArrayList<>();
        List<String> strings = readFromFile(FILE_CUSTOMER_PATH);
        String[] temp;
        for (String s : strings) {
            temp = s.split(",");
            String code = temp[0];
            String name = temp[1];
            String date = temp[2];
            int identity = Integer.parseInt(temp[3]);
            String phoneNumber = temp[4];
            String gmail = temp[5];
            String customerType = temp[6];
            String address = temp[7];
            Customer customer = new Customer(code, name, date, identity, phoneNumber, gmail, customerType, address);
            customers.add(customer);
        }
        return customers;
    }


    public List<Employee> readEmployees() {
        List<Employee> employees = new ArrayList<>();
        List<String> strings = readFromFile(FILE_EMPLOYEE_PATH);

        String[] temp;
        for (String s : strings) {
            temp = s.split(",");
            String code = temp[0];
            String name = temp[1];
            String date = temp[2];
            int identity = Integer.parseInt(temp[3]);
            String phoneNumber = temp[4];
            String gmail = temp[5];
            String level = temp[6];
            String index = temp[7];
            double money = Double.parseDouble(temp[8]);
            Employee employee = new Employee(code, name, date, identity, phoneNumber, gmail, level, index, money);
            employees.add(employee);
        }
        return employees;
    }

    // Ghi danh sách employee vào file
    public void writeEmployee(List<Employee> employees) {
        List<String> strings = new ArrayList<>();
        for (Employee employee : employees) {
            strings.add(employee.convertToLine());
        }
        writeToFile(FILE_EMPLOYEE_PATH, strings);
    }

    public void writeCustomer(List<Customer> customers) {
        List<String> strings = new ArrayList<>();

        for (Customer customer : customers) {
            strings.add(customer.convertToLine());
        }
        writeToFile(FILE_CUSTOMER_PATH, strings);
    }

    /**
     * Write from file
     */
    private void writeToFile(String pathFile, List<String> strings) {
        try {
            FileWriter fileWriter = new FileWriter(pathFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : strings) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Read from file
     */
    private static List<String> readFromFile(String pathFile) {
        List<String> strings = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(pathFile);
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

}

