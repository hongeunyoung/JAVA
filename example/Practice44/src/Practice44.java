//���ǰ����а� 20170809 ȫ����

public class Practice44 {
	public static void main(String[] args) {
		Shape[] sArray = new Shape[3];
		
		sArray[0] = new Shape();
		sArray[1] = new Rectangle();
		sArray[2] = new Triangle();
		
		//sArray[0]�� Shape Ÿ���̱� ������ true
		System.out.println(sArray[0] instanceof Shape);
		//��������ȯ�� �����ϰ� �ϴ� �ڵ尡 �ƴϴ�.
		//Shape Ÿ���̱� ������ Rectangle�� �ҼӺ������� ������ ���Ѵ�.
		System.out.println(sArray[0] instanceof Rectangle);
		//��������ȯ�� �����ϰ� �ϴ� �ڵ尡 �ƴϴ�.
		//Shape Ÿ���̱� ������ Triangle�� �ҼӺ������� ������ ���Ѵ�.
		System.out.println(sArray[0] instanceof Triangle);
		//Rectangle�� Shape�� ����ϱ� ������ ��������ȯ�� �����ϴ�.
		System.out.println(sArray[1] instanceof Shape);
		//sArray[1]�� Rectangle Ÿ���̱� ������ true
		System.out.println(sArray[1] instanceof Rectangle);
		//Rectangle�� Triangle�� ���� ��� ���谡 �ƴϱ� ������ ����ȯ�� �Ұ����ϴ�.
		System.out.println(sArray[1] instanceof Triangle);
		//Triangle�� Shape�� ����ϱ� ������ ��������ȯ�� �����ϴ�.
		System.out.println(sArray[2] instanceof Shape);
		//Rectangle�� Triangle�� ���� ��� ���谡 �ƴϱ� ������ ����ȯ�� �Ұ����ϴ�.
		System.out.println(sArray[2] instanceof Rectangle);
		//sArray[2]�� Triangle Ÿ���̱� ������ true
		System.out.println(sArray[2] instanceof Triangle);
	}
}
