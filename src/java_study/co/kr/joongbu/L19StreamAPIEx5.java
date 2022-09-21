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
		
		// set: 필드에 값을 지정하는 행위
		// get: 필드의 값을 반환하는 행위
		// 캡슐화: 객체의 필드를 접근지정자와 get함수, set함수, 생성자로 접근을 제한하는 행위
		
		// 외부에서 필드를 접근할 수 있게 생성한 함수
		// get set 함수는 디자인패턴(구조, 형식)으로 개발자들이 사용하다가 너무 보기 좋아 약속으로 만든 것
		// get set을 필드를 정의하는 객체를 VO DTO(VariableObject DataTransferObject)라고 한다.
		
		// 디자인 패턴과 ModelViewController => Spring
		
		// 캡슐화에 대해 아는 만큼 설명하라, 
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
		studentList.add(out.new Student("나자바", true, 1, 1, 300));
		studentList.add(out.new Student("김지미", false, 1, 1, 250));
		studentList.add(out.new Student("김자바", true, 1, 1, 200));
		studentList.add(out.new Student("이지미", false, 1, 2, 150));
		studentList.add(out.new Student("남자바", true, 1, 2, 100));
		studentList.add(out.new Student("안지미", false, 1, 2, 50));
		studentList.add(out.new Student("황지미", false, 1, 3, 100));
		studentList.add(out.new Student("강지미", false, 1, 3, 150));

		studentList.add(out.new Student("나자바", true, 2, 1, 300));
		studentList.add(out.new Student("김지미", false, 2, 1, 250));
		studentList.add(out.new Student("김자바", true, 2, 1, 200));
		studentList.add(out.new Student("이지미", false, 2, 2, 150));
		studentList.add(out.new Student("남자바", true, 2, 2, 100));
		studentList.add(out.new Student("안지미", false, 2, 2, 50));
		studentList.add(out.new Student("황지미", false, 2, 3, 100));
		studentList.add(out.new Student("강지미", false, 2, 3, 150));

		studentList.add(out.new Student("나자바", true, 3, 1, 300));
		studentList.add(out.new Student("김지미", false, 3, 1, 250));
		studentList.add(out.new Student("김자바", true, 3, 1, 200));
		studentList.add(out.new Student("이지미", false, 3, 2, 150));
		studentList.add(out.new Student("남자바", true, 3, 2, 100));
		studentList.add(out.new Student("안지미", false, 3, 2, 50));
		studentList.add(out.new Student("황지미", false, 3, 3, 100));
		studentList.add(out.new Student("강지미", false, 3, 3, 150));

		// 1학년 남자들의 점수
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
			
		// 2학년 여자들의 점수
		// 1학년의 남자 여자의 수를 collect로 구현하세요!
		// 1학년을 남자 여자 그룹으로 나누고 다시 통과(score >= 150)와 낙제 그룹으로 나누세요. partitioningBy 사용
		// 1학년 남자, 여자 그룹의 평균 점수를 구하세요
		// 각 학년별 남자, 여자 그룹의 점수가 가장 높은 사람을 구하세요 // 집계함수 사용
		// 2학년을 남자, 여자의 그룹으로 나누고 다시 통과한 사람과 낙제 한 사람의 수를 구하세요
		// 모든 학년을 그룹으로 나누고 학년 마다 남자와 여자 그룹의 수를 구하세요
		// 모든 학년을 그룹으로 나누고 학년 마다 반 그룹으로 나누세요.
		
	}
}
