import java.util.Scanner;

public class viraoun {

	public static void main(String[] args) {
		// furia maior = 80 trasforma se não n
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual a Fúria do Kakaroto? entre (0 - 100)  ");
		int furia = entrada.nextInt();
		
		if ( furia >= 80 && furia <=100) {
			System.out.println("KaKaroto conseguiu atinjir o SS4!");
			
		}  else if ( furia < 80 ) {
			System.out.println("kakaroto está muito calminho com seu cha de camumila");
			
		} else {
			System.out.println("Não foram solicitados numeros diferentes do que 0 - 100 ") ;
			
		}
		entrada.close();
	}

}
