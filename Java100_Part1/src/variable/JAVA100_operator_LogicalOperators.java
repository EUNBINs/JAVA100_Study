package variable;

public class JAVA100_operator_LogicalOperators {

	public static void main(String[] args) {
		
		// [!] �������� : &&,||(���� ������)			!(���� ������)
		// &&(and)    ||(or)		!(not)
		// ���迬���ڿ� ���������� ����ν� ������ ���� ��(true),����(false)���� �����Ƿ� ����� �޴� Ÿ���� boolean
		// A||B	:A,B ��� ���̿��� ��
		// A&&B	:A �Ǵ� B �� �ϳ��� ���̸� ��
		// !A		:A�� ���̸� false, �����̸� true
		
		int a =10, b=20, c=30;
		
		boolean rst1 = a < b	&& c >b;
		
		boolean rst2 = a < b || c < b;
		
		boolean rst3 = a > c || b != c;
		
		System.out.println(rst1);
		System.out.println(rst2);
		System.out.println(rst3);
		
		boolean rst4 = !rst3;					//true�� ����
		
		System.out.println(rst4);			//false
		System.out.println(!rst4);		
	}
}
