// 2���� ������ ���� �����ϴ� �޼��带 �����Ͻÿ�.
// �� ������ �ΰ��� ���� ���� ��ȯ�ϴ� �޼��� �ۼ����� �ƴ����� ���ؼ� ���� �����̴�.
// �Ʒ��� �ڵ忡�� 2���� ���� ���� �޴� �ڵ�� (1)�� (2)�� ��� ���ΰ�?

package function;

import java.util.Arrays;

public class Method_TwoReturn1 {
	
	public static int[] testMethod() {
		int num1 = 100;
		int num2 = 200;
		
		return new int[] {num1, num2};
		
	}
	public static void main(String[] args) {
		
		// [1] ���� ����
		int result[] = testMethod();
		
		// [2] ���
		System.out.println(result);									// �ּڰ� ���
		System.out.println(result[0] + " - " + result[1]);		// ���� ���
		System.out.println(result[0] + result[1]);					// ���� ���
		System.out.println(Arrays.toString(result));				// �ѹ��� ��� ��� ���
	}
}
