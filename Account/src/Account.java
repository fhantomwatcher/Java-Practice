public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(){}

    public void setAccountHolderName(String ahn) {
        this.accountHolderName = ahn;
    }

    public void setAccountNumber(int an) {
        this.accountNumber = an;
    }

    public void setBalance(double b) {
        this.balance = b;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void showDetails(){
        System.out.println("Account Details");
        System.out.println("Account Holder Name: "+getAccountHolderName());
        System.out.println("Account Number: "+getAccountNumber());
        System.out.println("Account Balance: "+getBalance());
    }
}
