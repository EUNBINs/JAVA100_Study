// ��ȯ���� �ְ� �޴� ���ڰ��� �ִ� �빮�� ��� �޼��带 �����غ��ÿ�.
// �޼���� ( "korea" ) �Է½� �빮�ڷ� ��µǵ��� �����Ѵ�.
// �� ������ �ڹ��� �޼��� �ۼ����� ��ȯ��, ���ڰ��� ���� ���ذ� �ִ����� ���� �����̴�

package function;

public class Method_Exam004 {
	
	public static String capitalMethod(String str) {			// () �ȿ��� �޴� ���ڰ�
		//���ڿ� ���� ����
		String ret = str.toUpperCase();
		return ret;
		
	}
	public static void main(String[] args) {
		
		// [1] ��ȯ�� -- O		�޴� ���ڰ� -- O
		// ��ȯ���� �ִٴ� ���� �޼���(�Լ�) ȣ�⿡ ���� ���ϵǴ� ���� �ִٴ� ���̹Ƿ� ȣ��� ���ϰ��� �޴� ������ �����Ѵ�
		// ���ڿ� ���� ����
		
		String rst;
		rst = capitalMethod("korea");
		
		// [2] ���
		System.out.println("�Է��� �ҹ����� �빮�ڴ� = " + rst);
	}

}