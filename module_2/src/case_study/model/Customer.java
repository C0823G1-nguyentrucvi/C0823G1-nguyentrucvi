package case_study.model;

public class Customer extends Person {
    private String customerType;
    private String address;

    public Customer(String code, String name, String date, Integer identity, String phoneNumber, String gmail,
                    String CustomerType, String Address) {
        super(code, name, date, identity, phoneNumber, gmail);
        this.customerType = CustomerType;
        this.address = Address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String convertToLine() {
        return super.getCode() + "," + super.getName() + "," + super.getDate() + "," + getIdentity() + "," + super.getPhoneNumber() + "," + super.getGmail() + "," + this.customerType + "," + this.address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "code='" + super.getCode() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", date='" + super.getDate() + '\'' +
                ", identity=" + super.getIdentity() +
                ", phoneNumber=" + super.getPhoneNumber() +
                ", gmail='" + super.getGmail() + '\'' +
                "CustomerType='" + customerType + '\'' +
                ", Address='" + address + '\'' +
                '}';
    }
}
