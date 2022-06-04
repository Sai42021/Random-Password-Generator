//First, we will create a password generator that asks the length of the password and generates a random password containing digits, alphabets, and special characters.

//Next, we will improve it by asking the number of each type of character, like the number of digits, alphabets, and special characters.

import java.util.Scanner;
import java.util.Random; //To create a random character 

public class RandomPasswordGenerator {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter 'A' for a random password without spcecial characters and 'B' for a password with special characters: ");
		String PasswordType = userInput.next();
		
		if(PasswordType.equalsIgnoreCase("A")) {
		System.out.println("Enter length of password: ");
		int ToBeRandomised = userInput.nextInt();
		
		String RandomAlphaNumbers = "a1b2c3d4e5f6g7h8i9j0k1l2m3n4o5p6q7r8s9t0u1v2w3x4y5z6";
	
		Random RandomChar = new Random();
		
		System.out.println("Random Password: ");
		for(int i = 0; i < ToBeRandomised; i++) {
			System.out.println(RandomAlphaNumbers.charAt(RandomChar.nextInt(ToBeRandomised)) + " ");
		}
      System.out.println("");
      
      System.out.println("Would you like to generate another random passwaord Y/N?");
      String BackToLand = userInput.next();
      String BackToLandUpper = BackToLand.toUpperCase();
      
      RandomPasswordGenerator Rec = new RandomPasswordGenerator();
      switch(BackToLandUpper) {
      case "Y":
    	  Rec.main(args);
    	  break;
      case "N":
      System.out.println("End Of Program :)");
        }
      } else if(PasswordType.equalsIgnoreCase("B")) {
    	  System.out.println("Enter number of digits: ");
    	  int NumOfInts = userInput.nextInt();
    	  String RandomDigits = "12345678910";
    		
    	  System.out.println("Number of alphabetical letters: ");
    	  int NumOfAlpha = userInput.nextInt();
    	  String RandomAlpha = "abcdefghijklmnopqrst";
    	  
    	  System.out.println("Number of special characters: ");
    	  int NumOfSpcChars = userInput.nextInt();
    	  String RandomSpecChar = "!@#$&*+";
    	  
    	  Random RandomNess = new Random();
    	  
    	  System.out.println("Random Password: ");
  		for(int i = 0; i < NumOfInts && i < NumOfAlpha && i < NumOfSpcChars; i++) {
  			System.out.println(RandomDigits.charAt(RandomNess.nextInt(NumOfInts)) + " ");
  			System.out.println(RandomAlpha.charAt(RandomNess.nextInt(NumOfAlpha)) + " ");
  			System.out.println(RandomSpecChar.charAt(RandomNess.nextInt(NumOfSpcChars)) + " ");
  		}
        System.out.println("");
    	  
        System.out.println("Would you like to generate another random passwaord Y/N?");
        String BackToLand = userInput.next();
        String BackToLandUpper = BackToLand.toUpperCase();
        
        RandomPasswordGenerator Rec = new RandomPasswordGenerator();
        switch(BackToLandUpper) {
        case "Y":
      	  Rec.main(args);
      	  break;
        case "N":
        System.out.println("End Of Program :)");
          }
      }
      
	}

}
