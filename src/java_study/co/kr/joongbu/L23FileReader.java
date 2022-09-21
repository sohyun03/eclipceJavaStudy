package java_study.co.kr.joongbu;

import java.io.BufferedReader;
import java.io.FileReader;

public class L23FileReader {

	public static void main(String[] args) {

		// AutoCloseable: try() ���� ������ ��ü�� �ڵ����� close ���ִ� ����

//		FileReader fr = null; // ���ڿ��� �ۼ��� ������ �ҷ����� ��ü

		try (FileReader fr = new FileReader("src/java_study/co/kr/joongbu/L20InputOutputStream.java");
				BufferedReader br = new BufferedReader(fr);) {
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// catch(FileNotFoundException e ) {e.printStackTrace();} // �ڽ��� ���ܺ��� �θ��� ���ܰ� ����
		// ������ ����� ������� �ʴ´�.

		// Exception > IOException > FileNotFoundException
	}

}
