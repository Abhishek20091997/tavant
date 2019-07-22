package day2;

public class SumofNumbers {
public int Sum0fEven(int start,int end) {
	int sum=0;
	if (start%2==0) {
		for(int i=start;i<=end;i=i+2) {
			sum+=i;
		}
	}
		else {
			for(int i=start+1;i<=end;i=i+2) {
				sum+=i;
			}
		}
	
	return sum;
}
public int Sum0fOdd(int start,int end) {
	int sum=0;
	if (start%2==0) {
		for(int i=start+1;i<=end;i=i+2) {
			sum+=i;
		}
	}
		else {
			for(int i=start;i<=end;i=i+2) {
				sum+=i;
			}
		}
	
	return sum;
}
public static void main(String s[])
{
	SumofNumbers SoN=new SumofNumbers();
	System.out.println(SoN.Sum0fEven(20, 45));
	System.out.println(SoN.Sum0fOdd(20, 45));
}
}
