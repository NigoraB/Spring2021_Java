package Class20.PracticeProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {

    // To store all accounts object for a customer
    private List<Accounts> allAccountsObjects = new ArrayList<>();
    private String name, ssn, address;

    public Customer() {
        Accounts acc = new Accounts();
        acc.createAccount("savings");
        allAccountsObjects.add(acc);
        System.out.println("\nsavings account successfully created");
        System.out.println("New Account number : " + acc.getAccountNumber());
        System.out.println("Balance : " + acc.getAccountBalance());
    }

//    public Customer() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter name : ");
//        name = input.next();
//        System.out.println("Please enter ssn : ");
//        ssn = input.next();
//        System.out.println("Would you like to enter your address : ");
//        if (input.next().equalsIgnoreCase("yes")) {
//            System.out.println("Please enter your address : " );
//            address = input.next();
//        }
//        System.out.println("Please enter account type : ");
//        String type = input.next();
//        Accounts acc = new Accounts();
//        acc.createAccount(type);
//        allAccountsObjects.add(acc);
//        System.out.println("New Account number : " + acc.getAccountNumber());
//        System.out.println("Balance : " + acc.getAccountBalance());
//    }

    public void createAccount() {
        Accounts acc = new Accounts();
        allAccountsObjects.add(acc);
        acc.createAccount("checking");
        System.out.println("\nchecking account successfully created");
        System.out.println("New Account number : " + acc.getAccountNumber());
        System.out.println("Balance : " + acc.getAccountBalance());
    }

    public void showAllAccountBalance() {
        // [acc1, acc2]
        System.out.println("\nYou have total " + allAccountsObjects.size() + " accounts");
        for (Accounts acc : allAccountsObjects) {
            System.out.println("Account Type: " + acc.getAccountType());
            System.out.println("Account Number : " + acc.getAccountNumber());
            System.out.println("Balance : " + acc.getAccountBalance());
        }
    }

    /**
     * Customer ->
     *      Name
     *      SSN
     *      Address
     *
     *      methods
     *          editDetails()
     *              input parameter : none
     *              output : show the updated info.
     *              make it interactive, ask user for the field wanna edit, and new value
     *          createAccount()
     *              input parameter : none
     *              if input is savings, create a savings account
     *              if input is checking, create a checking account
     *              if input is something else, show error
     *              make it interactive, ask user for account type
     *              show:
     *                  Savings account has been created.
     *                  Last 4-digits of account number is XXXX
     *          showAccountBalance()
     *              input parameter : none
     *              make it interactive, ask user for account number
     *              show:
     *                  Account number:
     *                  Balance:
     *          showAllAccountBalance()
     *              show:
     *                  You have total X account.
     *                  Account number:
     *                  Balance:
     *
     *                  Account number:
     *                  Balance:
     *
     *                  Account number:
     *                  Balance:
     *          makeWithdraw:
     *              make it interactive, ask user for account number
     *              if valid account number, then ask for amount
     *              if amount is valid, make withdraw happen
     *              show:
     *                  Please collect $XXXX.YY amount
     *                  Your updated balance: $NNNN.MM
     *          makeDeposit:
     *              make it interactive, ask user for account number
     *              if valid account number, then ask to enter the amount
     *              if amount is valid, make deposit happen
     *              show:
     *                  Amount has been deposited successfully
     *                  Your updated balance: $NNNN.MM
     *
     */
    public void makeDeposit(double amount) {
        // deposit of Accounts class
    }

    public Customer(String cName, String cSsn, String cType) {
        Accounts acc = new Accounts();
        acc.createAccount(cType);
        allAccountsObjects.add(acc);
        System.out.println("Congratulations for your new account.");
        System.out.println("Account number : " + acc.getAccountNumber());
    }

}
