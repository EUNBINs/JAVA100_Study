package variable;

public class JAVA100_operator_ArithmeticOperators2 {
	public static void main(String[] args) {
		
		// [!] ������ ��� : ���������� �������� ��� �Ҽ������°� ���� �� �ִ�
		int a = 60, b = 8;
		int rst1;	double rst2, rst3, rst4;
		
		rst1 = a / b;
		System.out.println(rst1);					//7.5�� �ƴ϶� 7 ���
		System.out.println( (double)rst1);		//7.5�� �ƴ϶� 7.0 ���	, ���Ϲ޴� 
		
		rst2 = a / (double)b;
		System.out.println(rst2);					//7.5 ���
		
		rst3 = 100 / (double)3;
		System.out.println(rst3);	
		
		rst4 = 250 / 3.0;
		System.out.printf("�� ������ ����� %.1f�Դϴ�.%n", rst4);
		
		
	}
}
