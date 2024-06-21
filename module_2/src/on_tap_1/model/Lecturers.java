package on_tap_1.model;

import java.time.LocalDate;

public class Lecturers {

    private Integer id;
    private String code;
    private String name;
    private LocalDate date;
    private boolean gender;
    private String specialize;


    public Lecturers() {
    }

    public Lecturers(Integer id, String code, String name, LocalDate date, boolean gender, String specialize) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.specialize = specialize;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isGender() {

        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "lecturers{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", gender=" + gender +
                ", specialize='" + specialize + '\'' +
                '}';
    }
}
