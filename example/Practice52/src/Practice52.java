//���ǰ����а� 20170809 ȫ����

public class Practice52 {
	public static void main(String[] args) {
		Movable[] rArray = new Movable[2];
		
		rArray[0] = new Rectangle();
		rArray[1] = new Triangle();
		
		System.out.println(rArray[0] instanceof Rectangle); //true
		//rArray[0]�� Rectangle ��ü�� ���������̱� ������ true
		System.out.println(rArray[0] instanceof Triangle); //false
		//Rectangle�� Triangle�� ��Ӱ��谡 �ƴϴ�.
		System.out.println(rArray[0] instanceof Movable); //true
		//Rectangle�� Shape�� ��ӹް� Shape�� Movable�� ��ӹ޴´�.
		System.out.println(rArray[0] instanceof Drawable); //true
		//Rectangle�� Drawable�� ��ӹ޴´�.
		
		System.out.println(rArray[1] instanceof Rectangle); //false
		//rArray[1]�� Triangle ��ü�� ���������̱� ������ Rectangle�� ��� ���谡 �ƴ϶� false
		System.out.println(rArray[1] instanceof Triangle); //true
		//rArray[1]�� Triangle�� ���������̱� ������ true
		System.out.println(rArray[1] instanceof Movable); //true
		//Triangle�� Shape�� ��ӹް� Shape�� Movable�� ��ӹ޴´�.
		System.out.println(rArray[1] instanceof Drawable); //true
		//Triangle�� Drawable�� ��ӹ޴´�.
	}
}
