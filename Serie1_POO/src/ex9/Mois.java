package ex9;

public class Mois {
	public static void main(String[] args)
	{
		if(args.length !=1)
			System.out.println("Nombre parametres invalide(doit etre égale à 2.");
		else
		{
			int x = Integer.parseInt(args[0]);
			switch(x)
			{
			case 1: System.out.println("Jan");break;
			case 2: System.out.println("vef");break;
			case 3: System.out.println("mars");break;
			case 4: System.out.println("avr");break;
			case 5: System.out.println("mais");break;
			case 6: System.out.println("Jun");break;
			case 7: System.out.println("jui");break;
			case 8: System.out.println("o");break;
			case 9: System.out.println("spe");break;
			case 10: System.out.println("Jan");break;
			case 11: System.out.println("Jan");break;
			default : System.out.println("Jan");break;
			}
		}
	}
}
