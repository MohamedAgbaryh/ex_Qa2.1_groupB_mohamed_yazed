package ex2_QA_winter_groub_b_Mohamed.ex2_QA_winter_groub_b_Mohamed;

public class question_1 {
	public static String calc_roots(int a,int b,int c) {
	String output="";
	if ((a<5) || (200<a) || (b<5) || (200<b)||  (c<5) || (200<c)){
		output= " One Or more variable is not in range  ";
		return output;
	}
	double determinant= b*b-4*a*c;
	if (a==0) {
		output="No quadratic equation";
				return output;}
	
	if(determinant<0) {
		output=" No Roots";
		return output;
	}	
	else if (determinant==0) {
		output="One root Roots ";
		return output;
		
	}
	
	output="There is Two roots ";
	return output;
		
	

}
}

