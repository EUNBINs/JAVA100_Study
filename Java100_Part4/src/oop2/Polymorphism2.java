// �ڽ� Ŭ������ �����ϴ� ��ü�� �θ��� Ÿ������ �޾Ƽ� ��ü�� �����ϸ� �������� ��� �Ǵ��� ���غ��ÿ�.
// �� ������ �������� ���迡�� �θ�, �ڽ� Ŭ���� �ڿ��� ��� �� �� �ִ����� ���� �����̴�. 
// �ڽ� Ŭ������ �����ϴ� ��ü�� �θ��� Ÿ������ �޾Ƽ� ��ü�� �����ϸ� �������� ��� �Ǵ��� ���غ��ÿ�.2
// �� ������ �������� ���迡�� �θ�, �ڽ� Ŭ���� �ڿ��� ��� �� �� �ִ����� ���� �����̴�.
// Person s2 = new Student(); // �ڽ��� �޼��带 �ٷ� ȣ���ϰ� �ʹٸ�?
// Student s1 = new Student(); // �ڽ� Ŭ�������� �������̵��� �θ� Ŭ������ ���� �޼��带 ȣ���ϰ� �ʹٸ�?


// [!] �ٽ�
// �θ�Ŭ���� Person�� �ְ�, �̸� ��ӹ��� �ڽ�Ŭ���� Student�� �ִ�
// ����Ŭ������ �ν��Ͻ�(��ü)�� ���� ���� ����Ŭ������ �ν��Ͻ�(��ü)�ε� ���� �� �ֵ�
// �׷��� ���� Ŭ������ �ν��Ͻ�(��ü)�� ����Ŭ������ �ν��Ͻ�(��ü)�� ���� �� ����

package oop2;

class Person2 {
	String str1 = "�� �θ�Ŭ����";
	void method1() {
		System.out.println("���̿��̿���");
		}
	void ppp() {
		System.out.println("ppp");
		}
}
class Student2 extends Person2 {
	String str2 = "�� �ڽ�Ŭ����";
	void method1() {
		System.out.println("�������̵�-AAA");
	}
	void sss() {
		System.out.println("sss");
	}
	void x() {
		method1();
		super.method1();
	}
}

public class Polymorphism2 {
	public static void main(String[] args) {
		
		// [1] : ��ü ���� --> �θ�� �ڽ� Ŭ������ ��� �ڿ� ��� ����
		Student2 s1 = new Student2();
		System.out.println(s1.str1);
		System.out.println(s1.str2);
		s1.method1();
		s1.sss();
		s1.ppp();
		
		// [!] �ڽ� Ŭ�������� �������̵��� �θ� Ŭ������ ���� �޼��带 ȣ���ϰ� ������ --> super ���
		System.out.println("-----------------[super ���]");
		s1.x();
		System.out.println("-----------------[super ���]");
		
		
		// [2] : ��ü ���� --> Ÿ���� �θ� Ÿ������ ����	--> �θ��� �ڿ��� ��� ����
		Person2 s2 = new Student2();					// ����Ŭ������ ��ü�� �����Ͽ� Ÿ���� ����Ŭ���� Ÿ���� ����ϴ� �� = ������
		System.out.println(s2.str1);
		//System.out.println(s2.str2);						// ERROR �ڽ��ڿ��� ��� �Ұ���
		s2.ppp();
		//s2.sss();												// ERROR �ڽ��ڿ��� ��� �Ұ���
		s2.method1();											// �������̵��Ѱ��� �ڽ��� �޼���� ����
		
		// [!] �ڽ��� �޼��带 �ٷ� ȣ���ϰ� �ʹٸ�? --> ĳ��Ʈ �ʿ�
		System.out.println("------------------[ĳ��Ʈ ���]");
		((Student2)s2).sss();
		System.out.println("------------------[ĳ��Ʈ ���]");
		
		// [3] : ��ü ����
		Person2 aaa = new Person2();
		aaa.method1();
		//aaa.sss();											// ERROR �ڽ��ڿ��� ��� �Ұ���
		
		
		// [4] : ��ü ���� --> Ÿ���� �ڽ� Ÿ������ ����	==> ����Ŭ������ ��ü�� �����ϸ鼭 Ÿ���� �ڽ�Ŭ������ ���� ��� //Error
		// Student bbb = new Person();
	}
}

//������ ��ü ���� ����� Ʋ�� ����?
//-------------------------------------------------------------------------------------------------------------------------------------------
//class Person {}
//class Student extends Person {}
//[1] Student s1 = new Student();
//[2] Person s2 = new Student();
//[3] Person p1 = new Person(); 
//[4] Student s1 = new Person();