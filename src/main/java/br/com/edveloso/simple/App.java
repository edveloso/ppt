package br.com.edveloso.simple;
import java.util.*;
import java.io.*;
/**
 * Hello world!
 *
 */
public class App 
{	
    public static void main( String[] args ) throws IOException
    {

		final String ANSI_CLS = "\u001b[2J";
    	final String ANSI_HOME = "\u001b[H";
    	System.out.print(ANSI_CLS + ANSI_HOME);
    	System.out.flush();
    	int pontoComputador = 0;
    	int pontoDesafiante = 0;


    	while(true){
	        System.out.println( "Papel pedra tesoura!" );
	        System.out.println("Escolha um dos tres!");
	        Scanner scan = new Scanner(System.in);
	        String escolha = scan.nextLine();
	        
	        int codigo = Tipo.getTipoPor(escolha).getCodigo();
	        int codOponente = 0;
	        while(codOponente <= 0 ){
	        	codOponente = new Random().nextInt(3);
	        }	        
        	System.out.print(ANSI_CLS + ANSI_HOME);
        	System.out.flush();
        	System.out.println("Eu escolhi: " + escolha.toUpperCase());
			System.out.println("O cumputador escolheu: " + Tipo.getTipoPor(codOponente));

			String resultado = new String();
	        switch(codigo){
	        	case 1:
	        		resultado = new Pedra(codOponente).getResultado();
	        		System.out.println(resultado);		        		
	        		break;
	        	case 2:
	        		resultado = new Papel(codOponente).getResultado();
	        		System.out.println(resultado);		        		
	        		break;	        		
	        	case 3:
	        		resultado = new Tesoura(codOponente).getResultado();
	        		System.out.println(resultado);		        			        		
	        		break;

	        }
	        if(resultado.contains("venci")){
	        	pontoDesafiante++;
	        }
	        else if (resultado.contains("perdi")){
	        	pontoComputador++;
	        }
	        System.out.println("Pontos desafiante: "+ pontoDesafiante+ " Pontos Computador: "+ pontoComputador);
	        System.out.println("Quer jogar de novo?");

	   }     


    }
}
