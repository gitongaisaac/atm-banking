import java.util.Scanner;

public class SignIn {
    
    public static void activity(){

        String activity = "Which account do you want to access"
                      + "\n1. Check balance"
                      + "\n2. Deposit "
                      + "\n3. Withdraw  "
                      + "\n4. Transfer  "
                      + "\n5. Transaction history"
                      + "\n6. Quit";
        
            System.out.println(activity);
    }

    public static void signIn() {
        
        int cardNo = 9804;
        int pinNo = 9804;
        Scanner scanner = new Scanner (System.in);
        
            System.out.print("Account Number: ");
        int enteredNo = scanner.nextInt();
        
            System.out.print("Pin number: ");
        int enteredPin = scanner.nextInt();  
        
        if (enteredNo != cardNo & enteredPin != pinNo) {
            for (int i = 1; i < 3; i++ ) {
                System.out.println("The details do not match");
                
                    System.out.print("Account Number: ");
                enteredNo = scanner.nextInt();

                    System.out.print("Pin number: ");
                enteredPin = scanner.nextInt();
            }
        }
        
        else
             activity();
        
    }
        
    public static void main(String[] args) {
//        signIn();
//        activity();
        
    }
}
