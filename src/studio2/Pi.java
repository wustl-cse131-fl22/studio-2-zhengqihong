package studio2;

import java.util.Scanner;

public class Pi {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" Number of test ");
		double TryNumber = in.nextDouble();
		int count=1;
		double outside=0;
		double inside=0;
		while (count <= TryNumber)
		{
			double x_dart=Math.random();
			double y_dart=Math.random(); 
			double y_string = Math.sqrt(1-Math.pow(x_dart, 2));
			if (y_dart >= y_string)
			{
				outside++ ;
			}
			else 
			{
				inside++;
			}
			count++;
		}
		double f= inside / (inside+outside);
		double pi=4*f;
		System.out.println(" PI= "+pi);

	}

}
