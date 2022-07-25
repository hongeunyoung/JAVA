//º¸°Ç°ü¸®ÇÐ°ú 20170809 È«Àº¿µ

import java.util.Scanner;

public class Practice36 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		System.out.print("1¹øÂ° ¼ø¼­½Ö xÁÂÇ¥: ");
		int x1 = s.nextInt();
		
		System.out.print("1¹øÂ° ¼ø¼­½Ö yÁÂÇ¥: ");
		int y1 = s.nextInt();
		
		Pair p1 =  new Pair(x1, y1);
		
		System.out.print("2¹øÂ° ¼ø¼­½Ö xÁÂÇ¥: ");
		int x2 = s.nextInt();
		
		System.out.print("2¹øÂ° ¼ø¼­½Ö yÁÂÇ¥: ");
		int y2 = s.nextInt();
		
		s.close();
		
		Pair p2 = new Pair(x2, y2);
		
		System.out.println("ÀÔ·ÂµÈ 1¹ø ¼ø¼­½Ö: (" + p1.getX() + ", " + p1.getY() + ")");
		System.out.println("ÀÔ·ÂµÈ 2¹ø ¼ø¼­½Ö: (" + p2.getX() + ", " + p2.getY() + ")");
		
		Pair pAdd = Pair.add(p1, p2);
		System.out.println("µ¡¼À °á°ú : " + pAdd.toString());
		
		Pair pSub = Pair.sub(p1, p2);
		System.out.println("»¬¼À °á°ú : " + pSub.toString());
		
		Pair pMult = Pair.mult(p1, p2);
		System.out.println("°ö¼À °á°ú : " + pMult.toString());
		
		Pair pDiv = Pair.div(p1, p2);
		System.out.println("³ª´°¼À °á°ú : " + pDiv.toString());
	}
}
