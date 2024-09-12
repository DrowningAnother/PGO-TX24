import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in Pesos: ");
        double pesos = scanner.nextDouble(); 
        
        final double CONVERSION_FACTOR = 43.25;
        double dollars = pesos / CONVERSION_FACTOR;
 
        System.out.println("Equivalent amount in Dollars: " + dollars);
    
  }
}
