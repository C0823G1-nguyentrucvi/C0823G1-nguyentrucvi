package ss4_static.bai_tap.bai_2;

public class Student {
    private String name;
    private String classes;


    public void setName(String name) {
        this.name = name;
    }


    public void setClasses(String classes) {
        this.classes = classes;
    }
    public Student(){
        this.setName("John");
        this.setClasses("C02");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
