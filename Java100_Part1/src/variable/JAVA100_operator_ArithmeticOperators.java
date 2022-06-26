package variable;

public class JAVA100_operator_ArithmeticOperators {
	public static void main(String[] args) {
		
		// [!] 수치연산자 : +, -, *, /, %(나머지연산자)
		int a, b, c, d;
		a = 60; b = 8; c = 300; d = 400;
		
		System.out.println( a + b );					//68
		System.out.println( "a + b=" + a + b );		//608
		System.out.println(" a + b=" + (a+b));		//68
		System.out.println(" a - b=" + (a-b));
		System.out.println(" a * b=" + (a*b));
		System.out.println(" a / b= " + (a/b));
		System.out.println(" a % b=" + (a%b));
	}

}
