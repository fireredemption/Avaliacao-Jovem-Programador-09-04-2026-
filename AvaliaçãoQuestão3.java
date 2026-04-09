package Exercicios;

import java.util.Scanner;

public class AvaliaçãoQuestão3 {

	public static void main(String[] args) {

		        Scanner input = new Scanner(System.in);

		        // Vetor Atribuído
		        int[] vetor = {6, 3, 1, 7, 4, 2, 3, 8, 4, 1};

		        int inicio, fim;

		        while (true) {
		            System.out.print("Digite o índice inicial: ");
		            inicio = input.nextInt();

		            System.out.print("Digite o índice final: ");
		            fim = input.nextInt();

		            if (inicio >= 0 && fim < vetor.length && inicio <= fim) {
		                break;
		            } else {
		                System.out.println("Índices inválidos! Tente novamente.\n");
		            }
		        }

		        // Novo Vetor
		        int tamanho = fim - inicio + 1;
		        int[] novoVetor = new int[tamanho];

		        int i = 0;
		        int j = inicio;

		        while (j <= fim) {
		            novoVetor[i] = vetor[j];
		            i++;
		            j++;
		        }

		        System.out.println("\nNovo vetor:");

		        i = 0;
		        while (i < novoVetor.length) {
		            System.out.print(novoVetor[i] + " ");
		            i++;
		        }

		        input.close();
		    }
		}