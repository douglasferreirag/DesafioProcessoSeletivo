package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class SelecionarCandidatura {
	
	static double valorPretendido() {
		
			return ThreadLocalRandom.current().nextDouble(1800,2200);
		
	}
	
	static void selecaoCandidatos() {
		
		String[] candidatos = {"SIMÃO", "PEDRO", "ANDRÉ", "TIAGO", "JOÃO", "FILIPE"
			, "BARTOLOMEU", "TOMÉ", "MATEUS", "TADEU", "THIAGO1"
								
		};
		
		int candidatosSelecionados = 0;
		
		int candidatoAtual = 0;
		
		double salarioBase = 2000.0;
		
		while( (candidatosSelecionados < 5) && (candidatoAtual < candidatos.length) ) {
			
			String candidato = candidatos[candidatoAtual];
			
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " solicitou este valor do salário " + salarioPretendido);
			
			if(salarioBase >= salarioPretendido) {
				
					System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
				
					candidatosSelecionados++;
				
			}
			
			
			candidatoAtual++;
				
			
		}
		
	}
	
	
		
	
	public static void main(String[] args) {
		
		
		
			selecaoCandidatos();
			
			
		
		
	}
	

}
