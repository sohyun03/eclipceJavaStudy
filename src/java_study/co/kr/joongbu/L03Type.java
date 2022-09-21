package java_study.co.kr.joongbu;

enum E { // ������ E

}

@FunctionalInterface // �߻�޼ҵ带 �� 1�� �����ؾ��Ѵ�.
interface C { // C Type
	void print(); // �߻� �޼��常 �����Ҽ� �ִ�.
//	void sdf();
}

abstract class B { // B Type
	abstract public void print(); // �߻� �޼��带 ������ �� �ִ�.
}

class A { // A Type

}

public class L03Type {
	// static �ʵ�: jvm�� �ڵ带 �����Ҷ� static���� ���ǵ� ������ �޼ҵ� �������� ����(���� ����� ����)

	public static int I = 13; // ���: �޼ҵ� ������ ����Ǵ� static �ʵ�(������ �ʴ� ����)

	static class InClass extends B {

		@Override
		public void print() {
		}
	}

	public static void main(String[] args) {

		final int I = 13; // ���: �������� ���Ǵ� �ٲ��� �ʴ� ���

		System.out.println(Integer.MAX_VALUE); // static �ʵ�� ���ǵ� ���
		A a = new A();
//		B b = new B();
//		C c = new C();
//		�������̽��� �߻�Ŭ������ �߻�޼��尡 �ֱ� ������ ��ü�� ������ �� ����.

		B b = new B() {
			// ������ ���ÿ� �߻�޼ҵ带 �����ϸ� ��ü�� ������ �� �ִ�.
			// �̶� �̳�Ŭ������ �����Ǵµ� ���ڷ� ���ǵ� �͸� Ŭ������ ���������.
			@Override
			public void print() {

			}
		};

		C c = new C() {
			@Override
			public void print() {
			}
		};

		B b2 = new InClass(); // InClass�� static�� ������ new L03Type().new InClass(); �� ����Ѵ�.

		
		// ���ٽ�: �Լ��� ���(�Լ��� ��ü)�� ǥ���� ȭ��ǥ�Լ��� �ۼ��� ��ü (�ڹٿ����� �Լ��� ��ü�� �� �� ����)
		// �ڹٿ��� ���ٽ��� �ۼ��ϱ� ���ؼ��� �������̽��� �߻�޼ҵ尡 1�� ���� ��� �����ϴ�.
		// �ڹٿ��� �Լ��� �Ű������� ����� �� ���� ������ �Լ��� �Ű������� ����Ϸ��� �� Ÿ���� �����ؾ��Ѵ�. �̰��� �����ϰ� �ϱ� ���� ���ٽ��� ���
		
		// �ڹٿ��� �Լ��� ��ü�� ���(x) ������ ���� (�Լ��� ����� ô)
		C c2 = () -> {
		}; // �������̽��� �߻�޼��尡 1�� ���� ��� ���ٽ����� ��ü�� ������ �� �ִ�. (�Լ��� ��� ���)
	}
}
