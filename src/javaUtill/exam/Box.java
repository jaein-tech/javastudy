package javaUtill.exam;

// Generic�̶�� ������ �������ν� instance�� ���鶧 ����ϴ� Ÿ���� �����ϴ� ������ �߰��Ǿ���.
public class Box<E> {  // ������ class E�� ����Ѵٴ� �ǹ̷� <E>�� �߰�
	private E obj;
	
	public void setObj(E obj) {
		this.obj = obj;
	}
	
	public E getObj() {
		return obj;
	}
}
