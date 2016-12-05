package expressionTree;

public class Main {

	public static void main(String[] args){
		String s1 = "(4%2)+(2+2)*(9-2)"; // should 28
		String s2 = "(4+2)*6/2"; // should 18
		String s3 = "(4+8*5)/(4+8*5)"; // should 1
		String s4 = "(4%2)-(2+2)/(3-4)"; // should 4
		String s5 = "(4%2)"; // should 0
		String s6 = "(2+2)*2"; // should 8

		
		System.out.println("S1: " + Parser.toTree(s1).eval());
		System.out.println("S2: " + Parser.toTree(s2).eval());
		System.out.println("S3: " + Parser.toTree(s3).eval());
		System.out.println("S4: " + Parser.toTree(s4).eval());
		System.out.println("S5: " + Parser.toTree(s5).eval());
		System.out.println("S6: " + Parser.toTree(s6).eval());

	}

}