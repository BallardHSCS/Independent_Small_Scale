public class BankAccount {

    private double balance;


    public BankAccount(){
            balance = 0;
        }

    public BankAccount(double startingBalance){

        balance = startingBalance;
        }

    //gets the balance

    public double getBalance(){

            return balance;
    }

    //makes deposits
        public void makeDeposit(double amount){

        balance += amount;
        }
    //makes withdrawal
    public void makeWithdrawal(double amount){
            balance -= amount;
    }

    public void setBalance(double balance){

        this.balance = balance;


    }
    public String toString(){
        return ("Current Balance:" + balance);
    }
}
