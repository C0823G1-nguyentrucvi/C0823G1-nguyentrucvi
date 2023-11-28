package ss18_case_study.bai_1.models;

import java.util.Date;

public class Resort {
private String codeService;
private String nameService;
private int area;
private float expense;
private int remember;
private Date time;

    public Resort() {
    }

    public Resort(String codeService, String nameService, int area, float expense, int remember, Date time) {
        this.codeService = codeService;
        this.nameService = nameService;
        this.area = area;
        this.expense = expense;
        this.remember = remember;
        this.time = time;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public float getExpense() {
        return expense;
    }

    public void setExpense(float expense) {
        this.expense = expense;
    }

    public int getRemember() {
        return remember;
    }

    public void setRemember(int remember) {
        this.remember = remember;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Resort{" +
                "codeService='" + codeService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", area=" + area +
                ", expense=" + expense +
                ", remember=" + remember +
                ", time=" + time +
                '}';
    }
}
