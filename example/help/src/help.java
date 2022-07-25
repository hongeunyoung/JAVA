import java.util.Scanner;

public class help {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      System.out.print("철수의 입력: ");
      String rslt1 = sc.next();
      
      while (rslt1.equals("가위") == false && rslt1.equals("바위") == false && rslt1.equals("보") == false) {
    	 System.out.println("잘못된 입력입니다. 다시 입력하세요.");
         System.out.print("철수의 입력: ");
         rslt1 = sc.next();
      }
      
      System.out.print("영희의 입력: ");
      String rslt2 = sc.next();
      
        while (rslt2.equals("가위") == false || rslt2.equals("바위") == false || rslt2.equals("보") == false) {
        	System.out.println("잘못된 입력입니다. 다시 입력하세요.");
           System.out.print("영희의 입력: ");
           rslt2 = sc.next();
        }
         
         if (rslt2.equals("가위") || rslt2.equals("바위") || rslt2.equals("보")) {
            if (rslt1.equals(rslt2) == true) {
               System.out.println("비겼습니다.");
            }
            else if (rslt1.equals(rslt2) == false) {
               if (rslt1.equals("가위")) {
                  if (rslt2.equals("바위")) {
                     System.out.println("영희가 이겼습니다.");
                  }
                  else if (rslt2.equals("보")) {
                     System.out.println("철수가 이겼습니다.");
                  }
               }
               else if (rslt1.equals("바위")) {
                  if (rslt2 == "가위") {
                     System.out.println("철수가 이겼습니다.");
                  }
                  else if (rslt2.equals("보")) {
                     System.out.println("영희가 이겼습니다.");
                  }
               }
               else if (rslt1.equals("보")) {
                  if (rslt2.equals("가위")) {
                     System.out.println("영희가 이겼습니다.");
                  }
                  else if (rslt2.equals("바위")) {
                     System.out.println("철수가 이겼습니다.");
                  }
               }
            }
         }
      
      
      sc.close();
   }

}