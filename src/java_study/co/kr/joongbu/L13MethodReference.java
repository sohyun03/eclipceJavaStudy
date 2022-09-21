package java_study.co.kr.joongbu;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class L13MethodReference {

	public static void main(String[] args) {

		// �޼ҵ� ����(���ٽ��� �ѹ� �� �ٿ��� �ۼ�)
		// "13" -> 13
		Function<String, Integer> paserInt = (s) -> {
			return Integer.parseInt(s);
		};
		Function<String, Integer> paserInt2 = s -> Integer.parseInt(s);
		Function<String, Integer> paserInt3 = Integer::parseInt;
		// �����Ϸ��� �ؼ��� �� �ִ� ������ ������ ����
		// �Ű������� ������ �����ϰ� ��ȯ�Ҷ� ����Ǵ� �Լ��� �Ű������� �� 1�� ����ϱ� ������
		System.out.println(paserInt3.apply("99") * 3);

		// ���ڿ� �� ��ü�� equals�� ������ �˻��ϴ� �Լ� �ۼ�
		BiPredicate<String, String> strEquals = (s1, s2) -> s1.equals(s2);
		BiPredicate<String, String> strEquals2 = String::equals; // �޼ҵ� ������ �Ű������� ����

		String str = "�ȳ��ϼ���!";
		String str2 = new String("�ȳ��ϼ���!");
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		System.out.println(strEquals.test(str, str2));
		System.out.println(strEquals2.test(str, str2));

		char[] charArr = { '��', '��', '��', '��', '��' };
		String msg = new String(charArr);
		System.out.println(msg);

		Function<char[], String> parseStr = cArr -> new String(cArr);
		Function<char[], String> parseStr2 = String::new;
		
		System.out.println(parseStr.apply(new char[] { '��', '��', '��' }) + "!");
		System.out.println(parseStr2.apply(new char[] { '��', '��', '��' }) + "!");
	}

}
