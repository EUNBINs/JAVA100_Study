// 자식 클래스로 생성하는 객체를 부모의 타입으로 받아서 객체를 생성하면 사용범위가 어떻게 되는지 말해보시오.
// 이 문제는 다형성의 관계에서 부모, 자식 클래스 자원을 어떻게 쓸 수 있는지를 묻는 문제이다. 
// 자식 클래스로 생성하는 객체를 부모의 타입으로 받아서 객체를 생성하면 사용범위가 어떻게 되는지 말해보시오.2
// 이 문제는 다형성의 관계에서 부모, 자식 클래스 자원을 어떻게 쓸 수 있는지를 묻는 문제이다.
// Person s2 = new Student(); // 자식의 메서드를 바로 호출하고 싶다면?
// Student s1 = new Student(); // 자식 클래스에서 오버라이딩된 부모 클래스의 원본 메서드를 호출하고 싶다면?


// [!] 핵심
// 부모클래스 Person이 있고, 이를 상속받은 자식클래스 Student가 있다
// 하위클래스의 인스턴스(객체)는 보다 위인 상위클래스의 인스턴스(객체)로도 사용될 수 있따
// 그러나 상위 클래스의 인스턴스(객체)는 하위클래스의 인스턴스(객체)로 사용될 수 없다

package oop2;

class Person2 {
	String str1 = "난 부모클래스";
	void method1() {
		System.out.println("에이에이에이");
		}
	void ppp() {
		System.out.println("ppp");
		}
}
class Student2 extends Person2 {
	String str2 = "난 자식클래스";
	void method1() {
		System.out.println("오버라이딩-AAA");
	}
	void sss() {
		System.out.println("sss");
	}
	void x() {
		method1();
		super.method1();
	}
}

public class Polymorphism2 {
	public static void main(String[] args) {
		
		// [1] : 객체 생성 --> 부모와 자식 클래스의 모든 자원 사용 가능
		Student2 s1 = new Student2();
		System.out.println(s1.str1);
		System.out.println(s1.str2);
		s1.method1();
		s1.sss();
		s1.ppp();
		
		// [!] 자식 클래스에서 오버라이딩된 부모 클래스의 원본 메서드를 호출하고 싶을때 --> super 사용
		System.out.println("-----------------[super 사용]");
		s1.x();
		System.out.println("-----------------[super 사용]");
		
		
		// [2] : 객체 생성 --> 타입은 부모 타입으로 생성	--> 부모의 자원만 사용 가능
		Person2 s2 = new Student2();					// 하위클래스로 객체를 생성하여 타입은 상위클래스 타입을 사용하는 것 = 다형성
		System.out.println(s2.str1);
		//System.out.println(s2.str2);						// ERROR 자식자원은 사용 불가능
		s2.ppp();
		//s2.sss();												// ERROR 자식자원은 사용 불가능
		s2.method1();											// 오버라이딩한것은 자식의 메서드로 실행
		
		// [!] 자식의 메서드를 바로 호출하고 싶다면? --> 캐스트 필요
		System.out.println("------------------[캐스트 사용]");
		((Student2)s2).sss();
		System.out.println("------------------[캐스트 사용]");
		
		// [3] : 객체 생성
		Person2 aaa = new Person2();
		aaa.method1();
		//aaa.sss();											// ERROR 자식자원은 사용 불가능
		
		
		// [4] : 객체 생성 --> 타입을 자식 타입으로 생성	==> 상위클래스로 객체를 생성하면서 타입은 자식클래스로 쓰는 경우 //Error
		// Student bbb = new Person();
	}
}

//다음의 객체 생성 방법중 틀린 것은?
//-------------------------------------------------------------------------------------------------------------------------------------------
//class Person {}
//class Student extends Person {}
//[1] Student s1 = new Student();
//[2] Person s2 = new Student();
//[3] Person p1 = new Person(); 
//[4] Student s1 = new Person();