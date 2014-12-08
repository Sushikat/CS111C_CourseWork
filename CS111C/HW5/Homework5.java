import java.util.Scanner;
public class Homework5{
    public static void main(String args[]){
	printStringBackwards("n-word", -100);
    }
    public static void displayRowOfCharacters(char letter, int counter){
	if(counter > 0){
	    System.out.print(letter);
	    counter--;
	    displayRowOfCharacters(letter, counter);
	}else{
	System.out.println();
	}
    }
    public static int askForNumber(){
	int userInput;
	Scanner k = new Scanner(System.in);
	System.out.print("Pick an integer between 1 and 10: ");
	userInput = k.nextInt();
	if(userInput > 10 || userInput < 1){
	    System.out.println();
	    askForNumber();
	}else{
	    System.out.println("Your number is " + userInput);
	    return userInput;
	}
    }
    public static void printStringBackwards(String input, int counter){
	if(counter == -100){
	    counter = (input.length()-1);
	}
	if(counter >= 0){
	    System.out.print(input.charAt(counter));
	    counter--;
	    printStringBackwards(input, counter);
	}else{
	    System.out.println();
	}
    }
    public static void isPalindrome(String word){
	
}
