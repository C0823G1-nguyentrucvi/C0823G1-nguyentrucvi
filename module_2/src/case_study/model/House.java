package case_study.model;

public class House extends Facility {
    private String standard;
    private int quantity;


    public House(String codeService, String nameService, Double area, float expense, int remember, String standard, int quantity) {
        super(codeService, nameService, area, expense, remember);
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
