

public class BSTSortedList<T extends Comparable<? super T>> implements SortedListInterface<T> {
	
	private BinarySearchTree<T> tree;
	
	public BSTSortedList() {
	}


	public boolean add(T newEntry) {
		return false;
	}

	public boolean remove(T anEntry) {
		return false;
	}

	public int getPosition(T anEntry) {
		return 0;
	}

	public T getEntry(int givenPosition) {
		return null;
	}

	public boolean contains(T anEntry) {
		return false;
	}

	public T remove(int givenPosition) {
		return null;
	}

	public void clear() {
		
	}

	public int getLength() {
		return 0;
	}

	public boolean isEmpty() {
		return false;
	}

	public boolean isFull() {
		return false;
	}

	public void display() {
		
	}

}
