import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int entryNumber = scanner.nextInt();
        String print = new String();

        if(entryNumber % 5 == 0){
            print = entryNumber % 3 == 0 ? "FizzBuzz" : "Fizz";
        }

        else{
            print = entryNumber % 3 == 0 ? "Buzz" : Integer.toString(entryNumber);
        }

        System.out.println(print);

        scanner.close();
    }
}
