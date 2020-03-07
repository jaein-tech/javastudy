package javaIO.exam;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteExam3 {

	public static void main(String[] args) {
//		try-with-resources - ����� �ڿ��� �ڵ����� ���� �����ִ� ���
		try(    // io��ü�� ����, �پ��� Ÿ���� ������ �� �ִ� ��ü DataOutputStream�̶�� class ���
				DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
				){
			out.writeInt(100);
			out.writeBoolean(true);
			out.writeDouble(50.5);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
