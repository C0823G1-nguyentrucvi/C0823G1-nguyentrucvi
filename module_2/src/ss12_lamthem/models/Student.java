package ss12_lamthem.models;

public class Student {
    private String name;
    private String code;
    private int old;

    public Student(String name, String code, int old) {
        this.name = name;
        this.code = code;
        this.old = old;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String toLine() {
        return getName() + "," + getCode() + "," + getOld();
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", old=" + old +
                '}';
    }
}
