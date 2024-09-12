import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        double radius = scanner.nextDouble(); 
        
        if(radius <= 0){
            System.out.print("Radius must be a positive.");
        } else {
            final double PI = 3.1416;
            
            double diameter = 2 * radius;
            double circumference = 2 * PI * radius;
            double area = PI * radius * radius;
            
            System.out.println("Diameter: " + diameter);
            System.out.println("Circumference: " + circumference);
            System.out.println("Area: " + area);
        }    
  }
}
