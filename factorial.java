package day2;

public class Factorial {
	public int calculateFact(int n) {
		if (n==0)
			return 1;
		else
			return(n*calculateFact(n-1));
		
	}
	public static void main(String s[]) {
		Factorial f=new Factorial();
		System.out.print(f.calculateFact(5));
	}

}
