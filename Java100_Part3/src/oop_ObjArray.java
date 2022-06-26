class Person5 {
	//Field
	String name;
	private int age;
	
	//Constructor
	Person5() {}
	Person5(String name, int age) {
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

public class oop_ObjArray {
	public static void main(String[] args) {
		
		// [1] : 객체 생성
		int[] ar1 = {1, 2, 3, 4, 5};
		char[] ar2 = {'A', 'B', 'C', 'D', 'E'};
		Person5[] ar3 = new Person5 [5];
		// Person 타입(5개의 배열을 담을수 있는)의 객체를 생성했다는 선언
		ar3[0] = new Person5 ("홍길동", 20);
		ar3[1] = new Person5 ("이순신", 30);
		ar3[2] = new Person5 ("세종대왕", 40);
		ar3[3] = new Person5 ("광개토대왕", 50);
		ar3[4] = new Person5 ("진흥왕", 60);
		
		// [2] : 출력
		for(int i=0; i<ar2.length; i++) {
			System.out.print(ar3[i].name + "\t\t");					//class에 private String name 이라고 되어있다면 getName으로 호출
			System.out.print(ar3[i].getAge()+ "\t\t");
		}
		System.out.println();
	}
}
