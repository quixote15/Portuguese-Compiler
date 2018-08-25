package simpleAdder1.interpret;


/**
 *
 */
import simpleAdder.lexer.*;
import simpleAdder.node.*;

public class ComentarioAninhado extends Lexer
{ private int count;
  private TComentarioBloco comment;
  private StringBuffer text;
  // We define a constructor
  public ComentarioAninhado(java.io.PushbackReader in)
  { super(in);
  }
  // We define a filter that recognizes nested comments.
  protected void filter() throws LexerException
  { // if we are in the comment state
    if(state.equals(State.COMENTARIO))
    { // if we are just entering this state
      if(comment == null)
      { // The token is supposed to be a comment.
        // We keep a reference to it and set the count to one
    	if(token instanceof TComentarioBlocFimErrado) {
    		state = State.NORMAL;
    		throw new LexerException(null,"Erro de comentario de bloco. Linha:"+ token.getLine() +  ", posicao: "+ token.getPos() +"."); 
    	}
      		
    	else
    	{
        comment = (TComentarioBloco) token;
        text = new StringBuffer(comment.getText());
        count = 1;
        token = null; // continue to scan the input.
    	}
      }
      else
      { // we were already in the comment state
        text.append(token.getText()); // accumulate the text.
        if(token instanceof TComentarioBloco)
          count++;
        else if(token instanceof TComentarioBlocFimErrado)
          count--;
        if(count != 0)
        {
        	if(token instanceof EOF) {
        		
        		state = State.NORMAL;
        		throw new LexerException(null,"Erro de comentario de bloco. Linha:"+ token.getLine() +  ", posicao: "+ token.getPos() +" .");
        	}
        		    	
        		
        	
          token = null; // continue to scan the input.        
          
          
        }
        else
        { 
          //comment.setText(text.toString());
          token = comment; //return a comment with the full text.
          state = State.NORMAL; //go back to normal.
          comment = null; // We release this reference.
        }
      }
    }
  }
}