import java.util.Scanner;

public class pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	
	
		System.out.println("Insérez un nombre");
		
		Scanner sc= new Scanner(System.in);
		int nombre = sc.nextInt();
		
	
		if (nombre >= 0) {
			
			
			System.out.println("Positif");
			
			
		}else 
			System.out.println("Négatif");
		
		
	
	
	    if (nombre % 2 == 0) {
	    	
	    	System.out.println(" & pair ");
	    	
	    }else
	    	
	    	System.out.println(" & impair ");

}

}