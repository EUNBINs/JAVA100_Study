// System.out.print(), println(), printf() � ���ؼ� ������ ���� �����غ��ÿ�.
// �̶� 10���� 10�� ���ؼ� 8����, 16������ ���� ����غ��ÿ�.
// �� ������ ��½� ���� ���Ǵ� print(), println(), printf() ���Ŀ� ���ؼ� �˰� �ִ����� ���� �����̴�.


package variable;

public class Systemout_println {
	public static void main(String[] args) {
		
		byte b = 20;
		short s = 21;
		int i = 22;
		float f = 9.8F;
		double d =3.14;
		char c = 'A';
		boolean bl = false;
		
		// [2] : print(), println()
		System.out.println("�ȳ��ϼ���");
		System.out.println();
		System.out.print("���� ȫ�浿�̾�");
		
		// [3] : printf() ��� -> �����ڸ� ���
		// %d (����), %f (�Ҽ��� ����) , %c (����), %s (���ڿ�) , %b (�ο�), %n (�ٹٲ�)
		// ������ byte, short, int, long
		// %(�Ҽ��� �ڸ���).f
		// %e (����), %o (8����), %x (16����)
		
		System.out.printf("���� %d���� ���־�. %d, %d %n",b,s,i);
		System.out.printf("�Ҽ��� ����->%.2f, %f %n ��������->%c, %b ", f,d,c,bl);
		
		byte h = 10;
		
		System.out.printf("10���� 10�� 8�����δ� %o, 16�����δ� %x�̴�.", h,h);
		
		//16������ 0-9, 10���ʹ� a 11�� b ...
	}

}
