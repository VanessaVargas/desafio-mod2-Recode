package umlJava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		//variáveis
		String nome;
		String endereco;
		int telefone;
		String cidade;
		String estado;
		int qtdDias;
		
		System.out.println("Sistema de Cadastro - Agência de Viagens");        

		//Utilizando while e scanner para pegar dados do cliente e destino da viagem
		int contador = 1;		
		while (contador > 0) {
			System.out.println (" ");
			System.out.println("Digite o nome do cliente: ");
			nome = sc.next();
			System.out.println("Endereço: ");
			endereco = sc.next();
			System.out.println("Telefone: ");
			telefone = sc.nextInt();
			System.out.println("Cidade de destino: ");
			cidade = sc.next();
			System.out.println("Estado: ");
			estado = sc.next();
			System.out.println("Quantidade de dias da viagem: ");
			qtdDias = sc.nextInt();
						
			//criando objetos e utilizando métodos de exibição
			Cliente Cad = new Cliente (nome, endereco, telefone);
			Destino Cad2 = new Destino (cidade, estado, qtdDias);

			System.out.println ("______________________________");
			Cad.exibe();
			Cad2.exibe();
			System.out.println ("______________________________");
			
			System.out.println ("Digite: \n" + "1 - Realizar novo cadastro \n" + "0 - Sair" );
			contador = sc.nextInt();	
		}
		
		System.out.println("**Sistema finalizado**");
		sc.close();
	}
}