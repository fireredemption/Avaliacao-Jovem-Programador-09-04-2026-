package Exercicios;

import java.util.Scanner;

public class AvaliaçãoQuestão4 {

	    public static void main(String[] args) {
	    	
	        Scanner input = new Scanner(System.in);

	        double[][] temp = {
	            {21.7,21.5,21.3,21.2,21.4,21.9,22.5,23.0,23.6,24.1,24.5,24.8,25.0,24.9,24.7,24.5,24.2,24.0,23.7,23.4,23.0,22.7,22.4,22.1},
	            {21.8,21.6,21.5,21.7,22.1,22.8,23.5,24.3,25.0,26.0,27.0,28.0,29.0,29.5,29.2,28.8,28.0,27.0,26.0,25.2,24.5,24.0,23.5,22.8},
	            {20.7,20.5,20.3,20.2,20.5,21.0,21.8,22.5,23.2,24.0,24.8,25.5,26.0,26.5,27.0,27.5,28.0,28.2,28.0,27.8,27.5,27.0,26.5,26.0},
	            {20.2,20.0,19.8,19.7,20.0,20.5,21.2,22.0,22.8,23.5,24.2,25.0,25.8,26.5,27.0,27.5,27.8,28.0,27.8,27.5,27.0,26.5,26.0,25.5},
	            {19.8,19.6,19.5,19.4,19.7,20.2,20.8,21.5,22.2,23.0,23.8,24.5,25.2,26.0,26.5,27.0,27.3,27.5,27.2,26.8,26.3,25.8,25.2,24.5},
	            {19.5,19.3,19.2,19.4,20.0,21.0,22.5,24.0,25.5,27.0,28.2,29.0,29.5,29.8,29.5,29.0,28.5,28.0,27.5,27.0,26.5,26.0,25.5,25.0},
	            {19.2,19.0,18.8,18.7,19.0,19.5,20.2,21.0,21.8,22.5,23.2,24.0,24.8,25.5,26.0,26.5,27.0,27.2,27.0,26.7,26.3,25.8,25.2,24.5}
	        };

	        String[] dias = {"domingo","segunda","terça","quarta","quinta","sexta","sabado"};

	        // A) MÉDIA DIA

	        System.out.print("Digite o dia da semana: ");
	        String dia = input.nextLine().toLowerCase();

	        int indiceDia = -1;
	        int i = 0;

	        while (i < dias.length) {
	        if (dia.equals(dias[i])) {
	                indiceDia = i;
	            }
	            i++;
	        }

	        if (indiceDia != -1) {
	          double soma = 0;
	          int j = 0;

	          while (j < 24) {
	                soma += temp[indiceDia][j];
	                j++;
	            }

	          double media = soma / 24;
	            System.out.println("Média do dia: " + media);
	        } else {
	            System.out.println("Dia inválido!");
	        }

	        // B) MÉDIA DE UMA HORA

	        System.out.print("\nDigite a hora (0 a 23): ");
	        int hora = input.nextInt();

	        if (hora >= 0 && hora < 24) {
	        double soma = 0;
	        int d = 0;

	        while (d < 7) {
	                soma += temp[d][hora];
	                d++;
	            }

	            double mediaHora = soma / 7;
	            System.out.println("Média da hora: " + mediaHora);
	        } else {
	            System.out.println("Hora inválida!");
	        }


	        // C) MAIOR AMPLITUDE

	        double maiorAmplitude = 0;
	        int diaMaior = 0;

	        int d = 0;
	        while (d < 7) {
	        double maior = temp[d][0];
	        double menor = temp[d][0];

	        int h = 1;
	        while (h < 24) {
	        if (temp[d][h] > maior) {
	                    maior = temp[d][h];
	       }
	        if (temp[d][h] < menor) {
	                    menor = temp[d][h];
	                }
	                h++;
	            }

	        double amplitude = maior - menor;
	        if (d == 0 || amplitude > maiorAmplitude) {
	                maiorAmplitude = amplitude;
	                diaMaior = d;
	            }

	            d++;
	        }

	        System.out.println("\nDia com maior amplitude térmica: " + dias[diaMaior]);
	        System.out.println("Amplitude: " + maiorAmplitude);

	        input.close();
	    }
	}