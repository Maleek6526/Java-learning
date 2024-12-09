package AnotherAccountHeadache;

import java.util.Scanner;

public class AccountDriverClass {
    private static MyBank bankA = new MyBank("Zenith");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {
        String menu = """
                Welcome to my dummy bank App
                1-> Open an Account
                2-> deposit
                3-> withdraw
                4-> transfer
                5-> check balance
                6-> inter-bank transfer
                7-> exit
                """;
        System.out.println(menu);
        System.out.println("Enter here: ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1: openAnAccount(); break;
            case 2: deposit();break;
            case 3: withdraw();break;
            case 4: transfer();break;
            case 5: checkBalance();break;
            case 6: interBankTransfer(); break;
            case 7: exit();break;
            default:
                System.out.println("Please enter the correct numbers");
        }
    }

    private static void interBankTransfer() {
        System.out.println("enter the sender account number: ");
        int senderAccountNumber = scanner.nextInt();
        System.out.println("enter the receiver account: ");
        int receiverAccountNumber = scanner.nextInt();
        System.out.println("enter the amount you want to transfer: ");
        float amount = scanner.nextFloat();
        System.out.println("enter the senders bank name: ");
        String sendersBankName = scanner.nextLine();
        scanner.nextLine();
        System.out.println("enter the senders pincode: ");
        String sendersPinCode = scanner.next();
        System.out.println("enter the recievers bank name: ");
        String receiver = scanner.nextLine();
        MyBank receiversBankName = new MyBank(receiver);
        bankA.interBankTransfer(senderAccountNumber,receiverAccountNumber,amount,sendersBankName,sendersPinCode,receiversBankName);


    }

    private static void exit() {
        System.out.println("Thanks for using my bank");
    }

    private static void checkBalance() {
        try {
            System.out.println("Enter your account number: ");
            int accountNumber = scanner.nextInt();
            System.out.println("Enter your pincode: ");
            String pincode = scanner.next();
            float amount = (float) bankA.getBalance(accountNumber, pincode);
            System.out.printf("your account balance is %,.2f %n", amount);
            mainMenu();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            checkBalance();
        }

    }

    private static void withdraw() {
        try{
            System.out.println("Enter your account number: ");
            int accountNumber = scanner.nextInt();
            System.out.println("Enter the amount you want to withdraw: ");
            float amount = scanner.nextFloat();
            System.out.println("Enter your pincode: ");
            String pinCode = scanner.next();
            bankA.withdraw(accountNumber, pinCode, amount);
            System.out.printf("You've successfully withdrawn %,.2f from your account %n", amount);
            mainMenu();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            withdraw();
        }

    }

    private static void deposit() {
        try{
            System.out.println("Enter the account number you want to deposit: ");
            int accountNumber = scanner.nextInt();
            System.out.println("Enter the amount you want to deposit: ");
            float amount = scanner.nextFloat();
            bankA.deposit(accountNumber, amount);
            System.out.printf("You've successfully deposited %,.2f into your account %n", amount);
            mainMenu();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            mainMenu();
        }
    }

    private static void openAnAccount() {
        try{
            System.out.println("please enter your first name: ");
            String firstName = scanner.next();
            System.out.println("please enter your second name: ");
            String secondName = scanner.next();
            scanner.nextLine();
            System.out.println("please set your pincode: ");
            String pinCode = scanner.next();
            bankA.createNewAccount(firstName,secondName, pinCode);
            System.out.println("Account created Successfully");
            System.out.println("Your account number is "+ bankA.getAccountNumber());
            mainMenu();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            openAnAccount();
        }

    }

    private static void transfer(){
        try{
            System.out.println("Enter the sender account number: ");
            int senderAccount = scanner.nextInt();
            System.out.println("Enter the receiver account number: ");
            int receiverAccount = scanner.nextInt();
            System.out.println("Enter your pinCode for the transaction: ");
            String pinCode = scanner.next();
            System.out.println("Enter the amount you want to transfer: ");
            float amount = scanner.nextFloat();
            System.out.println("Enter the receiver bank name: ");
            String receiverBankName = scanner.nextLine();
            MyBank bankTransfer = new MyBank(receiverBankName);
            bankA.transfer(senderAccount, receiverAccount, amount, pinCode, bankTransfer);
            System.out.printf("You've have successfully transferred %,.2f from your account %n", amount);
            mainMenu();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            openAnAccount();
        }
    }
}
