package case_study.model;

public class Person {
    private String code;
    private String name;
    private String date;
    private Integer identity;
    private Integer phoneNumber;
    private String gmail;

    public Person(String code, String name, String date, Integer identity, Integer phoneNumber, String gmail) {
        this.code = code;
        this.name = name;
        this.date = date;
        this.identity = identity;
        this.phoneNumber = phoneNumber;
        this.gmail = gmail;
    }

    public Person() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "Person{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", identity=" + identity +
                ", phoneNumber=" + phoneNumber +
                ", gmail='" + gmail + '\'' +
                '}';
    }
}
