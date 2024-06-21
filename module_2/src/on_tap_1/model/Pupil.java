package on_tap_1.model;

import java.time.LocalDate;

public class Pupil {
    private Integer id;
    private String code;
    private String name;
    private LocalDate date;
    private String clazz;
    private double point;

    public Pupil(Integer id, String code, String name, LocalDate date, String clazz, double point) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.date = date;
        this.clazz = clazz;
        this.point = point;
    }

    public Pupil() {
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

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", clazz='" + clazz + '\'' +
                ", point=" + point +
                '}';
    }
}
