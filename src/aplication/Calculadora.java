package aplication;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		
		
		Double vl1, vl2;
		Integer op;
		String controle = "";
		Scanner sc = new Scanner(System.in);
		
		do {

						
			System.out.println("-------------------------------------CALCULADORA-----------------------------------");
			System.out.println("Digite o primeiro número: ");
			vl1 = sc.nextDouble();
			
			System.out.println("------------------------------------------------------------------------");
			System.out.println("Digite uma Opção");
			System.out.println("1 = Adição | 2 = Subtração | 3 = Multiplicação | 4 = Divisão");
			
			sc.nextLine();
			op = sc.nextInt();
			System.out.println("------------------------------------------------------------------------");
			
			
			System.out.println("Digite o segundo número: ");
			vl2 = sc.nextDouble();
			
			System.out.println("------------------------------------------------------------------------");
			
				
			CalProcessamento cp = new CalProcessamento();
			cp.CalDados(op, vl1, vl2);
			System.out.println();
			System.out.print("Yes - para continuar | No - para finalizar ? ");
			controle = sc.next();
			
			
			
		}while (controle.equals("Yes"));
		
		
		
		System.out.println("Calculadora finalizada com sucesso!");
		sc.close();
		
	}

}
