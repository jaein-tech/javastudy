package javastudy;

public class StringExam2 {

	public static void main(String[] args) {
//		
		String str1 = "hello world";
		String str2 = str1.substring(5); // substring(n); n��° ���ڿ����� �߶� �ڿ� ���� ��ȯ
		System.out.println(str1);
		System.out.println(str2);

		String str3 = str1 + str2; 
		System.out.println(str3);
//		���ڿ��� + ������ ������ �� �ִµ�, ���ڿ��� ���Ҷ����� 
//		java�� �ڵ����� �Ʒ��� ���� StringBuffer ��ü�� ����� �� ��ü�� ���� append method�� ����Ͽ� ���ڿ��� ������Ų �Ŀ� 
//		toString���� �ٽ� string��ü�� ��ȯ ��Ų �Ŀ� return�� �ϴ°Ŵ�.
		
		String str4 = new StringBuffer().append(str1).append(str2).toString(); // �� str3�� ���� �ڵ�
		System.out.println(str4);
		
//		string class�� ������
		String str5 = "";
		for(int i = 0; i < 100; i++) { // �ݺ��������� �ݺ��Ҷ����� ���������� new StringBuffer ��ü�� ������ ���� �Ѵ�.
			str5 = str5 + "*";         // java������ new�����ڰ� ���� ���ɼ��� ���α׷��� �ӵ��� ��������.
		}
		System.out.println(str5);      // ���ڿ��� �ݺ��� �ȿ��� ����ϴ°��� ���ɻ����� ������ ���� �� �ֱ⶧���� �ݵ�� ���Ѵ�.
		
//		���� StringBuffer�� �ϳ� ���� �Ʒ��� ���� �ۼ��ϴ°��� �ξ� �� ȿ�����̴�. (���� str5�� ����� ����.)
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 100; i++) {
			sb.append("*");
		}
		String str6 = sb.toString();
		System.out.println(str6);
	}

}
