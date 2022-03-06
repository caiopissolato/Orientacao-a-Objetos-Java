package funcionario;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Cria uma lista de funcionários
		ArrayList<Funcionario> lista = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		String nome;
		double salario;
		
		while(true) {
			System.out.printf("\nEntre com o nome do funcionario, \"fim\" para sair: ");
			nome = in.nextLine();
			if(nome.equalsIgnoreCase("fim")){
				break;
			}
			System.out.printf("Entre com o salario do funcionaro:");
			salario = Double.parseDouble(in.nextLine()); // CORRIGINDO PROBLEMA DO BUFFER
			lista.add(new Funcionario(nome, salario));
		}
		
		for(Funcionario f: lista) {
			System.out.printf("\nNome = %s, Salario = %.2f", f.getNome(), f.getSalario());
		}
		
		System.out.println("\n\nSalarios após o aumento");
		for(Funcionario f: lista) {
			f.aumentaSalario(10.0);
			System.out.printf("\nNome = %s, Salario = %.2f", f.getNome(),f.getSalario());
		}
		in.close();
	}
}