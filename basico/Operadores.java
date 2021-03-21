package cursojava.basico;
/*
 * Classe de expicação e demostração
 * 
 * versao 1.0
 * 
 * autor Maykon Wagner
 * 
 * data 16-03-2021
 * 
 */

public class Operadores {

	public static void main(String[] args) {
		
		int numero1=10 ,numero2=8;
		/*      
		// Operadores aritiméticos + - * / %
		int resultado1 = numero1 + numero2;

		System.out.println(resultado1); 	
		  
		int resultado2 = numero1 - numero2;

		System.out.println(resultado2); 	
		
		int resultado3= numero1 * numero2; 	
		
		System.out.println(resultado3);
		
		double resultado4 = (double)numero1 / numero2; 
		
		System.out.println(resultado4);
		
		int resultado5= numero1 % numero2; 
		
		System.out.println(resultado5);
		*/
		/*
		
		//numero1= numero1 + 1;
		System.out.println(numero1++);
		
		System.out.println(++numero1);
		
		/* ***********incrementos antes e depois *************  
		 * com sinais ( ++ antes ou depois ) 
		 *  
		 /*		
		
		System.out.println(numero1+=10);
		
		System.out.println(numero1*=3);
		
		System.out.println(numero1/=4);
		
		System.out.println(numero1);
		
		 recebe o mesmo o valor
		//System.out.println(numero1=numero2);
		 
		 dois sinais igual (comparando)
		 System.out.println(numero1==numero2);
		 true ou false
		 
		 sinais de interrogação (diferente - desigualdade)
		 System.out.println(numero1 !  =numero2);
		 true ou false
		 */
		
		//OPERADORES DE RELACIONAMENTO
		/* 
		System.out.println(numero1 > numero2);
		System.out.println( numero1 >= numero2);
		System.out.println(numero1 <numero2);
		System.out.println( numero1 <= numero2);
		 */
		
		//OPERADORES LOGICOS && ||  
		
		
		System.out.println("falso e falso:"+(false&&false));
		System.out.println("falso e verdadeiro:"+(false&&true));
		System.out.println("verdadeiro e falso:"+(true&&false));
		System.out.println("verdaeiro e verdadeiro:"+ (true&&true));
		
		System.out.println();
		
		System.out.println("falso OU falso:"+(false||false));
		System.out.println("falso OU verdadeiro:"+(false||true));
		System.out.println("verdadeiro OU falso:"+(true||false));
		System.out.println("verdaeiro OU verdadeiro:"+ (true||true));
		
		
		
		
		
		
		
		
		
	}

}
