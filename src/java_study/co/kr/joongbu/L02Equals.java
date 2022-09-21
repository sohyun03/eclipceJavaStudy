package java_study.co.kr.joongbu;

import java.util.Objects;

class PersonTest {
	String name;
	int age;

	public PersonTest(String name, int age) {
		this.name = name; // this: 필드접근자
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 동일한 객체인지
			return true;
		if (obj == null) // 객체는 null이 될 수 없다.
			return false;
		if (getClass() != obj.getClass()) // 타입이 같은지
			return false;
		PersonTest other = (PersonTest) obj; // 부모의 타입을 찹조하는 변수를 자식의 타입으로 형변환
		return age == other.age && Objects.equals(name, other.name); // 필드가 같은지
	}

}

public class L02Equals {
	public static void main(String[] args) {

		PersonTest p1 = new PersonTest("박소현", 24);
		PersonTest p2 = new PersonTest("박소현", 24);

		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
	}
}
