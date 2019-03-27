import java.util.ArrayList;
import java.util.Scanner;

public class Bankomat {

    public static void main(String[] arg)
    {
        account Matthew = new account();

        Scanner s = new Scanner(System.in);

    while(true){
        System.out.println("\nWhat would you like to do?");
        System.out.println("1-Log in");
        System.out.println("2-Check balance");
        System.out.println("3-Log out");
        System.out.println("4-Withdraw money");
        System.out.println("5-Deposit money");
        System.out.println("0-close the console");

        int sw = s.nextInt();

            switch (sw) {
                case 1:
                    Matthew.log_In();
                    break;
                case 2:
                    Matthew.Check_Balance();
                    break;
                case 3:
                    Matthew.log_Out();
                    break;
                case 4:
                    Matthew.withdraw();
                    break;
                case 5:
                    Matthew.deposit();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error, no such command found");
                    break;
            }
        }
    }
}
class account
{
    int Pin=1234;
    int balance=2000;
    boolean LoggedIn=false;
    Scanner Login = new Scanner(System.in);

    public boolean correctPin(int Pin)
    {
        if(Pin==1234)
            return true;
        else
            return false;
    }

    public void log_In()
    {
        if(LoggedIn==true)
        {
            System.out.println("You're already logged in");
        }
        else {
            System.out.println("Enter your Pin");
            int pin = Login.nextInt();
            if (correctPin(pin) == true) {
                System.out.println("congratulation you have logged into your account");
                LoggedIn = true;
            } else
                System.out.println("Error-Try again!");
        }
    }

    public void log_Out()
    {
        if (LoggedIn==true) {
            LoggedIn = false;
            System.out.println("You have successfully Logged out");
        }

        else
            System.out.println("you are already Logged out");
    }

    public void Check_Balance()
    {
        if(LoggedIn==true)
            System.out.println(balance + "zl");
        else
            System.out.println("Please Log in to your account to Check your balance");
    }

    public void withdraw()
    {
        if(LoggedIn==true)
        {
            Scanner Withdraw = new Scanner(System.in);
            System.out.println("What is the amount you would like to withdraw?:");
            int money = Withdraw.nextInt();
            if(balance >=money)
            balance =balance - money;
            else
                System.out.println("insufficient funds");

        }
        else
            System.out.println("Please Log in to withdraw money");
    }

    public void deposit()
    {
        if(LoggedIn==true)
        {
            Scanner Deposit = new Scanner(System.in);
            System.out.println("What is the amount you would like to deposit?:");
            int money = Deposit.nextInt();
            balance = money +balance;
        }
        else
            System.out.println("Please Log in to deposit money");
    }

}


