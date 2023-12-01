package case_study.model;

public class Employee extends Person {
    private String level;
    private String index;
    private Double money;

    public Employee(String code, String name, String date, Integer identity, Integer phoneNumber, String gmail,
                    String level, String index, Double money) {
        super(code, name, date, identity, phoneNumber, gmail);
        this.level = level;
        this.index = index;
        this.money = money;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "code='" + super.getCode() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", date='" + super.getDate() + '\'' +
                ", identity=" + super.getIdentity() +
                ", phoneNumber=" + super.getPhoneNumber() +
                ", gmail='" + super.getGmail() + '\'' +
                ",level='" + level + '\'' +
                ", index='" + index + '\'' +
                ", money=" + money +
                '}';
    }
}
