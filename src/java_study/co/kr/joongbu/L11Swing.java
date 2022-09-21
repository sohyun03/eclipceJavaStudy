package java_study.co.kr.joongbu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class L11Swing {
	static boolean start = true;

	public static void main(String[] args) {

		// Frame awt -> JFrame Swing: GUI�� �����ϴ� ��ü
		// java: �÷���(os)�� ������ => ��� os���� ����ϰ� �����ϴ� ��ü�� ����
		JFrame frame = new JFrame("Swing Frame"); // Container: Component ��ü�� ������ �� �ִ�. Window: os���� �����ϴ� â�� ����
		JButton btn = new JButton("�ð����");
		JButton btn2 = new JButton("����");
		JLabel label = new JLabel("����ð� ���");
		label.setFont(new Font("Serif", Font.BOLD, 20));

//		boolean start = true; // �͸� Ŭ������ �������� ������ �� ����� ����Ѵ�.
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(start == false) {
					start = true;
				}
				new Thread(() -> {
					while (start) {
						System.out.println("��ư�� ����");
						String now = LocalTime.now().toString();
						label.setText(now);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}).start();
				// Component�� thread�� �����ϱ� ������ frame�� �ƹ��� ���۵� ���� �ʴ´�.
				// actionPerformed() �Լ��� ����Ǿ�� frame ���� ������ �� �� �ִ�.
			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				start = false;
			}
		});

//		frame�� �⺻ ���̾ƿ�(BorderLayout)�� �����Ǿ� �ִ�.
//		frame.add(btn, BorderLayout.CENTER);
//		frame.add(btn2, BorderLayout.NORTH);

		frame.setLayout(null); // ���̾ƿ��� ���ָ� ��ġ�� ũ��� ������Ʈ�� ��ġ�� ������ �� �ִ�.
		btn.setBounds(0, 0, 100, 80); // frame�� ������ ��ġ�� ũ�� ����
		btn2.setBounds(150, 0, 100, 80);
		label.setBounds(0, 100, 300, 100);

		frame.add(btn);
		frame.add(btn2);
		frame.add(label);

		frame.setBounds(100, 100, 300, 200); // �������� ȭ�� ��ġ
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // window�� ���� ��ư�� ������ ��� �ϴ��� ����
		frame.setVisible(true);
	}

}
