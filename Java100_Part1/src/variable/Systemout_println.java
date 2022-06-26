// System.out.print(), println(), printf() 등에 대해서 예제를 통해 설명해보시오.
// 이때 10진수 10에 대해서 8진수, 16진수로 각각 출력해보시오.
// 이 문제는 출력시 많이 사용되는 print(), println(), printf() 형식에 대해서 알고 있는지를 묻는 문제이다.


package variable;

public class Systemout_println {
	public static void main(String[] args) {
		
		byte b = 20;
		short s = 21;
		int i = 22;
		float f = 9.8F;
		double d =3.14;
		char c = 'A';
		boolean bl = false;
		
		// [2] : print(), println()
		System.out.println("안녕하세요");
		System.out.println();
		System.out.print("나는 홍길동이야");
		
		// [3] : printf() 출력 -> 지시자를 사용
		// %d (정수), %f (소수점 형식) , %c (문자), %s (문자열) , %b (부울), %n (줄바꿈)
		// 정수는 byte, short, int, long
		// %(소수점 자릿수).f
		// %e (지수), %o (8진수), %x (16진수)
		
		System.out.printf("나는 %d살인 공주야. %d, %d %n",b,s,i);
		System.out.printf("소숫점 형식->%.2f, %f %n 문자형식->%c, %b ", f,d,c,bl);
		
		byte h = 10;
		
		System.out.printf("10진수 10은 8진수로는 %o, 16진수로는 %x이다.", h,h);
		
		//16진수는 0-9, 10부터는 a 11은 b ...
	}

}
