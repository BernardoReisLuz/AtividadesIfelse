import java.util.Scanner;

public class Sabio {

	public static void main(String[] args) {
		// se o chakra for =< que 1000 ativando o modo Sábio 
		// - 1000 ele não sabo
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Naruto está em uma briga complicada , mas não sabe se é possivel"
				+ "ativar  qual é o valor de Chakra ele contém ?" );
		 int sabido = entrada.nextInt();
		if( sabido <= 1000) {
			System.out.println("O modo Sábio consiguiu ser ativado, "
					+ "Naruto agora virou sua batalha por conta do modo Sábio ");
			
		}else {
			System.out.println("Naruto vai continuar apanhando até seu Chakra subir"
					+ " o suficiente");
		
	}
		entrada.close();
	}
}
