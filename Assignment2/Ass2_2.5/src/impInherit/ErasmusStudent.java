package impInherit;

public class ErasmusStudent extends Student  {

	protected Subject subject;	

	public void setSubject(Subject sub){
		this.subject = sub;
	}
	
	public Subject getSubject(){
		return subject;
	}

}
