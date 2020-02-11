package ex1;

public class AfficheParametres {
	public static void main(String[] args) {
		if(args.length==0)
			System.out.println("Bonjour le monde");
		else
		
			for(int i=0;i<args.length;i++) {
				System.out.println(args[i]);
			}
		
			
	}
}
