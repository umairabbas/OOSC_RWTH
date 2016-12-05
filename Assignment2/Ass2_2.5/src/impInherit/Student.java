package impInherit;

public class Student implements IPerson {
	
	int StdId;
	String StdName;
	
	
	public String getPersonName(){
		return StdName;
	}
	
	public void setPersonName(String Name){
		if(Name != null && !Name.isEmpty())
		this.StdName = Name;
	}

}
