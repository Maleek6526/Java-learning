import java.util.Scanner;

public class BackToSenderLogisticsServices{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of your successful delivery: ");
		int successfulDeliveryCount = input.nextInt();
		
		double wages = successfulDelivery(successfulDeliveryCount);

		System.out.print("Your wages: "+ wages);

		input.close();

	}



public static double successfulDelivery(int successfulDelivery){
		
	double wages = 0;
	double basePay = 5000;
		
	if(successfulDelivery <= 50){

		double amountPerParcel = 160;
		wages = successfulDelivery * amountPerParcel + basePay;

		
	}
	
			

		else if(successfulDelivery > 50 && successfulDelivery <= 59){

			double amountPerParcel = 200;

			wages = successfulDelivery * amountPerParcel + basePay;

		

		}

	
		else if(successfulDelivery >= 60 && successfulDelivery <= 69){
				
			double amountPerParcel = 250;

			wages = successfulDelivery * amountPerParcel + basePay;

		

		}

			
		else if(successfulDelivery >= 70){

			double amountPerParcel = 500;

			wages = successfulDelivery * amountPerParcel + basePay;




		}
	
	
	return wages;

	}


}


