package java_study.co.kr.joongbu;

import java.time.LocalTime;
import java.util.Scanner;

public class L08Thread {
	public static void main(String[] args) {

		// 스레드(Thread): main 메소드가 1개 가지고 있다. (순차적 언어 main에 작성한 코드가 순서대로 1개씩 실행되는 것)

		System.out.println("first");
		System.out.println("second");
		System.out.println("third");

		boolean start = true;
		while (start) { // 반복문이 한개의 스레드를 독점하기 때문에 다음 코드(forth)는 절대 실행되지 않는다.
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

		// sc.nextLine : 콘솔창에 엔터를 입력하는 것을 대기 => 스레드를 독점
		System.out.println("forth");
	}
}
