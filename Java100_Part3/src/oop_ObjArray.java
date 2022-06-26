class Person5 {
	//Field
	String name;
	private int age;
	
	//Constructor
	Person5() {}
	Person5(String name, int age) {
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

public class oop_ObjArray {
	public static void main(String[] args) {
		
		// [1] : ��ü ����
		int[] ar1 = {1, 2, 3, 4, 5};
		char[] ar2 = {'A', 'B', 'C', 'D', 'E'};
		Person5[] ar3 = new Person5 [5];
		// Person Ÿ��(5���� �迭�� ������ �ִ�)�� ��ü�� �����ߴٴ� ����
		ar3[0] = new Person5 ("ȫ�浿", 20);
		ar3[1] = new Person5 ("�̼���", 30);
		ar3[2] = new Person5 ("�������", 40);
		ar3[3] = new Person5 ("��������", 50);
		ar3[4] = new Person5 ("�����", 60);
		
		// [2] : ���
		for(int i=0; i<ar2.length; i++) {
			System.out.print(ar3[i].name + "\t\t");					//class�� private String name �̶�� �Ǿ��ִٸ� getName���� ȣ��
			System.out.print(ar3[i].getAge()+ "\t\t");
		}
		System.out.println();
	}
}
