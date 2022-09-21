package java_study.co.kr.joongbu;

import java.time.LocalTime;
import java.util.Scanner;

class Clock implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println(LocalTime.now());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class L09MultiThread {

	public static void main(String[] args) {

		System.out.println("ù��°");
		System.out.println("�ι�°");
		System.out.println("����°");

		Clock clock = new Clock();
		// Thread�� �Ű����� Ÿ���� Runnable�� ����(Ÿ���� ��Ȯ�� ����� Ư¡)
		// Ÿ���� ��Ȯ�� ��ü���� ����� ������ ����
		// ����: �Ű����� Ÿ���� ��Ȯ�ؼ� ������ �߻����� �ʴ´�.
		// ����: ���ŷӴ�. (��� ����=> ��ü���� => �Ű����� ���)
		// ���� �غ� 1: �������̽��� �͸�Ŭ������ ����
		// ���� �غ� 2: ���ٽ� ��� (�߻�޼ҵ尡 1���� �ִ� �������̽�)
		Thread clockThread = new Thread(clock); // Thread: �����带 run()�� �ۼ��� �ڵ�� �����ϴ� ��ü
		clockThread.start(); // start(): ������ �����ϴ� �Լ�

		System.out.println("�׹�°: ��Ƽ ������ ȯ���̸� ����Ǵ� �ڵ�");
		Scanner sc = new Scanner(System.in);

		while (true) {
			String line = sc.nextLine();
			System.out.println("�Էµ� ��: " + line);
		}

	}

}
