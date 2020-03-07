package javaIO.exam;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ByteExam4 {

	public static void main(String[] args) {
		try(
				DataInputStream in = new DataInputStream(new FileInputStream("data.txt"));
				){
			int i = in.readInt();
			boolean b = in.readBoolean();
			double d = in.readDouble();
			
			System.out.println(i); // 100
			System.out.println(b); // true
			System.out.println(d); // 50.5
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
