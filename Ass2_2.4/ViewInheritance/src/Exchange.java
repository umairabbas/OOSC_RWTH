
public class Exchange extends StudentType{

	public Exchange(String name, Integer id) {
		super(name, id);
	}

	public Exchange(String name, Integer id, String type) {
		super(name, id, type);
	}

	public String getType(){
		return "Exchange";
	}
}
