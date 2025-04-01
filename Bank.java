package Collection;

public class Bank {
    private  final String  CustID;
    private final String  CustName;
    private final String AccNo;
    private final String AccType;
    private final String Balance;

    public Bank(String custID, String custName, String accNo, String accType, String balance) {
        CustID = custID;
        CustName = custName;

        AccNo = accNo;
        AccType = accType;
        Balance = balance;
    }
}
