package java_study.co.kr.joongbu;

import java.io.BufferedReader;
import java.io.FileReader;

public class L23FileReader {

	public static void main(String[] args) {

		// AutoCloseable: try() 에서 생성한 객체를 자동으로 close 해주는 문법

//		FileReader fr = null; // 문자열로 작성된 파일을 불러오는 객체

		try (FileReader fr = new FileReader("src/java_study/co/kr/joongbu/L20InputOutputStream.java");
				BufferedReader br = new BufferedReader(fr);) {
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// catch(FileNotFoundException e ) {e.printStackTrace();} // 자식의 예외보다 부모의 예외가 먼저
		// 있으면 절대로 실행되지 않는다.

		// Exception > IOException > FileNotFoundException
	}

}
