package java_study.co.kr.joongbu;

import java.util.Objects;

class PersonTest {
	String name;
	int age;

	public PersonTest(String name, int age) {
		this.name = name; // this: �ʵ�������
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // ������ ��ü����
			return true;
		if (obj == null) // ��ü�� null�� �� �� ����.
			return false;
		if (getClass() != obj.getClass()) // Ÿ���� ������
			return false;
		PersonTest other = (PersonTest) obj; // �θ��� Ÿ���� �����ϴ� ������ �ڽ��� Ÿ������ ����ȯ
		return age == other.age && Objects.equals(name, other.name); // �ʵ尡 ������
	}

}

public class L02Equals {
	public static void main(String[] args) {

		PersonTest p1 = new PersonTest("�ڼ���", 24);
		PersonTest p2 = new PersonTest("�ڼ���", 24);

		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
	}
}
