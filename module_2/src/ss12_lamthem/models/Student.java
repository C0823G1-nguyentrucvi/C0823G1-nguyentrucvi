package ss12_lamthem.models;

public class Student {
    private String id;
    private String name;
    private String date;
    private String room;
    private Double point;

    public Student() {

    }

    public Student(String id, String name, String date, String room, Double point) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.room = room;
        this.point = point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", room='" + room + '\'' +
                ", point=" + point +
                '}';
    }
}
