public class MainBankAccount {
    public static void main(String[] args) {
    Checking c=new Checking("Mini","7276789",234567);
    c.showInfo();
        c.deposit(7654);
        c.withdraw(789);
        c.transfer("Akash",567);
        System.out.println("********************");
    Savings s=new Savings("Rohan","74635355",8769);
    s.showInfo();

    s.deposit(2345);
    s.withdraw(56);
    s.transfer("Rajesh",4567);





    }
}
