/**
   Tester for the ItemPair class
*/
public class ItemPairTester{
    /**
       Used to test the class for fuctionality
    */
    public static void main(String[] args) {
	String a = "hi";
	String b = "hi";
	int one = 1;
	int two = 1;
	int three = 2;
	ItemPair<String> testOne = new ItemPair<>(a, b);
	System.out.println("Test One (String): " + testOne.sameItems());
	ItemPair<Integer> testTwo = new ItemPair<>(one, two);
	System.out.println("Test Two (Integer): " + testTwo.sameItems());
	ItemPair<Integer> testThree = new ItemPair<>(one,two);
	System.out.println("Test Three (Same as Test Two): " + testThree);
	ItemPair<Integer> testFour = new ItemPair<>(one, three);
	System.out.println("Test Four (Integer): " + testFour);
	System.out.println("Test One equals Test Two? " + testOne.equals(testTwo));
	System.out.println("Test Two equals Test Three? " + testTwo.equals(testThree));
	System.out.println("Test Three equals Test Four? " + testThree.equals(testFour));		
	System.out.println("End of my tests, start of Prof's Tests\n");

	ItemPair<Integer> numberPair1 = new ItemPair<Integer>(3, 4);
	System.out.println("Should print a text representation:");
	System.out.println(numberPair1);
	System.out.println("Item 1 should be 3: " + numberPair1.getItem1());
	System.out.println("Item 2 should be 4: " + numberPair1.getItem2());
	System.out.println("Items are the same? Should be false: " + numberPair1.sameItems());
	numberPair1.setItem1(5);
	numberPair1.setItem2(5);
	System.out.println("Item 1 should be 5: " + numberPair1.getItem1());
	System.out.println("Item 2 should be 5: " + numberPair1.getItem2());
	System.out.println("Items are the same? Should be true: " + numberPair1.sameItems());
		
	/* 
	 * un-comment the line of code below- it should cause a compiler error 
	 * because numberPair1 should only accept Integers, not Strings
	 */
	//		numberPair1.setItem1("hello");
		
	ItemPair<String> wordPair = new ItemPair<String>("hello", "goodbye");
	System.out.println(wordPair);
	System.out.println("Item 1 should be hello: " + wordPair.getItem1());
	System.out.println("Item 2 should be goodbye: " + wordPair.getItem2());
	System.out.println("Items are the same? Should be false: " + wordPair.sameItems());
	wordPair.setItem2("hello");
	System.out.println("Items are the same? Should be true: " + wordPair.sameItems());

		
	/* 
	 * un-comment the line of code below- it should cause a compiler error 
	 * because wordPair should only accept Strings
	 */
	//		wordPair.setItem2(3);


	/* uncomment this section if completing the extra credit */
	/*
	  ItemPair<Integer> numberPair2 = new ItemPair<Integer>(5, 6);
	  System.out.println("Pairs the same? Should be false: " + numberPair1.equals(numberPair2));
	  numberPair2.setItem2(5);
	  System.out.println("Pairs the same? Should be true: " + numberPair1.equals(numberPair2));
	  System.out.println("Pairs the same? Should be false: " + numberPair1.equals(wordPair));
	*/

	
    }
}