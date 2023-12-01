package case_study.model;

public class Customer extends Person {
    private String CustomerType;
    private String Address;

    public Customer(String code, String name, String date, Integer identity, Integer phoneNumber, String gmail,
                    String CustomerType, String Address) {
        super(code, name, date, identity, phoneNumber, gmail);
        this.CustomerType = CustomerType;
        this.Address = Address;
    }

    public String getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(String customerType) {
        CustomerType = customerType;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
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
                "CustomerType='" + CustomerType + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
