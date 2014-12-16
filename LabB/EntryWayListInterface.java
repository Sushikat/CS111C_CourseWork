/*
 * A Generic ListInterface that is different from the provided list Interface
 * Name: Iris Buschelman
 * Course: CS111C
 * Due Date: 9/1/2014
 * Assignment: LabB -- Interfaces
 */

interface EntryWayListInterface<T>{
    /**
     * Task: Put a new entry at the front of the list
     *       adds newEntry to front of list
     *       moves all other entries down one index
     * @param newEntry the new Entry to be added to the front
     * @return true if successful add, false otherwise
     */
    boolean insertHead(T newEntry);
    /**
     * Task: Put a new entry at the end of the list
     *       adds newEntry to end of list
     * @param newEntry the new Entry to be added to the end
     * @return true if successful add, false otherwise
     */
    boolean insertTail(T newEntry);
    /**
     * Task: Delete the first item in a list
     *       moves all the other items up one index
     * @return reference to the deleted object
     */
    T deleteHead(); // (returns the object that has been deleted)
    /**
     * Task: Delete the last item in a list
     * @return reference to the deleted object
     */
    T deleteTail(); // (returns the object that has been deleted)
    /**
     * Task: Display all items in the list
     */
    void display();
    /**
     * Task: Check if the list contains an item
     * @param anEntry the entry to be found
     * @return the index of the entry if found or -1 if not
     */
    int contains(T anEntry); //(returns the position of the entry that was found)
    /**
     * Task: Check if the list contains 0 items
     * @return true if the list is empty, false otherwise
     */
    boolean isEmpty();
    /**
     * Task: Check if the list contains no empty items
     * @return true if the list is full, false otherwise
     */
    boolean isFull();
}
