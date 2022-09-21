package java_study.co.kr.joongbu;

import java.util.ArrayList;
import java.util.List;

public class L15StreamAPIEx {
	static int sum2 = 0;
	public static void main(String[] args) {
		
		
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(500);
		numList.add(55);
		numList.add(5);
		numList.add(null);
		numList.add(1);
		numList.add(3);
		numList.add(-300);
		
		int sum = 0;
		for (Integer num: numList) { // int num = numList.get(i).intValue(); => int num = null.intValue();
			if(num != null) {
				sum += num;		
			}
		}
		
//		1. null�� int�� ����ȯ�Ҷ� ����
//		2. sum + null ���� ����
//		3. null�� �ʵ尡 ���µ� �����ؼ� ���� (o)
		
		System.out.println(sum);
		
		numList.stream()
			.filter(i->i!=null) // filter(�߰�����): �˻�Ŀ��� true�� ��ȯ�ϴ� ���� stream���� �ٽ� ��ȯ
			.forEach((i)->{sum2+=i;}); // forEach(��������)
		
		System.out.println(sum2);
		
		
		
	}

}
