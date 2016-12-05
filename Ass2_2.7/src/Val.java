public class Val extends Node{

	private final double val;
	
	public Val(double val){
		this.val = val;
	}

	@Override
	public double eval() {
		return val;
	}
	
	@Override
	public String toString(){
		return "" + val;
	}
	
}