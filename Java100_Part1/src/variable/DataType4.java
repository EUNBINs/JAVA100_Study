// 정수형 변수를 문자형으로 형(Type) 변환시켜서 출력하면 어떤 결과가 나오는지 말해보시오.
// 아래 코드의 결과를 예상하여 말해보시오.
// 이 문제는 정수형과 문자형의 타입 변환시 일어나는 변화에 대해서 알고 있는지를 묻는 문제이다

package variable;

public class DataType4 {

	public static void main(String[] args) {
		
		// [1]
		short a = 'A'; 
		System.out.println( a );				// A=65, B=66, C=67 ... Z=90
		// [2]
		short b = 90;
		System.out.println( (char)b );
		// [3]
		char c = 'a';
		System.out.println( (short)c );		// a=97, v
	}
}
