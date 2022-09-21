package java_study.co.kr.joongbu;

import java.time.LocalTime;
import java.util.Scanner;

public class L08Thread {
	public static void main(String[] args) {

		// ������(Thread): main �޼ҵ尡 1�� ������ �ִ�. (������ ��� main�� �ۼ��� �ڵ尡 ������� 1���� ����Ǵ� ��)

		System.out.println("first");
		System.out.println("second");
		System.out.println("third");

		boolean start = true;
		while (start) { // �ݺ����� �Ѱ��� �����带 �����ϱ� ������ ���� �ڵ�(forth)�� ���� ������� �ʴ´�.
			System.out.println(LocalTime.now());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		// sc.nextLine : �ܼ�â�� ���͸� �Է��ϴ� ���� ��� => �����带 ����
		System.out.println("forth");
	}
}
