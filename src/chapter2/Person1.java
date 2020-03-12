package chapter2;

public class Person1 {
	String name;
	String number;
	
	Person1(String name, String number){
		this.name = name;
		this.number = number;
	}
	
	Person1(){
		
	}
	
	public String toString() {
		String result = "name : " + name + "\n" +
						"number : " + number + "\n";
		
		return result;
	}
}
