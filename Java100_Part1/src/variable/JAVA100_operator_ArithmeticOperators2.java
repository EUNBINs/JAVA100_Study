package variable;

public class JAVA100_operator_ArithmeticOperators2 {
	public static void main(String[] args) {
		
		// [!] 연산의 결과 : 정수끼리라도 나누기의 경우 소숫점형태가 나올 수 있다
		int a = 60, b = 8;
		int rst1;	double rst2, rst3, rst4;
		
		rst1 = a / b;
		System.out.println(rst1);					//7.5가 아니라 7 출력
		System.out.println( (double)rst1);		//7.5가 아니라 7.0 출력	, 리턴받는 
		
		rst2 = a / (double)b;
		System.out.println(rst2);					//7.5 출력
		
		rst3 = 100 / (double)3;
		System.out.println(rst3);	
		
		rst4 = 250 / 3.0;
		System.out.printf("세 과목의 평균은 %.1f입니다.%n", rst4);
		
		
	}
}
