import java.util.Scanner;

public class AtmMAchineApp{

	private String firstName;
	private String lastName;
	private int usersPin;
	private double balance;

	
public void setFirstName(String firstName){

	this. firstName = firstName;

}


public String getFirstName(){

	return firstName;

}


public void setLastName(String lastName){

	this.lastName = lastName;


}


public String getLastName(){

	return lastName;

}

public void setUsersPin(int pin){

	this. usersPin = pin;

}


public int getUsersPin(){

	return usersPin;

}

public void setUserBalance(double balance){

	this. balance = balance;

}

public double getUserBalance(){

	return balance;

}

public void usersDeposit(double amount){

	if(amount > 0.0) balance += amount;

	else System.out.println("Invalid Amount");

}


public void usersWithdrawal(double amount){

	if(amount < balance) balance -= amount;

	else System.out.println("Insufficient Funds");

}
	
}