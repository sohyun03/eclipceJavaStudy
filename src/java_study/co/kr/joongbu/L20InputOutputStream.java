package java_study.co.kr.joongbu;

public class L20InputOutputStream {
	public static void main(String[] args) {

		// ����� IO ��ġ�� ��Ʈ��
		// �Է°� ���: ��ǻ�� ����(cpu, memory), �ܺ�(��ġ)���� ���α׷����� �����͸� �ְ� �޴� ��
		// ������ �Է¹ްų� ����ϴ� ����
		// �Ҹ��� ���, Ű���� or ���콺 �Է�
		// ����Ϳ� ���

		try {
			int i = System.in.read();
			System.out.println("�Է��� ��: " + (char) i);
			// �ƽ�Ű�ڵ�(1byte): ���ʷ� ������� ����ǥ, �����ڵ�(2byte): ��� ���ڸ� ����ϱ� ���� ������� ����ǥ
			// ������� �⺻ 1byte�� �������� data�� �Է��ϰų� ����Ѵ�.
			// ��) char(97 + 16) (255 77) (0 44) (99 254) -1 (����) => �����ڵ�� ��ȯ
			// ��) char(97) (16) (255) (77) (0) (44) (99) (254) -1 (����) => �����ڵ�� ��ȯ
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
