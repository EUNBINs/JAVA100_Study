
package oop2;

class Person {
	
	//Field
	String name;
	int age;
	int weight;
	
	//Constructor
	Person() {}
	Person(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	//Method
	void wash() {
		System.out.println("�Ĵ�");}
	void study() {
		System.out.println("�����ϴ�");}
	void play() {
		System.out.println("���");}
}

interface Allowance {
	// Field
	// ������ �ȵǳ� ����� �ǹǷ� ����� �������ָ� �� --> public static final �� �ٿ��ָ� �ȴ�
	// �������̽� �� ��� ��� �ʵ�(����)�� public static final�̿��� �Ѵ�(���ܾ���) --> ���� ���� --> "Ÿ�� �����" �����ؼ� ���� �� [ex) int bbb]
	public static final String aaa = "�ڸ���";
	int bbb = 100;
	// Abstract Method
	// �������̽� �� ��� �޼���� public abstract�̾�� �� -->�׷��� ��������  [ex) void in ]
	abstract void in(int allowance, String name);
	void out(int allowance, String name);
}
interface Train {
	// Abstract Mehthod
	abstract void train (int training_pay, String name);
}

class Student extends Person implements Allowance, Train {
	// Field
	// Constructor
	Student() {}
	Student(String name, int age, int weight) {
		super (name, age, weight);
	}
	// Mehtod
	public void in(int price, String name) {
		System.out.printf("%s���Լ� %d���� �޾ҽ��ϴ�%n", name,price);}
	public void out(int price, String name) {
		System.out.printf("%d���� �����߽��ϴ�. [����뵵 : $s]%n", price, name);}
	public void train(int training_pay, String name) {
		System.out.printf("[%s--> %d�� �ԱݿϷ�]%n", name,training_pay);}
	
}
public class Interface3 {
	public static void main(String[] args) {
		
		// [1] : ��ü ����
		Student s1 = new Student("ȫ�浿", 23, 75);
		
		// [2] : Ŭ������ �������̽��κ��� ���(Person)�� ����(Allowance,Train)�� �� �޼���� ȣ��
		s1.wash();
		s1.study();
		s1.play();
		s1.in(10000, "����");
		s1.out(5000,"������");
		s1.train(50000,"�ƺ�");
		
		// [3] : ��� �ʵ� ����ϱ�
		System.out.println(s1.aaa);
		System.out.println(s1.bbb);
		System.out.println(Allowance.aaa);
		System.out.println(Allowance.bbb);
	}
}
