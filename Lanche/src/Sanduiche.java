

import java.util.Scanner;

public class Sanduiche extends Lanche {
	protected int tempo = 15;


	@Override
	protected void setIngredientes(String[] ingredientes) {
	}

	void menuSanduiche(Lanche lanche) {

		Scanner teclado = new Scanner(System.in);
		String[] ingredientes = new String[10];
		String ingrediente = "";
		int i = 0;
		int distancia;

		System.out.println("Voce está no Menu do Sanduiche");
		System.out
				.println("Escolha os seguintes ingredientes ( caso queira finalizar sua escolha aperte 0)");
		System.out.println("\n[1] Calabresa \n[2] Queijo\n[3] Carne\n[4] Doce\n"
				+ "[5] Ervilha\n[6] Milho\n[7] Molho verde\n[8] Parmesão\n[9] Queijo Com Carne\n[10] 4 Queijos");

		while (i < 10 && !ingrediente.contentEquals("0")) {
			ingrediente = teclado.nextLine();
			ingredientes[i] = ingrediente;
			i++;

		}
		super.setPreco(10.00);
		System.out.println("Informe sua distancia em km : ");
		distancia = teclado.nextInt();
		super.setTempo(distancia);
		System.out.println("O valor de seu sanduiche é : " + super.getPreco() + " reais");
		System.out.println("Seu pedido vai ser entrege em " + super.getTempo(tempo)+ " minutos");

	}

}
