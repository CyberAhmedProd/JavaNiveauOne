package ex3;

public class OperationArithmetique {
	public static void main(String[] args) {
		if(args.length !=2)
			System.out.println("Nombre parametres invalide(doit etre égale à 2.");
		else
		{
			int x = Integer.parseInt(args[0]); //class wrapper gere les type prémitif
			int y = Integer.parseInt(args[1]); // parseInt la chaine doit etre une chaine numérique sion on a une erreur
			System.out.println("La Somme de "+x+"+"+y+"="+(x+y));
			System.out.println("La différence de "+x+"*-"+y+"="+(x-y));
			System.out.println("La multiplication de "+x+"*"+y+"="+(x+y));
			if(y==0) 
				System.out.println("on peut pas diviser par 0");
			else
				System.out.println("La Soustraction de "+x+"/"+y+"="+(x/y));
		}
	}

}
