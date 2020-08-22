import java.util.Scanner;

public class TestePrograma {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Lanche lanche = null;

		System.out.println("Bem Vindo ao Delivery \n");

		System.out.println("Por favor, selecione o seu lanche : \n");

		System.out.println("[1] sanduiches     [2] Massas          [3] Bolos \n");
		int opcao = teclado.nextInt();

		while (opcao != 1 && opcao != 2 && opcao != 3) {
			System.out.println("Opção Invalida, tente novamente");
			opcao = teclado.nextInt();
		}

		switch (opcao) {
		case 1:

			Sanduiche sanduiche = new Sanduiche();

			sanduiche.menuSanduiche(lanche);
			break;

		case 2:

			Massa massa = new Massa();
			massa.menuMassa(lanche);
			break;
		case 3:

			Bolo bolo = new Bolo();
			bolo.menuBolo(lanche);
			break;

		default:
			System.out.println("Escolha uma opção valida");
			break;

		}

	}

}
