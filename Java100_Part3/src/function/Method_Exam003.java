// ��ȯ���� �ְ� �޴� ���ڰ��� ���� �޼��带 �����غ��ÿ�.
// �� ������ �ڹ��� �޼��� �ۼ����� ��ȯ��, ���ڰ��� ���� ���ذ� �ִ����� ���� �����̴�


package function;

public class Method_Exam003 {
	
	public static int returnMethod() {
		int ret = 100;
		ret *= 100;
		return ret;											//	10000
	}
	public static void main(String[] args) {
		
		// [1] ��ȯ�� O		�޴� ���ڰ� X
		// ��ȯ���� �ִٴ� ���� �޼���(�Լ�) ȣ�⿡ ���� ���ϰ��� �ִ� ���̹Ƿ� ȣ��� ���ϰ��� �޴� ������ �����Ѵ�
		
		int rst;
		rst = returnMethod();
		
		// [2] ���
		System.out.println("�޼��� ȣ�⿡ ���� ���ϰ��� = " + rst);
	}
}
