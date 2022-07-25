//���ǰ����а� 20170809 ȫ����

public class Practice51 {
	public static void main(String[] args) {
		Shape s = new Shape();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		
		System.out.println(s instanceof Shape); //true
		System.out.println(s instanceof Rectangle); //false
		//��������ȯ�� true�� �Ƿ��� ���� s�� Rectangle ��ü�� ����Ű�� �ϰ� ��������ȯ �߾�� �ߴ�
		System.out.println(s instanceof Triangle); //false
		//��������ȯ�� true�� �Ƿ��� ���� s�� Triangle ��ü�� ����Ű�� �ϰ� ��������ȯ �߾�� �ߴ�
		System.out.println(s instanceof Movable); //true
		System.out.println(s instanceof Drawable); //false
		//s�� �������̽� Drawable�� ������� �ʴ´�. ��ӹ��� �ʴµ� compile error�� ���� �ʴ� ������ �������̽��� ���� ����� �����ϱ� ������ Shape�� Drawable�� ������ ���� �� �ֱ� �����̴�.
		
		System.out.println(r instanceof Shape); //true
		System.out.println(r instanceof Rectangle); //true
		//System.out.println(r instanceof Triangle);
		//java���� ���� Ŭ���� ����� �����Ƿ� ������ �߿� Rectangle ��ü�� Triangle�� �� �� ������ ���������� �˰� �ֱ� �����̴�.
		//instanceof ������ �����ʿ� ���� �� �ִ� Ŭ������ ��� ���迡 �ִ� Ŭ������ �����Ѵ�.
		System.out.println(r instanceof Movable); //true
		System.out.println(r instanceof Drawable); //true
		
		System.out.println(t instanceof Shape); //true
		//System.out.println(t instanceof Rectangle);
		//java���� ���� Ŭ���� ����� �����Ƿ� ������ �߿� Triangle ��ü�� Rectangle�� �� �� ������ ���������� �˰� �ֱ� �����̴�.
		//instanceof ������ �����ʿ� ���� �� �ִ� Ŭ������ ��� ���迡 �ִ� Ŭ������ �����Ѵ�.
		System.out.println(t instanceof Triangle); //true
		System.out.println(t instanceof Movable); //true
		System.out.println(t instanceof Drawable); //true
	}
}
