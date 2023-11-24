package ss_15_textFilet.bai_1;

public class Milk {

    public int id;
    public String name;
    public double point;

    public Milk() {
    }

    public Milk(int id, String name, double point) {
        this.id = id;
        this.name = name;
        this.point = point;
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

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + point +
                '}';
    }


}
