package variable;

public class JAVA100_operator_LogicalOperators {

	public static void main(String[] args) {
		
		// [!] 논리연산자 : &&,||(이항 연산자)			!(단항 연산자)
		// &&(and)    ||(or)		!(not)
		// 관계연산자와 마찬가지로 결과로써 나오는 값은 참(true),거짓(false)으로 나오므로 결과를 받는 타입은 boolean
		// A||B	:A,B 모두 참이여야 함
		// A&&B	:A 또는 B 중 하나라도 참이면 참
		// !A		:A가 참이면 false, 거짓이면 true
		
		int a =10, b=20, c=30;
		
		boolean rst1 = a < b	&& c >b;
		
		boolean rst2 = a < b || c < b;
		
		boolean rst3 = a > c || b != c;
		
		System.out.println(rst1);
		System.out.println(rst2);
		System.out.println(rst3);
		
		boolean rst4 = !rst3;					//true를 부정
		
		System.out.println(rst4);			//false
		System.out.println(!rst4);		
	}
}
