package ss10_Java_Collection_Framework.model;

public class Product {
    private int id;
    private String name;
    private Long salary;

    public Product(String id, String name, double salary) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.salary = (long) salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
