import java.util.Scanner;

public class Case extends account{

    public void cases() {

        Scanner s = new Scanner(System.in);
        users.add(Matt);
        users.add(Jacek);

        int screen = 0;
        while (screen == 0) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1-Create an account");
            System.out.println("2-Log in");
            System.out.println("0-close the console");
            String s1 = s.nextLine();
            switch (s1) {
                case "1":
                    add();
                    break;
                case "2":
                    log_In();
                    if(LoggedIn==true)
                        screen = 2;
                    else
                        screen = 0;
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error, no such command found");
                    break;
            }

         while (screen == 2) {
             System.out.println("1-Check balance");
             System.out.println("2-Withdraw money");
             System.out.println("3-Deposit money");
             System.out.println("4-Log out");
             System.out.println("0-Close the console");
             String s2 = s.nextLine();
             switch (s2) {
                 case "1":
                     Check_Balance();
                     break;
                 case "2":
                     withdraw();
                     break;
                 case "3":
                     deposit();
                     break;
                 case "4":
                     log_Out();
                     screen = 0;
                     break;
                 case "0":
                     System.exit(0);
                     break;
                 default:
                     System.out.println("Error, no such command found");
                     break;
             }
         }

        }
    }
}