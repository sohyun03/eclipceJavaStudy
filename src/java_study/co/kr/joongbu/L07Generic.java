package java_study.co.kr.joongbu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class GenericTest<T> {
	T name; // �⺻���� Object (��� ��ü�� ������ �� �ֱ� ����)

	public GenericTest(T name) {
		this.name = name;
	}
}

interface Carable {}

class Qm3 implements Carable {
	@Override
	public String toString() {
		return "����Ｚ�� qm3";
	}
}

class Qm5 implements Carable {
}

// Carable�� �θ��� Ÿ�Ը� ���׸����� ���� ����
class CarInfo<T extends Carable> {
	T car;

	public void print() {
		System.out.println(car.getClass() + ": " + car.toString());
	}
}

public class L07Generic {

	public static void main(String[] args) {

		Qm3 qm3 = new Qm3();
		Qm5 qm5 = new Qm5();
		CarInfo carInfo = new CarInfo();
		carInfo.car = qm3;
		// carInfo.car = "dd";
		carInfo.print();

//		----------------------------------------------------------------------------------------------

		GenericTest a = new GenericTest("����");
		System.out.println(a.name);
		GenericTest<Integer> a2 = new GenericTest<Integer>(200);
		System.out.println(a2.name);
		GenericTest<Integer> a3 = new GenericTest<Integer>(null);
		System.out.println(a3.name); // �⺻���� ���� Ŭ������ �������̱� ������ null�� ����� �� �ִ�.

//		-----------------------------------------------------------------------------------------------

		List<Integer> list = new ArrayList<Integer>(); // �⺻���� ���׸����� ����� �� ����.
//		list.add("1");
//		Integer�� int�� ���� Ŭ����
//		�⺻���� ���� Ŭ������ �ϴ� �� (Byte, Short, Integer, Long, Float, Double, Character(�ƽ�Ű�ڵ������ϸ� 1byte, �����ڵ������ϸ� 2byte))
//		1. ����ȯ Integer.parseInt("13");
//		2. �⺻������ Ÿ���� ������ ���� Integer.MAX_VALUE
//		3. ���׸� Ÿ������ ���ȴ�.
		list.add(1);
		list.add(20);
		System.out.println(list);

		Object[] birthArr = { 1986, "2000", 1990.0, 2002f, 1900l }; // �¾ ����
		int now = 2022;
		Object[] ageArr = new Object[5];
		for (int i = 0; i < birthArr.length; i++) {
//			ageArr[i] = (now - (int) birthArr[i]);
		}
		List birthList = new ArrayList();
		birthList.add(1986);
		birthList.add("2000");
		birthList.add(1990.0);
		birthList.add(2002f);

		for (int i = 0; i < birthList.size(); i++) {
			try {
				int age = now - (int) birthList.get(i); // �����Ͻ� �߰ߵ��� �ʴ� �ɰ��� ����

			} catch (Exception e) {
			}
		}
		List<Integer> birthList2 = new ArrayList<Integer>();
		birthList2.add(1986);
//		birthList2.add("2000");
//		birthList2.add(1990.0);
//		birthList2.add(2002f);
//		���׸��� ����ϸ� ������ �ʵ�� ������ �� �ִ�.

//		List�� Array�� Key: index (������ �ִ�)
//		Map���� Key: �ߺ����� �ʴ� � ���̵� ����(Set)
		Map<Integer, String> person = new HashMap<Integer, String>();
		person.put(1986, "�ְ��");
		person.put(1986, "ȫ�浿");
		person.put(1995, "Daniel");
		person.put(1970, "Rose");
		System.out.println(person);
		// key�� �ߺ��� �� ���� Set Ÿ���̱� ������ "�ְ��"�� "ȫ�浿"���� ��������
		// Map�� �ڷᱸ���� ������ ����.
		System.out.println(person.get(1970));

		Set<Integer> set = new HashSet<Integer>(); // �ߺ��� ������ �ʴ� ������ ���� �ڷᱸ��
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(20);
		set.add(20);
		set.add(10);
		set.add(50);
		System.out.println(set);
	}


}
