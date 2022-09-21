package java_study.co.kr.joongbu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

class TextEditor extends JFrame {
	JTextArea ta;
	JMenuBar mb;
	JMenu menu;
	JMenuItem miNew, miOpen, miSave, miExit;

	public TextEditor() {
		super("�ؽ�Ʈ ������"); // super: �θ� ����������, super(): �θ��� ������ ȣ��
		ta = new JTextArea();
		mb = new JMenuBar();
		menu = new JMenu("����");
		miNew = new JMenuItem("���� �����");
		miOpen = new JMenuItem("����");
		miSave = new JMenuItem("����");
		miExit = new JMenuItem("������");
		menu.add(miNew);
		menu.add(miOpen);
		menu.add(miSave);
		menu.add(miExit);
		mb.add(menu);
		
		// this.add(mb)
		this.setJMenuBar(mb);
		this.add(ta);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		miOpen.addActionListener((e) ->{
			JFileChooser fileChooser = new JFileChooser();
			int option = fileChooser.showOpenDialog(this);
			if(option == JFileChooser.APPROVE_OPTION) {
				File file = fileChooser.getSelectedFile();
				try {
					Scanner sc = new Scanner(file);
					while(sc.hasNext()) {
						String line = sc.nextLine();
						System.out.println(line);
						ta.append(line + "\n");
					}
				} catch (FileNotFoundException  e2) {
					e2.printStackTrace();
				}
			}
		});
		
		
	}

}

public class L24TextEditorApp {

	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		editor.setBounds(0, 1, 400, 400);
		editor.setVisible(true);
	}

}
