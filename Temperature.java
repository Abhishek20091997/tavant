package day2;

public class Temperature {
	public double convertToFarenheit(double celsius)
	{
		double far = (celsius*9/5)+32;
		return (far);
	}
	public double convertToCelsius(double farenheit)
	{
		double cel =(farenheit - 32)*5/9;
		return (cel);
	}
	public static void main(String s[])
	{
		Temperature temp = new Temperature();
		System.out.println(String.format("%.2f",temp.convertToCelsius(57)));
		System.out.println(String.format("%.2f",temp.convertToFarenheit(44)));
		
		
	}

}
