package candidatura;

public class ImprimirSelecionados {
	
	static void imprimirSelecionados() {
		
		String[] candidatos = {"SIMÃO", "PEDRO", "ANDRÉ", "TIAGO", "JOÃO"
									
			};
			
		System.out.println("Imprimindo a lista de candidatos informando o índice do elemento.");
		
		for(int indice = 0; indice < candidatos.length; indice++)
			
			System.out.println("O candidato de nº " + (indice + 1) + " é " + candidatos[indice]);
		
		System.out.println("Forma abreviada de interação: for each.");
		
		for(String candidato: candidatos)
			
			System.out.println("O candidato selecionado foi: " + candidato);
		
	}
	

	public static void main(String[] args) {
		
		
		
		imprimirSelecionados();
		
		
	
	
	}
	

}
