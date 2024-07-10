package ai.dv.ui.as;
import java.util.Scanner;
public class Pr7Arithmetic {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNumber = scan.nextInt();
        System.out.print("Enter Operator: ");
        String operator = scan.next();
        scan.close();
        int result;
        if(operator.equals("+")) {
            result = firstNumber + secondNumber;
            System.out.println("Sum is: "+result);
        } else if(operator.equals("-")) {
            result = firstNumber - secondNumber;
            System.out.println("Difference is: "+result);
        }  else if(operator.equals("*")) {
            result = firstNumber * secondNumber;
            System.out.println("Product is: "+result); 
        } else if(operator.equals("/")) {
            result = firstNumber / secondNumber;
            System.out.println("Quotient is: "+result);
        } else if(operator.equals("%")) {
            result = firstNumber % secondNumber;
            System.out.println("Remainder is: "+result);
        }else {
            System.out.println("Invalid");
        }
    }
}
