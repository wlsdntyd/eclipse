package section4;

import java.util.Arrays;

public class MyArrayList<E> {
	// generic : �������� ����, �������� || specific : Ư����, ������
	private static final int INIT_CAPACITY = 10;
	private E [] theData;
	private int size;
	private int capacity = INIT_CAPACITY;
	
	public MyArrayList() {	// new E [10]; >> new�� ��ü�� ������ �� ������ Ÿ���� �������� �ʴ´�.
		theData = (E []) new Object [INIT_CAPACITY];	// �ڼ��� ������ ���ͳ�����,,
		size = 0;
	}
	// capacity : �뷮, ����  || entry : ��,����
	public void add(int index, E anEntry) {
		if(index < 0 || index > size)	// error or exception
			throw new ArrayIndexOutOfBoundsException(index);// ���� �߻���Ű��
		
		if(size >= capacity)
			reallocate();
		for(int i = size-1; i >= index; i--)
			theData[i+1] = theData[i];
		theData[index] = anEntry;	// E type value ����
		size++;
	}
	// ������ �ʰ� �� ����
	private void reallocate() {
		capacity *= 2;
		theData = Arrays.copyOf(theData, capacity);
		
	}
	
	private void add(E anEntry) {	// �׻� �������� �߰�
		add(size, anEntry);
	}
	
	private int size() {
		return size;
	}
	
	private int indexOf(E anEntry) {
		for(int i=0; i<size; i++)
			if(theData[i].equals(anEntry))
				return i;
		return -1;
	}
	
	private E get(int index) {	// ������ ����
		if(index < 0 || index >= size)
			throw new ArrayIndexOutOfBoundsException(index);
		return theData[index];
	}
	
	private E set(int index, E newValue) {	// ���� �ִ� �� ����, �����.
		if(index < 0 || index >= size)
			throw new ArrayIndexOutOfBoundsException(index);
		E oldValue = theData[index];
		theData[index] = newValue;
		return oldValue;
	}
	
	private E remove(int index) {
		if(index < 0 || index >= size)
			throw new ArrayIndexOutOfBoundsException(index);
		E oldValue = theData[index];
		for(int i = index; i < size-1; i++)
			theData[i] = theData[i+1];
		size--;
		return oldValue;
	}
	
	public static void main(String[] args) {
		MyArrayList<String> mylist = new MyArrayList<>();
		mylist.add("jinwoo");
		mylist.add(1, "eunchong");
		mylist.add("123");
		mylist.add("456");
		mylist.add("789");
		System.out.println(mylist.size);
		System.out.println(mylist.get(2));
		System.out.println(mylist.indexOf("789"));
	}
}
