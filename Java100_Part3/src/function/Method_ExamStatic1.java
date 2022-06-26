// 아래의 메서드 구현 코드에서 틀린 곳을 찾아 올바르게 수정하시오.
// 이 문제는 자바의 메서드 구현시 기본적인 주의점에 대해서 아는지를 묻는 문제이다.

package function;

public class Method_ExamStatic1 {
	public static void HelloWorld() {
		System.out.println("Hello, World");
	}
	
	public static void showMenu( ) {
		System.out.println("showMenu()메서드가 호출되었습니다");
	}
	public static void main(String[] args) {		// 위 아래 모두 static 이 존재해야 호출 가능
		
		// [1] 메서드 호출
		HelloWorld();
		
		//[3-1] :반환값X		받는 인자값X
		showMenu();
	}

}

// [2] 메서드란 ?
// (1) 메서드는 다른 언어에서의 함수와 마찬가지로 어떤 특정한 동작이나 처리를 하도록 만들어진 코드 단위
// (2) 반복적인 작업을 처리해야 하는 경우 메서드로 만들어놓으면 이후에 필요할 때 재사용이 가능하여 유용하다
// (3) 메서드는 호출시 어떤 결과를 반환하기도 하지만, 결과를 반환하지 않는 메서드도 있다
// (4) 메서드는 호출시 어떤 인자 값들을 넘겨서 호출하는 경우도 있지만, 인자값 없이 호출하는 경우도 있다

// [3] 메서드 종류 -> 크게 4가지 유형
// (1) 반환값 X			받는 인자값 --> X
// (2) 반환값 X			받는 인자값 --> O
// (3) 반환값 O			받는 인자값 --> X
// (4) 반환값 O			받는 인자값 --> O




