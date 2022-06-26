// ��ü ������ �ʱ갪�� ������ �޼��忡�� �����ϴ� Ŭ������ �����غ��ÿ�.
// �� ������ Ŭ������ �ν��Ͻ� ������ �����ڸ� ���ؼ� �ʱ�ȭ�ϴ� ���� �˰� �ִ��� ���� �����̴�

package oop;

class Person {
	
	// [1] �Ӽ� (Attribute)
	int age;
	String name;
	
	// [2] ������ (Constructor)
	Person() {}
	Person(int age, String name) {
		this.age = age;									// this = ������ ��ü �ڽ��� �ǹ�		// ���̽㿡���� thsi =self
		this.name = name;
	}
	// [3] �޼��� (Method)
	void printPerson() {
		System.out.println( "���� :" + age + ", �̸� : " + name );
	}
}
public class oop_Exam006 {

	public static void main(String[] args) {
		
		// [1] ��ü ����
		Person p1 = new Person(20, "ȫ�浿");
		System.out.println(p1);
		System.out.println(p1.age);
		System.out.println(p1.name);
		p1.printPerson();
		
		Person p2 = new Person(30, "�̼���");
		p2.printPerson();
	}

}
