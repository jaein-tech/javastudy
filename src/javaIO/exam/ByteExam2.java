package javaIO.exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam2 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		FileInputStream fis = null; 
		FileOutputStream fos = null; 
		
		try {
			fis = new FileInputStream("src/javaIO/exam/ByteExam1.java");
			fos = new FileOutputStream("byte.txt");
			
			int readCount = -1;
			byte[] buffer = new byte[512];
			while((readCount = fis.read(buffer)) != -1) {
				fos.write(buffer,0,readCount);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
//	os에서 512byte씩 읽어오기 때문에 파일을 읽어 올때는 512byte의 배수로 배열의 크기를 잡아주는것이 성능상 좋다.
}
