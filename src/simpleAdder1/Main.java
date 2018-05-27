package simpleAdder1;
 
import java.io.* ;
import java.io.FileReader;

import simpleAdder1.interpret.ComentarioAninhado;
import simpleAdder.lexer.*;
import simpleAdder.node.*;
  
public class Main {
	public static void main(String[] args){
		try{
			String arquivo = "tester.sa";
//			Lexer lexer = new Lexer(new PushbackReader(new FileReader(arquivo), 1024)); 			
			ComentarioAninhado lexer = new ComentarioAninhado(new PushbackReader(new FileReader(arquivo), 1024)); 			
//            lexer.next()
			
			Token token;
			
			while(!((token = lexer.next()) instanceof EOF)) {
            	if(token.getText() == " " || (int)token.getText().charAt(0) == 32) {
					System.out.print(" ");
				}else {
					if(token.getText() == "\n" || (int)token.getText().charAt(0) == 13 || (int)token.getText().charAt(0) == 10) {
						System.out.print("\n");
					}else {
						System.out.print(token.getClass().getSimpleName() + "(" + token.getText() + ")");
					}
				}
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}