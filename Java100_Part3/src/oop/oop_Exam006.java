// 객체 생성시 초깃값을 생성자 메서드에서 설정하는 클래스를 구현해보시오.
// 이 문제는 클래스의 인스턴스 생성시 생성자를 통해서 초기화하는 것을 알고 있는지 묻는 문제이다

package oop;

class Person {
	
	// [1] 속성 (Attribute)
	int age;
	String name;
	
	// [2] 생성자 (Constructor)
	Person() {}
	Person(int age, String name) {
		this.age = age;									// this = 생성된 객체 자신을 의미		// 파이썬에서는 thsi =self
		this.name = name;
	}
	// [3] 메서드 (Method)
	void printPerson() {
		System.out.println( "나이 :" + age + ", 이름 : " + name );
	}
}
public class oop_Exam006 {

	public static void main(String[] args) {
		
		// [1] 객체 생성
		Person p1 = new Person(20, "홍길동");
		System.out.println(p1);
		System.out.println(p1.age);
		System.out.println(p1.name);
		p1.printPerson();
		
		Person p2 = new Person(30, "이순신");
		p2.printPerson();
	}

}
