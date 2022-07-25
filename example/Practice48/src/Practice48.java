//º¸°Ç°ü¸®ÇÐ°ú 20170809 È«Àº¿µ

public class Practice48 {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		Person p1 = new Person("±èµ¿´ö", 1);
		Person p2 = new Person("È«±æµ¿", 20);
		
		speak3Times(myDog);
		speak3Times(p1);
		speak3Times(p2);
	}

	public static void speak3Times(Speakable s) {
		for(int i = 0; i < 3; i++) {
			s.speak();
		}
	}
}
