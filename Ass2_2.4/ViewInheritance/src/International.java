
public class International extends StudentType{

	public International(String name, Integer id) {
		super(name, id);
	}

	public International(String name, Integer id, String type) {
		super(name, id, type);
	}
	
	public String getType(){
		return "International";
	}
}
