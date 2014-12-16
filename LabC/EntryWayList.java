/*
  Iris Buschelman
  CS111C
  Lab C: Implementation of EntryWayListInterface
  Due 9/18/2014
  NOTE TO SELF! COMMENT DIS SHIT!
*/

public class EntryWayList<T> implements EntryWayListInterface<T> {
    private Object[] list;
    private int length;

    public EntryWayList(){
	list = new Object[10];
	length = 0;
    }

    /**
     * Task: Places a new object at beginning of list
     * 
     * @param newEntry
     *            is a valid object
     * @return true if insert is successful; false otherwise
     */
    public boolean insertHead(T newEntry){
	if(isFull()){
	    try{
		makeBigger();
	    }catch(Throwable e){
		return false;
	    }
	}
	for(int i = length; i >= 0;i--){
	    list[i+1] = list[i];
	}
	list[0] = newEntry;
	length++;
	return  true;
    }
    /**
     * Task: Places a new object at the end of the list
     * 
     * @param newEntry
     *            is a valid object
     * @return true if insertion successful; false otherwise
     */
    public boolean insertTail(T newEntry){
	if(isFull()){
	    try{
		makeBigger();
	    }catch(Throwable e){
		return false;
	    }
	}
	list[length] = newEntry;
	length++;
	return true;
    }
    /**
     * Task: delete the object at the beginning of the list
     * 
     * @return the deleted object, or null if the list was empty
     */
    
    public T deleteHead(){
	if(length == 0){
	    return null;0
	}
	T retval = (T)list[0];
	for(int i = 1; i < length; i++){
	    list[i-1] = list[i];
	}
	list[length - 1] = null;
	length--;
	return retval;
    }
    /**
     * Task: delete the object at the end of the list
     * 
     * @return the deleted object, or null if the list was empty
     */
    public T deleteTail(){
	if(length == 0){
	    return null;
	}
	length--;
	T retval = (T)list[length];
	list[length] = null;
	return retval;
    }
    /**
     * Task: display the contents of the list on the console, 
     * in order, one per line
     */
    public void display(){
	for(int i = 0; i < length; i++){
	    System.out.println((T)list[i]);
	}
    }
    /**
     * Task: search the list for the given object and return its 
     * position in the list, or -1 if it's not found
     * 
     * @param anEntry
     *            is a valid object to find in the list
     * @return the found entry's position,  or -1 if it's not found
     */
    public int contains(T anEntry){
	for(int i = 0; i < length; i++){
	    if(list[i].equals(anEntry)){
		return i+1;
	    }
	}
	return -1;
    }
    /**
     * Task: check to see if list is empty
     * 
     * @return true if list is empty, false if list contains one or more
     *         objects.
     */
    public boolean isEmpty(){
	return length == 0;
    }
    /**
     * Task: check if list is full
     * 
     * @return true if list is full, false if list has space for more objects
     */
    public boolean isFull(){
	if(length == list.length){
	    return true;
	}else{
	    return false;
	}
    }
	
    /**
     * Private
     * Task: Enlarge internal array
     * Adds 10 empty slots to list when called
     */
    
    private void makeBigger(){
	Object[] temp = list;
	list = new Object[list.length + 10];
	for(int i = 0; i < temp.length; i++){
	    list[i] = temp[i];
	}
	temp = null;
    }
}