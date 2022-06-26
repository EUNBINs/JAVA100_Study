// ���� �Լ��� �̿��Ͽ� �л����� ������ 1����� ���� ���� ������� ����غ��ÿ�.
// ����� �޼��带 ����ϸ� ���� ���� �˰����� ������ �ʾƵ� �ȴ�.
// �̶�, ������������ �����Ѵ�.
// �� ������ ���� ���� �˰����� �������� �ʰ� ����� ���� �޼��带 ����ؼ� �����غ��� �����̴�.

package algorithm;

import java.util.Arrays;
import java.util.Collections;

public class sortAlgorithmWithMethod2 {
	public static void main(String[] args) {
		
		
		// [1] : �迭 ���� --> ���� �迭
		// �̶�, ���������̰ų� �Ǵ� ���ϴ´�� ������ ������ �����ؼ� �ϰ��� �� �� --> �⺻���� �迭���� ������ �ȵȴ�
		// ����, ���� Ŭ������ ���� �����ؾ� �Ѵ�
		Integer[] scores = {88, 55, 33, 100, 90, 99, 77, 66};
		
		// [2] ���� �迭 --> �������� ���� --> Arrays.sort(); --> import �ʿ� --> �߰� �ɼ� ������ �ʿ� --> (�迭��, �÷��� reverseOrder)
		// Collections Ŭ������ reverseOrder() �޼��� ��� --> import �ʿ�
		System.out.print("ȭ���(����) ���� ��=");
		for (int i=0; i < scores.length; i++)
			System.out.print(scores[i] + " "); System.out.println();
			
		//�������� ����
		Arrays.sort(scores, Collections.reverseOrder());
		
		System.out.print("ȭ���(����) ���� ��=");
		for (int i=0; i < scores.length; i++)
			System.out.print(scores[i] + " "); System.out.println();
			
		// [3] : ���� for�� ���
			
		System.out.print("ȭ���(����) ���� ��=");
		for(int i : scores)
			System.out.print( i + " "); System.out.println();
	}

}
