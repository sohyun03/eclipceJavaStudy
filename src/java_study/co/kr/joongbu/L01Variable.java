package java_study.co.kr.joongbu;

import java.util.ArrayList;

// class �̸� ��Ģ: �Ľ�Į ǥ���(�̸� ǥ���� �� ���), ���ڷ� �����ϸ� �ȵ�
public class L01Variable {
	// �޼ҵ� �̸� ��Ģ: ī��ǥ��� ���, ���ڷ� �����ϸ� �ȵȴ�.
	// main �޼ҵ� ��Ģ: public(��𼭵� ���� ����), static(������ jvm < jre (jre�� jvm ����) ���ÿ���
	// ������), void (��ȯ�Ǵ� ���� ����), args (main�� ����� �� �����Ǵ� �⺻��)

	public static void main(String[] args) { // �Ķ����(�Ű�����)

		String[] arr = { "a", "b", "c" }; // array �迭
		System.out.println(arr.length);
		System.out.println(arr.toString()); // Object.toString() : ��ü�� �ּ����� (��ü�� ���� ������ ������ �ϱ⸦ ����ϴ� �Լ�)
		// java.lang.Object: ��� ��ü�� �θ�(��� Ÿ���� ��ü�� �� �� �ִ� ������ ���� => Ŭ������ �����ڸ� new �����ڷ�
		// ȣ���ؼ� ��ü�� ������ �� �ְ� ���ش�.)
		ArrayList<String> list = new ArrayList<String>(); // list �迭
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list.toString()); // List.toString()�� Object.toString()�� ������
		System.out.println(list.size());
		System.out.println(list.contains("c"));

		L01Variable l01Variable = new L01Variable();
		System.out.println(l01Variable); // toString�� ��������
		System.out.println(l01Variable.toString());
		// @Override: �θ��� �ʵ带 ������ �ϴ� �� (������: �� ���� �̸��� ������ ���� ���� ��)
		// �ڽ��� �θ��� ��� �ʵ带 ���������� ������ �� �ʵ尡 �켱������ ���´�.

		// �����ε�: �޼ҵ��̸��� ������ �Ű������� �ٸ��� (������: �� ���� �̸��� ������ ���� ���� ��)

		// Ÿ���� ������: �Ѱ��� ��ü�� ���� Ÿ�Կ� ���� ����(������)
		String hello = "�ȳ�";
		Object o = hello; // o�� Object Ÿ���� ��ü�� ���� ����, �θ� Object�� ��ü�� ��������(Ÿ���� ������ => ����ȯ)

		// 0 (������ ��ȣ�� ����) or 1 (������ ��ȣ�� ����)
		// 2������ 16���� -> 1byte(8bit)
		// �޸𸮰� ���� ���� ������ 1bit�� 8���� 1byte�� ������.
		// -+(��ȣ��Ʈ) 7bit�� 2������ ǥ�� 2^0, 2^1, 2^2, 2^3, ... 2^6 => ���� ���
		// 5: 4+1 ù��° ��Ʈ(2^0)�� 3��° ��Ʈ(2^2)�� ������ ��ȣ�� �ش�.

		// �ε��Ҽ������� ǥ���ϴ� �Ǽ�
		// 0.005 (�����Ҽ��� ǥ��) => 5.0 * 10^-3 (�ε� �Ҽ���)
		// +(-): ��ȣ��Ʈ
		// 5: ������ => ù��° ��Ʈ�� ����° ��Ʈ�� ������ ��ȣ�� �ش�.
		// -3: ������ => �Ǽ����� ��ȣ��Ʈ�� ������ ��ȣ, 1+2 �������� ù��° ��Ʈ�� �ι�° ��Ʈ�� ������ ��ȣ�� �ش�.

