public class Checking extends Account{
    // List properties specific to checking account
    private long debitCard;
    private int pin;

    // Constructors initialize the checking acc properties
    public Checking(String name,String securityNumber,double initialDeposit){
        super( name, securityNumber, initialDeposit);
        accountNumber="2"+accountNumber;
        setDebitsDetails();
        setRate();
    }
    //List methods specific to checking account


    private void setDebitsDetails(){
        // 10-digit numbers over Integer.MAX_VALUE doesn't fit in an int, hence the long.
        debitCard = (long) Math.floor(Math.random() * 9_000_000_000_00L) + 1_000_000_000_00L;


        pin=(int) (Math.random()*Math.pow(10,4));
    }

    @Override
    public void setRate(){
        rate=getBaseRate() * 0.15;
    }
    public void showInfo(){
        System.out.println("Hi "+getName()+" these are your Checking Accounts details");

        super.showInfo();
        System.out.println("Debit Card: "+debitCard+"\nPin: "+pin+"\nBase Interest Rate: "+rate);
    }



}
