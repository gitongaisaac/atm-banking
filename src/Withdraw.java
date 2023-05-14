
import java.util.Scanner;

public class Withdraw {
    
    int amountInTheAccount = 50000;
    
    public static int withdraw (int amountInTheAccount){

        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the amount you wish to withdraw: ");
        int withdrawCash = scanner.nextInt();
        int totalAmount = amountInTheAccount - withdrawCash;
        System.out.println("Your account balance is: " + totalAmount);

        SignIn.activity();
        Atm.switchClass();
        return totalAmount;
    }
    
    public static void main(String[] args) {
        withdraw(50000);
    }
}
