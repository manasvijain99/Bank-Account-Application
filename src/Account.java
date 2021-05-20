public abstract class Account implements IBaseRate {
    //List common properties for both types of accounts
    private String name;
    private  String securityNumber;
    protected String accountNumber;
    protected double rate;
    private double balance;
   private static int index=10000; //Because we want 5 digit unique number which can not change and is different to static is used.

    //Constructor to set base properties and initialize accounts
    public Account(String name,String securityNumber,double initialDeposit){
        this.name=name;
        this.securityNumber=securityNumber;
        this.accountNumber=setAccountNumber();
        balance=initialDeposit; //Balance may change so we are taking initial value and then assigning it to balance
    }

    private String setAccountNumber(){
        String lastTwoDigits= securityNumber.substring(securityNumber.length()-2);
        int randDigit= (int)(Math.random()*Math.pow(10,3)); //Because we need a three digit random number
        int uniqueDigit=index++;
        return lastTwoDigits  + uniqueDigit + randDigit;

    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }


    public abstract void setRate();
//     List Common methods
    public  void deposit(double amount){
        balance=balance+amount;
        System.out.println("Amount is deposited with remaining balance as: "+balance);

    }

    public  void withdraw(double withdrawAmount){
        balance=balance-withdrawAmount;
        System.out.println("Amount withdrawn successfully with remaining balance as: "+balance);

    }

    public  void transfer(String toWhom,double transferAmount){
        balance=balance-transferAmount;
        System.out.println("Amount transfer to "+toWhom+" successfully with remaining balance "+balance);
    }
    public void showInfo(){
        System.out.println("Name: "+name+"\nAccount Number: "+ accountNumber+"\nBalance: "+balance);
    }

}
