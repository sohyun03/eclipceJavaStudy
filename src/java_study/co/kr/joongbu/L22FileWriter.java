package java_study.co.kr.joongbu;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class L22FileWriter {

	public static void main(String[] args) {

		FileWriter fw = null; // 문자열을 파일로 출력하는 객체
		BufferedWriter bw = null; // 보조스트림

		try {
			fw = new FileWriter("./newFile.txt"); // 경로 + 파일이름(상대경로 가능)
			bw = new BufferedWriter(fw);
			bw.write("안녕하세요!\nFileWriter로 파일 출력 테스트 중입니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
				if (fw != null)
					fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
