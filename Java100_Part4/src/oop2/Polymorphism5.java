// �������� ����ϸ� �迭�̳� �Ű����� Ȱ�뿡�� ���ٴµ� �ڼ��� �ڵ�� �����غ��ÿ�.
// �� ������ �������� ����� �ʿ伺 �׸��� � ������ Ȱ���� �� �������� �˰� �ִ����� ���� �����̴�.
// �Ʒ��� ��ü ������ Ʋ�� ����?

package oop2;

class Person5{}
class Batman extends Person5{}

class Human{}
class Superman extends Human{}

public class Polymorphism5 {
	public static void main(String[] args) {
		
		// [1] : �迭���� �������� ����� �� ���ٸ�,,
		// �迭 --> ������ Ÿ���� �����͸� �ϳ��� ��� �����ϴ� �ڷᱸ�� --> �������� ���ٸ� �� ��ü���� ������ �ؾ��Ѵ�
		Person5[] persons = new Person5[10];				// Person ����
		persons[0] = new Person5();
		persons[1] = new Person5();
		persons[2] = new Person5();
	
		Batman[] batmans = new Batman[10];				// Batman ����
		batmans[0] = new Batman();
		batmans[1] = new Batman();
		//batmans[2] = new Person();							// ERROR	---- �ڽ�Ŭ���� �迭�� �θ�Ŭ�������� �����ϴ°� �Ұ���
		
		// [2] : �迭���� �������� ����� �� �ֱ⿡
		Human[] humans = new Human[10];
		humans[0] = new Human();	
		humans[1] = new Superman();							// �θ�Ŭ���� �迭�� �ڽ�Ŭ�������� �����ϴ°� ����
		
		// [3] : �Ű������� ������
		// ���α׷��� ���� �Լ��� �޼��带 ȣ���� ���� �׿� �´� ������ �Ķ���͸� ��������Ѵ�.
		// System.out.println() �޼����� ��� � Ÿ��, ��ü�� �Ű������� �޴��� �������� �ش� ��ü�� ���� ��� --> ���� ������ ������?
		// �װ��� ������ ���� : �ٷ� �������� Ȱ���ϰ� �ֱ� �����̴�
		// ���� �޼����� API�� ���� --> public void println(Object x) �� �Ǿ� �ֱ⿡ � ��ü Ÿ���� ���޵Ǵ��� �������� ����� �Ǵ� ���̴�
		System.out.println(new Person5());
		System.out.println(new Batman());
		System.out.println(new Human());
		System.out.println(new Superman());
	}

}



//[ ��� ��� ]
//-------------------------------------------------------------------------------------------------------------------------------------------
//class Person {}
//class Batman extends Person {}
//Person[] persons = new Person[10];
//persons[0] = new Person();
//persons[1] = new Person();
//persons[2] = new Batman();
//Batman[] batmans = new Batman[10];
//batmans[0] = new Batman();
//batmans[1] = new Batman();
//batmans[2] = new Person();