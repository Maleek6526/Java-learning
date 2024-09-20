public class XandOs{

	public static void main(String [] args){

	char[][] tiktactoe = {{'x', 'o', 'x'}, {'o', 'o', 'o'}, {'x', 'o', 'x'}};


	for(int count = 0; count < tiktactoe.length; count++){

		for(int counter = 0; counter < tiktactoe.length; counter++){

			System.out.print(tiktactoe[count] [counter] + "  " );

		}System.out.println();

	}
	
	}


} 