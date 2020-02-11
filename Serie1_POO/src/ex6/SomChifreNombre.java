package ex6;

public class SomChifreNombre {
	public static void main(String[] args) {
		if(args.length !=1)
			System.out.println("Nombre parametres invalide(doit etre égale à 2.");
		else
		{
			int x = Integer.parseInt(args[0]);
			int som = 0;
			if(x<=0)
				System.out.println("Nombre choisie n'est pas positif.");
			else {
					while(x!=0) {
						 som = som+(x%10);
						x = x/10;
					}
				System.out.println(som);
			}
			
				
		}
	}
}
