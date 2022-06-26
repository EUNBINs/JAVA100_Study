package oop;

class Warrior {
	// Field (�Ӽ��� ��� ����)
	int gender;
	int power;
	// Constructor
	Warrior() {
		this.gender = 1;							// 1 : ����, 2 : ����
		this.power = 100;							// �⺻ �Ŀ� : 100
	}
	//Method
	void walk() {
		System.out.println("�ɾ�� �ֽ��ϴ�.");
	}
}
class Hero extends Warrior {
	// Field
	String name;
	int age;
	// Constructor
	Hero () {}
	Hero (String name, int age) {
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
class Villain {}

public class oop_InheritanceSample2 {
	public static void main(String[] args) {
		
		// [1] : ��ü ����
		Warrior p1 = new Warrior();

		// [2] : ����� ���� ���۸� ��ü ����
		Hero h1 = new Hero("���۸�", 20);
		System.out.println(h1.name);
		System.out.println(h1.age);
		System.out.println(h1.gender);								
		System.out.println(h1.power);								// �θ�Ŭ������ �ִ� �ʵ庯��
	}

}
