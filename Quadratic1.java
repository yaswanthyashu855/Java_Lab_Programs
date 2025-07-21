// This code is written using Constructors 

import static java.lang.System.out;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Main {
 
  public static void main(String[] args) { 
     Scanner input = new Scanner(System.in);
    
     out.print("Enter the coefficent of x^2 : ");
     float a = input.nextFloat();
     out.print("Enter the coefficent of x : ");
     float b = input.nextFloat();
     out.print("Enter the constant: ");
     float c = input.nextFloat();

     Quadratic example = new Quadratic(a, b, c);
     example.display();
  }

}

class Quadratic {
  private float root1, root2;
  public float discriminant, real, imaginary;
  Quadratic(float a, float b, float c) {
    discriminant = b*b - 4*a*c;
  
   if(discriminant >= 0 ) {
     root1 = (float ) (-b + sqrt(discriminant)) / (2*a); 
     root2 = (float) (-b - sqrt(discriminant)) / (2*a); 
   }
   else {
    real = -b / (2*a);
    imaginary = (float) sqrt(-discriminant) / (2*a);
    }

  }
  
  public void display() {
   if(discriminant >= 0) {
      out.println("Roots are " + root1 + " and " + root2 + ".");
   }
   else {
      out.println("Roots are " + real + " + " + imaginary + "i , and " + real + "-" + imaginary + "i.");  
   }
 }
}
