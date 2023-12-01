package case_study.model;

public class Villa extends Facility{
    private String standard;
    private Double area;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String standard, Double area, int numberOfFloors) {
        this.standard = standard;
        this.area = area;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standard='" + standard + '\'' +
                ", area=" + area +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
