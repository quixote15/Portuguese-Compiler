package simpleAdder1;
 
import java.io.* ;
import java.io.FileReader;

import simpleAdder.parser.Parser;

import simpleAdder1.interpret.ComentarioAninhado;
import simpleAdder.lexer.*;
import simpleAdder.node.*;
  
import simpleAdder.lexer.LexerException;
import simpleAdder.node.* ; 
  
import java.io.* ;
import java.io.FileReader;
  
public class Main {
	public static void main(String[] args) {
		try{
			
			//String arquivo = "C:\\Users\\João Cruz\\eclipse-workspace\\Test Sable Project 1.0\\Exemplos de Testes\\Caso 1.txt";
			String arquivo = "tester.sa";
			
			try {
				ComentarioAninhado lexer =
						new ComentarioAninhado(
								new PushbackReader(  
										new FileReader(arquivo), 1024)); 
	            Token token;
	            
				
				Parser p = new Parser(lexer);
            	
                Start start = p.parse();
                System.out.print(start.toString());
                //start.apply(new Printer());
                System.out.println("Sintaxe correta!");
            }
			catch(Exception e) {
            	e.printStackTrace();
            }
            /*
			while(true) {
				try {
					
					token = lexer.next();
					if(token instanceof EOF)
						break;
					else {
						printToken(token);

					}
					
				}
				catch (LexerException e) 
				{
					//token = lexer.next();

					System.out.print(e.getMessage());
					
				}
			}*/
	
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	static void printToken(Token token){
			if(token instanceof TBlank){
				System.out.print(token.getText());
			}
			else {
				System.out.print(token.getClass().getSimpleName());
			}	
	}
}