package oop;

public class oop_Parselnt {
	public static void main(String[] args) {
		
		// [1] 숫자끼리의 연산
		int a = 1;
		int b = 2;
		int c = a + b;
		System.out.println("a + b = " + c );
		
		// [2] 문자열끼리의 연산
		String a1 = "1";
		String b1 = "2";
		String c1 = a1 + b1;
		System.out.println("a1 + b1 = " + c1);
		System.out.println(c1.getClass().getName());
		
		// [3] 문자열 --> 숫자로 변환 후 연산
		int a2 = Integer.parseInt(a1);
		int b2 = Integer.parseInt(b1);
		System.out.println(a2 + b2);
		
		// [4] 진수 지정
		System.out.println("-------------------------[진수지정]");
		System.out.println(Integer.parseInt("2022"));
		System.out.println(Integer.parseInt("2022",10));
		System.out.println(Integer.parseInt("1",2));
		System.out.println(Integer.parseInt("1001",2));
		System.out.println(Integer.parseInt("1004",8));
		System.out.println(Integer.parseInt("A",16));
		System.out.println(Integer.parseInt("F",16));
		System.out.println(Integer.parseInt("FF",16));
		System.out.println("-------------------------[진수지정]");
		
		// 10진수 --> 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		// 16진수 --> 0 1 2 3 4 5 6 7 8 9  A	 B 	 C  D   E  F
	}
}


// [!] 변환이 왜 필요한가?
// 1+2 숫자끼리의 연산은 3이지만, 문자열끼리의 연산은 12가 되기 때문에 숫자로 변환 후 연산을 수행해야 한다.
// 문자열을 숫자로 변환시키는 방법 --> Integer.parseInt() 사용.
// paraseInt() --> Integer 클래스의 static 으로 지정 --> 따라서, 객체의 생성없이 바로 "클래스명.parseInt()"로 직접 사용 가능
// 두 번째 인자 값으로 진수를 지정 --> 해당 진수값에 맞는 값이 됨 --> Integer.parseInt(1000", 2);