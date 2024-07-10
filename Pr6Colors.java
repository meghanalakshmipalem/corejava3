package ai.dv.ui.as;
import java.util.Scanner;
public class Pr6Colors {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter name of the color: ");
		String color = scan.next();
		scan.close();
		switch(color) {
			case "v": 	System.out.println("Violet color");
						break;
			case "i": 	System.out.println("Indigo color");
						break;
			case "b": 	System.out.println("Blue color");
						break;
			case "g": 	System.out.println("Green color");
						break;
			case "y": 	System.out.println("Yellow color");
						break;
			case "o": 	System.out.println("Orange color");
						break;
			case "r": 	System.out.println("Red color");
						break;
			default:    System.out.println("Unknown color");
						break;
		}
		
	}

}
