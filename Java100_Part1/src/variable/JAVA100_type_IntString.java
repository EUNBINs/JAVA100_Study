package variable;

public class JAVA100_type_IntString {

	public static void main(String[] args) {
		
		//[1] : 정수 선언
		int a = 12345;
		String str = "12345";
		System.out.println(str.length()); 			// srt 자릿수
		//System.out.println(int.length()); 			// 에러 : int는 문자열이 아니기때문에
		
		
		// [2] : 정수 --> 문자열로 변환 -->자릿수 구하기		
		String stra = String.valueOf(a);
		System.out.println(stra.length());
		
		// [3] : 문자열 + 정수형 = ?
		System.out.println( 12345 + 1);				//12346
		System.out.println( str+1);					//문자열 + 정수형 = 합성(합류)
		
		// [4] : 문자열 -> 정수로 변환
		int b = Integer.valueOf(str);
		System.out.println(b + 1); 
	}
}
