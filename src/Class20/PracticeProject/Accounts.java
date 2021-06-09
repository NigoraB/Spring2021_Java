package Class20.PracticeProject;

import java.util.ArrayList;
import java.util.List;

public class Accounts {
    private int accountNumber = 0000;
    private double balance = 0.00;
    private String accType = "checking";



    public int createAccount(String type) {
        if (type.toLowerCase().startsWith("saving") || type.toLowerCase().startsWith("checking")) {
            // to generate a random number between 1000-9999
            accountNumber = (int) (Math.random()*(9999-1000)) + 1000;
            accType = type;
        } else {
            System.out.println("Please enter correct account type");
        }
        return accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return balance;
    }

    public String getAccountType() {
        return accType;
    }

    /**
     *
     *
     * methods
     *      createAccount()
     *          input parameter : 1
     *          output parameter : 1 (4 digits of created account #)
     *
     *      withDraw()
     *          input parameter: 2
     *              accountNum, amount
     *          output :
     *
     *      deposit()
     *          input parameter: 2
     *              accountNum, amount
     *          output :
     *
     *       balance()
     *          input parameter: 1
     *              accountNum
     *          output parameter: 1
     *              balance amount
     *
     */

    public void deposit(double amt) {

    }




}
