package java_study.co.kr.joongbu;
// ���α׷��ְ� ��ü�� Ÿ�� ����� ��������

// ��ü���� ������ ������� �ʰ� �ڵ����� ����
// ��ȹ: ��ɱ���(������, �ڷ� ������, ����, �����۰� ����â �۱� ... ���� -> method), ����� ���� (����, Ÿ�̾�, ������, �극��ũ, �Ǽ�, �ڵ� ... -> �ʵ�)
// field, property, attribute
// ����� �ְ� �����ϴ� ���� ��ü�� �ϰ� �̷� ��ü�� ���赵�� Ÿ���̶� �Ѵ�.

// ������ ����� �߰�: �Ҹ�

class engine {
	int gasoline;
	int bpm;
	sound s = new sound();

	class sound {
		String s = "�θ�";
	}
}

class BmwS3 extends engine {
	public String name = "BMW 3 �ø���";

	class wheel {
	}

	class tire {
	}

	class breakPadal {
		int press; // �ʵ�� �⺻���� �ִ�. �⺻���� 0, �������� null
	}

	class handle {
		int turn; // -���� +������
	}

	class engine {
		int gasoline;
		int bpm;
		sound s = new sound();

		class sound {
			String s = "������";
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
	public String name = "BMW 5 �ø���";

	class wheel {
	}

	class tire {
	}

	class breakPadal {
		int press; // �ʵ�� �⺻���� �ִ�. �⺻���� 0, �������� null
	}

	class handle {
		int turn; // -���� +������
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
