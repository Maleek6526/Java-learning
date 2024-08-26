import java.util.Scanner;
public class Discount{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("Enter your age range: ");
	int ageRange = input.nextInt();

	if(ageRange < 0) {
	System.out.println("Invalid Age!");
	}

	if (ageRange > 200) {
	System.out.println("Invalid Age!");
	
	if(ageRange < 16) {
	System.out.println("You are eligible for the 10% reduction: ");}

	else if(ageRange > 39) {
	System.out.println("You are eligible for the 10% reduction");}


}
	
	
	else {System.out.println("You are not eligible for the 10% reduction ");


	
}
	


}}