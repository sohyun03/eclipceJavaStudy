package java_study.co.kr.joongbu;

class ObjectA {
	String a = "ObjectA.a �Դϴ�.";
}

class ObjectB extends ObjectA {
	String b = "ObjectB.b �Դϴ�.";
}

class ObjectC extends ObjectB {
	String c = "ObjectC.c �Դϴ�.";
}

// ��ӹ��� Ÿ���� �ڽ��̶� �ϰ� ����� �� Ÿ���� �θ�� �Ѵ�.
public class L05ExtendsAndType {
	public static void main(String[] args) {
		// ����� Ÿ���� �������� �����.
		ObjectC c = new ObjectC();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);

		ObjectB b = c; // ObjectB �� ������ �� �ִ� �ʵ常 ���� ����
		System.out.println(b.a);
		System.out.println(b.b);
//		System.out.println(b.c);

		ObjectA a = c;
		System.out.println(a.a);
//		System.out.println(a.b);
//		System.out.println(a.c);

		// c�� �����ϴ� ��ü�� �پ��� ���ϱ�? => ���� ��ü�� �״�ΰ� �θ��� Ÿ�Ը�ŭ�� ����

		Object o = c;
//		System.out.println(o.a);
//		System.out.println(o.b);
//		System.out.println(o.c);

		ObjectC o_c = (ObjectC) o; // ĳ���� ����ȯ

		if (o instanceof String) {
			String s_o = (String) o; // ��ü�� ������� Ÿ������ ĳ���� ����ȯ�ϸ� ����(�����Ͻ� �߰ߵ��� �ʴ� �ɰ��ѿ���)�� �߻�! => ���൵�߿� ������ �߻��ϸ� ������ �����.
		}

		try {
			String s_o = (String) o;
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
//		int i = (int)"���ڿ�"; // ������ �־ �������� �� ����. => �̸� ������ �߰��ؼ� ������ �������� ����
		// ������ �Ǵ� ����� ����: ������ �ִ� �ڵ带 �������� �ʴ´�.
	}
}
