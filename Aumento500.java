import java.util.Scanner;

/**
 * Programa para ler salarios dos funcionarios, e informar se receberam
 * aumentos.
 * @author Hudson
 *
 */
public class Aumento500 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double salario;
		String saida;
		while (true){
			System.out.println("Insira o salario do funcionario.");
			salario = leitor.nextDouble();
			if (salario <= 500){
				salario = (salario*1.2);
				System.out.println("Novo salario: R$"+ salario);
			
			}
			else {
				System.out.println("Nao recebe aumento.");
			}
			System.out.println("Digite fim para sair, qualquer outro para continuar.");
			saida = leitor.nextLine();// nao funciona//
			if (saida == "fim"){
				break;
			}
		}
		leitor.close();
	}
}
