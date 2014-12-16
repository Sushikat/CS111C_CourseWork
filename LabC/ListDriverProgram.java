/*
  Iris Buschelman
  CS111C
  Lab C: EntryWayList Driver Program
  Due 9/18/2014
*/

 public class ListDriverProgram {
    public static void main(String[] args){
	System.out.println("Display an empty List");
	EntryWayList<Integer> mylist = new EntryWayList<>();
	mylist.display();
	
	System.out.println("\nAdd 5 items to the list, some at head"
			   + ", some at tail");
	System.out.println(mylist.insertHead(3));
	System.out.println(mylist.insertHead(2));
	System.out.println(mylist.insertHead(1));
	System.out.println(mylist.insertTail(4));
	System.out.println(mylist.insertTail(5));
	
	System.out.println("Display the List");
	mylist.display();
	
	System.out.println("\nRemove the first Entry");
	System.out.println(mylist.deleteHead());

	System.out.println("Remove the last Entry");
	System.out.println(mylist.deleteTail());

	System.out.println("Display the List");
	mylist.display();
	
	System.out.println("\nTest to see if elements are in the list"
			   + " (one that is and one that isn't)");
	System.out.println("Contains 1? " + mylist.contains(1));
	System.out.println("Contains 3? " + mylist.contains(3));

	System.out.println("\nRemove the last three elements"
			   + " in the list.");
	System.out.println(mylist.deleteHead());
	System.out.println(mylist.deleteTail());
	System.out.println(mylist.deleteHead());

	System.out.println("\nTry to remove an element from "
			   + "the empty list.");
	System.out.println(mylist.deleteHead());
	System.out.println(mylist.deleteTail());
    }
}