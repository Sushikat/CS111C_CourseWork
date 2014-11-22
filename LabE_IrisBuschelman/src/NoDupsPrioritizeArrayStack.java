/**
 * Created by Iris on 11/17/2014.
 */
public class NoDupsPrioritizeArrayStack<T> implements NoDupsPrioritizeStackInterface<T>{
    private T[] stack;
    private int topIndex;
    private static final int DEFAULT_SIZE = 50;

    public NoDupsPrioritizeArrayStack(){
        NoDupsPrioritizeArrayStack(DEFAULT_SIZE);
    }

    public NoDupsPrioritizeArrayStack(int capacity){
        stack = (T[])new Object[capacity];
        topIndex = -1;
    }

    /** Task: Adds a new entry to the top of the stack if entry is not already in stack
     *  @param newEntry  an object to be added to the stack */
    public void push(T newEntry){

    }

    /** Task: Removes and returns the stack�s top entry.
     *  @return either the object at the top of the stack or, if the
     *          stack is empty before the operation, null */
    public T pop();

    /** Task: Retrieves the stack�s top entry.
     *  @return either the object at the top of the stack or null if
     *          the stack is empty */
    public T peek();

    /** Task: Detects whether the stack is empty.
     *  @return true if the stack is empty */
    public boolean isEmpty();

    /** Task: Removes all entries from the stack */
    public void clear();

    /*
     * Task: Moves the given entry to the top of the stack. If the entry is not
     * in the stack, just add it at the top.
     *
     * @param entry the item to move or add
     */
    public void moveToTop(T entry);

    /*
     * * Task: displays the contents of the stack (to be used for testing);
     * specifies the top and bottom of the stack
     */
    public void display();
}
