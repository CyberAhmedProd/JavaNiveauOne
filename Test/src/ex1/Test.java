package ex1;

public class Test {
	static final int piece = 50;
	public static void main(String[] args) {
		int i = 258;
		long l =i;
		//ok
		//byte = i; on peut pas convertir 4  en 2
		//byte = 258; de meme 
		byte b = (byte) i ; 
		float x;
		x = 12.5f; 
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
		
		

	}

}