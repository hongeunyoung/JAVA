//���ǰ����а� 20170809 ȫ����

public class Practice66 {
	public static void main(String[] args) {
		HealthData<Integer, Integer> m1 = new HealthData<Integer, Integer>("�赿��", 160, 50);
		System.out.println(m1.toString());
		
		HealthData<Double, Integer> m2 = new HealthData<Double, Integer>("ȫ�浿", 180, 100.35);
		System.out.println(m2.toString());
		
		HealthData<Integer, Double> m3 = new HealthData<Integer, Double>("������", 156.7, 65);
		System.out.println(m3.toString());
		
		System.out.println("\n3��� ü���� �� : " + ((double)m1.getWeight() + m2.getWeight() + (double)m3.getWeight()));
	}
}
