
import java.util.Scanner;

public class Massa extends Lanche {
	
	private int tempo = 30 ;

	@Override
	protected void setIngredientes(String[] ingredientes) {

	}

	void menuMassa(Lanche lanche) {
		
		Scanner teclado = new Scanner(System.in);
		String[] ingredientes = new String[4];
		String ingrediente = "";
		String[] molhos = new String[4];
		String molho= "";
		
		int i = 0;
		int distancia;
		

		System.out.println("Você Selecionou Massa\n");
		System.out.println("Escolha o que voce quer em sua massa ( digite 0 para finalizar a escolha)");
		System.out.println("\n[1] Macarrão\n[2] Pizza\n[3] Lasanha");

		while (i < 10 && !ingrediente.equals("0")) {
			ingrediente = teclado.nextLine();
			ingredientes[i] = ingrediente;
			i++;

		}
		
		System.out.println("Voce Também pode escolher o molho que preferir, o que acha?\n");
		System.out.println("Selecione o tipo de molho que voce deseja\n( digite 0 para finalizar a escolha)");
		System.out.println("[1] Molho Verde\n[2]Molho Apimentado\n[3]Molho Vermelho");
		
		while (i < 10 && !molho.equals("0")) {
			molho = teclado.nextLine();
			molhos[i] = molho;
			i++;

		}
		
		
		
		
		super.setPreco(80.00);
		System.out.println("Informe sua distancia em km : ");
		distancia = teclado.nextInt();
		super.setTempo(distancia);
		System.out.println("O valor de sua Massa é : " + super.getPreco() + " reais");
		System.out.println("Seu pedido vai ser entrege em " + super.getTempo(tempo) + " minutos");
		
	}

}
