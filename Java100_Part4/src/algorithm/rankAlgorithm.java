// �л����� ������ 1�� ���� ������ �Űܼ� ����غ��ÿ�.
// �� ������ ����(Ranking) �˰��� ���ؼ� �˰� �ִ����� ���� �����̴�.

// �л����� ������ 1�� ���� ������ �Űܼ� ����غ��ÿ�.
// �� ������ ����(Ranking) �˰��� ���ؼ� �˰� �ִ����� ���� �����̴�.
// �̶�, ���� �迭�� ������ ������������ �����ؼ� ��½�Ű�� ���� ����� ǥ���Ͻÿ�.


package algorithm;

import java.util.Arrays;

public class rankAlgorithm {
	public static void printRanking(int[] scores, int[] ranking) {
		// �迭 ����
		int scores_len = scores.length;
		int ranking_len = ranking.length;
		//System.out.println(scores_len);
		
		System.out.println("��" + scores_len + "���� �л��� ������ �����?");
		for (int i = 0; i <scores_len; i++)
			System.out.print(scores[i] + "��-->" +  ranking[i] + "��    ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		// [1] : �迭 ���� --> ���� �迭, ��ŷ �迭 2����
		int[] scores = {88, 50, 38, 100, 90, 100, 99, 75};
		int s_len = scores.length;
		int[] ranking = new int[s_len];
		
		// [1.5] : ������������ �迭 ���� --> Arrays.sort(�迭��); --> import �ʿ�
		Arrays.sort(scores);
		
		// [2] : �ݺ����� ���鼭 ��ŷ ó��
		for( int i = 0; i < s_len; i++) {
			
			// ��ŷ �ʱ�ȭ --> 0 --> �ϴ��� ���� 1������ �ʱ�ȭ
			ranking[i] = 1;
			
			// ��ø �ݺ���
			for (int j=0; j<s_len; j++)
				
				// System.out.println(scores[i] + "-" scores[j]); // �ٽ� ! --> ��ø �ݺ����� ���鼭 i,j��° ���� ���Ѵ�
				if ( scores[i] < scores[j])
					ranking[i]++;
		}
			// ���	--> ������ �޼��� ȣ��
			printRanking(scores, ranking);
	}	

}
