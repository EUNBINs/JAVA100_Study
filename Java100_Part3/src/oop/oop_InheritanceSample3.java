package oop;

class Warrior1 {
	// Field (속성과 기능 서술)
	int gender;
	int power;
	// Constructor
	Warrior1() {
		this.gender = 1;							// 1 : 남성, 2 : 여성
		this.power = 100;							// 기본 파워 : 100
	}
	//Method
	void walk() {
		System.out.println("걸어가고 있습니다.");
	}
}
class Hero1 extends Warrior1 {		
	// Field
	String name;
	int age;
	// Constructor
	Hero1 () {}
	Hero1 (String name, int age) {
		super();										// 부모클래스의 생성자 호출 (gender와 power 생략되있다는 의미로 보면된다)
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
class Villain1 {}

public class oop_InheritanceSample3 {
	public static void main(String[] args) {
		
		// [1] : 객체 생성
		Warrior1 p1 = new Warrior1();

		// [2] : 상속을 통한 슈퍼맨 객체 생성
		Hero1 h1 = new Hero1("슈퍼맨", 20);
		System.out.println(h1.name);
		System.out.println(h1.age);
		System.out.println(h1.gender);								
		System.out.println(h1.power);								// 부모클래스에 있는 필드변수
		h1.walk();
		h1.eat();
		h1.displayPerson();
		
		// [3] : 원더우면 객체 생성
		Hero1 h2 = new Hero1("원더우면", 30);
		h2.displayPerson();
		h2.gender = 2;
		h2.power = 300;
		h2.displayPerson();
		h2.walk();
	}

}
