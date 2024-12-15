package ex2_QA_winter_groub_b_Mohamed.ex2_QA_winter_groub_b_Mohamed;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
/**
 * /**
 * Hello world!
 * Mohamed Agbaryh 211405568 
 * Yazed Diab 314744228

 */

public class AppTest {
	question_1 Tester=new question_1();

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    @Test  public void TC_1(){
    	String Expected_Result=" No Roots";
    	int a=5,b=8,c=10;
    	String actual_result=Tester.calc_roots(a,b,c);
    	assertEquals(Expected_Result, actual_result);
    	
    }

@Test  public void TC_2(){
	String Expected_Result=" No Roots";
	int a=6,b=8,c=10;
	String actual_result=Tester.calc_roots(a,b,c);
	assertEquals(Expected_Result, actual_result);
	
}
@Test  public void TC_3(){
	String Expected_Result="There is Two roots ";
	int a=199,b=180,c=10;
	String actual_result=Tester.calc_roots(a,b,c);
	assertEquals(Expected_Result, actual_result);
	
}
@Test  public void TC_4(){
	String Expected_Result="There is Two roots ";
	int a=200,b=180,c=10;
	String actual_result=Tester.calc_roots(a,b,c);
	assertEquals(Expected_Result, actual_result);
	
}
@Test  public void TC_5(){
	String Expected_Result=" No Roots";
	int a=8,b=5,c=10;
	String actual_result=Tester.calc_roots(a,b,c);
	assertEquals(Expected_Result, actual_result);
	
}
@Test  public void TC_6(){
	String Expected_Result=" No Roots";
	int a=10,b=6,c=8;
	String actual_result=Tester.calc_roots(a,b,c);
	assertEquals(Expected_Result, actual_result);
	
}
@Test  public void TC_7(){
	String Expected_Result="There is Two roots ";
	int a=5,b=199,c=10;
	String actual_result=Tester.calc_roots(a,b,c);
	assertEquals(Expected_Result, actual_result);
	
}
@Test  public void TC_8(){
	String Expected_Result="There is Two roots ";
	int a=6,b=200,c=9;
	String actual_result=Tester.calc_roots(a,b,c);
	assertEquals(Expected_Result, actual_result);
	
}
@Test  public void TC_9(){
	String Expected_Result=" No Roots";
	int a=8,b=10,c=5;
	String actual_result=Tester.calc_roots(a,b,c);
	assertEquals(Expected_Result, actual_result);
	
}
@Test  public void TC_10(){
	String Expected_Result=" No Roots";
	int a=8,b=8,c=6;
	String actual_result=Tester.calc_roots(a,b,c);
	assertEquals(Expected_Result, actual_result);
	
}
@Test  public void TC_11(){
	String Expected_Result="There is Two roots ";
	int a=6,b=180,c=199;
	String actual_result=Tester.calc_roots(a,b,c);
	assertEquals(Expected_Result, actual_result);
	
}
@Test  public void TC_12(){
	String Expected_Result="There is Two roots ";
	int a=5,b=180,c=200;
	String actual_result=Tester.calc_roots(a,b,c);
	assertEquals(Expected_Result, actual_result);
	


}
}
