/**
   Name: Iris Buschelman
   Class: CS111C
   Assignment: Lab A ItemPair
   Date: 8/24/2014
   Generic class that contains a pair of items of type T
*/
public class ItemPair<T> {
    T one;
    T two;
    /**
       @param a The first item in the Item Pair
       @param b The second item in the Item Pair
       Constructor initializes the variables one and two with a and b
    */
    ItemPair(T a, T b) {
	one = a;
	two = b;
    }
    /**
       @return returns the value of the first item (one)
    */
    public T getItem1() {
	return  one;
    }
    /**
       @return returns the value of the second item (two)
    */
    public T getItem2() {
	return two;
    }
    /**
       Sets the first value of the ItemPair to new value a
       @param a the new value for one
    */
    public void setItem1(T a){
	one = a;
    }
    /**
       Sets the second value of the ItemPair to new value b
       @param b the new value for two
    */
    public void setItem2(T a) {
	two = a;
    }
    /**
       @return A String containing the values of one and two
    */
    public String toString() {
	String output = one + ", " + two;
	return output;
    }
    /**
       Checks to see if the first value in the ItemPair is the same as the second
       @return boolean true if values are the same, false otherwise
    */
    public boolean sameItems() {
	if(one.equals(two))
	    return true;
	else
	    return false;
    }
    /**
       Checks if the first value is equal to other ItemPair's first and if the
       second value is equal to the other ItemPair's second
       Overrides the .equals() method of the Object class
       @param other The ItemPair to be checked with
       @return boolean true if values of each objects one and two are equal
    */
    public boolean equals (ItemPair other){
	return this.getItem1().equals(other.getItem1()) && 
	    this.getItem2().equals(other.getItem2());
    }
}