package java_study.co.kr.joongbu;

import java.time.LocalTime;

public class L10RunableLamda {

	public static void main(String[] args) {
		
		// 인터페이스는 객체를 생성할 수 없다. => but 생성과 동시에 추상메소드를 구현하면 된다.
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
