package test;
import org.junit.Assert;
import org.junit.Test;

import impInherit.ErasmusStudent;
import impInherit.Student;
import impInherit.Subject;

public class ErasmusStudentTest {
	
    @Test
    public void test_ErasmusUsedAsStudent() {
        Student EStudent = new ErasmusStudent();
        EStudent.setPersonName("Test_Name");
        String Name = EStudent.getPersonName();
        Assert.assertEquals("Test_Name", Name);
    }
    
    @Test
    public void test_ErasmusCanhaveSubject() {
        ErasmusStudent eStd = new ErasmusStudent();
        eStd.setPersonName("Test_Name_2");
        Subject subject = new Subject();
        subject.setSubjectName("Informatik");
        eStd.setSubject(subject);
        Subject sub1 = eStd.getSubject();
        String subStr = sub1.getSubjectName();
        Assert.assertEquals("Informatik", subStr);
    }
	
}
