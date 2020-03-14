package section4;

import java.util.Arrays;

public class MyArrayList<E> {
	// generic : 정해지지 않은, 포괄적인 || specific : 특정한, 정해진
	private static final int INIT_CAPACITY = 10;
	private E [] theData;
	private int size;
	private int capacity = INIT_CAPACITY;
	
	public MyArrayList() {	// new E [10]; >> new로 객체를 생성할 때 가상의 타입은 생성되지 않는다.
		theData = (E []) new Object [INIT_CAPACITY];	// 자세한 사항은 인터넷으로,,
		size = 0;
	}
	// capacity : 용량, 수용  || entry : 들어감,입장
	public void add(int index, E anEntry) {
		if(index < 0 || index > size)	// error or exception
			throw new ArrayIndexOutOfBoundsException(index);// 오류 발생시키기
		
		if(size >= capacity)
			reallocate();
		for(int i = size-1; i >= index; i--)
			theData[i+1] = theData[i];
		theData[index] = anEntry;	// E type value 대입
		size++;
	}
	// 사이즈 초과 시 실행
	private void reallocate() {
		capacity *= 2;
		theData = Arrays.copyOf(theData, capacity);
		
	}
	
	private void add(E anEntry) {	// 항상 마지막에 추가
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
	
	private E get(int index) {	// 데이터 추출
		if(index < 0 || index >= size)
			throw new ArrayIndexOutOfBoundsException(index);
		return theData[index];
	}
	
	private E set(int index, E newValue) {	// 원래 있던 값 리턴, 덮어쓰기.
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
