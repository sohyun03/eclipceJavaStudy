package java_study.co.kr.joongbu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class L16StreamAPIEx2 {

	// ������: �ҽ��ڵ�(java) -> ���̳ʸ��ڵ�(class)
	// �ڹ�: �����Ͻ� �߰ߵǴ� ���� (��Ŭ������ ������) <-> ��Ÿ�ӽ� �߰ߵǴ� ����
	// ������ �ʴ� �ڵ带 �ۼ��ϴ� �͵� ������ ����
	// ���̽� (���������;�� -> �ҽ��ڵ带 �ٷ� ����: �����Ͻ� �߰ߵǴ� ���� (�������� ������) <-> ��Ÿ�ӽ� �߰ߵǴ� ����

	// ���θ����� �Ǹ��ϴ� ��ǰ �ڷ� type = Variable Object(VO), Data Transfer OBject(DTO)
	// JSON: ��Ž� ���� 1. ���ڿ�, 2. ������ 3. type�� ���ǰ��� 4. data traveling�� ����
	// key: value �� �Ǿ��ִ� ���� �α� �ִ� �ڷᱸ��! JavaScriptObjectNotation : �ڹٽ�ũ��Ʈ ��ü ����(��ü
	// ����) => ���ͷ� ǥ������� �������

//	enum Cate {��ǰ, �Ƿ�, ����, ������, ħ����} // �� �ʵ尡 �������� ���� ����̱� ������ ���� ����ϴ� �ٸ� ����� ����� �ʴ´�. (����: �ڹ� ���ο����� ����)
	interface Cate {
		public static int ��ǰ = 0;
		public static int �Ƿ� = 1;
		public static int ���� = 2;
		public static int ���� = 3;
		public static int ħ�� = 4;
	}

	class ProductDTO {
		// class�� ������ ����� ����: ��������, ��ü�� �ʵ�� ������(�Ӽ�)
		String name = null;
		int price = 0;
		int category; // 0: ��ǰ, 1: �Ƿ�, 2: ����, 3: ������, 4: ħ����
		int quantity = 10;

		// �����ڷ� �ʵ带 �ʱ�ȭ: �����ڴ� new �����ڷ� ȣ���ϸ� ��ü�� ��ȯ�ϴµ� �̸��� ��ȯ�ϴ� Ÿ���� �Լ���.

		public ProductDTO(String name, int price, int category) {
			this.name = name;
			this.price = price;
			this.category = category;
		}

		public ProductDTO(String name, int price, int category, int quantity) {
			// �ʵ������� this
			this.name = name;
			this.price = price;
			this.category = category;
			this.quantity = quantity;
		}

		@Override
		public String toString() {
			return "ProductDTO [name=" + name + ", price=" + price + ", category=" + category + ", quantity=" + quantity
					+ "]";
		}

	}

	public int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		L16StreamAPIEx2 ex2 = new L16StreamAPIEx2();
		List<ProductDTO> products = new ArrayList<ProductDTO>();
		products.add(ex2.new ProductDTO("�㽬���ݸ�", 1000, Cate.��ǰ)); // �Ǵ� ProductDTO�� static���� ������
		products.add(ex2.new ProductDTO("�㽬���ݸ� ����", 1200, Cate.��ǰ, 5));
		products.add(ex2.new ProductDTO("�ٳ��� ����", 1500, Cate.��ǰ, 3));
		products.add(ex2.new ProductDTO("������", 900, Cate.��ǰ, 15));
		products.add(ex2.new ProductDTO("�ϰմ��� �ٴҶ�", 5000, Cate.��ǰ, 11));
		products.add(ex2.new ProductDTO("�Ҽ��� ���ö�", 3500, Cate.��ǰ, 3));
		products.add(ex2.new ProductDTO("���ö� �Ŷ��", 800, Cate.��ǰ, 50));

		products.add(ex2.new ProductDTO("hp ����", 500, Cate.����, 200));
		products.add(ex2.new ProductDTO("���찳", 500, Cate.����, 50));
		products.add(ex2.new ProductDTO("����", 1000, Cate.����, 100));
		products.add(ex2.new ProductDTO("ȭ��Ʈ ���찳", 2500, Cate.����, 3));

		products.add(ex2.new ProductDTO("��� ����", 10000, Cate.�Ƿ�, 0));
		products.add(ex2.new ProductDTO("����Ű ���� Ƽ", 25000, Cate.�Ƿ�, 5));
		products.add(ex2.new ProductDTO("����Ű �Ź�", 110000, Cate.�Ƿ�, 2));
		products.add(ex2.new ProductDTO("�Ƶ�ٽ� �Ź�", 95000, Cate.�Ƿ�, 2));

		products.add(ex2.new ProductDTO("������ �̺�", 25000, Cate.ħ��, 1));
		products.add(ex2.new ProductDTO("�� ����", 2000, Cate.ħ��, 10));
		products.add(ex2.new ProductDTO("�볪�� ����", 2000, Cate.ħ��, 0));
		products.add(ex2.new ProductDTO("ħ�� Ŀ�� ��", 15000, Cate.ħ��, 3));

		products.add(ex2.new ProductDTO("���", 60000, Cate.����, 1));
		products.add(ex2.new ProductDTO("å��", 45000, Cate.����, 1));
		products.add(ex2.new ProductDTO("���������", 145000, Cate.����, 3));

		System.out.println(products);

		// ������ ���� ���α׷�
		// ������ ��ǰ ����
		// ������ ��ǰ �з�, ��ǰ�� ���� ���� ���� Ȯ��, �з� ���� ��ǰ�� ���� ���=> ����(�ڷḦ �ٷ�� ���)

		// ��ǰ �߿� 2000�� �̻��� ���� �˻� �ϰ� �ʹ�.
		List<ProductDTO> foods = new ArrayList<ProductDTO>();
		for (ProductDTO p : products) {
			if (p.category == Cate.��ǰ && p.price >= 2000) {
				foods.add(p);
			}
		}
		// �ܺιݺ��� �˻��(�Լ��� �� �����ϴ� ���ιݺ��� ���� ���⵵�� ����)
		System.out.println(foods);
		Optional<String> namesOpt = products.stream()
				.filter((p) -> p.category == Cate.��ǰ) // �߰�����(stream�� �ٽ� ��ȯ -> �̾ �߰����� ����)
				.filter((p) -> p.price >= 2000) // �߰������� ���� �����ϱ� ���ϰ� ������ �� �ִ�.
				.map((p) -> p.name) // ��ȯ�ϴ� ������ �ڷḦ ��ȯ
				.reduce((s, s1) -> s + ", " + s1); // �������� BiOperator: (s1, s2) -> {return s3}
//			.forEach(System.out::println);

		// reduce ���� ����: nums = {10, 20, 30, 40, 50, 60, 70}; result = 0;
		// (s1, s2) -> s1 + s2;
		// 0: result += nums[0];
		// 1: result += nums[1];
		// ...
		// end: result += nums[nums.length-1] => return result;
		System.out.println(namesOpt.get());

		// ī�װ��� ������ ���� ������ ���� ���ϼ��� (reduce)

		Optional<Integer> sumOtp = products.stream()
				.filter(p -> p.category == Cate.����)
				.map(p -> p.price * p.quantity) // �߰������� IntStream�� ��ȯ (�⺻�� ��Ʈ���� ���� 1. null ����, 2. �����ϴ� �Լ��� ����)
				.reduce((p1, p2) -> p1 + p2);
//			.forEach(System.out::println);
		System.out.println("������ ���� ����:" + sumOtp.get());

		// ���ιݺ����� ����ϸ� stream �ڷḦ sql queryó�� ������ �� �ִ�.

		
		Integer i = null;
//		System.out.println(i + 10); // ���� null.intValue()
		i = 30;
		System.out.println(i + 10);

		
		// Optional: data�� null�� �� ������ ó���ϵ��� ����ϴ� Ÿ��
		Optional<Integer> i_opt = Optional.empty(); // Optional �����
		i_opt = Optional.ofNullable(99);
//		System.out.println(i_opt + 20);
//		System.out.println(i_opt.get() + 20);
		if (i_opt.isPresent()) {
			System.out.println(i_opt.get() + 20);
		} else {
			System.out.println("isPresent() �� ���� ���� ���� true�� ��ȯ, isEmpty()�� Null�϶��� true ��ȯ");
		}
		// ��ȯ�Ǵ� �����Ͱ� Null�� �� ������ type���� ����ϴ� ��
//		i_opt.ifPresent((num) -> {
//			System.out.println("���� �������� ����Ǵ� �Լ�");
//		});
		i_opt.ifPresentOrElse((num) -> {
			System.out.println("���� �������� ����");
		}, () -> {
			System.out.println("null�϶� ����");
		});
		
		
		/////////////////////////////// stream groupingBy ///////////////////////////////
		Map <Integer, List<ProductDTO>> groupingList = products.stream()
				.collect(Collectors.groupingBy(p -> p.category));
		// �ش� ��ü�� Ư�� �ʵ�� ��ȯ�ϸ� �ش� �ʵ带 key�� �ϴ� list�� �׷��εȴ�.
		
		System.out.println(groupingList);
		System.out.println(groupingList.get(Cate.����));
		
/////////////////////////////// stream partitioningBy: true or false �� �� �׷����� ������ �� ///////////////////////////////
	}

}
