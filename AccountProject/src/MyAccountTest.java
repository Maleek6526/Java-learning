package AnotherAccountHeadache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyAccountTest {
    @Test
    public void checkIfTheBankWorks(){
        MyBank bank = new MyBank("FIRST-BANK PLC");
        bank.createNewAccount("Adewale", "Maleek", "1234");
        bank.createNewAccount("Bola","Adewale", " 2212");
        assertEquals(bank.getCounter(), 2);
    }

    @Test
    public void checkIfThePincodeWorks(){
        MyBank bank = new MyBank("BANK-A");
        bank.createNewAccount("Adewale", "Maleek", "1234");
        bank.createNewAccount("Bola","Adewale", "2212");
        bank.deposit(1, 2000);
        bank.deposit(2, 4000);
        assertEquals(bank.getBalance(2, "2212"), 4000);
    }

    @Test
    public void checkIfTheTransferWorks(){
        MyBank bankA = new MyBank("BANK-A");
        bankA.createNewAccount("Adewale", "Maleek", "1234");
        bankA.createNewAccount("Bola","Adewale", "2212");
        bankA.deposit(1, 2000);
        bankA.deposit(2, 4000);
        bankA.transfer(1, 2, 1000, "1234", bankA);
        assertEquals(bankA.getBalance(2, "2212"), 5000);
    }

    @Test
    public void checkIfTheAccountNumberIncreases(){
        MyBank bank = new MyBank("BANK-A");
        bank.createNewAccount("Adewale", "Maleek", "1234");
        bank.createNewAccount("Bola","Adewale", "2212");
        assertEquals(bank.getAccountNumber(), 2);
    }

    @Test
    public void testThatBanksCanTransferToAnotherBank(){
        MyBank bankA = new MyBank("Zenith");
        MyBank bankB = new MyBank("Access");
        bankA.createNewAccount("Wale", "peju", "1234");
        bankB.createNewAccount("lola", "saka", "1212");
        bankA.deposit(1, 2000);
        bankB.deposit(1, 16000);
        bankA.interBankTransfer(1,1,1000,"FIRST-BANK PLC", "1234", bankB);
        assertEquals(bankA.getBalance(1, "1234"), 1000);
        assertEquals(bankB.getBalance(1, "1212"), 17000);
    }
}
