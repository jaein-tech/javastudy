package javaUtill.exam;

public class BoxExam {

	public static void main(String[] args) {
//		Box box = new Box();
//		box.setObj(new Object());               objectŸ���� �ڽ� class�� �����̵� ���� �� �ִ�.
//		Object obj = box.getObj();              (�θ� Ŭ������ �ڽ��� ���� �޼ҵ忡 ���� �� �� ����!!!!!)
//		
//		box.setObj("hello");                    box�� string���� �ִ´�.
//		String str = (String)box.getObj();      ���ڿ��� ���� �־ ���ڿ��� ���� �޾Ƽ� ���� ������ objectŸ���� ��ȯ�ϱ��
//		System.out.println(str);                �Ǿ� �־ ���ʰ� ���� ����ȯ�� ��ģ�� ���ڿ��� �޾� ��� �Ѵ�.
//		                                    
//		box.setObj(1);
//		int value = (int)box.getObj();
		
		Box<Object> box = new Box<>();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box<String> box2 = new Box<>();        // instance�� ���鶧 <>�ȿ� � Ÿ���� �޾Ƶ帱 �� �ֵ��� �����Ұ��� �����Ѵ�.
		box2.setObj("hello");                  // �׷� <>�ȿ� Ÿ���� return�ȴ�.
		String str= box2.getObj();
		
		Box<Integer> box3 = new Box<>();
		box.setObj(4);
		int v2 = box3.getObj();
		
	}

}
