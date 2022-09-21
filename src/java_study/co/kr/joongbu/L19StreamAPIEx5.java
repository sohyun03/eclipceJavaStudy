package java_study.co.kr.joongbu;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class L19StreamAPIEx5 {

	class Student {
		private String name;
		private boolean isMale;
		private int hak;
		private int ban;
		private int score;

		public Student(String name, boolean isMale, int hak, int ban, int score) {
			this.name = name;
			this.isMale = isMale;
			this.hak = hak;
			this.ban = ban;
			this.score = score;
		}
		
		// set: �ʵ忡 ���� �����ϴ� ����
		// get: �ʵ��� ���� ��ȯ�ϴ� ����
		// ĸ��ȭ: ��ü�� �ʵ带 ���������ڿ� get�Լ�, set�Լ�, �����ڷ� ������ �����ϴ� ����
		
		// �ܺο��� �ʵ带 ������ �� �ְ� ������ �Լ�
		// get set �Լ��� ����������(����, ����)���� �����ڵ��� ����ϴٰ� �ʹ� ���� ���� ������� ���� ��
		// get set�� �ʵ带 �����ϴ� ��ü�� VO DTO(VariableObject DataTransferObject)��� �Ѵ�.
		
		// ������ ���ϰ� ModelViewController => Spring
		
		// ĸ��ȭ�� ���� �ƴ� ��ŭ �����϶�, 
		public String getName() {
			return name;
		}

		public boolean isMale() {
			return isMale;
		}

		public int getHak() {
			return hak;
		}

		public int getBan() {
			return ban;
		}

		public int getScore() {
			return score;
		}

		@Override
		public String toString() {
			return "{" + name + "," + isMale + "," + hak + "," + ban + "," + score + "}";
		}
	}

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		L19StreamAPIEx5 out = new L19StreamAPIEx5();
		studentList.add(out.new Student("���ڹ�", true, 1, 1, 300));
		studentList.add(out.new Student("������", false, 1, 1, 250));
		studentList.add(out.new Student("���ڹ�", true, 1, 1, 200));
		studentList.add(out.new Student("������", false, 1, 2, 150));
		studentList.add(out.new Student("���ڹ�", true, 1, 2, 100));
		studentList.add(out.new Student("������", false, 1, 2, 50));
		studentList.add(out.new Student("Ȳ����", false, 1, 3, 100));
		studentList.add(out.new Student("������", false, 1, 3, 150));

		studentList.add(out.new Student("���ڹ�", true, 2, 1, 300));
		studentList.add(out.new Student("������", false, 2, 1, 250));
		studentList.add(out.new Student("���ڹ�", true, 2, 1, 200));
		studentList.add(out.new Student("������", false, 2, 2, 150));
		studentList.add(out.new Student("���ڹ�", true, 2, 2, 100));
		studentList.add(out.new Student("������", false, 2, 2, 50));
		studentList.add(out.new Student("Ȳ����", false, 2, 3, 100));
		studentList.add(out.new Student("������", false, 2, 3, 150));

		studentList.add(out.new Student("���ڹ�", true, 3, 1, 300));
		studentList.add(out.new Student("������", false, 3, 1, 250));
		studentList.add(out.new Student("���ڹ�", true, 3, 1, 200));
		studentList.add(out.new Student("������", false, 3, 2, 150));
		studentList.add(out.new Student("���ڹ�", true, 3, 2, 100));
		studentList.add(out.new Student("������", false, 3, 2, 50));
		studentList.add(out.new Student("Ȳ����", false, 3, 3, 100));
		studentList.add(out.new Student("������", false, 3, 3, 150));

		// 1�г� ���ڵ��� ����
		/*Optional<Integer> sumM = studentList.stream()
				.filter(m -> m.isMale == true && m.getHak() == 1)
				.map((m) -> m.score)
				.reduce((m1, m2) -> m1 + m2);
		System.out.println(sumM.get()); */
		
		Optional<String> sumM = studentList.stream()
				.filter(m -> m.isMale == true && m.getHak() == 1)
				.map((m) -> m.score + "")
				.reduce((m1, m2) -> m1 + ", " + m2);
		System.out.println(sumM.get());
			
		// 2�г� ���ڵ��� ����
		// 1�г��� ���� ������ ���� collect�� �����ϼ���!
		// 1�г��� ���� ���� �׷����� ������ �ٽ� ���(score >= 150)�� ���� �׷����� ��������. partitioningBy ���
		// 1�г� ����, ���� �׷��� ��� ������ ���ϼ���
		// �� �г⺰ ����, ���� �׷��� ������ ���� ���� ����� ���ϼ��� // �����Լ� ���
		// 2�г��� ����, ������ �׷����� ������ �ٽ� ����� ����� ���� �� ����� ���� ���ϼ���
		// ��� �г��� �׷����� ������ �г� ���� ���ڿ� ���� �׷��� ���� ���ϼ���
		// ��� �г��� �׷����� ������ �г� ���� �� �׷����� ��������.
		
	}
}
