package java_study.co.kr.joongbu;

class ObjectA {
	String a = "ObjectA.a 입니다.";
}

class ObjectB extends ObjectA {
	String b = "ObjectB.b 입니다.";
}

class ObjectC extends ObjectB {
	String c = "ObjectC.c 입니다.";
}

// 상속받은 타입을 자식이라 하고 상속을 한 타입을 부모라 한다.
public class L05ExtendsAndType {
	public static void main(String[] args) {
		// 상속은 타입의 다형성을 만든다.
		ObjectC c = new ObjectC();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);

		ObjectB b = c; // ObjectB 가 참조할 수 있는 필드만 접근 가능
		System.out.println(b.a);
		System.out.println(b.b);
//		System.out.println(b.c);

		ObjectA a = c;
		System.out.println(a.a);
//		System.out.println(a.b);
//		System.out.println(a.c);

		// c가 참조하는 객체가 줄어드는 것일까? => ㄴㄴ 객체는 그대로고 부모의 타입만큼만 참조

		Object o = c;
//		System.out.println(o.a);
//		System.out.println(o.b);
//		System.out.println(o.c);

		ObjectC o_c = (ObjectC) o; // 캐스팅 형변환

		if (o instanceof String) {
			String s_o = (String) o; // 객체와 상관없는 타입으로 캐스팅 형변환하면 오류(컴파일시 발견되지 않는 심각한오류)가 발생! => 실행도중에 오류가 발생하면 어플이 멈춘다.
		}

		try {
			String s_o = (String) o;
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
//		int i = (int)"문자열"; // 오류가 있어서 컴파일할 수 없다. => 미리 오류를 발견해서 입으로 배포하지 않음
		// 컴파일 되는 언어의 장점: 오류가 있는 코드를 배포하지 않는다.
	}
}
