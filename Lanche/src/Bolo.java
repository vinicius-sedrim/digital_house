
import java.util.Scanner;

public class Bolo extends Lanche {
	
	private int tempo = 10 ;

	@Override
	protected void setIngredientes(String[] ingredientes) {

	}

	void menuBolo(Lanche lanche) {
		
		Scanner teclado = new Scanner(System.in);
		String[] ingredientes = new String[4];
		String ingrediente = "";
		int i = 0;
		int distancia;
		

		System.out.println("Você Selecionou Bolo");
		System.out.println("Escolha o que voce quer em seu bolo ( digite 0 para finalizar a escolha)");
		System.out.println("\n[1] Massa\n[2] Recheio\n[3] Cobertura");

		while (i < 10 && !ingrediente.equals("0")) {
			ingrediente = teclado.nextLine();
			ingredientes[i] = ingrediente;
			i++;

		}
		super.setPreco(50.00);
		System.out.println("Informe sua distancia em km : ");
		distancia = teclado.nextInt();
		super.setTempo(distancia);
		System.out.println("O valor de seu bolo é : " + super.getPreco() + " reais");
		System.out.println("Seu pedido vai ser entrege em " + super.getTempo(tempo) + " minutos");

	}

}
