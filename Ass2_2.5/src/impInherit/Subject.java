package impInherit;

public class Subject implements ISubject {

	String subjectName;
	
	public void setSubjectName(String s){
		if(s!=null && !s.isEmpty())
		this.subjectName = s;
	}
	
	public String getSubjectName(){
		return subjectName;
	}
}
