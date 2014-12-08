/**
 * An interface for an ADT list. Entries in the list have positions that begin
 * with 1. Entries can only be accessed from the beginning and end of the list.
 * 
 * @author Jessica Masters
 */
public interface EntryWayListInterface<T> {
	/**
	 * Task: Places a new object at beginning of list
	 * 
	 * @param newEntry
	 *            is a valid object
	 * @return true if insert is successful; false otherwise
	 */
	boolean insertHead(T newEntry);

	/**
	 * Task: Places a new object at the end of the list
	 * 
	 * @param newEntry
	 *            is a valid object
	 * @return true if insertion successful; false otherwise
	 */
	boolean insertTail(T newEntry);

	/**
	 * Task: delete the object at the beginning of the list
	 * 
	 * @return the object that has been deleted, or null if the list was empty
	 */
	T deleteHead();

	/**
	 * Task: delete the object at the end of the list
	 * 
	 * @return the object that has been deleted, or null if the list was empty
	 */
	T deleteTail();

	/**
	 * Task: display the contents of the list on the console, in order, one per
	 * line
	 */
	void display();

	/**
	 * Task: search the list for the given object and return its position in the
	 * list, or -1 if it's not found
	 * 
	 * @param anEntry
	 *            is a valid object to find in the list
	 * @return the position of the entry that was found, or -1 if it's not found
	 */
	int contains(T anEntry);

	/**
	 * Task: check if list is full
	 * 
	 * @return true if list is full, false if list has space for more objects
	 */
	boolean isFull();
}
