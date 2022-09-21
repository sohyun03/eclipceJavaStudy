package java_study.co.kr.joongbu;

import java.time.LocalTime;

public class L10RunableLamda {

	public static void main(String[] args) {
		
		// �������̽��� ��ü�� ������ �� ����. => but ������ ���ÿ� �߻�޼ҵ带 �����ϸ� �ȴ�.
//		Thread clockThread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				while(true) {
//					System.out.println(LocalTime.now());
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		});
		
//		-----------------------------------------------------------------------
		
//		Thread clockThread = new Thread(()->{
//			while(true) {
//				System.out.println(LocalTime.now());
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		});
//		
//		-----------------------------------------------------------------------
		
		Runnable clock =()->{
			while(true) {
				System.out.println(LocalTime.now());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread clockThread = new Thread(clock);
		
		clockThread.start();
		System.out.println("main thread");
	}

}
