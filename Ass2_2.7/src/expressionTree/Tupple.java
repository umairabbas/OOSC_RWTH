package expressionTree;
public class Tupple<X, Y> {
	private final X x;
	private final Y y;

	public Tupple(X x, Y y) {
		this.x = x;
		this.y = y;
	}
	
	public X _1(){
		return x;
	}
	
	public Y _2(){
		return y;
	}
}