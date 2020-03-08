package javaIO.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIOExam1 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		데코레이터 패턴 - 객체에 추가적인 요건을 동적으로 첨가하는 방식,  서브 클래스를 만드는 것을 통해 기능을 우연하게 확장할 수 있는 방법 제공
		
		String line = null;
		try {
			line = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(line); // console창에 입력한 그대로 다시 console에 나온다.
	}
//	반복문등을 통해 여러줄 입력을 받을 수도 있을것이고, 데코레이터 패턴을 이용해서 키보드가 아니라 파일로부터 입력받을 수도 있을것이고,
//	console창이 아니라 파일이나 array list같은 다른 자료구조를 통해 저장을 할 수도 있을것이다.
}
