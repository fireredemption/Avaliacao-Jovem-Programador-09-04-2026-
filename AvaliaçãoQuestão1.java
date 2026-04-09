package Exercicios;

import java.util.Scanner;

public class AvaliaçãoQuestão1 {

	public static void main(String[] args) {

		        Scanner input = new Scanner(System.in);

		        double lado1, lado2, lado3;

		        System.out.print("Digite o primeiro lado: ");
		        lado1 = input.nextDouble();

		        System.out.print("Digite o segundo lado: ");
		        lado2 = input.nextDouble();

		        System.out.print("Digite o terceiro lado: ");
		        lado3 = input.nextDouble();

		        // Classificação
		        if (lado1 == lado2 && lado2 == lado3) {
		            System.out.println("Triângulo: Equilátero");
		        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
		            System.out.println("Triângulo: Isósceles");
		        } else {
		            System.out.println("Triângulo: Escaleno");
		        }

		        input.close();
		    }
		}	