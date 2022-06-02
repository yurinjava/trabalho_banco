package trabalho;
import java.util.Scanner;
public class Banco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com o nome do cliente: ");
		String nome = sc.nextLine();
		System.out.print("Entre com o numero da conta corrente: ");
		int corrente = sc.nextInt();
		System.out.print("Entre com o saldo inicial da conta corrente: ");
		double saldoCorrente = sc.nextDouble();
		System.out.print("Entre com o numero da conta poupança: ");
		int poupanca = sc.nextInt();
		System.out.print("Entre com o saldo inicial da conta poupança: ");
		double saldoPoupanca = sc.nextDouble();
		
		System.out.println("------------------------------------------------------");
		
		double crediCorrente, crediPoupanca;
		String  test="y";
	
		
		while(!"y".equals(test));{
			System.out.println("Qual operaçao deseja realizar?");
			System.out.println("1-Creditar");
			System.out.println("2-Debitar");
			System.out.println("3-Transferir");
			System.out.println("4-Saldo");
			System.out.println("5-Sair");
			
			int resposta = sc.nextInt();
				switch(resposta) {
					case 1:{
						System.out.println("qual conta deseja creditar? ");
						System.out.println("1-corrente ");
						System.out.println("2-poupanca ");
						int resp1 = sc.nextInt();
						if(resp1==1) {
							System.out.println("Qual o valor deseja creditar na conta "+corrente+" ?");
							crediCorrente = sc.nextDouble();
							saldoCorrente+=crediCorrente;
							System.out.println("o saldo atual da conta "+corrente+" e "+saldoCorrente);
							
							System.out.println("deseja realizar alguma outra operecao? y/n ");
							 test = sc.nextLine();
							
						}
						break;
					}
					case 2:{
						System.out.println("debitar");
						break;
					}
					case 3:{
						System.out.println("tranferir");
						break;
					}
					case 4:{
						System.out.println("seu saldo da conta corrente é "+saldoCorrente);
						System.out.println("seu saldo da conta poupanca é "+saldoPoupanca);
						break;
					}
					case 5:{
						System.out.println("Encerrando aplicacao ");
						test="n";
						break;
					}
				}
				

		}
		
		sc.close();
	}

}
