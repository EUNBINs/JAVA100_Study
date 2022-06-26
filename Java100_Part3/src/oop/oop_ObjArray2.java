package oop;
class Person6 {
	//Field
	String name;
	 int age;
	
	//Constructor
	Person6() {}
	Person6(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//Method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age; 
	}
	public void setAge(int age) {
		this.age = age;
	}
		
}

public class oop_ObjArray2 {
	public static void main(String[] args) {
		
		// [1] : ��ü ����
		Person6[] pa;													// Person6 Ÿ���� ��ü �迭���� pa����
		pa = new Person6[5];										// Person6 ��ü�� �������� ���ҷ� ������ �迭 ������ 5�� ���� -> 5�� ��ü�� �������״� �ּ� ������
		
		// [2] : �ݺ���(for)�� ���鼭 Person6() ��ü ����
		for (int i=0; i<pa.length; i++) {
			pa[i] = new Person6(i+"�� �ĺ���",i+20);			// i�� �Է��ϸ� �ȵǳ� ���ڿ��� ���̸� ���ڿ��� ����
			
		
			// [2-1] : getter, setter �޼��带 ����� ���
			// System.out.println(pa[i].getName()+ "�� ���̴�" + pa[i].age + "�� �Դϴ�.");		
			
			// [2-2] : �迭 �ε��� ����ؼ� ��� --> ��, �̷��� ������ private������ �����ϰ� ���
			//System.out.println(pa[i].name+"�� ���̴�" +pa[i].age + "�� �Դϴ�.");
			
			// [2-3] : printf()
			System.out.printf("%s�� �ĺ����� ���̴� %d�� �Դϴ�.%n", pa[i].name, pa[i].age);
		}
	}
}
