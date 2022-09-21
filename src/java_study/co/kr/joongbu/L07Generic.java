package java_study.co.kr.joongbu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class GenericTest<T> {
	T name; // 기본값은 Object (모든 객체를 참조할 수 있기 때문)

	public GenericTest(T name) {
		this.name = name;
	}
}

interface Carable {}

class Qm3 implements Carable {
	@Override
	public String toString() {
		return "르노삼성의 qm3";
	}
}

class Qm5 implements Carable {
}

// Carable이 부모인 타입만 제네릭으로 지정 가능
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

		GenericTest a = new GenericTest("하이");
		System.out.println(a.name);
		GenericTest<Integer> a2 = new GenericTest<Integer>(200);
		System.out.println(a2.name);
		GenericTest<Integer> a3 = new GenericTest<Integer>(null);
		System.out.println(a3.name); // 기본형의 랩퍼 클래스는 참조형이기 때문에 null을 사용할 수 있다.

//		-----------------------------------------------------------------------------------------------

		List<Integer> list = new ArrayList<Integer>(); // 기본형은 제네릭으로 사용할 수 없다.
//		list.add("1");
//		Integer는 int의 랩퍼 클래스
//		기본형의 랩퍼 클래스가 하는 일 (Byte, Short, Integer, Long, Float, Double, Character(아스키코드참조하면 1byte, 유니코드참조하면 2byte))
//		1. 형변환 Integer.parseInt("13");
//		2. 기본데이터 타입의 정보를 포함 Integer.MAX_VALUE
//		3. 제네릭 타입으로 사용된다.
		list.add(1);
		list.add(20);
		System.out.println(list);

		Object[] birthArr = { 1986, "2000", 1990.0, 2002f, 1900l }; // 태어난 날만
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
				int age = now - (int) birthList.get(i); // 컴파일시 발견되지 않는 심각한 오류

			} catch (Exception e) {
			}
		}
		List<Integer> birthList2 = new ArrayList<Integer>();
		birthList2.add(1986);
//		birthList2.add("2000");
//		birthList2.add(1990.0);
//		birthList2.add(2002f);
//		제네릭을 사용하면 정수만 필드로 참조할 수 있다.

//		List와 Array의 Key: index (순서가 있는)
//		Map에서 Key: 중복되지 않는 어떤 것이든 가능(Set)
		Map<Integer, String> person = new HashMap<Integer, String>();
		person.put(1986, "최경민");
		person.put(1986, "홍길동");
		person.put(1995, "Daniel");
		person.put(1970, "Rose");
		System.out.println(person);
		// key는 중복될 수 없는 Set 타입이기 때문에 "최경민"을 "홍길동"으로 재정의함
		// Map의 자료구조는 순서가 없다.
		System.out.println(person.get(1970));

		Set<Integer> set = new HashSet<Integer>(); // 중복이 허용되지 않는 순서가 없는 자료구조
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
