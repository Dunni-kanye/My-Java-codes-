import java.util.Scanner;

public class Physics {

public static void main(String[]args) {
Scanner input = new Scanner(System.in);

System.out.print(" Enter the value of acceleration ");
double acceleration = input.nextDouble();

System.out.print(" Enter the value of speed ");
double speed = input.nextDouble();

System.out.print( " Enter the value of length ");
double length = input.nextDouble();
double division = (speed * speed)/ (2 * acceleration); 

System.out.printf("%.2f" ,division);

   }

}










