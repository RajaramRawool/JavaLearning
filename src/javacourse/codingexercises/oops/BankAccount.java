package javacourse.codingexercises.oops;

public class BankAccount {
    private long accountNumber;
    private long balance;
    private String customerName;
    private String email;
    private long phoneNumber;
//    getters
    public long getAccountNumber() {
        return this.accountNumber;
    }
    public long getBalance() {
        return this.balance;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public String getEmail() {
        return this.email;
    }
    public long getPhoneNumber() {
        return this.phoneNumber;
    }
//    setters
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
//    additional methods
    public void depositFunds(long funds) {
        this.balance += funds;
        System.out.println("Amount of " + funds + " deposited to your balance, and your current balance is " + this.balance +"." );
    }
    public void withdrawFunds(long funds) {
        if (funds > this.balance) {
            System.out.println("you don't have sufficient balance to process this withdraw.");
        }else {
            this.balance -= funds;
            System.out.println("Amount of " + funds + " withdrawn from your balance, and your current balance is " + this.balance +"." );
        }
    }
}
