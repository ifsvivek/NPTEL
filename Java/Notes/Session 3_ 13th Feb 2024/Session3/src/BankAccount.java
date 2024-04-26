public class BankAccount {
    // fields
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private long phoneNumber;
    private String email;

    // default constructor
    public BankAccount(){
        System.out.println("This is a default constructor. It is invoked just after creation of the object.");
    }

    public BankAccount(int accountNumber, double accountBalance,
                       String customerName, long phoneNumber, String email) { // parameterized constructor
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        System.out.println("This is a parameterized constructor.");
    }

    public BankAccount(int accountNumber, double accountBalance) {
        // method 2
        this(accountNumber, accountBalance, "Rahul",
                6829017382l, "rahul@yahoo.in");
        System.out.println("This is 2nd parameterized constuctor using this() as a constructor chaining");

        // method 1
//        this.accountBalance = accountBalance;
//        this.accountNumber = accountNumber;
//        this.customerName = "Rahul";
//        this.email = "rahul@yahoo.in";
//        this.phoneNumber = 6829017382l;

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
        System.out.println("Account balance before deposit: "+ this.accountBalance);
        this.accountBalance += money;
        System.out.println("Rs. " +  money + " has been deposited. Update balance is : " + this.accountBalance);
    }

    public void withdrawingFunds(double money) {
        if ((this.accountBalance -  money) < 0) {
            System.out.println("You cannot withdraw the money, because your account Balance will " +
                    "become negative.");
        }
        else {
            this.accountBalance -= money;
            System.out.println("Rs. " + money + "money has been withdrawn. Current balance is: " + this.accountBalance);
        }

    }
}
