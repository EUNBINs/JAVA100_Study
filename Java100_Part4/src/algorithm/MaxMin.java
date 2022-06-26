// �������� ���� 10���� ���� ���� �迭�� ����� �ִ񰪰� �ּڰ��� ���� ����غ��ÿ�.
// �̶�, 1�� �ڸ� ������ 0~9 ���̷� �Ѵ�.
// �� ������ ���� ���� ������ �ִ�, �ּڰ� �˰����� �� ���� ����� �� �ִ����� ���� �����̴�.

package algorithm;

public class MaxMin {
	public static void main(String[] args) {
			
			// [1] : ���� �迭 ����
			int[] ar = new int[10];
		
			// [2] : �ݺ����� ���鼭 �������� 10�� �������� ���� --> Math.random()
			for(int i=0; i<ar.length; i++) {
				ar[i] =(int) (Math.random()*10);
				System.out.print(ar[i] + "\t\t");
				//System.out.println((int)Math.random()*10));
			}
			System.out.println();
			
			// [3] : �ִ�, �ּڰ� ���� �ʱ�ȭ
			int max = ar[0], min = ar[0];
			
			// [4] : �ݺ����� ���鼭 �ִ�, �ּڰ� ��
			for(int i=0; i<ar.length; i++) {
				
				// �ִ� ��
				if(max < ar[i]) max = ar[i];
				// �ּڰ� �豳
				if(min > ar[i]) min = ar[i];

				}
				
			// [5] : ���
			System.out.println("------------------");
			System.out.println("ar �迭�� �ִ� :" + max);
			System.out.println("ar �迭�� �ּڰ� :" + min);
			System.out.println("------------------");
	}
}
