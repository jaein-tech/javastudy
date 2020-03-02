package javastudy;

public class StringBufferExam {

	public static void main(String[] args) {
//		String class�� �ڱ� �ڽ��� ������ �ʴ� �Һ� class�̴�.
//		�ݸ鿡 StringBuffer class�� �ڱ� �ڽ��� ���ϴ� class�̴�.
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello"); // append - �߰��ϴ� method
		sb.append(" ");
		sb.append("world");
		
//		toString() method�� string���� return
		String str = sb.toString(); 
		System.out.println(str); // hello +  + world��ȯ
//		stringBuffer�� ������ �ִ� method���� ��κ� �ڱ� �ڽ��� ��ȯ�Ѵ�.
//		sb.append�� ����� �Ŀ� ��ȯ�Ǿ��� ���� �ڱ� �ڽ��̾���.
		
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello"); // .append�� �ڱ� �ڽ�, �� this�� ��ȯ. ��ȯ�� �ڱ��ڽ��� sb3�� �־���.
		if(sb2 == sb3)
			System.out.println("sb2 == sb3"); // ���� sb2�� sb3�� ����.
//		stringBuffer�� ����ؼ� �ڱ� �ڽ��� return�ϴ� ���� �̿��� �ڱ� �ڽ��� ȣ���ϸ鼭 �ڽ��� ���� �ٲ㳪����. = (�޼ҵ� ü�̴�)
//		 �޼ҵ� ü�̴�(method chaining) -- �ڱ��ڽ��� return�� �ڽ��� method�� ȣ���ϴ� ���
		
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
		System.out.println(str2);
	}

}
