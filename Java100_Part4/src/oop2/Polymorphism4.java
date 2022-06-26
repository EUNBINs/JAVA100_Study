package oop2;

abstract class Car2 {
	abstract void run();
}

class Ambulance2 extends Car2 {
	void run() {System.out.println("�ں深�� ��������~ �߻ǻ߻�~");}
}
class Cultivator2 extends Car2 {
	void run() {System.out.println("���� ��������~ ���ȴ���~");}
}
class SportsCar2 extends Car2 {
	void run() {System.out.println("������ī ��������~ ��~");}
}

public class Polymorphism4 {
	public static void main(String[] args) {
		
		// [1] : �迭 ���̰� 3�� Car ��ü �迭 ����
		//Car2[] cars2 = new Car2[3];
		//System.out.println(cars2[0]);						// null --> �� �迭���� ���� null ���� ����
		
		// cars �迭 �ʱ�ȭ
		//cars = new Cars[] {new Ambulance(), new Cultivator(), new SportsCar()};
		
		// [2] : 1�� ��� ���� --> �ڽ�Ŭ������ ��ü ���� --> Ÿ���� �θ�Ÿ������ --> �̷��� ������ ��ü��� �ٷ� �迭 �ʱ�ȭ --> ������ ����
		Car2[] cars2 = {new Ambulance2(), new Cultivator2(), new SportsCar2()};
	
		// [3] : �ݺ��� ���鼭 �� ��ü�� run() �޼��� ȣ��
		for (int i=0; i<cars2.length; i++ ) {
			cars2[i].run();
		}
		
		// [4] : ���� for��
		System.out.println("------------------");
		for (Car2 obj : cars2)
			// System.out.prinltn(obg);
			obj.run();
	}
}
