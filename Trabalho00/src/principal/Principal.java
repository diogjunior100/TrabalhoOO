package principal;

import java.util.Scanner;

import objetos.*;
import principal.*;


public class Principal {
	
	public static void main(String[] args) {
		ControlePaciente cad[] = new ControlePaciente[50];
		
		//telefone
		t1 = new Telefone(86, "999108399");
		t2 = new Telefone(86, "999469112");
		
		//horario
		h1 = new Horario(10, 20, "Segunda-feira e Terça-Feira", "Pela manha após o cafe");
		h2 = new Horario(12, 20, "Segunda-feira e Quarta-Feira", "Pela manhã após o almoco");
		
		//medicamento
		m1 = new Liquido("Ritalina", "Pfizer", "2 vezes ao dia", 2.5, 50, h1);
		m2 = new Comprimido("Dipirona", "EMS", "3 vezes ao dia", 2, 50, h2);
		
		//paciente
		p1 = new Paciente("03 de agosto", "Masculino", "Diogenes", "digo", t1, m1, "Vermelho");
		p2 = new Paciente("04 de agosto", "Masculino", "Jorge", "jfdofd", t2, m2,  "Azul");

		
		int opcao = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
				System.out.println("\nDigite uma opcao: ");
				opcao = sc.nextInt();
				//System.out.print("\n");
					
				switch (opcao) {
					case 1:
						cad[1] = new Cadastro(p1);
						cad[2] = new Cadastro(p2);
						break;
					case 2:
						//deletarPaciente;
						cad[1].deletar();
						break;
					case 3:
						System.out.println(cad[1].toString());
						System.out.println(cad[2].toString());
						break;
						
					case 0:
						break;
					default:
						System.out.println("Opção Inválida!\n");
						break;
					}
				} while (opcao != 0);
			
	}
		
}

