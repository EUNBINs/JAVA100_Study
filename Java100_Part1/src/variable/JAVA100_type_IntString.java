package variable;

public class JAVA100_type_IntString {

	public static void main(String[] args) {
		
		//[1] : ���� ����
		int a = 12345;
		String str = "12345";
		System.out.println(str.length()); 			// srt �ڸ���
		//System.out.println(int.length()); 			// ���� : int�� ���ڿ��� �ƴϱ⶧����
		
		
		// [2] : ���� --> ���ڿ��� ��ȯ -->�ڸ��� ���ϱ�		
		String stra = String.valueOf(a);
		System.out.println(stra.length());
		
		// [3] : ���ڿ� + ������ = ?
		System.out.println( 12345 + 1);				//12346
		System.out.println( str+1);					//���ڿ� + ������ = �ռ�(�շ�)
		
		// [4] : ���ڿ� -> ������ ��ȯ
		int b = Integer.valueOf(str);
		System.out.println(b + 1); 
	}
}
