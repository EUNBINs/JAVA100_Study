// 메서드로 인자 전달시 정수 100을 보냈을 때의 아래 코드의 결과를 말해보시오.
// 이 문제는 자바의 기본형 타입과 참조형 타입의 다양한 메서드 호출 방식에 대해서 아는지를 묻는 문제이다

package function;

public class Method_MethodCall1 {
	
	// [!] : Call by value --> 값에 의한 호출 --> 값에 의해서 (메서드를) 호출
	public static void sum(int a) {
		a = a + 400;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		// [1] 변수 선언 및 메서드 호출
		
		int a = 100;
		sum (a);
		
		// [2] 출력
		System.out.println(a);
	}
}
