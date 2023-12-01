package case_study.repository;

import case_study.common.ReadFile;
import case_study.model.Employee;

import java.io.IOException;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private ReadFile readFile = new ReadFile();

    @Override
    public List<Employee> finAll() {
        return readFile.readFile();
    }

    @Override
    public void finAdd() {
        try {
            readFile.writeFile();
        } catch (IOException e) {
            System.out.println("error");
        }
    }

}
