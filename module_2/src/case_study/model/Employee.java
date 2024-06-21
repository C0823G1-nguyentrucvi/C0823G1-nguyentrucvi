package case_study.model;

public class Employee extends Person {
    private String level;
    private String position;
    private Double money;

    public Employee(String code, String name, String date, Integer identity, String phoneNumber, String gmail,
                    String level, String position, Double money) {
        super(code, name, date, identity, phoneNumber, gmail);
        this.level = level;
        this.position = position;
        this.money = money;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String convertToLine() {
        return super.getCode() + "," + super.getName() + "," + super.getDate() + "," + super.getIdentity() + "," + super.getPhoneNumber() + "," + super.getGmail() + "," + this.getLevel() + "," + this.getPosition() + "," + this.getMoney();
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
                ", position='" + position + '\'' +
                ", money=" + money +
                '}';
    }
}
