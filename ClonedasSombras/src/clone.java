import java.util.Scanner;

public class clone {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos clones o Naruto vai fazer ?");
		int clones = entrada.nextInt();
		if( clones > 5) {
			System.out.println("Caramba Narutin fez " + clones + " para seu exercito ");
		}else {
			System.out.println("Narutin fez um pouco de clones , somente " + clones +
					" para auxiliar no que necessitava");
		}
		entrada.close();
	}
	

}
