package function;

class TestNumber {
	int num;
	TestNumber(int num) {this.num = num;}							// main()으로 부터 num에 100이 셋팅
}
public class Method_MethodCall3 {
	public static void sum(TestNumber a) {							// main()으로부터 a 에 대한 주솟값만 전달받음
		System.out.println("sum()메서드 안에서의 a 값 -->" + a);		// a 값(TestNumber 주소) 출력
		System.out.println(a.num);										// 100	
		a.num = a.num + 400;												
		System.out.println(a.num);										// 500
	}
	
	public static void main(String[] args) {
		
		// [1] :객체 변수 선언
		TestNumber a = new TestNumber(100);						// a 에는 주솟값만 전달
		sum(a);
		
		System.out.println("-----------------------------");		// 100						
		System.out.println(a.num);										// 500						
	
	}
}
