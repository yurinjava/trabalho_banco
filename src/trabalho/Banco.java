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
		System.out.print("Entre com o numero da conta poupan�a: ");
		int poupanca = sc.nextInt();
		System.out.print("Entre com o saldo inicial da conta poupan�a: ");
		double saldoPoupanca = sc.nextDouble();
		
		System.out.println("------------------------------------------------------");
		
		double opCorrente, opPoupanca;
		String  test="y",nula;
	
		
		while("y".equals(test)){
			System.out.println("Qual opera�ao deseja realizar?");
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
							opCorrente = sc.nextDouble();
							saldoCorrente+=opCorrente;
							System.out.println("o saldo atual da conta "+corrente+" e "+saldoCorrente);
							
							System.out.println("deseja realizar alguma outra operecao? y/n ");
							nula=sc.nextLine();
							 test = sc.nextLine();
							
						}else if(resp1==2) {
							System.out.println("Qual valor deseja creditar na conta "+poupanca+" ?");
							opPoupanca = sc.nextDouble();
							saldoPoupanca += opPoupanca;
							System.out.println("o saldo atual da conta "+poupanca+" e "+saldoPoupanca);
							
							System.out.println("deseja realizar alguma outra operecao? y/n ");
							nula=sc.nextLine();
							 test = sc.nextLine();
						}else {
							System.out.println("Erro! opcao invalida.");
						}
						break;
					}
					case 2:{
						System.out.println("Em qual conta deseja debitar? ");
						System.out.println("1-Corrente");
						System.out.println("2-Poupanca");
						int resp2=sc.nextInt();
						if(resp2==1) {
							System.out.println("Qual valor deseja debitar da conta "+corrente+" ?");
							opCorrente=sc.nextInt();
							saldoCorrente -=opCorrente;
							System.out.println("O valor atual da conta "+corrente+" e de "+saldoCorrente);
							
							System.out.println("deseja realizar alguma outra operecao? y/n ");
							nula=sc.nextLine();
							 test = sc.nextLine();
						}else if(resp2==2) {
							System.out.println("Qual valor deseja debitar da conta "+poupanca+" ?");
							opPoupanca=sc.nextInt();
							saldoPoupanca -=opPoupanca;
							System.out.println("O valor atual da conta "+poupanca+" e de "+saldoPoupanca);
							
							System.out.println("deseja realizar alguma outra operecao? y/n ");
							nula=sc.nextLine();
							 test = sc.nextLine();
						}
						
						break;
					}
					case 3:{
						System.out.println("tranferir");
						break;
					}
					case 4:{
						System.out.println("------------------------------------------");
						System.out.println("seu saldo da conta corrente � "+saldoCorrente);
						System.out.println("seu saldo da conta poupanca � "+saldoPoupanca);
						System.out.println("------------------------------------------");
						System.out.println();
						System.out.println("deseja realizar alguma outra operecao? y/n ");
						nula=sc.nextLine();
						 test = sc.nextLine();
						break;
					}
					case 5:{
						test="n";
						break;
					}
				}		
		}
		System.out.println("Encerrando aplicacao ");
		sc.close();
	}
}
