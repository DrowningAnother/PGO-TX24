import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

       
        double usdRate = 43.33089;
        double euroRate = 0.734719;
        double yuanRate = 6.346934;
        double korunaRate = 18.77263;
        double kroneRate = 5.449007;
        double sheqelRate = 3.726334;
        double dinarRate = 0.274588;

        
        System.out.print("Enter Philippine peso: ");
        double phpAmount = input.nextDouble();

        
        double usd = phpAmount / usdRate;
        double euro = usd * euroRate;
        double yuan = usd * yuanRate;
        double koruna = usd * korunaRate;
        double krone = usd * kroneRate;
        double sheqel = usd * sheqelRate;
        double dinar = usd * dinarRate;

        
        System.out.printf("\nThe amount's equivalent to:\n");
        System.out.printf("US Dollar is :\t%.3f\n", usd);
        System.out.printf("Euro :\t%.6f\n", euro);
        System.out.printf("Yuan :\t%.6f\n", yuan);
        System.out.printf("Koruna :\t%.5f\n", koruna);
        System.out.printf("Krone :\t%.6f\n", krone);
        System.out.printf("Sheqel :\t%.6f\n", sheqel);
        System.out.printf("Dinar :\t%.6f\n", dinar);

        // Close scanner
        input.close();
    }
}