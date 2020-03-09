import java.util.Scanner;

public class Maquina {

	public static void main(String[] args) {

		double valor = 0, total = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		do {
			System.out.printf("Insira o valor de uma moeda: \n", "%.2f");
			valor = leitor.nextDouble();
			if (valor == 0.10 || valor == 0.25) {
				total += valor;
			} else {
				System.out.println("Valor da moeda não é válido!!!");
			}
			
		} while (total < 0.45);
		System.out.printf("Você inseriu R$ %.2f - Retire a sua Coca-Cola!!!\n", total);
		
	}

}
