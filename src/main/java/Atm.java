public class Atm {

    private int initialBalance;
    private String pin;

     //returns the information
    public int getBalance() {
        return initialBalance;
    }
    //constructor
    public Atm(int initialBalance, String pin) {
        this.initialBalance = initialBalance;
        this.pin = pin;
    }

    public void deposit(int amountToDeposit) {
        initialBalance += amountToDeposit;
    }

    public void withdrawal(int amountToWithdrawal) {
        initialBalance -= amountToWithdrawal;
        if(amountToWithdrawal > initialBalance){
            initialBalance -= 0;
        }else{
            initialBalance -= amountToWithdrawal;

        }
    }

    public boolean accessAccount(String userEnteredPin) {
        if(userEnteredPin.equals((pin))) {
            return true;
        }else {
            return false;
        }

    }
}
