package day1_selenium;

public class Demo {

	public static void main(String[] args) {
		int num1,num2,num3;
		num1=80;
		num2=70;
		num3=75;
		int ave=(num1+num2+num3)/3;
		int total=num1+num2+num3;
		System.out.println("Total Marks are := "+total);
		if(ave>75)
		System.out.println("Distinction");
		else if(ave>40)
		System.out.println("Pass");
		else
		System.out.println("Fail");
		}
}
