package ex1; // package en minuscule 

public class Test {
	static final int piece = 50;
	public static void main(String[] args) {
		System.out.println("ça marche");
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Short.MIN_VALUE);
		int i = 258;
		long l =i;
		//ok
		//byte = i; on peut pas convertir 4  en 2
		//byte = 258; de meme 
		byte b = (byte) i ;  // forçage du contenue d'un addresse vers une autre address memoire autrement
		float x;
		x = 12.5f; // sans f elle sera interprété comme double 
		// pour convertir de double a float on ajoute f a la fin
		char c ='A';
		boolean testy = true;
				
		System.out.println("b="+testy);
		
		int n = 3, p=2;
		testy = n<p; // resultat d un test 
		System.out.println("b="+testy); 
		final int ni = 20;// on peut pas modifier une constante 
		//if(testy==true)
			//ni = 10;
		//else
			//ni =20;
			
		System.out.println("n="+ni);
		int x1 = -3;
		int valabs = (x1>=0)? x1 : -x1;
		System.out.println("valeur abs = "+valabs);
		
		int count;
		for(count=1;count<=5;count++) {
			System.out.println("debut tour"+count);
			if(count<4) continue;
			System.out.println("fin tour"+count);
		}
		System.out.println("fin boucle");
		
	// tableau a deux dim
		/*int t[][]= new int[5][];
		for(int j=0;j<t.length;j++)
		{
			t[j] = new	 int[5-j];
		}
		for(int j=0;j<t.length;j++)
		{
			for(int z=0;j<t[j].length;z++)
			{
				t[j][z]=j+z;
				System.out.println(t[j][z]+"|");
			}
			System.out.println("");
		} */
		
		// manuipulation des string
		
		String ch1 = "Bonjour";
		String ch2 = " Tout le monde";
		String ch3 = ch1+ch2;
		
		
		System.out.println(ch3);
		
		if(ch1.compareTo(ch2)==0)
			System.out.println("ch1 et ch2 sont égaux");
		else
			System.out.println("ch1 et ch2 ne sont  pas égaux");
		
		int a;
		a = 'A' - 1;
		System.out.println("cast implicite = "+a);
		
		
	}

}