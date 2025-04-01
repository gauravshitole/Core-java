package Collection;

public class Customer {
    private Integer CustId;
    private String name;
    private String address;
    private  String pan;
    private  String addhar;
    private String PhoneNumber;
    private String emailId;

    public Customer(Integer custId, String name, String address, String pan, String addhar, String phoneNumber, String emailId) {
        CustId = custId;
        this.name = name;
        this.address = address;
        this.pan = pan;
        this.addhar = addhar;
        PhoneNumber = phoneNumber;
        this.emailId = emailId;
    }
    public String getPan(){
        return this.pan;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "pan='" + pan + '\'' +
                '}';
    }
}
