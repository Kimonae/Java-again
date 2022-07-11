import java.util.Scanner;

public class Prenoms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Entrez votre Prénom, Nom");
		Scanner sc= new Scanner(System.in);
		String prenom =sc.nextLine();
		Scanner sc2= new Scanner(System.in);
		String nom =sc.nextLine(); 
		
		System.out.println("Saisissez un Age"); 
		int age = sc.nextInt();
		Scanner sc3= new Scanner(System.in);
		System.out.println(prenom + nom + age); 
	}

}
