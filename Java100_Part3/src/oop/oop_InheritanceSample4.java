package oop;

class Person4 {
	// Field
	private String name;									// �� Ŭ���� �������� ��� ���� private
	private int gender;
	private int age;
	private int height;
	private int weight;
	
	// Constructor
	Person4() {}
	Person4( String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// Method
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(int Height) {
		this.height = height;
	}
	public void setWeight(int Weight) {
		this.weight = weight;	
	}
	
	public void move() {
		System.out.println("�̵���..");
	}

}

class Villain4 extends Person4 {
	// Field
	private String unique_key;
	private int weapon;
	private double power;
	
	//Constructor
	Villain4 () {}
	Villain4 (String name, int age, int height, int weight, String unique_key, int weapon, double power) {
		super (name, age, height, weight);							// �θ�κ��� ���޹��� �ʵ�
		this.unique_key = unique_key;
		this.weapon = weapon;
		this.power = power;
	}
	//Method
	public String getUnique_key () {
		return unique_key;
	}
	public void setUnique_key(String unique_key) {
		this.unique_key = unique_key;
	}
	public int getWeapon() {
		return weapon;
	}
	public void setWeapon(int weapon) {
		this.weapon = weapon;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	
	// printPerson()
	public void printPerson4() {
		System.out.println("------------------------------");
		System.out.println("�Ǵ� �̸� :" + getName());
		System.out.println("�Ǵ� ���� :" + getAge());
		System.out.println("�Ǵ��� Ű :" + getHeight());
		System.out.println("�Ǵ� ü�� :" + getWeight());
		System.out.println("�Ǵ� �ѹ� :" + getUnique_key());
		System.out.println("�Ǵ� ���� :" + getWeaponName(getWeapon()));
		System.out.println("�Ǵ� �Ŀ� :" + getPower());
	}
	
	//getWeaponName();
	public String getWeaponName(int a) {
		String weapon;
		switch(a) {
		case 1:
			weapon="â";
			break;
		case 2:
			weapon="����";
			break;
		case 3:
			weapon="��";
			break;
		default:
			weapon="----";
			break;
		}
		return weapon;							// �Է¹��� ���� ���� ��ȯ������
	}
}

class Hero4 extends Person4 {}

public class oop_InheritanceSample4 {
	public static void main(String[] args) {
		
		// [1] : ��ü ����
		Person4 p1 = new Person4();
		p1.setName("ȫ�浿");
		System.out.println(p1.getName());
		
		// [2] : villian1 ��ü ����
		Villain4 v1 = new Villain4("����", 20, 180, 80, "202205111", 2, 99.5);
		v1.printPerson4();
		System.out.println(v1.getName()+" ");
		v1.move();
		
		// [3] : villian2 ��ü ����
		Villain4 v2 = new Villain4("������", 30, 210, 70, "202205112", 1, 120);
		v2.printPerson4();
		System.out.println(v2.getName()+" ");
		v2.move();
		
		// [4] : villian3 ��ü ����
		Villain4 v3 = new Villain4("ó��ͽ�", 80, 165, 40, "202205113", 3, 55);
		v3.printPerson4();
		System.out.println(v3.getName()+" ");
		v3.move();

	}
}
