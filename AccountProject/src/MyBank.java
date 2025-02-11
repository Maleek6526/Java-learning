package AnotherAccountHeadache;

import java.util.ArrayList;

public class MyBank {
    private ArrayList<MyAccount> dataBase;
    private int counter = 0;
    private int accountNumber;
    private float balance;
    private String bankName;
    public MyBank(String bankName){
        dataBase = new ArrayList<>();
        this.bankName = bankName;
    }
    public void createNewAccount(String firstName, String lastName, String pinCode){
        String fullName = firstName + " " + lastName;
        this.accountNumber = counter + 1;
        MyAccount newAccount = new MyAccount(fullName,pinCode, accountNumber);
        dataBase.add(newAccount);
        counter++;
    }

    public int getCounter(){
        return counter;
    }

    public int getAccountNumber(){
        return accountNumber;
    }


    public void deposit(int accountNumber, float amount) {
        MyAccount account = findAccount(accountNumber);
        account.getDeposit(amount);
    }

    public double getBalance(int accountNumber, String pinCode) {
        MyAccount account = findAccount(accountNumber);
        if (account == null) {
            throw new IllegalArgumentException("Account not found.");
        }
        if (!validatePincode(account, pinCode)) {
            throw new IllegalArgumentException("Invalid PIN code.");
        }
        return account.getBalance();
    }

    private MyAccount findAccount(int accountNumber) {
        for (MyAccount account : dataBase) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    private boolean validatePincode(MyAccount account, String pinCode) {
        return account.getPinCode().equals(pinCode);
    }

    public void transfer(int senderAccount, int receiverAccount, float amount, String pinCode, MyBank receiverBank){
        MyAccount sender = findAccount(senderAccount);
        MyAccount receiver = findAccount(receiverAccount);
        if (sender == null) {
            throw new IllegalArgumentException("Sender Account not found.");
        }
        if (receiver == null) {
            throw new IllegalArgumentException("Receiver Account not found.");
        }
        if (!validatePincode(sender, pinCode)) {
            throw new IllegalArgumentException("Sender Invalid PIN code.");
        }

        if (amount <= 0) {
            throw new IllegalArgumentException("Transfer amount must be greater than zero.");
        }

        sender.getWithdraw(pinCode, amount);
        receiver.getDeposit(amount);
    
    }

    public void withdraw(int accountNumber, String pinCode, float amount){
        MyAccount sender = findAccount(accountNumber);
        validatePincode(sender, pinCode);
        sender.getWithdraw(pinCode, amount);
    }

    public void interBankTransfer(int senderAccount, int receiverAccount, float amount, String senderBankName, String pinCode, MyBank receiverBank) {

        MyAccount sender = findAccount(senderAccount);
        MyAccount receiver = receiverBank.findAccount(receiverAccount);

        if (sender == null) {
            throw new IllegalArgumentException("Sender Account not found.");
        }
        if (receiver == null) {
            throw new IllegalArgumentException("Receiver Account not found in the receiver bank.");
        }

        if (!validatePincode(sender, pinCode)) {
            throw new IllegalArgumentException("Sender Invalid PIN code.");
        }


        if (amount <= 0) {
            throw new IllegalArgumentException("Transfer amount must be greater than zero.");
        }


        if (sender.getBalance() < amount) {
            throw new IllegalArgumentException("Insufficient funds in sender's account.");
        }


        sender.getWithdraw(pinCode, amount);
        receiver.getDeposit(amount);

        System.out.println("Inter-bank transfer successful from Bank: " + senderBankName + " to Bank: " + receiverBank.bankName);
    }

}
