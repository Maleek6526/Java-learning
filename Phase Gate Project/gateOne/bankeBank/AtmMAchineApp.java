import java.util.Scanner;

public class AtmMAchineApp{

	private String firstName;
	private String lastName;
	private String usersPin;
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

public void setUsersPin(String pin){

	this. usersPin = pin;

}


public String getUsersPin(){

	return usersPin;

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