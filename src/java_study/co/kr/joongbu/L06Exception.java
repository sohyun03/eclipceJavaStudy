package java_study.co.kr.joongbu;

import java.util.Scanner;

public class L06Exception {

	public static void main(String[] args) {

		// ������ �� �߰ߵ��� �ʴ� ������ ����ó�� �ϴ� ��� try catch

		String[] arr = { "a", "b", "c" };

		Scanner sc = new Scanner(System.in); // ��� ����� �⺻�� ���ڿ��̴�.
		System.out.println("{\"a\",\"b\",\"c\"} ã�� ���� �迭�� �ε��� �Է�!");

		while (true) {
			String str = sc.nextLine();
			try {
				System.out.println("arr[" + str + "]: " + arr[Integer.parseInt(str)]);
			} catch (NumberFormatException e) {
				System.out.println("������ �Է��ϼ���Ѥ�");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("0���� " + (arr.length - 1) + "������ ������ �Է��϶�� �Ѥ�");
			} catch (Exception e) { // ��� ���ܸ� ó��
				System.out.println("�� �� ���� ���� �߻�! �߻�! �߻�!");
			} finally { // ���� �߻� ���ο� ������� ������ ���� (����� �ϰ� ������ �� ���� ���)
				System.out.println("������ ���������");
			}
		}

	}

}
