package javastudy;

public class WrapperExam {

	public static void main(String[] args) {
//		java�� �⺻������ �پ��� package�� �����Ѵ�.
//		���߿��� ���� �߿��� package�� java.lang package�� �˾ƺ���
		
//		java.lang package�� import���� �ʾƵ� ����� �� �ִ�.
//		[wrapper, object, string, stringBuffer, stringBilder, system, math, ...��]
		
//		wrapper�� �⺻�� ������ Ÿ���� ��ü�� ��ȯ��ų�� ����Ѵ�.
//		wrapper��� ���� class�� �����ϴ°��� �ƴϰ� 8���� �⺻�� ������ Ÿ��(boolean, byte, char, ...��)��
//		���� ��ü�� ��ȯ��ų �� �ִ� class�� �����ϴµ� ������ class�� ��� ��� wrapper class��� �Ѵ�.
//		 wrapper class -- �⺻�� ������ Ÿ���� ��üȭ�� �����ϰ� �����ִ� class��
		
		int i = 5; // �⺻��Ÿ��
		Integer i2 = new Integer(5); // ���� int�� ��ü�� �ٲ��ִ� wrapper class�� �ϳ�
		// i�� �⺻�� Ÿ���̱� ������ ��ü�� �ƴϴ�.(������ �ƴ�)
		// i2�� ���� �����ؾ� ���������� ����� �� �ִ�.
		
		Integer i3 = 5; // ���� �⺻�������� �ڵ����� Integer�� ����ȯ�� ���� = (����ڽ�)
		//����ڽ� == �⺻ Ÿ�� �����͸� ��ü Ÿ���� �����ͷ� �ڵ� ����ȯ �����ִ� ���
		
		int i4 = i3.intValue();

		int i5 = i3; // java5 ���ĺ��� ��ó�� intValue()��� method�� ȣ������ �ʾƵ� �ٷ� ������ ��밡���ϴ�. = (�����ڽ�)
		
		// �����ڽ� == ����ڽ̰� �ݴ�� ��üŸ���� �����͸� �⺻�� Ÿ�Ե����ͷ� �ڵ� ����ȯ
	}

}
