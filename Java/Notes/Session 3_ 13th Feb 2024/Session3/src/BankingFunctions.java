public class BankingFunctions {
//    Account ac1 = new Account();
//    accountBalance = ac1.getAccountBalance();
    double accountBalance;
    public void depositingFunds(Account ac1, double money) {
        accountBalance = ac1.getAccountBalance();
        accountBalance += money; // accountBalance = accountBalance + money
        System.out.println(money + " is currently deposited in your account "
                + " Total Balance after deopsit: " + accountBalance);
        ac1.setAccountBalance(accountBalance);

    }

    public void withdrawingFunds(double money){
        if((this.accountBalance -  money) < 0.0) {
            System.out.println(" You cannot withdraw the money");
        } else {
            this.accountBalance -= money;
            System.out.println(money + " is currently withdraw from your account "
                    + " Total Balance after withdrawal: " + this.accountBalance);
        }

    }}
