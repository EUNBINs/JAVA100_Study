// ���� �޼��忡�� ���� 100�� Call by reference ������� �޼��� ȣ���ϴ� �ڵ带 �����Ͻÿ�.
// �� ������ �ռ� �ٷ�� ������ Call by value ����� Call by reference ������� �����ؼ� ������� �ǹ̴�.
// a ���� ���� ����� �������� �ڵ带 �����غ��ÿ�.
// ��, Ŭ������ Wrapper, ��ü ������ ���� ������ �ʿ��ϹǷ� ���� ���θ� �ϰ� ���� ���� �����ϴµ� ������ �ȴ�.

package function;

public class Method_MethodCall2 {
	
	public static void sum(Integer a ) {

		System.out.println (a);								// �ּҰ��� �ƴ϶� ���� ������	
	}
	
	public static void main(String[] args) {
		
		// [1] ���� ���� �� �޼��� ȣ��
		// Wrapper Ŭ������ Integer Ŭ���� Ÿ������ ���� a�� �����ϰ�, new�� ��ü�� �����Ͽ� �ش� �ּҰ��� �޼���� ������
		Integer a = new Integer(100);
		sum(a);
		
		// [2] ���
		System.out.println(a);	// �ּҰ� ���
	}

}
