package ai.dv.ui.as;
import java.util.Scanner;
public class Pr8Sum {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int number = scan.nextInt();
		scan.close();
		double sum = 0.0;
		for(int i=1;i<=number;i++){
			sum+=1.0/i;
		}
		System.out.println(sum);
	}
}
