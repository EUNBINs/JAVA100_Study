package oop;

class Warrior {
	// Field (속성과 기능 서술)
	int gender;
	int power;
	// Constructor
	Warrior() {
		this.gender = 1;							// 1 : 남성, 2 : 여성
		this.power = 100;							// 기본 파워 : 100
	}
	//Method
	void walk() {
		System.out.println("걸어가고 있습니다.");
	}
}
class Hero extends Warrior {
	// Field
	String name;
	int age;
	// Constructor
	Hero () {}
	Hero (String name, int age) {
		this.name = name;
		this.age = age;
	}
	// Mehtod
	void walk() {
		System.out.println("2배로 빨리 걸어가고 있어요.");			// "걸어가고 있습니다"를 상속받았지만 새로 재정의하여 사용
	}
	void eat() {
		System.out.println("밥먹고 있어요.");
	}
	void displayPerson() {
		System.out.println("이름:" + name + "나이:" + age + "성별:" + gender + "파워:" + power);
	}
}
class Villain {}

public class oop_InheritanceSample2 {
	public static void main(String[] args) {
		
		// [1] : 객체 생성
		Warrior p1 = new Warrior();

		// [2] : 상속을 통한 슈퍼맨 객체 생성
		Hero h1 = new Hero("슈퍼맨", 20);
		System.out.println(h1.name);
		System.out.println(h1.age);
		System.out.println(h1.gender);								
		System.out.println(h1.power);								// 부모클래스에 있는 필드변수
	}

}
