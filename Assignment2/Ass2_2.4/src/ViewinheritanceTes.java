

import static org.junit.Assert.*;

import org.junit.Test;

public class ViewinheritanceTes {

	@Test
	public void regularTest(){
		
		StudentType student = new Regular("Alex",20522);
		String type = student.getType();
		
		assertEquals("Regular",type);
		
	}
	
	@Test
	public void InternationalTest(){
		
		StudentType student = new International("Chihab",27522);
		String type = student.getType();
		
		assertEquals("International",type);
	}

	@Test
	public void exchangeTest(){
		
		StudentType student = new Exchange("Michele",38000);
		String type = student.getType();
		
		assertEquals("Exchange",type);
	}
	
	@Test
	public void freshmanTest(){

		StudentSeniority student = new Freshman("Peter",38421);
		String seniority = student.getSeniority();
		
		assertEquals("Freshman",seniority);
	}
	
	@Test
	public void sophomoreTest(){

		StudentSeniority student = new Sophomore("Max",30544);
		String seniority = student.getSeniority();
		
		assertEquals("Sophomore",seniority);
	}
	
	@Test
	public void juniorTest(){

		StudentSeniority student = new Junior("Anna",21349);
		String seniority = student.getSeniority();
		
		assertEquals("Junior",seniority);
	}

	@Test
	public void seniorTest(){
		
		StudentSeniority student = new Senior("Thomas",17555);
		String seniority = student.getSeniority();
		
		assertEquals("Senior",seniority);
	}
}
