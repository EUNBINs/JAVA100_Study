package oop;

public class oop_Exam002 {
	public static void main(String[] args) {
		
		// [1] ��ü ����
		FarmMachine fm = new FarmMachine();
		
		// [2] ������ ��ü �Ӽ� �� �Է��ϱ�
		fm.price = 1000000;
		fm.year = 2020;
		fm.color = "Red";
		
		// [3] �Ӽ� �� ����ϱ�
		//String fm_price = String.format("%,d", 1000000);
		System.out.println(String.format("%,d", fm.price));
		System.out.println(fm.year);
		System.out.println(fm.color);
		
		// [4] ���� �����ϱ�
		fm.move();
		fm.dig();
		fm.grind();
		
	}
}
