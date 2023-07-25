package curso_atualizado;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		String nome = "Jorge";
		String tipoConta = "Corrente";
		double saldo = 2500.00;
		
		String inicio = """
				    ***************************
				        Nome do Cliente: %s
				        Tipo de Conta: %s
				        Saldo: %f
				    ***************************
						""".formatted(nome, tipoConta, saldo);
		
		String operacoes = """
				Insira a operação desejada:
				1 - Consultar saldo
				2 - Transferir valor
				3 - Receber valor
				4 - Sair
				""";
		
		System.out.println(inicio);
		
		Scanner scan = new Scanner(System.in);
		int escolha = 0;
		
		while (escolha != 4) {
			System.out.println("\n" + operacoes);
			
			escolha = scan.nextInt();
			
			if (escolha == 1) {
				System.out.println("O saldo atual é R$ " + saldo);
			}
			
			if (escolha == 2) {
				System.out.println("Digite o valor a ser transferido");
				double valorTransferido = scan.nextDouble();
				if (saldo >= valorTransferido) {
					saldo -= valorTransferido;
					System.out.println("Tranferencia concluida. O novo saldo é R$ " + saldo);
				} else {
					System.out.println("Saldo insuficiente");
				}
				
			}
			
			if (escolha == 3) {
				System.out.println("Digite o valor a ser recebido");
				double valorRecebido = scan.nextDouble();
				saldo += valorRecebido;
				System.out.println("Recebimento concluido. O novo saldo é R$" + saldo);
			}
			
		}
		System.out.println("Encerrado");
		scan.close();
	}

}
