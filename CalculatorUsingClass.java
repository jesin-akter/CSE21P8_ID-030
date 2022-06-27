
package calculatorusingclass;
import java.util.Scanner;

public class CalculatorUsingClass {

    public static void main(String[] args) {
       System.out.println("**********General Calculator***********");
		while(true) {
			Scanner s = new Scanner(System.in);
			System.out.println("\tEnter your choice here: ");
			System.out.print("\tSelect 1. For Summation \n\tSelect 2.For Subtraction \n\tSelect 3.For Multiplication \n\tSelect 4.For Division \n\tSelect 5.For Modulas "
					+ "\n\tSelect 6.For Sine Operation \n\tSelect 7.For Cosine Operation \n\tSelect 8.For Minimum value \n\tSelect 9.For Maximum value \n\tSelect 10.For Root \n\tSelect 11.For Exit\n");

			double a, b;
			Cal c = new Cal();

			int ch = s.nextInt();

			switch(ch) {
			case 1:{
				System.out.print("Enter the value of a & b: ");
				a = s.nextDouble();
				b = s.nextDouble();
				c.sum(a, b);
				break;
			}
			case 2:{
				System.out.print("Enter the value of a & b: ");
				a = s.nextDouble();
				b = s.nextDouble();
				c.sub(a, b);
				break;
			}
			case 3:{
				System.out.print("Enter the value of a & b: ");
				a = s.nextDouble();
				b = s.nextDouble();
				c.mult(a, b);
				break;
			}
			case 4:{
				System.out.print("Enter the value of a & b: ");
				a = s.nextDouble();
				b = s.nextDouble();
				c.div(a, b);
				break;
			}
			case 5:{
				System.out.print("Enter the value of a & b: ");
				a = s.nextDouble();
				b = s.nextDouble();
				c.mod(a, b);
				break;
			}
			case 6:{
				System.out.print("Enter the angle in Degree: ");
				a = s.nextDouble();
				c.sin(a);
				break;
			}
			case 7:{
				System.out.print("Enter the angle in degree: ");
				a = s.nextDouble();
				c.cos(a);
				break;
			}
			case 8:{
				System.out.print("Enter the value of a & b: ");
				a = s.nextDouble();
				b = s.nextDouble();
				c.min(a, b);
				break;
			}
			case 9:{
				System.out.print("Enter the value of a & b: ");
				a = s.nextDouble();
				b = s.nextDouble();
				c.max(a, b);
				break;
			}
			case 10:{
				System.out.println("Enter the value of a: ");
				a = s.nextDouble();
				c.root(a);
				break;
			}

			case 11: System.exit(0);

			default: System.out.println("Invalid input!");
			}

		}


	}
    }
    



