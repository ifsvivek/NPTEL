public class Account {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private long phoneNumber;
    private String phoneNumber1;
    private String email;

    public Account() { //default constructor
        System.out.println("This is invoked after creating an object in ClassChallenge.java");
    }

    public Account(int accountNumber, double accountBalance, String customerName,
                   long phoneNumber, String email) { // parameterized constructor
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        System.out.println("This is a constructor where all attributes are instantitated");
    }

    public Account(int accountNumber, double accountBalance) {
        this(accountNumber, accountBalance, "Viren",
                9993728163l, "viren@outlook.com"); // constructor chaining
//        this.customerName = "Viren";
        System.out.println("This is a constructor with two arguments");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void depositingFunds(double money) {
        this.accountBalance += money; // accountBalance = accountBalance + money
        System.out.println(money + " is currently deposited in your account "
                + " Total Balance after deopsit: " + this.accountBalance);

    }

    public void withdrawingFunds(double money){
        if((this.accountBalance -  money) < 0.0) {
            System.out.println(" You cannot withdraw the money");
        } else {
            this.accountBalance -= money;
            System.out.println(money + " is currently withdraw from your account "
                    + " Total Balance after withdrawal: " + this.accountBalance);
        }

    }
}
