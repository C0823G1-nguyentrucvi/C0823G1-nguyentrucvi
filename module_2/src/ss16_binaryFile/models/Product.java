package ss16_binaryFile.models;

import java.io.Serializable;
import java.util.List;

public class Product implements Serializable {
    private static final long serialVersionUID = -6500665823330706018L;
    private String code;
    private String name;
    private Float price;
    private String manufacture;
    private String describe;

    public Product() {
    }

    public Product(String code, String name, Float price, String manufacture, String describe) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.manufacture = manufacture;
        this.describe = describe;
    }




    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacture='" + manufacture + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }


}
