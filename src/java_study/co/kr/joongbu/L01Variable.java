package java_study.co.kr.joongbu;

import java.util.ArrayList;

// class 이름 규칙: 파스칼 표기법(이름 표기할 때 사용), 숫자로 시작하면 안됨
public class L01Variable {
	// 메소드 이름 규칙: 카멜표기법 사용, 숫자로 시작하면 안된다.
	// main 메소드 규칙: public(어디서든 접근 가능), static(정적인 jvm < jre (jre가 jvm 포함) 스택에서
	// 참조됨), void (반환되는 것이 없음), args (main이 실행될 때 지정되는 기본값)

	public static void main(String[] args) { // 파라미터(매개변수)

		String[] arr = { "a", "b", "c" }; // array 배열
		System.out.println(arr.length);
		System.out.println(arr.toString()); // Object.toString() : 객체의 주소정보 (객체에 대한 정보를 재정의 하기를 기대하는 함수)
		// java.lang.Object: 모든 객체의 부모(모든 타입이 객체가 될 수 있는 정보를 포함 => 클래스의 생성자를 new 연산자로
		// 호출해서 객체를 생성할 수 있게 해준다.)
		ArrayList<String> list = new ArrayList<String>(); // list 배열
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list.toString()); // List.toString()는 Object.toString()를 재정의
		System.out.println(list.size());
		System.out.println(list.contains("c"));

		L01Variable l01Variable = new L01Variable();
		System.out.println(l01Variable); // toString은 생략가능
		System.out.println(l01Variable.toString());
		// @Override: 부모의 필드를 재정의 하는 것 (다형성: 한 개의 이름이 역할을 많이 갖는 것)
		// 자식은 부모의 모든 필드를 물려받지만 재정의 된 필드가 우선순위를 갖는다.

		// 오버로드: 메소드이름이 같지만 매개변수가 다른것 (다형성: 한 개의 이름이 역할을 많이 갖는 것)

		// 타입의 다형성: 한개의 객체가 여러 타입에 참조 가능(다형성)
		String hello = "안녕";
		Object o = hello; // o는 Object 타입의 객체만 참조 가능, 부모가 Object인 객체를 참조가능(타입의 다형성 => 형변환)

		// 0 (정기적 신호가 있음) or 1 (정기적 신호가 없음)
		// 2진수와 16진수 -> 1byte(8bit)
		// 메모리가 가장 작은 단위는 1bit를 8개씩 1byte로 나눈다.
		// -+(부호비트) 7bit로 2진수를 표기 2^0, 2^1, 2^2, 2^3, ... 2^6 => 수는 약속
		// 5: 4+1 첫번째 비트(2^0)와 3번째 비트(2^2)에 전기적 신호를 준다.

		// 부동소수점으로 표기하는 실수
		// 0.005 (고정소수점 표기) => 5.0 * 10^-3 (부동 소수점)
		// +(-): 부호비트
		// 5: 가수부 => 첫번째 비트와 세번째 비트에 전기적 신호를 준다.
		// -3: 지수부 => 실수부의 부호비트에 정기적 신호, 1+2 지수부의 첫번째 비트와 두번째 비트에 전기적 신호를 준다.

		byte b; // 1byte(8bit)로 참조할 수 있는 정수
		short s; // 2byte로 참조할 수 있는 정수
		// 변수 i가 선언됨 (참조할 객체의 타입을 명시)
		int i; // 4byte로 참조할 수 있는 정수 (기본정수)
		long l; // 8byte로 참조할 수 있는 정수
		char c; // 문자표(아스키코드, 유니코드)의 번호를 참조
		// 실수를 참조하는 타입
		float f; // 4byte로 표기하는 실수: float 0.000314 => 3.14 * 10의 -4승 (부동소수점)
		double d; // 8byte 실수 (기본실수)
		System.out.println(13.33); // double
		System.out.println(13); // int
		i = 320000000 * 320000000;
		System.out.println("320000000 * 320000000 = " + i);
		i = 2147483647 + 1;
		System.out.println("2147483647 + 1 = " + i);
		// -2147483648: 정수 기본타입은 표현할 수 있는 수보다 큰 수를 참조하면 가장 작은 수 부터 나머지를 더한다.

		l = 9223372036854775807L + 1;
		System.out.println("9223372036854775807L + 1 = " + l);

		f = 13;
		System.out.println(f);
		f = 13.1212122131213f; // 13.121212 : 가수부로 표현할 수 없는 수는 버린다.(가수부가 작다)(오차범위가 크다)
		System.out.println(f);

		f = 1234597987484635453f;
//		f = 13546846878678746846845416546847684665f;  float 지수부로 표현할 수 없는 수는 참조할 수 없다.
		System.out.println(f); // 1.23459804E18 : E18는 10의 17승을 의미

		f = 68454565446848979413513f * 9999991245456413513f;
		System.out.println(f); // float로 참조하기에 큰 수는 Infinity를 반환 (음수면 -Infinity)

		d = 13.12345647845132154;
		System.out.println(d); // 13.123456478451322

		// JavaScript의 Number는 java의 double과 같다.

		boolean bool = true; // true: 1, false: 0 => 1bit data => 자바에서 8bit를 사용함(메모리를 1byte로 구성하고 있기 때문)

		// 상수
		final int I = 30;
//		I = 20; // 최초 선언된 값 외의 data를 참조할 수 없다. (기본형 data를 값이라 부른다. 객체라 불러도 큰 문제는 없으나 객체를 참조형 data로 구분하는 사람들이 있음)
		System.out.println(I);

		Integer objI = new Integer(30); // java는 기본형을 참조형으로 선언하는 것을 권장하지 않는다.

		System.out.println(I == objI); // true

		String objStr = new String("hi");
		String literalStr = "hi";
		System.out.println(objStr == literalStr); // false

		Object obj = new Object();
		Object obj2 = new Object();
		System.out.println(obj == obj2); // false

		// == 동등비교가 비교하는것
		// 1. 객체가 같은 것인지 비교(주소비교) (참조형은 선언할 때마다 새로운 객체를 만들기 때문에 무조건 false)
		// 2. 값이 같은지 비교 (값은 기본형 => 수 => 수가 같은지)

		System.out.println("20 == 20.0 : " + (20 == 20.0)); // 기본형: 값을 비교
		System.out.println(new String("안녕") == new String("안녕")); // 참조형: 주소를 비교(완전 같은 객체인지 비교)
		System.out.println("hi" == "hi"); // true 참조형 중에 String만 예외 : 문자열을 리터럴하게 선언시 기본형처럼 새로운 data를 만들지 않고 기존 데이터 참조.
											// 리터럴하게 선언한 두 문자열은 완전히 같은 객체다.
		
		// 참조형을 비교연산 하는 방법 => Object.equals(obj) 서로 다른 두 객체가 같으려면 필드가 완전히 같아야 한다. (주관적으로 필드의 범위를 지정가능) => 재정의해야 가능
		// String의 equals를 재정의하고 있다.
		System.out.println(new String("hihi").equals(new String("hihi"))); // true
	}

	public void print() {
	}

	@Override // 모든 class는 Object를 자동으로 상속하기 때문에 toString을 재정의 할 수 있다.
	public String toString() {
		return "변수에 대한 수업";
	}
}
