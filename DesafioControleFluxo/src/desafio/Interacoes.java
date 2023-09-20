package desafio;

import java.util.Scanner;

public class Interacoes {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
				
		int number1 = Scan.nextInt();
		
		System.out.println();
		
		System.out.print("Digite o segundo número: ");
		
		int number2 = Scan.nextInt();
		
		if(number2 <  number1){
			
				
			System.out.println("O número 1 deve ser maior do que o número 2");
			
			System.exit(0);
			
			
		}
		
		else {
			
			int quantidade = 0;
			
			for(int i = number1; i < number2; i++) {
				
				
				System.out.println("Imprimindo o número " + i);
				
				quantidade++;
				
					
				
			}
			
			System.out.println("A quantidade de interações foi: " + quantidade);
			
			
			
		}

	}

}
