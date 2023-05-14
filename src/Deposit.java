import java.util.Scanner;

public class Deposit {
    
    int amountInTheAccount = 50000;
    
    public static int deposit(int amountInTheAccount){
        /*int amountInTheAccount = 50000;*/
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the amount you wish to deposit: ");
        int amountDeposited = scanner.nextInt();
        int totalAmount = amountInTheAccount + amountDeposited;
        
        System.out.println("your account balance is " + totalAmount);

        SignIn.activity();
        Atm.switchClass();
        return totalAmount;
    }
    
    public static void main(String[] args) {
        deposit(50000);
    }
}
