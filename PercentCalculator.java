import java.util.Scanner;

public class PercentCalculator {

	public static void main(String[] args) {
		
		double total = result();
		System.out.println(total);
	}


		public static double result() {
			Scanner input=new Scanner(System.in);
			
			System.out.println("Starting Balance?");
			int balance= input.nextInt();
			
			System.out.println("What percent daily increase?");
			int percent=input.nextInt();
			double per=(percent/100.0)+1;
			System.out.println("How many days?");
			int day=input.nextInt();
			
			
			double result= balance*(Math.pow(per, day));
			return result;
		}
		
		
		
	

}
