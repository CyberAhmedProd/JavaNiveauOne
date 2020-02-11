package ex2;

public class CompareParametre {
	public static void main(String[] args) {
		if(args.length !=2)
			System.out.println("Nombre parametres invalide(doit etre égale à 2.");
		else
		{
			int x = Integer.parseInt(args[0]); //class wrapper gere les type prémitif
			int y = Integer.parseInt(args[1]); // parseInt la chaine doit etre une chaine numérique sion on a une erreur
			if(x<y)
				System.out.println(x+" est < à"+y);
			else
				if(x>y)
					System.out.println(x+" est > à "+y);
				else
					System.out.println(x+" est égale à "+y);
				
			
		}
		
		
		
	}

}
