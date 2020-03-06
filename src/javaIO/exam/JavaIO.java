package javaIO.exam;

public class JavaIO {
//	java IO - input, output

//	Byte단위 입출력 - inputStream과 outputStream이라는 추상클래스를 상속받아 만들어진다.
//	Char단위 입출력 - reader와 writer라는 추상클래스를 상속받아 만들어 진다.

//	4가지 추상클래스(Byte단위{InputStream, OutputStreamReader}, Char단위{Reader,Writer})를 
//	받아들이는 생성자가 있다면 다양한 입출력 방법을 제공하는 클래스

//	4가지 클래스를 받아들이는 생성자가 없다면 어디로부터 입력받을 것인지, 어디에 쓸것인지를 나타내는 클래스

//	파일로 부터 입력받고 쓰기 위한 클래스 : FileInputStream, FileOutputStream / FileReader, FileWriter
//	배열로 부터 입력받고 쓰기 위한 클래스 : ByteArrayInputStream, ByteArrayOutputStream / CharReader, CharWriter
//	해당 클래스들은 '어디로부터', '어디에'라는 대상을 지정할 수 있는 IO클래스이다. 
//	이런 클래스를 장식대상 클래스라고 한다.

//	DataInputStream, DataOutputStream같은 클래스를 보면 다양한 데이터 형을 입력받고 출력한다.
//	PrintWriter는 다양하게 한줄 출력하는 println() method를 가지고 있다.
//	BufferedReader는 한줄 입력받는 readLine() method를 가지고 있다.
//	이런 클래스들은 다양한 방식으로 입력하고, 출력하는 기능을 제공한다. 
//	이런 클래스를 장식하는 클래스라고 합니다.

//	Decorator pattern으로 만들어져 있다.
//	 - 하나의 클래스를 장식하는것처럼 생성자에서 감싸서 새로운 기능을 계속 추가 할 수 있도록 클래스를 만드는 방식

}
