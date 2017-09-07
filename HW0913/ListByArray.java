package HW0913;

public class ListByArray {

	private int list[];
	private int size;
	private int index;
	private int maxSize = 10;
	
	public ListByArray() {
		list = new int[maxSize];
	}
	
	public ListByArray(int size) {
		list = new int[size];
	}
	
	public void add(int value) {
		if(isFull())
			resize();
		list[index++] = value;
		size++;
	}
	
	private void resize() {
		int newList[] = new int[2*maxSize];
		for(int i=0;i<size;i++) {
			newList[i] = list[i];
		}
		maxSize *= 2;
		list = newList;
	}
	
	public void remove(int index) {
		if(isEmpty())
			throw new java.util.NoSuchElementException("remove(): List Empty");
		for(int i = index+1; i<size; i++) {
			list[i-1] = list[i];
		}
		size--;
	}
	
	public int getValue(int index) {
		if(isEmpty())
			throw new java.util.NoSuchElementException("getValue(): List Empty");
		return list[index++];
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == maxSize;
	}
}
