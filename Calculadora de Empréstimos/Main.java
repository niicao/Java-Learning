import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Principal: ");
        Scanner scanner = new Scanner(System.in);
//        String principalString = scanner.next();
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        String annualInterestRateString = scanner.next();
        float annualInterestRate = Float.parseFloat(annualInterestRateString);
        float monthlyInterestRateDecimal = annualInterestRate / (12*100);
//        System.out.println(monthlyInterestRateDecimal);
        System.out.print("Number of Years: ");
        int numberOfYears = scanner.nextInt();
        int numberOfMonths = numberOfYears*12;

//        System.out.println("numberOfYears = " + numberOfYears);


        double mortgageCalc = (float) principal * monthlyInterestRateDecimal * Math.pow((1 + monthlyInterestRateDecimal), numberOfMonths)/((float) Math.pow((1 + monthlyInterestRateDecimal), numberOfMonths) - 1);
//        System.out.println("mortgageCalc = " + mortgageCalc);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(mortgageCalc);

//        System.out.println("principal = " + principal);
//        System.out.println("annualInterestRate = " + annualInterestRate);
//        System.out.println("numberOfYears = " + numberOfYears);
//        System.out.println("result = " + result);



//        System.out.print(principalString)
        System.out.print("Pagamento Mensal do Empréstimo: " + result + "\n");
    }
}

