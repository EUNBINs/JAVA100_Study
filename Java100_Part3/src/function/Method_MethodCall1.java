// �޼���� ���� ���޽� ���� 100�� ������ ���� �Ʒ� �ڵ��� ����� ���غ��ÿ�.
// �� ������ �ڹ��� �⺻�� Ÿ�԰� ������ Ÿ���� �پ��� �޼��� ȣ�� ��Ŀ� ���ؼ� �ƴ����� ���� �����̴�

package function;

public class Method_MethodCall1 {
	
	// [!] : Call by value --> ���� ���� ȣ�� --> ���� ���ؼ� (�޼��带) ȣ��
	public static void sum(int a) {
		a = a + 400;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		// [1] ���� ���� �� �޼��� ȣ��
		
		int a = 100;
		sum (a);
		
		// [2] ���
		System.out.println(a);
	}
}
