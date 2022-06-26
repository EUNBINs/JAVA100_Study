package oop;

class FarmMachine {
	
	// [1] : �Ӽ�(Ư¡)
	int price;			//����
	int year;				//����
	String color;		//����
	
	// [2] : ����/���/�ൿ (method) 
	void move() {
		System.out.println("Farm-machine is moving");
	}
	
	void dig() {
		System.out.println("Farm-machine is digging");
	}
	void grind() {
		System.out.println("Farm-machine is grinding");
	}
}
public class oop_Exam001 {
	public static void main(String[] args) {
		
		// [1] ��ü ����
		FarmMachine fm = new FarmMachine();										//fm = FarmMachine �� �ּڰ�
		System.out.println(fm);
		
		// [2] ������ ��ü�� �Ӽ� �� �Է��ϱ�
		fm.price = 1000000;
		fm.year = 2020;
		fm.color = "red";
		
		// [3] �Ӽ� �� ����ϱ�
		String fm_price = String.format("%,d", 1000000);
		System.out.println(fm.price);														// �ٷ� String.format("%,d", fm.price) ��ȯ�� ����
		System.out.println(fm.year);
		System.out.println(fm.color);
		
		// [4] ���� �����ϱ�
		fm.move();
		fm.dig();
		fm.grind();
	}
}


// [1] Ŭ������ �� ��������?
// Ŭ���� ���̵� ��ü�� Ư¡(�Ӽ�)���� ������ ������ �� ���� ���̰�, ������ �Լ��� ������ �� ���� ���̴�
// �׷��� ���α׷��� �Ը� Ŀ���� ���� ����� �����ϴ� �������� �� �� ü�����̰� �о�ȭ�� �ý������� �����ϰ� Ȯ���س��� �ʿ伺�� �ִ�
// �׷� �Ϸ��� �������� OOP(��ü ���� ���α׷���)�� ��������� �����ؿԴ�.
// ���� ��� ���α׷��� ���� OOP ������ �����ϰ� �ְ� �ϳ��� ���� OOP ������ �����ϸ� �ٸ� ������ ���� �����ϴ�

// [2] Ŭ���� �����
// ��ü�� Ư¡ --> �Ӽ�(attribute)
// ��ü�� ���� --> �޼���(method)