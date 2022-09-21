package java_study.co.kr.joongbu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L21ReaderWriter {

	public static void main(String[] args) {

		// byte 기반의 입출력과 문자 기반의 입출력 차이
		System.out.println("아스키 코드의 문자만 입력(enter) 하세요!");
		try {
			int input = -1;
			while ((input = System.in.read()) != 10) {
				System.out.println("입력한 문자의 번호: " + input);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 끝에 Reader와 Writer가 붙어있으면 문자 기반 입출력 클래스 (자바)
		System.out.println("문자열을 입력하세요!");
		InputStreamReader isr = null;
		BufferedReader br = null; // 문자열은 배열 자료구조로 길이가 계속 늘어날 수 있기 때문에 버퍼를 사용한다.
		// 버퍼: 임시저장공간, 보조스트림(InputStream이 문자열을 받을 수 있도록 돕는다.)
		// 버퍼링: 8gb 메모리(Ram)를 모두 사용하면 하드디스크에 임시공간을 마련해서 메모리처럼 사용 => 컴퓨터가 멈추지 않도록 돕는 역할
		isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr); // 보조 스트림
		String inputStr = "";

		try {
			inputStr = br.readLine();
			System.out.println("입력한 문자열: " + inputStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
