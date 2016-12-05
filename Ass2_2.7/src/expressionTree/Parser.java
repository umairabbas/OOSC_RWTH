package expressionTree;
import java.util.regex.Pattern;

public interface Parser {
	
	public static Node toTree(String s){
		return braketParse(s, 0)._1();
	}
	
	
	static Tupple<Node, Integer> braketParse(String s, int nbBrakets) throws IllegalArgumentException{	
		
		int i=0;
		boolean haveBrakets = false;
		while(i<s.length() &&  !haveBrakets){
			
			Character c = s.charAt(i);
			if(c.equals('(')){
				++nbBrakets;
				haveBrakets = true;
				if(i != 0){ // not first position
					Op.Operator o = Op.Operator.getOp(s.charAt(i-1));
					Tupple<Node, Integer> t1 = braketParse(s.substring(0, i-1), nbBrakets);
					Tupple<Node, Integer> t2 = braketParse(s.substring(i + 1), nbBrakets);
					Op op = new Op(o, t1._1(), t2._1());
					nbBrakets = t2._2();
					return new Tupple<>(op, nbBrakets);
				}
				else{
					Tupple<Node, Integer> t = braketParse(s.substring(i + 1), nbBrakets);
					nbBrakets = t._2();
					return new Tupple<>(t._1(), nbBrakets);
				}	
			}
			else if(c.equals(')')){
				if(nbBrakets == 0) {
					throw new IllegalArgumentException("The formula is not corrected braketed");
				}
				--nbBrakets;
				haveBrakets = true;
				if(i != s.length() - 1){
					Op.Operator o = Op.Operator.getOp(s.charAt(i+1));
					Tupple<Node, Integer> t1 = braketParse(s.substring(0, i), nbBrakets);
					Tupple<Node, Integer> t2 = braketParse(s.substring(i + 2), nbBrakets);
					Op op = new Op(o, t1._1(), t2._1());
					nbBrakets = t2._2();
					return new Tupple<>(op, nbBrakets);
				}
				else{
					Tupple<Node, Integer> t = braketParse(s.substring(0, i), nbBrakets);
					nbBrakets = t._2();
					return new Tupple<>(t._1(), nbBrakets);
				}
			}
			++i;
		}
		
		// expression withoutBracket
		if(!haveBrakets){
			return new Tupple<>(plusParse(s), nbBrakets);
		}
		else{
			throw new IllegalArgumentException("The formula is not corrected braketed");
		}
	}
	
	
	
	
	
	
	static Node concat(Node[] nodes, Op.Operator op, int idxBegin) throws IllegalArgumentException{
		if(nodes.length == 0) throw new IllegalArgumentException("The array do not have to be empty");
		else if(idxBegin == nodes.length - 1){
			return nodes[idxBegin];
		}
		else{
			Node node1 = nodes[idxBegin];
			Node node2 = concat(nodes, op, ++idxBegin);
			return new Op(op, node1, node2);
		}
	}

	
	static Node plusParse(String s) throws NumberFormatException{
		Character firstSymbol = s.charAt(0);
		Character lastSymbol = s.charAt(s.length() - 1);
		if(firstSymbol.equals('+') || lastSymbol.equals('+')){
			throw new IllegalArgumentException("The formula is not coorect");
		}
		
		String[] plus = s.split(Pattern.quote("+"));
		Node[] nodes = new Node[plus.length];
		for(int i=0; i<plus.length; ++i){
			nodes[i] = (Node) minusParse(plus[i]);
		}
		
		return concat(nodes, Op.Operator.PLUS, 0);
	}
	
	static Node minusParse(String s) throws NumberFormatException{
		Character firstSymbol = s.charAt(0);
		Character lastSymbol = s.charAt(s.length() - 1);
		if(firstSymbol.equals('-') || lastSymbol.equals('-')){
			throw new IllegalArgumentException("The formula is not coorect");
		}
		
		String[] minus = s.split(Pattern.quote("-"));
		Node[] nodes = new Node[minus.length];
		for(int i=0; i<minus.length; ++i){
			nodes[i] = timesParse(minus[i]);
		}
		
		return concat(nodes, Op.Operator.MINUS, 0);
	}
	
	static Node timesParse(String s) throws NumberFormatException{
		Character firstSymbol = s.charAt(0);
		Character lastSymbol = s.charAt(s.length() - 1);
		if(firstSymbol.equals('*') || lastSymbol.equals('*')){
			throw new IllegalArgumentException("The formula is not coorect");
		}
		
		String[] times = s.split(Pattern.quote("*"));
		Node[] nodes = new Node[times.length];
		for(int i=0; i<times.length; ++i){
			nodes[i] = moduloParse(times[i]);
		}
		return concat(nodes, Op.Operator.TIMES, 0);
	}
	
	static Node moduloParse(String s) throws NumberFormatException{
		Character firstSymbol = s.charAt(0);
		Character lastSymbol = s.charAt(s.length() - 1);
		if(firstSymbol.equals('%') || lastSymbol.equals('%')){
			throw new IllegalArgumentException("The formula is not coorect");
		}
		
		String[] times = s.split(Pattern.quote("%"));
		Node[] nodes = new Node[times.length];
		for(int i=0; i<times.length; ++i){
			nodes[i] = divideParse(times[i]);
		}
		return concat(nodes, Op.Operator.MODULO, 0);
	}
	
	static Node divideParse(String s) throws NumberFormatException{
		Character firstSymbol = s.charAt(0);
		Character lastSymbol = s.charAt(s.length() - 1);
		if(firstSymbol.equals('/') | lastSymbol.equals('/')){
			throw new IllegalArgumentException("The formula is not coorect");
		}
		
		String[] divide = s.split(Pattern.quote("/"));
		Val[] vals = new Val[divide.length];
		for(int i=0; i<divide.length; ++i){
			vals[i] = new Val(Double.parseDouble(divide[i]));
		}
		return concat(vals, Op.Operator.DIVIDE, 0);
	}
	
}