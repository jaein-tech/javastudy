package javastudy;

public class MathExam {

	public static void main(String[] args) {
//		Math class = ���а���� �ϱ� ���� class
//		������ ��ü�� private���� �Ǿ� �ֱ� ������ new �����ڷ� ��ü�� ������ �� ����.
//		��ü�� ������ ���� ������ method�� �Ӽ����� static���� �Ǿ��ֱ� ������ ��ü�� �������� �ʰ� ����� �� �ִ�.
		
		int value1 = Math.max(5, 30);
		System.out.println(value1);
		
		int value2 = Math.min(5, 30);
		System.out.println(value2);
		
		System.out.println(Math.abs(-10)); // ���밪
		
		System.out.println(Math.random()); // 0~1������ ������
		
		System.out.println(Math.sqrt(25)); // .sqrt = �������� �����ش�.
	}

}
