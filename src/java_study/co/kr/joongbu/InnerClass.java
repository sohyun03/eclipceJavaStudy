package java_study.co.kr.joongbu;

import java.util.*; // ���߿� ������ Ŭ���� ����
import java.util.ArrayList; // HashMap.. �÷��� �����ӿ�ũ(������ �ڷᱸ��)

public class InnerClass {
	// class����: java -> class�� ������ (javac)
	// ��Ű�� ����: Ŭ������ ���� �̸��� ����
	// public class : java ������ ������ �̸��� class, �ٸ� ��Ű������ import �ؼ� ��밡���� class
	// main �޼ҵ� (��): jre�� ȣ���ؼ� �ۼ��� �ڵ带 ������� ���� => ������ ���
	public static void main(String[] args) {

		System.out.println("����");
		java.lang.String s = "hi";
		java.lang.Integer i = 13; // ����Ŭ����

		int i2 = 2;
		int i3 = 2;
		int i4 = 2;

		char[] arrC = { 'a', 'b', 'c', 'd' }; // �迭(���ͷ��ϰ� ���𰡴�) => ������
		char[] arrC2 = new char[5]; // {0,0,0,0,0}
		Character[] arrC3 = new Character[3]; // {null, null, null}
		String s3 = "abcd"; // ��ġ �⺻��ó�� ��������� ������ �迭�̱� ������ ������

		// �⺻��(������) ������ Ÿ�� (Primitive type)�� Ư¡ (���� �������� ������) -> ���� �ܰ�
		// 1. ������������ int i = 4; => �޸� 4byte ������ �Ҵ�(�ּ�) ��ȣ, 2^0, 2^1, 2^2 ... 2^30 => ������ ����
		// 2. ���ͷ��ϰ� ���� (���ڱ״��) : ��κ� ���� ���õǾ� �ֱ� ����, ���� ����ϱ� ����
		// 3. ���� �޸𸮿� ������ : ���� ����ϱ� ���� (i2~4���� ���� 2�� ����)

		// ������ ������ Ÿ���� Ư¡
		Object o = new Object();
		// 1. {"���", "�浿", "�Ѹ�"} data�� �����ϰ� �־ ������ ������ Ÿ�Դϴ�.
		// 2. new �����ڷ� �����ڸ� ȣ���ϸ� ������ ������(��ü) ���� (class�� ������ �̸��� ���� ����)
		// 3. ��ü�� �� �޸𸮿� ���� (������ �÷��ǿ� ���� ���� => �����Ͱ� �ʿ䰡 ����) => �ν��Ͻ� ��ü

		Jung j = new Jung();

	}
}

class Jung {
	// ������ �����ϴ� ���� �ʵ尡 �ȴ�. (��ü�� �����ϴ� data)
	String name = "Jung";
	String[] hands = {};
	int bitrh = 1990;
}
