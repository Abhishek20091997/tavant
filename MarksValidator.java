package day2;

public class MarksValidator {
	String Grade;
 public boolean isPass(int marks) {
	 if (marks>=40) {
		 return true;
	 }
	 else {
		 return false;
	 }
 }
 public String markGrade(int marks) {
	 String Grade = null;
	 if(isPass(marks)==true) {
		 if(marks>90)
			  Grade = "A";
		 else if(marks>75)
			  Grade = "B";
		 else if(marks>60)
			  Grade = "C";
		 else
			  Grade = "D";
	 }
	return Grade;
	 
 }
 public String Switcher(int marks) {
	 String grade = null;
	 if(isPass(marks)==true)
	 { if(marks>=70&&marks<=75)
	 {
		 switch(marks)
		 {
		 case 70:case 71:case 73:case 74:case 75:
			 grade="C";
			 break;
		 }
	 }
	 else
	 {
	 switch (marks/10)
	 {
	 case 10:
	 case 9:
		 grade="A";
		 break;
	 case 8:
	 case 7:
		 grade="B";
		 break;
	 case 6 :
		 grade="C";
		 break;
     default:
    	 grade="D";
		 break;
	 }
	 }}
	 
	return grade;
 }
 public static void main(String s[])
 {
	 MarksValidator mark=new MarksValidator();
	System.out.println( mark.isPass(95));
	System.out.println("By If-Else"+mark.markGrade(74));
	System.out.println("By Switch"+mark.Switcher(74));
 }
}
