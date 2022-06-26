
package oop2;

class Person {
	
	//Field
	String name;
	int age;
	int weight;
	
	//Constructor
	Person() {}
	Person(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	//Method
	void wash() {
		System.out.println("씻다");}
	void study() {
		System.out.println("공부하다");}
	void play() {
		System.out.println("놀다");}
}

interface Allowance {
	// Field
	// 변수는 안되나 상수는 되므로 상수로 지정해주면 됨 --> public static final 을 붙여주면 된다
	// 인터페이스 내 모든 멤버 필드(변수)는 public static final이여야 한다(예외없음) --> 생략 가능 --> "타입 상수명" 지정해서 쓰면 됨 [ex) int bbb]
	public static final String aaa = "코리아";
	int bbb = 100;
	// Abstract Method
	// 인터페이스 내 모든 메서드는 public abstract이어야 함 -->그래서 생략가능  [ex) void in ]
	abstract void in(int allowance, String name);
	void out(int allowance, String name);
}
interface Train {
	// Abstract Mehthod
	abstract void train (int training_pay, String name);
}

class Student extends Person implements Allowance, Train {
	// Field
	// Constructor
	Student() {}
	Student(String name, int age, int weight) {
		super (name, age, weight);
	}
	// Mehtod
	public void in(int price, String name) {
		System.out.printf("%s에게서 %d원을 받았습니다%n", name,price);}
	public void out(int price, String name) {
		System.out.printf("%d원을 지출했습니다. [지출용도 : $s]%n", price, name);}
	public void train(int training_pay, String name) {
		System.out.printf("[%s--> %d원 입금완료]%n", name,training_pay);}
	
}
public class Interface3 {
	public static void main(String[] args) {
		
		// [1] : 객체 생성
		Student s1 = new Student("홍길동", 23, 75);
		
		// [2] : 클래스와 인터페이스로부터 상속(Person)과 구현(Allowance,Train)을 한 메서드들 호출
		s1.wash();
		s1.study();
		s1.play();
		s1.in(10000, "엄마");
		s1.out(5000,"편의점");
		s1.train(50000,"아빠");
		
		// [3] : 상수 필드 사용하기
		System.out.println(s1.aaa);
		System.out.println(s1.bbb);
		System.out.println(Allowance.aaa);
		System.out.println(Allowance.bbb);
	}
}
