package java_study.co.kr.joongbu;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class L22FileWriter {

	public static void main(String[] args) {

		FileWriter fw = null; // ���ڿ��� ���Ϸ� ����ϴ� ��ü
		BufferedWriter bw = null; // ������Ʈ��

		try {
			fw = new FileWriter("./newFile.txt"); // ��� + �����̸�(����� ����)
			bw = new BufferedWriter(fw);
			bw.write("�ȳ��ϼ���!\nFileWriter�� ���� ��� �׽�Ʈ ���Դϴ�.");
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
