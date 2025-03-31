import java.util.Scanner;

public class kame {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Rasengan ou Kamehameha? ");
		String furia = entrada.nextLine();
		
		if ( furia.equalsIgnoreCase("Rasengan") ) {
			System.out.println("Rasengan destruidor saindo ");
			
		}  else if (furia.equalsIgnoreCase("Kamehameha")  ) {
			System.out.println("Kamehameha destruidor saindo");
			
		} else {
			System.out.println("Não foi solicitado esse movimento ") ;
			
		}
		entrada.close();
	}

}