		byte b; // 1byte(8bit)�� ������ �� �ִ� ����
		short s; // 2byte�� ������ �� �ִ� ����
		// ���� i�� ����� (������ ��ü�� Ÿ���� ���)
		int i; // 4byte�� ������ �� �ִ� ���� (�⺻����)
		long l; // 8byte�� ������ �� �ִ� ����
		char c; // ����ǥ(�ƽ�Ű�ڵ�, �����ڵ�)�� ��ȣ�� ����
		// �Ǽ��� �����ϴ� Ÿ��
		float f; // 4byte�� ǥ���ϴ� �Ǽ�: float 0.000314 => 3.14 * 10�� -4�� (�ε��Ҽ���)
		double d; // 8byte �Ǽ� (�⺻�Ǽ�)
		System.out.println(13.33); // double
		System.out.println(13); // int
		i = 320000000 * 320000000;
		System.out.println("320000000 * 320000000 = " + i);
		i = 2147483647 + 1;
		System.out.println("2147483647 + 1 = " + i);
		// -2147483648: ���� �⺻Ÿ���� ǥ���� �� �ִ� ������ ū ���� �����ϸ� ���� ���� �� ���� �������� ���Ѵ�.

		l = 9223372036854775807L + 1;
		System.out.println("9223372036854775807L + 1 = " + l);

		f = 13;
		System.out.println(f);
		f = 13.1212122131213f; // 13.121212 : �����η� ǥ���� �� ���� ���� ������.(�����ΰ� �۴�)(���������� ũ��)
		System.out.println(f);

		f = 1234597987484635453f;
//		f = 13546846878678746846845416546847684665f;  float �����η� ǥ���� �� ���� ���� ������ �� ����.
		System.out.println(f); // 1.23459804E18 : E18�� 10�� 17���� �ǹ�

		f = 68454565446848979413513f * 9999991245456413513f;
		System.out.println(f); // float�� �����ϱ⿡ ū ���� Infinity�� ��ȯ (������ -Infinity)

		d = 13.12345647845132154;
		System.out.println(d); // 13.123456478451322

		// JavaScript�� Number�� java�� double�� ����.

		boolean bool = true; // true: 1, false: 0 => 1bit data => �ڹٿ��� 8bit�� �����(�޸𸮸� 1byte�� �����ϰ� �ֱ� ����)

		// ���
		final int I = 30;
//		I = 20; // ���� ����� �� ���� data�� ������ �� ����. (�⺻�� data�� ���̶� �θ���. ��ü�� �ҷ��� ū ������ ������ ��ü�� ������ data�� �����ϴ� ������� ����)
		System.out.println(I);

		Integer objI = new Integer(30); // java�� �⺻���� ���������� �����ϴ� ���� �������� �ʴ´�.

		System.out.println(I == objI); // true

		String objStr = new String("hi");
		String literalStr = "hi";
		System.out.println(objStr == literalStr); // false

		Object obj = new Object();
		Object obj2 = new Object();
		System.out.println(obj == obj2); // false

		// == ����񱳰� ���ϴ°�
		// 1. ��ü�� ���� ������ ��(�ּҺ�) (�������� ������ ������ ���ο� ��ü�� ����� ������ ������ false)
		// 2. ���� ������ �� (���� �⺻�� => �� => ���� ������)

		System.out.println("20 == 20.0 : " + (20 == 20.0)); // �⺻��: ���� ��
		System.out.println(new String("�ȳ�") == new String("�ȳ�")); // ������: �ּҸ� ��(���� ���� ��ü���� ��)
		System.out.println("hi" == "hi"); // true ������ �߿� String�� ���� : ���ڿ��� ���ͷ��ϰ� ����� �⺻��ó�� ���ο� data�� ������ �ʰ� ���� ������ ����.
											// ���ͷ��ϰ� ������ �� ���ڿ��� ������ ���� ��ü��.
		
		// �������� �񱳿��� �ϴ� ��� => Object.equals(obj) ���� �ٸ� �� ��ü�� �������� �ʵ尡 ������ ���ƾ� �Ѵ�. (�ְ������� �ʵ��� ������ ��������) => �������ؾ� ����
		// String�� equals�� �������ϰ� �ִ�.
		System.out.println(new String("hihi").equals(new String("hihi"))); // true
	}

	public void print() {
	}

	@Override // ��� class�� Object�� �ڵ����� ����ϱ� ������ toString�� ������ �� �� �ִ�.
	public String toString() {
		return "������ ���� ����";
	}
}
