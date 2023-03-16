import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Principal (R$1000 - R$1,000,000): ");
        Scanner scanner = new Scanner(System.in);
        int principal = scanner.nextInt();
        while(principal < 1000 || principal > 1000000{
            System.out.println("Insira um valor dentro do intervalo R$1000 - R$1000000.");
            principal = scanner.nextInt();
        };



        System.out.print("Annual Interest Rate: ");

        String annualInterestRateString = scanner.next();
        float annualInterestRate = Float.parseFloat(annualInterestRateString);
        while(annualInterestRate < 0 || annualInterestRate >30){
            System.out.println("Insira um valor maior que 0 e menor ou igual a 30.");
            System.out.print("Annual Interest Rate: ");
            String annualInterestRateString = scanner.next();
            float annualInterestRate = Float.parseFloat(annualInterestRateString);
        }

        float monthlyInterestRateDecimal = annualInterestRate / (12*100);
        System.out.print("Number of Years(1-30): ");
        int numberOfYears = scanner.nextInt();

        while(numberOfYears < 1 || numberOfYears > 30 ){
            System.out.println("Insira um valor entre 1 e 30");
            System.out.print("Number of Years(1-30): ");
            numberOfYears = scanner.nextInt();
        }

        int numberOfMonths = numberOfYears*12;




        double mortgageCalc = (float) principal * monthlyInterestRateDecimal * Math.pow((1 + monthlyInterestRateDecimal), numberOfMonths)/((float) Math.pow((1 + monthlyInterestRateDecimal), numberOfMonths) - 1);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(mortgageCalc);



        System.out.print("Pagamento Mensal do Empréstimo: " + result + "\n");
    }
}

