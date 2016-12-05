import java.util.HashMap;
import java.util.Map;

public class Op extends Node{
	public static enum Operator{
		PLUS("+"), MINUS("-"), TIMES("*"), DIVIDE("/"), MODULO("%");
		
		private final String op;
		private static Map<String, Operator> map = new HashMap<>();
		static{
			for(Operator op : Operator.values()){
				map.put(op.getOp(), op);
			}
		}
		private Operator(String op){
			this.op = op;
		}
		
		public String getOp(){
			return op;
		}
		
		public static Operator getOp(String op){
			return map.get(op);
		}
		public static Operator getOp(Character op){
			return map.get(op.toString());
		}
	}
	
	private final Operator op;
	private final Node node1;
	private final Node node2;
	
	public Op(Operator op, Node node1, Node node2){
		this.op = op;
		this.node1 = node1;
		this.node2 = node2;
	}
	@Override 
	public double eval(){
		switch (op) {
		case PLUS:
			return node1.eval() + node2.eval();
		case MINUS:
			return node1.eval() - node2.eval();
		case TIMES:
			return node1.eval() * node2.eval();
		case DIVIDE:
			return node1.eval() / node2.eval();
		case MODULO:
			return node1.eval() % node2.eval();
		default:
			return -1; // TODO: throw Errors
		}
	}
	
	@Override
	public String toString(){
		return node1.toString() + op.getOp() + node2.toString();
	}
	
}