import java.util.Scanner;

public class Gen {

	public static void main(String[] args) {
		// + 50 aguenta 5 min
		//- 50 já ta na ilussão
		Scanner entrada = new Scanner(System.in);
		System.out.println("Itachi olhou diretamente em seu olho qual a sua resistência para " +
				"a ilussão dele ?" );
		int ilu = entrada.nextInt();
		if(ilu <= 50 ) {
			System.out.println("Sua ilussão já começou ");
		} else {
			System.out.println("Ok ainda tem 5 minutos para aguentar");
		}
		entrada.close();

	}

}
