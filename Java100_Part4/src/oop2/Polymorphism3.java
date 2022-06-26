// �߻� Ŭ������ ����� ����Ͽ� ������ ������ �����ÿ�.
// �� ������ �߻� Ŭ������ ����� ������ �����ϰ� �̸� Ȱ���Ͽ� �������� ������ �� �ִ����� ���� �����̴�.

package oop2;

abstract class Car {
	abstract void run();
}

class Ambulance extends Car {
	void run() {System.out.println("�ں深�� ��������~ �߻ǻ߻�~");}
}
class Cultivator extends Car {
	void run() {System.out.println("���� ��������~ ���ȴ���~");}
}
class SportsCar extends Car {
	void run() {System.out.println("������ī ��������~ ��~");}
}

public class Polymorphism3 {
	public static void main(String[] args) {
		
		// [1] : ��ü ����
		Car c1 = new Ambulance();
		Car c2 = new Cultivator();
		Car c3 = new SportsCar();
		
		
		// [2] : run() �޼��� ȣ��
		c1.run();
		c2.run();
		c3.run();
	}

}
