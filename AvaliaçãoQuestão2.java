package Exercicios;

import java.util.Scanner;

public class AvaliaçãoQuestão2 {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome;
        double vendas, salario;
        char continuar = 's'; // inicia com 's' para entrar no loop

        while (continuar == 's' || continuar == 'S') {

            System.out.print("Digite o nome do vendedor: ");
            nome = input.nextLine();

            System.out.print("Digite o total de vendas (R$): ");
            vendas = input.nextDouble();

            // cálculo da comissão
            salario = vendas * 0.17;

            // relatório
            System.out.println("\n--- Relatório ---");
            System.out.println("Nome: " + nome);
            System.out.println("Total de vendas: R$ " + vendas);
            System.out.println("Salário (comissão): R$ " + salario);
            System.out.println("------------------\n");

            System.out.print("Deseja digitar outro vendedor? (s/n): ");
            continuar = input.next().charAt(0);

            input.nextLine(); // limpar buffer
        }

        System.out.println("Programa encerrado.");
        input.close();
    }
}