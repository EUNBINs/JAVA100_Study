package oop;

public class oop_Exam002 {
	public static void main(String[] args) {
		
		// [1] 객체 생성
		FarmMachine fm = new FarmMachine();
		
		// [2] 생성된 객체 속성 값 입력하기
		fm.price = 1000000;
		fm.year = 2020;
		fm.color = "Red";
		
		// [3] 속성 값 출력하기
		//String fm_price = String.format("%,d", 1000000);
		System.out.println(String.format("%,d", fm.price));
		System.out.println(fm.year);
		System.out.println(fm.color);
		
		// [4] 동작 수행하기
		fm.move();
		fm.dig();
		fm.grind();
		
	}
}
