package javastudy;

public class Student {
//	objectŬ���� - ��� Ŭ������ �ֻ��� Ŭ����
	
//	�ƹ��͵� ��ӹ��� ������ �ڵ����� object�� ��ӹ޴´�. object�� �������ִ� method�� ��� Ŭ������ ��밡���ϴ�
//	�Ʒ��� objectŬ�������� ���� ���� ���Ǵ� method�ε� ����Ҷ� ��� Overriding�ؼ� ����ؾ� �Ѵ�.
//	equals - ��ü�� ���� ���� ���� �� ���
//	toString - ��ü�� ������ �մ� ���� ���ڿ��� ��ȯ
//	hashCode - ��ü�� �ؽ��ڵ� �� ��ȯ, �ؽ��ڵ�� �ڷᱸ������ ���� ���ȴ�.
	
	String name;
	String number;
	int birthyYear;
	
//	��� tab�� sourceŬ���� generate hashCode() and equals()������ �ڵ����� override����
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}
//	�˰����� ���� �����ؾ��Ѵ�.


	@Override
	public boolean equals(Object obj) {
		if (this == obj)  //  method�� parameter�� ���� object�� �ڱ��ڽ��� ���Ѵ�.
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())  //  getClass()�� object�� ������ �ִ� method�� class�� ���� ������ ������ �ִ�.
			return false;                  //  �ڱ��ڽ��� Ŭ���� ������ object�� Ŭ���������� ���Ѵ�.
		Student other = (Student) obj;  //  object�� student�� ����ȯ
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number)) // �ڽ��� number�� object�� number�� ���Ѵ�.
			return false;
		return true;
	}

	
//	��� tab�� sourceŬ���� generate toString()������ �ڵ����� override����

	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", birthyYear=" + birthyYear + "]";
	}


	// main + ctrl + space�� main method�� �����ϰ� ���� �� �� �ִ�.
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "ȫ�浿";
		s1.number = "1234";
		s1.birthyYear = 1995;
		
		Student s2 = new Student();
		s2.name ="ȫ�浿";
		s2.number = "1234";
		s2.birthyYear = 1995;
		
		if(s1.equals(s2))
			System.out.println("s1 == s2");
		else
			System.out.println("s1 != s2");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1);
		System.out.println(s1.toString());//���� ����
	}
}
