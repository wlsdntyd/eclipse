package test;

public class Car{
    //�̾����� �������� ����� CarŬ�����Դϴ�.
    //�̸�, ž���ο�, ����, ������� �ʵ�� �����ϴ�.
    public String name;
    public int capacity;  
    public int price;
    public int age;
    
    //������ �ʵ带 �����ڿ��� �޾Ƽ� �ʱ�ȭ�մϴ�.
    public Car(String name, int capacity, int price, int age){
        this.name = name;
        this.capacity = capacity;
        this.price = price;
        this.age = age;
    }
    
    //Car ��ü�� ���ڿ��� ����ϸ� �̸��� ����մϴ�.
    public String toString(){
        return name;
    }
    
    public static void main(String args[])
    {
        Car car = new Car("new model", 4, 3000, 0);
    }
}