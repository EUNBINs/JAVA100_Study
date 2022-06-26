package oop;
class Person6 {
	//Field
	String name;
	 int age;
	
	//Constructor
	Person6() {}
	Person6(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//Method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age; 
	}
	public void setAge(int age) {
		this.age = age;
	}
		
}

public class oop_ObjArray2 {
	public static void main(String[] args) {
		
		// [1] : 객체 생성
		Person6[] pa;													// Person6 타입의 객체 배열변수 pa선언
		pa = new Person6[5];										// Person6 객체의 참조값을 원소로 가지는 배열 공간을 5개 생성 -> 5명 객체를 생성할테니 주소 저장해
		
		// [2] : 반복문(for)을 돌면서 Person6() 객체 생성
		for (int i=0; i<pa.length; i++) {
			pa[i] = new Person6(i+"번 후보자",i+20);			// i만 입력하면 안되나 문자열을 붙이면 문자열로 전달
			
		
			// [2-1] : getter, setter 메서드를 사용해 출력
			// System.out.println(pa[i].getName()+ "의 나이는" + pa[i].age + "살 입니다.");		
			
			// [2-2] : 배열 인덱스 사용해서 출력 --> 단, 이렇게 쓰려면 private선언을 삭제하고 사용
			//System.out.println(pa[i].name+"의 나이는" +pa[i].age + "살 입니다.");
			
			// [2-3] : printf()
			System.out.printf("%s번 후보자의 나이는 %d살 입니다.%n", pa[i].name, pa[i].age);
		}
	}
}
