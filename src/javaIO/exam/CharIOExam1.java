package javaIO.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIOExam1 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		���ڷ����� ���� - ��ü�� �߰����� ����� �������� ÷���ϴ� ���,  ���� Ŭ������ ����� ���� ���� ����� �쿬�ϰ� Ȯ���� �� �ִ� ��� ����
		
		String line = null;
		try {
			line = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(line); // consoleâ�� �Է��� �״�� �ٽ� console�� ���´�.
	}
//	�ݺ������� ���� ������ �Է��� ���� ���� �������̰�, ���ڷ����� ������ �̿��ؼ� Ű���尡 �ƴ϶� ���Ϸκ��� �Է¹��� ���� �������̰�,
//	consoleâ�� �ƴ϶� �����̳� array list���� �ٸ� �ڷᱸ���� ���� ������ �� ���� �������̴�.
}
