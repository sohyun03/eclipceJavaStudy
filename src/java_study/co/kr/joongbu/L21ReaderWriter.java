package java_study.co.kr.joongbu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L21ReaderWriter {

	public static void main(String[] args) {

		// byte ����� ����°� ���� ����� ����� ����
		System.out.println("�ƽ�Ű �ڵ��� ���ڸ� �Է�(enter) �ϼ���!");
		try {
			int input = -1;
			while ((input = System.in.read()) != 10) {
				System.out.println("�Է��� ������ ��ȣ: " + input);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// ���� Reader�� Writer�� �پ������� ���� ��� ����� Ŭ���� (�ڹ�)
		System.out.println("���ڿ��� �Է��ϼ���!");
		InputStreamReader isr = null;
		BufferedReader br = null; // ���ڿ��� �迭 �ڷᱸ���� ���̰� ��� �þ �� �ֱ� ������ ���۸� ����Ѵ�.
		// ����: �ӽ��������, ������Ʈ��(InputStream�� ���ڿ��� ���� �� �ֵ��� ���´�.)
		// ���۸�: 8gb �޸�(Ram)�� ��� ����ϸ� �ϵ��ũ�� �ӽð����� �����ؼ� �޸�ó�� ��� => ��ǻ�Ͱ� ������ �ʵ��� ���� ����
		isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr); // ���� ��Ʈ��
		String inputStr = "";

		try {
			inputStr = br.readLine();
			System.out.println("�Է��� ���ڿ�: " + inputStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
