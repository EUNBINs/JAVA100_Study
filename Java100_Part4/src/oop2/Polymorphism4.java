package oop2;

abstract class Car2 {
	abstract void run();
}

class Ambulance2 extends Car2 {
	void run() {System.out.println("앰뷸런스 지나가요~ 삐뽀삐뽀~");}
}
class Cultivator2 extends Car2 {
	void run() {System.out.println("경운기 지나가요~ 덜컹덜컹~");}
}
class SportsCar2 extends Car2 {
	void run() {System.out.println("스포츠카 지나가요~ 씽~");}
}

public class Polymorphism4 {
	public static void main(String[] args) {
		
		// [1] : 배열 길이가 3인 Car 객체 배열 선언
		//Car2[] cars2 = new Car2[3];
		//System.out.println(cars2[0]);						// null --> 각 배열에는 아직 null 값만 존재
		
		// cars 배열 초기화
		//cars = new Cars[] {new Ambulance(), new Cultivator(), new SportsCar()};
		
		// [2] : 1번 방법 말고 --> 자식클래스로 객체 생성 --> 타입은 부모타입으로 --> 이렇게 생성된 객체들로 바로 배열 초기화 --> 다형성 덕분
		Car2[] cars2 = {new Ambulance2(), new Cultivator2(), new SportsCar2()};
	
		// [3] : 반복문 돌면서 각 객체의 run() 메서드 호출
		for (int i=0; i<cars2.length; i++ ) {
			cars2[i].run();
		}
		
		// [4] : 향상된 for문
		System.out.println("------------------");
		for (Car2 obj : cars2)
			// System.out.prinltn(obg);
			obj.run();
	}
}
