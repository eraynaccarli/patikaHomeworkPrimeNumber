package patikaOdevAsalSayi;

public class App {

	public static void main(String[] args) {
		// bir sayac tanýmladýk
		int counter = 0;
		// 1 ve sýfýr olmadigi icin ikiden basladik 
		for(int i = 2; i <= 100; i++) {
			int control = 0;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					control = 1;
					break;
				}
				
			}
			if(control == 0) {
				System.out.print(i + " ");
				counter++;
			}
		}
	}

}
