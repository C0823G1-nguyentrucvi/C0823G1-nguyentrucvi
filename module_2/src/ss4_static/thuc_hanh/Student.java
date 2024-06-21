package ss4_static.thuc_hanh;

public class Student {
    private String name;
    public String old;
    private static String hv = "coder";

    public Student() {
    }

    Student(String a, String b) {
        name = a;
        old = b;
    }

    static void change() {
        hv = "Dev";

    }

    void display() {
        this.name = "Truc Vi";
        System.out.println(name + "," + old + "," + hv);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public static String getHv() {
        return hv;
    }

    public static void setHv(String hv) {
        Student.hv = hv;
    }
}
