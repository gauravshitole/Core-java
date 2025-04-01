package Collection;

public class Account implements  Comparable<Account>{
    private  String  custId;
    private  Integer  accNo;
    private  String  typeOfAccount;
    private  double balance;

    public  Account(String custId,Integer accNo,String typeOfAccount ,Double balance){
       this.custId=custId;
        this.accNo=accNo;
        this.typeOfAccount=typeOfAccount;
    }
    public double getbalance(double balance){
        return this.balance=balance;
    }
    @Override
    public  String toString(){
        return "Account[custId-"+this.custId+",accNo"+this.accNo+",typOfAccount"+typeOfAccount+",balance"+balance;
    }
    @Override
    public int compareTo(Account anoherAcoount){
        return this.accNo.compareTo(anoherAcoount.accNo);
    }
}
