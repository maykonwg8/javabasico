package cursojava.basico;
/*
 * Classe demostrativas de variaveis e constantes
 * 
 * versão 1.0
 * 
 * autor Maykon Wagner
 * 
 */
public class VariaveisEContantes {

	public static void main(String[] args) {
		
		// Criação de constantes
		final double ACELERACAO_GRAVIDADE_TERRA = 9.80665;
				
		//Criação de variaveis
		String nome="Jose ";

		int idade=48;
				
	    double peso=73.4,altura=1.73;
		
		char sexo='m', cnh='a';
		
		boolean doadorOrgaos=true;
		
		
		System.out.println("Nome: "+nome);
		
		System.out.println("Idade: "+idade);
		
		System.out.println("Peso:"+peso);
		
		System.out.println("Altura:"+altura);
		
		System.out.println("Sexo:  "+sexo);
		
		System.out.println("Habilitação:  "+cnh);
		
		System.out.println("Doador de Orgãos: "+doadorOrgaos);
		
		System.out.println(" Gravida na Terrra é: "+ACELERACAO_GRAVIDADE_TERRA+ "m/s2" );
		
			}

}
