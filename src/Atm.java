import java.util.Scanner;

public class Atm {

        public static void switchClass() {

            System.out.print("Account: ");

            Scanner scanner = new Scanner(System.in);
            int switchActivity = scanner.nextInt();

            switch (switchActivity){
                case 1:
                    CheckBalance.balance();
                    break;
                case 2:
                    Deposit.deposit(50000);
                    break;
                case 3:
                    Withdraw.withdraw(50000);
                    break;
                case 4:
                    Transfer.transfer();
                    break;
                case 5:
                    TransHis.transHis();
                    break;
                default:
                    SignIn.signIn();
            }

        }

        public static void loop() {
            int i = 0;
            do {
                Atm.switchClass();
            }
            while (i < 1);
        }


        public static void main(String[] args) {
//            loop();
            SignIn.signIn();
            switchClass();

        }

}