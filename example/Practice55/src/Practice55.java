//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice55 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.print("������ �Է��ϼ���: ");
			String str = s.next();
			
			int num = Integer.parseInt(str);
			int[] array = new int[num];
			
			s.close();
			
			for(int i = 0; i < array.length; i++) {
				array[i] = i * 20;
			}
		} catch (NumberFormatException e) {
			System.out.println("���� ���� ����");
		} catch (NegativeArraySizeException e) {
			System.out.println("�迭 ũ�� ���� ����");
			return;
		} catch (Exception e) {
			System.out.println("����");
		} finally {
			System.out.println("�ݵ�� ó���� ��");
		}
		
		System.out.println("continue running");
	}
	/*������ �Է��� ���
	 * int[] array = new int[num];���� catch (NegativeArraySizeException e)�� �̵�
	 *return�� �����Ƿ� System.out.println("continue running");�� ������� �ʴ´�
	 *finally�� �ݵ�� ����ȴ�
	 */
	
	/*
	 * ����� �Է��� ���
	 * try���� ���ܰ� �߻����� �����Ƿ� catch ������ ���� �ʰ� finally ���� ����
	 */
	
	/*
	 * ���ڸ� �Է��� ���
	 * catch (NumberFormatException e)�� ����ǰ� return���� �����Ƿ� System.out.println("continue running"); ����
	 * finally�� �ݵ�� ����
	 */
}
