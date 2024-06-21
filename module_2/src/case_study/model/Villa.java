package case_study.model;

import java.util.Date;

public class Villa extends Facility {
    private String standard;

    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String codeService, String nameService, Double area, float expense, int remember, String standard, int numberOfFloors) {
        super(codeService, nameService, area, expense, remember);
        this.standard = standard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
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
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
