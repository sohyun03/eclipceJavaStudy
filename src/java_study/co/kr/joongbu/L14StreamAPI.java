package java_study.co.kr.joongbu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L14StreamAPI {
	static int sum2 = 0;

	public static void main(String[] args) {

		// IOStream: ����� �� �� �帧 (�Է¹���, ��¹���)
		// StreamAPI: ��� �ڷᱸ���� ������ ������� �ٷ�� ���� ����(�帧�� �ִ� �ڷ� ����)

		List<Integer> numList = new ArrayList<Integer>();
		numList.add(500);
		numList.add(35);
		numList.add(71);
		numList.add(80);
		numList.add(369);
		numList.add(280);
		numList.add(-300);

		int sum = 0;
		for (int i = 0; i < numList.size(); i++) {
			sum += numList.get(i);
		}
		System.out.println("for �ݺ��� ���: " + sum);

		sum = 0;
		for (int num : numList) { // java�� �迭�� ���õ� �ڷᱸ���� Iterator ������ �ϱ� ������ ���� for�� ��� ����
			sum += num;
		}
		System.out.println("���� for �ݺ��� ���: " + sum);

		// ���� �ݺ��� => JS List�� �䳻��
		// forEach�� List�� ������ �ִ�.
		numList.forEach((num) -> { // Consumer ���ٽ�: �Ű������� ����
			sum2 += num;
		});
		System.out.println("���� �ݺ��� foreach ���: " + sum2);
		
		sum2 = 0;
		numList.stream().forEach((num)->{sum2 += num;});
		System.out.println("���� �ݺ��� stream foreach ��� (List): " + sum2);
		
		sum2 = 0;
		int[] numArr = {333, 1111, 222, 1, -333, 5};
		Arrays.stream(numArr).forEach((num)->{sum2 += num;}); // �迭�� �����ϴ� ��ü(����Ŭ����)
		System.out.println("���� �ݺ��� stream foreach ��� (Array): " + sum2);
		
		int intStreamSum = Arrays.stream(numArr).sum(); // List, Map, Set .. �÷��������ӿ�ũ���� �����ϴ� �ڷᱸ���� �⺻������ �ڷḦ ������ �� ����. => stream�� �⺻�� �ڷᱸ���� �����Ѵ�.
		System.out.println("���� �ݺ��� IntStream sum foreach ��� (Array): " + intStreamSum);
	}

}
