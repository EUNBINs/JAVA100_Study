// ���� �Լ��� �̿��Ͽ� �л����� ������ ������� 1�� ���� ������� ����غ��ÿ�.
// ����� �޼��带 ����ϸ� ���� ���� �˰����� ������ �ʾƵ� �ȴ�.
// �̶�, ������������ �����Ѵ�.
// �� ������ ���� ���� �˰����� �������� �ʰ� ����� ���� �޼��带 ����ؼ� �����غ��� �����̴�

package algorithm;

import java.util.Arrays;

public class sortAlgorithmWithMethod {
	public static void main(String[] args) {
		
		// [1] : �迭 ���� --> ���� �迭
		int[] scores = {88, 55, 39, 100, 90, 100, 98, 67};
		
		// [2] : ���� �迭 --> �������� ���� --> Arrays.sort(�迭��); --> ���������� �⺻���� --> import �ʿ�
		// Ŭ���� �޼���ν� Arrays Ŭ������ �ν��Ͻ� �������� �ٷ� ��� ����
		System.out.println("ȭ���(����) ���� ��=");
		for (int i=0; i<scores.length; i++)
			System.out.print(scores[i] + " "); System.out.println();
			
		Arrays.sort(scores);
		
		System.out.println("ȭ���(����) ���� ��=");
		
		for(int i =0; i < scores.length; i++)
			System.out.print(scores[i]+ " " );System.out.println();
			
		// [3] : ���� for�� ���
		System.out.println("ȭ���(����) ���� ��=");
		for (int i : scores)
			//System.out.println(scores[i]);				// (scores[i]) �� ERROR
			System.out.print( i + " "); System.out.println();
		
		
		
		
	}
}
