import java.util.Scanner;

public class help {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      System.out.print("ö���� �Է�: ");
      String rslt1 = sc.next();
      
      while (rslt1.equals("����") == false && rslt1.equals("����") == false && rslt1.equals("��") == false) {
    	 System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
         System.out.print("ö���� �Է�: ");
         rslt1 = sc.next();
      }
      
      System.out.print("������ �Է�: ");
      String rslt2 = sc.next();
      
        while (rslt2.equals("����") == false || rslt2.equals("����") == false || rslt2.equals("��") == false) {
        	System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
           System.out.print("������ �Է�: ");
           rslt2 = sc.next();
        }
         
         if (rslt2.equals("����") || rslt2.equals("����") || rslt2.equals("��")) {
            if (rslt1.equals(rslt2) == true) {
               System.out.println("�����ϴ�.");
            }
            else if (rslt1.equals(rslt2) == false) {
               if (rslt1.equals("����")) {
                  if (rslt2.equals("����")) {
                     System.out.println("���� �̰���ϴ�.");
                  }
                  else if (rslt2.equals("��")) {
                     System.out.println("ö���� �̰���ϴ�.");
                  }
               }
               else if (rslt1.equals("����")) {
                  if (rslt2 == "����") {
                     System.out.println("ö���� �̰���ϴ�.");
                  }
                  else if (rslt2.equals("��")) {
                     System.out.println("���� �̰���ϴ�.");
                  }
               }
               else if (rslt1.equals("��")) {
                  if (rslt2.equals("����")) {
                     System.out.println("���� �̰���ϴ�.");
                  }
                  else if (rslt2.equals("����")) {
                     System.out.println("ö���� �̰���ϴ�.");
                  }
               }
            }
         }
      
      
      sc.close();
   }

}