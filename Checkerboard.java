
public class Checkerboard {

	public static void main(String[] args) {
		for(int i = 0; i < 20; i++) {
			if((i < 4) || (7 < i && i < 12) || (15 < i)) {
				Odd();
			} else {
				Even();
			}
		}
	}

	static void Odd() {
		System.out.println("❑❑❑❑    ❑❑❑❑    ❑❑❑❑");
	}
	
	static void Even() {
		System.out.println("    ❑❑❑❑    ❑❑❑❑    ");
	}
}
