// static ������ �ȵǾ��ִ� �޼��带 ����ϴ� ����� ���ؼ� �ڵ�� �����غ��ÿ�.
// �� ������ ���� �޼��忡�� static ������ ���� �޼��带 ����ϴ� ����� ���ؼ� �ƴ����� ���� �����̴�.
// Ŭ������ ��ü�� ���� ���� �н��� �ʿ��ϹǷ� �̿� ���� �н� �� �� ������ �ٽ� Ǯ��� ���� ����.


package function;

public class Method_ExamStatic2 {
	public static void helloWorld() {
		System.out.println("hello, world~");
	}
	
	public static void main(String[] args) {
		
		// [1] �޼��� ȣ��
		//helloWorld();								// ���� �޼���� static �޼��常 ȣ���� �� �ֱ� ������ ����
		
		// [2] ��ü ���� �� �޼��� ȣ��
		Method_ExamStatic2 jes = new Method_ExamStatic2();
		jes.helloWorld();
	}
		
}
