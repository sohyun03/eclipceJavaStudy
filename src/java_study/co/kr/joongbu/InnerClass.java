package java_study.co.kr.joongbu;

import java.util.*; // 개발에 유용한 클래스 집합
import java.util.ArrayList; // HashMap.. 컬렉션 프레임워크(유용한 자료구조)

public class InnerClass {
	// class생성: java -> class로 컴파일 (javac)
	// 패키지 생성: 클래스의 고유 이름을 제공
	// public class : java 문서와 동일한 이름의 class, 다른 패키지에서 import 해서 사용가능한 class
	// main 메소드 (앱): jre를 호출해서 작성한 코드를 순서대로 실행 => 순차적 언어
	public static void main(String[] args) {

		System.out.println("하이");
		java.lang.String s = "hi";
		java.lang.Integer i = 13; // 랩퍼클래스

		int i2 = 2;
		int i3 = 2;
		int i4 = 2;

		char[] arrC = { 'a', 'b', 'c', 'd' }; // 배열(리터럴하게 선언가능) => 참조형
		char[] arrC2 = new char[5]; // {0,0,0,0,0}
		Character[] arrC3 = new Character[3]; // {null, null, null}
		String s3 = "abcd"; // 마치 기본형처럼 선언되지만 문자의 배열이기 때문에 참조형

		// 기본형(원시형) 데이터 타입 (Primitive type)의 특징 (기계와 가까울수록 원시적) -> 면접 단골
		// 1. 원시형데이터 int i = 4; => 메모리 4byte 공간을 할당(주소) 부호, 2^0, 2^1, 2^2 ... 2^30 => 데이터 원본
		// 2. 리터럴하게 선언 (문자그대로) : 대부분 수와 관련되어 있기 때문, 자주 사용하기 때문
		// 3. 스택 메모리에 생성됨 : 자주 사용하기 때문 (i2~4까지 같은 2를 참조)

		// 참조형 데이터 타입의 특징
		Object o = new Object();
		// 1. {"경민", "길동", "둘리"} data를 참조하고 있어서 참조형 데이터 타입니다.
		// 2. new 연산자로 생성자를 호출하면 참조형 데이터(객체) 생성 (class와 동일한 이름을 갖는 존재)
		// 3. 객체는 힙 메모리에 생성 (가비지 컬렉션에 의해 정리 => 포인터가 필요가 없음) => 인스턴스 객체

		Jung j = new Jung();

	}
}

class Jung {
	// 전역에 선언하는 것은 필드가 된다. (객체가 참조하는 data)
	String name = "Jung";
	String[] hands = {};
	int bitrh = 1990;
}
