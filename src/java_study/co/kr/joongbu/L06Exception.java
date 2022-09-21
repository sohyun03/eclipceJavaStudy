package java_study.co.kr.joongbu;

import java.util.Scanner;

public class L06Exception {

	public static void main(String[] args) {

		// 컴파일 시 발견되지 않는 오류를 예외처리 하는 방법 try catch

		String[] arr = { "a", "b", "c" };

		Scanner sc = new Scanner(System.in); // 모든 통신은 기본이 문자열이다.
		System.out.println("{\"a\",\"b\",\"c\"} 찾고 싶은 배열의 인덱스 입력!");

		while (true) {
			String str = sc.nextLine();
			try {
				System.out.println("arr[" + str + "]: " + arr[Integer.parseInt(str)]);
			} catch (NumberFormatException e) {
				System.out.println("정수만 입력하세요ㅡㅡ");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("0부터 " + (arr.length - 1) + "사이의 정수만 입력하라고 ㅡㅡ");
			} catch (Exception e) { // 모든 예외를 처리
				System.out.println("알 수 없는 오류 발생! 발생! 발생!");
			} finally { // 예외 발생 여부와 관계없이 무조건 실행 (통신을 하고 종료할 때 많이 사용)
				System.out.println("무조건 실행되지롱");
			}
		}

	}

}
