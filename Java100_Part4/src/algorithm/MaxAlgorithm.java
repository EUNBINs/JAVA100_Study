// ������ �̷���� �迭���� ���� ū ���� ���ϴ� �ִ� �˰����� �����غ��ÿ�.
// �� ������ �迭�� ���� ���鿡�� �ִ��� ���ϴ� �˰��� ���ؼ� �ƴ����� ���� �����̴�

package algorithm;

public class MaxAlgorithm {
	public static void main(String[] args) {
		
		// [1] : �迭 ����
		int[] ar = {4, -13, 150, 17, -2};
		
		// [2] max, min �Լ�
		System.out.println(Math.max(10,4));
		System.out.println(Math.min(10,4));
		
		// [3] : �ϴ� �迭 �� ù��° ������ ���� ���� ũ�ٰ� �����ϰ� �ʱ�ȭ
		//int min = Integer.MAX_VALUE;
		int min = ar[0];
		
		
		// [4] : �ݺ��� ���鼭 ���Ͽ� ��� --> �̶�, �񱳴� 2��°���� ���ϸ� �Ǵϱ� int i =1 �� ����
		System.out.println("���� �迭�� ���� ���� ���� : " + min );
		System.out.println();
		
		for (int i=1; i <ar.length; i++) {
			if ( min > ar[i] )
				min = ar [i];

		}
		System.out.println("���� �迭�� ���� ���� ���� : " + min );
	}

}
