import java.util.Scanner;
/**
 * programa para checar se a pessoa pode receber o credito requisitado
 * @author Hudson
 *
 */
public class EmprestimoCredito {

	public static void main(String[] args) {
		double salario, prestacao;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira o salario bruto.");
		salario = leitor.nextDouble();
		System.out.println("Insira o valor da prestacao que foi pedido");
		prestacao = leitor.nextDouble();
		if (prestacao <= (salario*0.3)){
			System.out.println("Emprestimo pode ser concedido");
			
		}
		else{
			System.out.println("Emprestimo recusado.");
		}
		leitor.close();
		
	}
}
