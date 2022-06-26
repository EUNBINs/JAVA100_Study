package oop;

public class oop_Parselnt {
	public static void main(String[] args) {
		
		// [1] ���ڳ����� ����
		int a = 1;
		int b = 2;
		int c = a + b;
		System.out.println("a + b = " + c );
		
		// [2] ���ڿ������� ����
		String a1 = "1";
		String b1 = "2";
		String c1 = a1 + b1;
		System.out.println("a1 + b1 = " + c1);
		System.out.println(c1.getClass().getName());
		
		// [3] ���ڿ� --> ���ڷ� ��ȯ �� ����
		int a2 = Integer.parseInt(a1);
		int b2 = Integer.parseInt(b1);
		System.out.println(a2 + b2);
		
		// [4] ���� ����
		System.out.println("-------------------------[��������]");
		System.out.println(Integer.parseInt("2022"));
		System.out.println(Integer.parseInt("2022",10));
		System.out.println(Integer.parseInt("1",2));
		System.out.println(Integer.parseInt("1001",2));
		System.out.println(Integer.parseInt("1004",8));
		System.out.println(Integer.parseInt("A",16));
		System.out.println(Integer.parseInt("F",16));
		System.out.println(Integer.parseInt("FF",16));
		System.out.println("-------------------------[��������]");
		
		// 10���� --> 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		// 16���� --> 0 1 2 3 4 5 6 7 8 9  A	 B 	 C  D   E  F
	}
}


// [!] ��ȯ�� �� �ʿ��Ѱ�?
// 1+2 ���ڳ����� ������ 3������, ���ڿ������� ������ 12�� �Ǳ� ������ ���ڷ� ��ȯ �� ������ �����ؾ� �Ѵ�.
// ���ڿ��� ���ڷ� ��ȯ��Ű�� ��� --> Integer.parseInt() ���.
// paraseInt() --> Integer Ŭ������ static ���� ���� --> ����, ��ü�� �������� �ٷ� "Ŭ������.parseInt()"�� ���� ��� ����
// �� ��° ���� ������ ������ ���� --> �ش� �������� �´� ���� �� --> Integer.parseInt(1000", 2);