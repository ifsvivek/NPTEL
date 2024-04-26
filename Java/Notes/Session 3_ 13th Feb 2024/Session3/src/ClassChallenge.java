public class ClassChallenge {
    public static void main(String[] args) {
//        int phoneNumber;
        System.out.print(Integer.MAX_VALUE);
        Account Easaccount =  new Account();
        Account account1 = new Account(34267, 10000,
                "Eashaan", 873987419l, "eas@gmail.com");
        Account account2 = new Account(67628, 190000);
        BankingFunctions fun1 = new BankingFunctions();
        fun1.depositingFunds(account1, 4000);
        System.out.print("New balance after deposit for account 1: "+ account1.getAccountBalance());
//        Easaccount.setAccountBalance(10000);
//        Easaccount.setAccountNumber(34267);
//        Easaccount.setEmail("eas@gmail.com");
//        Easaccount.setCustomerName("Eashaan");
//        Easaccount.setPhoneNumber(873987419l);
//
//        Easaccount.depositingFunds(5000);
//        Easaccount.withdrawingFunds(9000);
    }
}
//employer - parent
//manager- subclass
//new Manager()
// bonus() - both employer and manager
// an object - manager (super
//
// employer e = new Manager()
// e.bonus(5)