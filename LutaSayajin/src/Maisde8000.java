import java.util.Scanner;

public class Maisde8000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// numero mair que 9000 É mais de 9000!!! :O
		// se for menor já era esperado 
		Scanner entrada = new Scanner(System.in);
		System.out.println("Um Sayajin esta sendo avaliado pelo o Calvo do Vegetta ,"
				+ "Qual o valor do poder de Luta do Oponete dele ?");
		int poderdeluta = entrada.nextInt();
		
		if ( poderdeluta > 9000 ) {
			System.out.println("É MAIS DE 9000!!!!! :O");
		} else {
			System.out.println("Ja era esperado de um verme como esse!");
		}
		entrada.close();
		
	}

}
