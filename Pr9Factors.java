package ai.dv.ui.as;

import java.util.Scanner;

public class Pr9Factors {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = scan.nextInt();
		scan.close();
		System.out.println("Factors are: ");
		for(int i=1;i<=number;i++){
			if(number%i==0){
				System.out.println(i);
			}
		}
	}
}
