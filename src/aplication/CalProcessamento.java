package aplication;

public class CalProcessamento {

	public void CalDados(int op, Double vl1, Double vl2) {

		switch (op) {
		case 1:
			 
			System.out.println("Sua opção foi (Somar)");
			System.out.printf("Total %.2f", (vl1+vl2));

			break;
		case 2:
			
			System.out.println("Sua opção foi (Subtração)");
			System.out.printf("Total %.2f", (vl1-vl2));

			break;

		case 3:
			
			System.out.println("Sua opção foi (Multiplicação)");
			System.out.printf("Total %.2f", (vl1*vl2));

			break;

		case 4:
			
			System.out.println("Sua opção foi (Divisão)");
			System.out.printf("Total %.2f", (vl1/vl2));

			break;

		default:
			
			System.out.println("Opção invalida!");
			break;
		}

	}

}
