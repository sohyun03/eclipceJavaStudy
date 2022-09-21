package java_study.co.kr.joongbu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class L18StreamAPIEx4 {

	public static void main(String[] args) {

		// Stream ���� ���� ����
		// forEach(Consumer): ���
		// reduce(BinaryOperator): �Ҹ�(��ҵ��� 1���� ����� ���δ�.)
		// sum(), average(): ���� �Ҹ�(�⺻��)
		// count(), max, min(�⺻��), max, min(������ sort): ����, ��� ����

		// any, all, none, Match(): �˻�(�߰����� filter ������)

		// collect(): ���� (�ְ����� map�� ����)

		int[] scoreArrCKM = { 88, 50, 70, 100, 30, 90 };
		int[] scoreArrHKD = { 90, 100, 99, 100, 85, 92 };

		// �������� ���α׷�
		// ���б� ����� 2���� �ִµ� ��� ������ ������ 80�̻��̾�� ���б��� ���´�. (�˻���� �����ϼ���)

		long c = Arrays.stream(scoreArrCKM).filter((s) -> s < 80).count();
		System.out.println("�ְ�ξ��� ������ 80�� ������ ������ ��: " + c);

		boolean test = Arrays.stream(scoreArrCKM).allMatch(s -> s >= 80);

		System.out.println("�ְ�ξ��� ������ ��� 80�̻��ΰ���? " + test);

		test = Arrays.stream(scoreArrHKD).allMatch(s -> s >= 80);
		System.out.println("ȫ�浿���� ������ ��� 80�̻��ΰ���? " + test);

		// 1���� 60�� �̸��� ������ ������ ���б� ��󿡼� Ż��
		test = Arrays.stream(scoreArrCKM).anyMatch(s -> s < 60);
		System.out.println("�ְ�ξ��� ������ 60 �̸��� ���� 1���� �ֳ���? " + test);

		Stream stream = Stream.of("a", 1, "b", 33.9, "c", "d"); // (Object ... value): �Ű������� �� ������ ���� �����
		Stream<String> stream2 = Stream.of("15", "1", "33", "33", "7", "-50");
		ArrayList<Integer> strList = stream2
				.map(s -> Integer.parseInt(s))
				.collect(Collectors.toCollection(() -> new ArrayList<Integer>()));
//				.map(Integer::parseInt) // ������ �ٲ۴�.
//				.collect(Collectors.toCollection(ArrayList<Integer>::new));
		System.out.println(strList);
		
//		stream2.forEach(System.out::println); // Stream�� ���⼺�� �ִ� �ڷᱸ���� �ѹ� ����ϸ� �ٽ� ��� �Ҵ�
		
		Stream<String> stream3 = Stream.of("15", "1", "33", "33", "7", "-50");
		int sum = stream3.collect(Collectors.summingInt((str) -> Integer.parseInt(str)));
		
		System.out.println(sum);
	}

}
