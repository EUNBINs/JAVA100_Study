// �⺻�� Ÿ���� ���� �ʱ�ȭ�� �Ʒ��� �ڵ忡�� Ʋ�� ���� ã�� �����Ͻÿ�.
// �� ������ �⺻�� Ÿ���� ���� �ʱ�ȭ�ϴ� ����� ���ؼ� �˰� �ִ����� ���� �����̴�

package variable;

public class DataType3 {
	public static void main(String[] args) {
		
		//[1] : �⺻�� Ÿ�� --> 8�� --> ���� ����� ���ÿ� ���� �Է�
		byte b = 100;
		short s = 30000;
		int i = 2100000000;
		long l = 7000000000L;		// Long�� ���ڳ��� L���̻� ���̱�
		float f = 9.8F;					// ���������� ���̻�F �ʿ�
		double d = 3.14;
		char c = 'A';
		boolean bl = false;			//�ҹ��ڷθ� ǥ�� false,true
		
		// [2] : ���
		System.out.println(b + "byte �ִ�-->" + Byte.MAX_VALUE);
		System.out.println(s + "short �ִ�-->" + Short.MAX_VALUE);
		System.out.println(i + "integer �ִ�-->" +Integer.MAX_VALUE);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bl);
		

	}

}
