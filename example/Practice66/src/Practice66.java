//º¸°Ç°ü¸®ÇÐ°ú 20170809 È«Àº¿µ

public class Practice66 {
	public static void main(String[] args) {
		HealthData<Integer, Integer> m1 = new HealthData<Integer, Integer>("±èµ¿´ö", 160, 50);
		System.out.println(m1.toString());
		
		HealthData<Double, Integer> m2 = new HealthData<Double, Integer>("È«±æµ¿", 180, 100.35);
		System.out.println(m2.toString());
		
		HealthData<Integer, Double> m3 = new HealthData<Integer, Double>("¼ºÃáÇâ", 156.7, 65);
		System.out.println(m3.toString());
		
		System.out.println("\n3»ç¶÷ Ã¼ÁßÀÇ ÇÕ : " + ((double)m1.getWeight() + m2.getWeight() + (double)m3.getWeight()));
	}
}
