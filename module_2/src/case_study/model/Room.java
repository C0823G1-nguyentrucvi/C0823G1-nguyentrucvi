package case_study.model;

public class Room extends Facility{
    private String freeDV;

    public Room(String freeDV) {
        this.freeDV = freeDV;
    }

    public Room() {
    }

    public String getFreeDV() {
        return freeDV;
    }

    public void setFreeDV(String freeDV) {
        this.freeDV = freeDV;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeDV='" + freeDV + '\'' +
                '}';
    }
}
