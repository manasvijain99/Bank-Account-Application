public class Savings extends Account{


    // List properties specific to savings account
    private int safetyDepositNumber;
    private int safetyDepositCode;


    // Constructors initialize the savings acc properties
    public Savings(String name,String securityNumber,double initialDeposit){
        super( name, securityNumber, initialDeposit);
        accountNumber="1"+accountNumber;
        setSafetyDepositBox();
        setRate();
    }
    //List methods specific to savings account


    private void setSafetyDepositBox(){
        safetyDepositNumber=(int)(Math.random()*Math.pow(10,3));
        safetyDepositCode=(int)(Math.random()*Math.pow(10,4));
    }
    @Override
    public void setRate(){
        rate=getBaseRate() - 0.0025;
    }
    public void showInfo(){
        System.out.println("Hi "+getName()+" these are your Savings Accounts details");

        super.showInfo();
        System.out.println("Safety Deposit Number: "+safetyDepositNumber+"\nSafety Deposit Code: "
                +safetyDepositCode+"\nBase Interest Rate: " + rate);
    }






}
