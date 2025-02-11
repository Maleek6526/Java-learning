package LittleHereAndThere;

import java.util.NoSuchElementException;
import java.util.Scanner;

import static java.lang.System.in;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        try{
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("you have entered "+ number);
        }
        catch (IllegalStateException | NoSuchElementException exception){
            System.out.println("Error:: "+exception.getMessage());
        }
    }
}
