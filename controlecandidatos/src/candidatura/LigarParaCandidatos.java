package candidatura;

import java.util.Random;

public class LigarParaCandidatos {
	
	public static void ligar() {
		
		String[] candidatos = {"SIMÃO", "PEDRO", "ANDRÉ", "TIAGO", "JOÃO", "FILIPE"
				, "BARTOLOMEU", "TOMÉ", "MATEUS", "TADEU", "THIAGO1"
									
			};
		
		for(String candidato: candidatos) {
			
				
				entrandoEmContato(candidato);
			
		}
		
		
		
	}
	
	static void entrandoEmContato(String candidato){
		
			int tentativasRealizadas = 1;
			
			boolean continuarTentando = true;
			
			boolean atendeu = false;
			
			do {
				
				atendeu = atender();
				
				continuarTentando = ! atendeu;
				
				if(continuarTentando)
					
					tentativasRealizadas++;
				
				else
					
					System.out.println("CONTATO REALIZADO COM SUCESSO.");
				
				
				
				
			}while(continuarTentando && tentativasRealizadas < 3);
			
			if(atendeu) 
				
					System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas  + " tentativa.");
					
			
			else
				
				System.out.println("NÂO CONSEGUIMOS CONTATO COM " + candidato + ". NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas  + " ATINGIDO.");
			
			
			
			
		
		
	}
	
	static boolean atender() {
		
			return new Random().nextInt(3) == 1;
		
		
	}
	
	public static void main(String[] args) {
			
			
			
			ligar();
			
			
		
		
	}
	

}
