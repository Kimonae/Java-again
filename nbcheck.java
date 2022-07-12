import java.util.Scanner;
public class nbcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Trouvez le nombre secret" );
		int aa= 0;
		int randoma = (int)(Math.random() * ((10-0)));
		
		while (aa != randoma) {
		Scanner sc= new Scanner(System.in);
		
		aa = sc.nextInt();
		
		
		System.out.println(aa);
		
		System.out.println("Et non ! Essayez encore" +aa );
		}
		if(aa == randoma) {
			
			System.out.println("Félicitation vous avez trouvé ! La valeur était: " +aa );
			
		}
		
		
		}
	}



