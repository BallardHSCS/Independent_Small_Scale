public class SavingsAccount extends BankAccount {
    private static double INTEREST_RATE;
    private double balance;


    public SavingsAccount(){
        super(0);
    }

    public SavingsAccount(double startingBalance){
        balance = startingBalance;
    }

    //gets the balance

    public double getBalance(){

        return balance;
    }



    //makes deposits
    public void makeDeposit(double amount){

        double newBalance = super.getBalance() + amount;
        newBalance *= (1 + INTEREST_RATE);
        super.setBalance(newBalance);
    }
    //makes withdrawal
    public void makeWithdrawal(double amount){
        balance -= amount;
    }
}

