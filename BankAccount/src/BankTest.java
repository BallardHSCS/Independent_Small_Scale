public class BankTest {

    public static void main(String[] args){

        BankAccount rolandsAccount = new BankAccount();
        SavingsAccount svensAccount = new SavingsAccount(2000);
        svensAccount.makeDeposit(500);
        System.out.println(rolandsAccount);
        System.out.println(svensAccount);


    }
}
