package javaIO.exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam1 {
//	파일로 부터 1byte씩 읽어들여 파일에 1byte씩 저장하는 프로그램을 작성
	public static void main(String[] args) {
		
		FileInputStream fis = null; // 파일로 부터 읽어오기 위한 객체 - FileInputStream
		FileOutputStream fos = null; // 파일에 쓸수 있게 해주는 객체 - FileOutputStream
		
		try {
			fis = new FileInputStream("src/javaIO/exam/ByteExam1.java");
			fos = new FileOutputStream("byte.txt");
			
			int readData = -1;
			while((readData = fis.read()) != -1) {
				fos.write(readData);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
