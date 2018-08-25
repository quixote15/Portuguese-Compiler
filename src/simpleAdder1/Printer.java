package simpleAdder1;

import org.sablecc.sablecc.analysis.DepthFirstAdapter;
import org.sablecc.sablecc.node.Node;

import simpleAdder.node.Switch;

public class Printer extends DepthFirstAdapter implements Switch {
	int indent;
	
	public void printIndent(){
		for (int i = 0; i < indent; i++) {
			System.out.print("\u0009");
		}
	}
	
	public void printNode(Node node){
		printIndent();
		
        System.out.print(node.getClass().toString().replaceAll("class node\\.T?", ""));
		System.out.println(" |  "+node.toString() );
	}
	
	@Override
	public void defaultIn(Node node){
		printNode(node);
		indent++;
	}
	
	@Override
	public void defaultOut(Node node){
		indent--;
	}
}