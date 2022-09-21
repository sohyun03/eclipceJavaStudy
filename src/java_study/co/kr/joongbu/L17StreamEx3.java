package java_study.co.kr.joongbu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L17StreamEx3 {

	public static void main(String[] args) {

		/*
		 * Stream�� �߰� ���� sort(): stream �ڷḦ ����
		 */

		// Array �迭�� �⺻�� �Ǵ� Ÿ��: �ʵ尡 Index ���� �ڷ���
		int[] numAr = {};

		// List �迭�� �����ϱ� ���� �ڷ���: �ʵ尡 Index�� ��� ������ �Լ��� ����, �迭�� �������� �߰� ���� ����(���� ���氡��)
		List<Integer> numList = new ArrayList<>();
		numList.add(99);
		numList.add(99);
		numList.add(99);
		numList.add(99);
		numList.sort(null); // �⺻���� �������� ����(�迭 �ڽ��� �����ϴ� �Լ�)
		System.out.println(numList);

		int[] numArr2 = { 99, -1, 5, 2, 33, -7 };
		// Stream �ڷ����� ��ǥ�� ��� �ڷ����� �ݺ����� ����

		Arrays.stream(numArr2).sorted().forEach(System.out::println);

		String[] strArr = { "aaa", "Bbb", "zzz", "Bcd", "aaa", "aaa", "aaa", "zzz", "bbb" };

		Arrays.stream(strArr).distinct() // �ߺ��� �����ϴ� �߰�����
				.sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::println);

		int[] intArr3 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Arrays.stream(intArr3).skip(3) // �ǳʶٴ� �߰�����
				.limit(3) // ���̸�ŭ �߶󳻴� ����
				.forEach(System.out::println);

	}

}
