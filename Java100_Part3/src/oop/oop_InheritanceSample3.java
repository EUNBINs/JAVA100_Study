package oop;

class Warrior1 {
	// Field (�Ӽ��� ��� ����)
	int gender;
	int power;
	// Constructor
	Warrior1() {
		this.gender = 1;							// 1 : ����, 2 : ����
		this.power = 100;							// �⺻ �Ŀ� : 100
	}
	//Method
	void walk() {
		System.out.println("�ɾ�� �ֽ��ϴ�.");
	}
}
class Hero1 extends Warrior1 {		
	// Field
	String name;
	int age;
	// Constructor
	Hero1 () {}
	Hero1 (String name, int age) {
		super();										// �θ�Ŭ������ ������ ȣ�� (gender�� power �������ִٴ� �ǹ̷� ����ȴ�)
		this.name = name;
		this.age = age;
	}
	// Mehtod
	void walk() {
		System.out.println("2��� ���� �ɾ�� �־��.");			// "�ɾ�� �ֽ��ϴ�"�� ��ӹ޾����� ���� �������Ͽ� ���
	}
	void eat() {
		System.out.println("��԰� �־��.");
	}
	void displayPerson() {
		System.out.println("�̸�:" + name + "����:" + age + "����:" + gender + "�Ŀ�:" + power);
	}
}
class Villain1 {}

public class oop_InheritanceSample3 {
	public static void main(String[] args) {
		
		// [1] : ��ü ����
		Warrior1 p1 = new Warrior1();

		// [2] : ����� ���� ���۸� ��ü ����
		Hero1 h1 = new Hero1("���۸�", 20);
		System.out.println(h1.name);
		System.out.println(h1.age);
		System.out.println(h1.gender);								
		System.out.println(h1.power);								// �θ�Ŭ������ �ִ� �ʵ庯��
		h1.walk();
		h1.eat();
		h1.displayPerson();
		
		// [3] : ������� ��ü ����
		Hero1 h2 = new Hero1("�������", 30);
		h2.displayPerson();
		h2.gender = 2;
		h2.power = 300;
		h2.displayPerson();
		h2.walk();
	}

}
