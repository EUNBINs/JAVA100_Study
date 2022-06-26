// 기본형 타입의 값을 초기화한 아래의 코드에서 틀린 곳을 찾아 수정하시오.
// 이 문제는 기본형 타입의 값을 초기화하는 방법에 대해서 알고 있는지를 묻는 문제이다

package variable;

public class DataType3 {
	public static void main(String[] args) {
		
		//[1] : 기본형 타입 --> 8개 --> 변수 선언과 동시에 값을 입력
		byte b = 100;
		short s = 30000;
		int i = 2100000000;
		long l = 7000000000L;		// Long은 숫자끝에 L접미사 붙이기
		float f = 9.8F;					// 마찬가지로 접미사F 필요
		double d = 3.14;
		char c = 'A';
		boolean bl = false;			//소문자로만 표기 false,true
		
		// [2] : 출력
		System.out.println(b + "byte 최댓값-->" + Byte.MAX_VALUE);
		System.out.println(s + "short 최댓값-->" + Short.MAX_VALUE);
		System.out.println(i + "integer 최댓값-->" +Integer.MAX_VALUE);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bl);
		

	}

}
