package ss18_case_study.bai_1.models;

public class House extends Facility {
    private String standard;
    private int quantity;

    public House(String standard, int quantity) {
        this.standard = standard;
        this.quantity = quantity;
    }

    public House() {
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "House{" +
                "standard='" + standard + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
