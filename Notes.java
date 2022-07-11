import java.util.Scanner;

public class Notes {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Rentrez 3 notes");
		Scanner sc= new Scanner(System.in);
		int note1 = sc.nextInt();
		int note2 = sc.nextInt();
		int note3 = sc.nextInt();
		
		int note4 = note1 + note2 + note3;
		note4 = note4 /3;
		System.out.println(note4);
	}

}
