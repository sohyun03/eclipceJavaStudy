package java_study.co.kr.joongbu;
// 프로그래밍과 객체와 타입 재사용과 유지보수

// 객체지향 문법을 사용하지 않고 자동차를 구현
// 계획: 기능구현(앞으로, 뒤로 움직임, 멈춤, 와이퍼가 유리창 닦기 ... 동작 -> method), 재원을 정의 (바퀴, 타이어, 와이퍼, 브레이크, 악셀, 핸들 ... -> 필드)
// field, property, attribute
// 재원이 있고 동작하는 것을 객체라 하고 이런 객체의 설계도를 타입이라 한다.

// 엔진엔 기능을 추가: 소리

class engine {
	int gasoline;
	int bpm;
	sound s = new sound();

	class sound {
		String s = "부릉";
	}
}

class BmwS3 extends engine {
	public String name = "BMW 3 시리즈";

	class wheel {
	}

	class tire {
	}

	class breakPadal {
		int press; // 필드는 기본값이 있다. 기본형은 0, 참조형은 null
	}

	class handle {
		int turn; // -왼쪽 +오른쪽
	}

	class engine {
		int gasoline;
		int bpm;
		sound s = new sound();

		class sound {
			String s = "덜덜덜";
		}
	}

	class accelerater {
		int press;
	}

	public void move() {
	}

	public void turn() {
	}

	public void stop() {
	}
}

class BmwS5 {
	public String name = "BMW 5 시리즈";

	class wheel {
	}

	class tire {
	}

	class breakPadal {
		int press; // 필드는 기본값이 있다. 기본형은 0, 참조형은 null
	}

	class handle {
		int turn; // -왼쪽 +오른쪽
	}

	class engine {
		int gasoline;
		int bpm;
		sound s = new sound();

		class sound {

		}
	}

	class accelerater {
		int press;
	}

	public void move() {
	}

	public void turn() {
	}

	public void stop() {
	}
}

public class L04Extends {
	public static void main(String[] args) {

	}
}
