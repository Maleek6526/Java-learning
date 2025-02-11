package LittleHereAndThere;

import java.util.Scanner;

import static java.lang.System.in;

public class RegexTutorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        //TODO Character classes groups bunch of related entities
        // - \d -> matches only digits character
        // \D -> matches non digit character
        // -\s-> matches white space characters
        // \S -> mathes non white space characters
        // -\w -> matches any word character
        // \W -> matches non word character
        // - [0-9], [A-Z], [a-z], [A-z]
        //TODO Quantifiers
        // -* -> matches zero or more occurrences of a character
        // + -> matches one or more occurrences of a character
        // . ->  matches any character
        // ? -> matches zero or one occurrence of a character
        // {n} -> matches exactly n occurrence of a character
        // {n,m} -> matches at least n and at most m occurrences of a character
        // {n,} -> matches n or more occurrences of a character
        //TODO Capture groups

//        String text = "Today is wednesday";
//        String pattern = "(\\w|\\s)+";
//        boolean result = text.matches(pattern);
//        System.out.println(result);
//
//        String phoneNumber = "07025284621";
//        String check = "\\d{11}";
//        System.out.println(phoneNumber.matches(check));
//        System.out.println("Enter you number: ");
//        String phoneNumber = scanner.next();
//        String regexSymbol = "(\\d|\\*)+";
//        if (phoneNumber.length() != 11){
//            throw new IllegalArgumentException("Error");
//        }
//        else if(phoneNumber.startsWith("+2347")){
//            System.out.println(phoneNumber.matches(regexSymbol));
//        }
//
//        else if(phoneNumber.startsWith("+2348")){
//            System.out.println(phoneNumber.matches(regexSymbol));
//        }
//
//        else if(phoneNumber.startsWith("+2349")){
//            System.out.println(phoneNumber.matches(regexSymbol));
//        }
//
//        else if(phoneNumber.startsWith("070")){
//            System.out.println(phoneNumber.matches(regexSymbol));
//        }
//
//        else if(phoneNumber.startsWith("081")){
//            System.out.println(phoneNumber.matches(regexSymbol));
//        }
//        else if(phoneNumber.startsWith("090")){
//            System.out.println(phoneNumber.matches(regexSymbol));
//        }
//        else if(phoneNumber.startsWith("091")){
//            System.out.println(phoneNumber.matches(regexSymbol));
//        }
//        else {
//            System.out.println("nonsense");
//        }

        System.out.println(getFirstStringNumber("+2347025284621"));

    }

    public static boolean getPhoneNumber(String number){
        return number.matches("0?\\w{0}\\d[7-9(0|1)]\\w{0}\\d{8}\\w{0}");
    }

    public static boolean getFirstStringNumber(String number){
        return number.matches("\\w{0}^[+]\\w{0}(234)\\w{0}\\d(0|1)\\w{0}\\d{8}\\w{0}");
    }
}
