package java_study.co.kr.joongbu;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface Func<T, R>{
	R apply(T t);
}

public class L12Lamda {

	public static void main(String[] args) {

		// JavaScript(�Լ������, ����Ÿ�Ծ��) ���ٽ�: function(){} �Լ� => ������ Ÿ��(Ÿ��), class (������ ���� == function), () => {} ���ٽ� �Լ�(Ÿ���� �������� �ʴ�)
		// function Calc(a,b){this.a = a; this.b = b; this.sum = function(){}} let calc = new Calc();
		// Java(��ü������) ���ٽ�: �Լ��� �ϳ� �ִ� ��ü�� �Ű����� ��� �����ϰ� �ۼ��ϴ� ������ ����
		Function<Integer, Long> square = (i) -> {
			return (long) i * i;
		};
		Function<Integer, Long> square2 = new Function<Integer, Long>() {

			@Override
			public Long apply(Integer t) {
				long result = t * t;
				return result;
			}

		};

		BiFunction<Integer, Integer, Long> sum = (i, i2) -> {
			return (long) (i + i2);
		};
		System.out.println(sum.apply(40, 100));
		Consumer<Integer> squarPrint = (i)->{System.out.println(i*i);};
		squarPrint.accept(10);
		
		// Predicate(�˻��): �Ű������� ��ȯ�ϴ� ���� �ִµ� ��ȯ�ϴ� ���� Ÿ���� ������ boolean
		Predicate<String> nullCheck = s-> s != null;
		
		// Supplier: ��ȯ�ϴ� �͸� �ִ� �Լ� ����
		Supplier<Integer> randomNum = ()->{return (int)(Math.random()*10) + 1; }; // 1~10���� ������ �� ��ȯ
		System.out.println(randomNum.get());
		
		// BinaryOperator(�����ϴ� �Լ�): �Ű������� 2���� ��ȯ�ϴ� ���� ������ �Ű������� ��ȯ ���� Ÿ���� ������
		BinaryOperator<Integer> sum2 = (i, i2)-> i + i2;
		System.out.println(sum2.apply(15, 10));
		
		// �ڵ��� ���̰� �پ��� ������ + �����ð��� �پ��� ������������ �����ϱ� ������ ���ٽ��� ���� ����ϰ� �ִ�.
	}

}

// ����� ���� ���� (��ü���⿡ ���� ���� + �����ͺ��̽� ����) + �������(�ݺ��� �˻�, ���� ���� if -> switch, ����� ȸ�� ������Ʈ ���� ���� ���)
// ���� -> ���� (�⺻)
