package function;

class TestNumber {
	int num;
	TestNumber(int num) {this.num = num;}							// main()���� ���� num�� 100�� ����
}
public class Method_MethodCall3 {
	public static void sum(TestNumber a) {							// main()���κ��� a �� ���� �ּڰ��� ���޹���
		System.out.println("sum()�޼��� �ȿ����� a �� -->" + a);		// a ��(TestNumber �ּ�) ���
		System.out.println(a.num);										// 100	
		a.num = a.num + 400;												
		System.out.println(a.num);										// 500
	}
	
	public static void main(String[] args) {
		
		// [1] :��ü ���� ����
		TestNumber a = new TestNumber(100);						// a ���� �ּڰ��� ����
		sum(a);
		
		System.out.println("-----------------------------");		// 100						
		System.out.println(a.num);										// 500						
	
	}
}
