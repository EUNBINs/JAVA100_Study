// 2개의 정수형 값을 리턴하는 메서드를 구현하시오.
// 이 문제는 두개의 리턴 값을 반환하는 메서드 작성법을 아는지에 대해서 묻는 문제이다.
// 아래의 코드에서 2개의 리턴 값을 받는 코드는 (1)과 (2)중 어느 것인가?

package function;

import java.util.Arrays;

public class Method_TwoReturn1 {
	
	public static int[] testMethod() {
		int num1 = 100;
		int num2 = 200;
		
		return new int[] {num1, num2};
		
	}
	public static void main(String[] args) {
		
		// [1] 변수 선언
		int result[] = testMethod();
		
		// [2] 출력
		System.out.println(result);									// 주솟값 출력
		System.out.println(result[0] + " - " + result[1]);		// 각각 출력
		System.out.println(result[0] + result[1]);					// 연산 출력
		System.out.println(Arrays.toString(result));				// 한번에 모든 요소 출력
	}
}
