// ������ ������ ���������� ��(Type) ��ȯ���Ѽ� ����ϸ� � ����� �������� ���غ��ÿ�.
// �Ʒ� �ڵ��� ����� �����Ͽ� ���غ��ÿ�.
// �� ������ �������� �������� Ÿ�� ��ȯ�� �Ͼ�� ��ȭ�� ���ؼ� �˰� �ִ����� ���� �����̴�

package variable;

public class DataType4 {

	public static void main(String[] args) {
		
		// [1]
		short a = 'A'; 
		System.out.println( a );				// A=65, B=66, C=67 ... Z=90
		// [2]
		short b = 90;
		System.out.println( (char)b );
		// [3]
		char c = 'a';
		System.out.println( (short)c );		// a=97, v
	}
}
