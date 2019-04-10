import java.util.*;

public class person {

    String login;
    String firstname;
    String lastName;
    String password;
    int balance;

    public person(String login,String firstName, String lastName,String password,int balance)
    {
        this.login=login;
        this.firstname=firstName;
        this.lastName=lastName;
        this.password=password;
        this.balance=balance;
    }

    String get_login()
    {
        return login;
    }
    String get_password(){
        return password;
    }
    String getFirstname()
    {
        return firstname;
    }
    int getBalance()
    {
        return balance;
    }

    person()
    {
        super();
    }






























   /* int UserPassword;
    int balance;
    int PinLength;
    boolean correctPin=false;
    String user;
    HashMap<String, Integer> User = new HashMap<String, Integer>();
    Scanner Username = new Scanner(System.in);
    Scanner pin = new Scanner(System.in);
    Scanner money = new Scanner(System.in);
    public void add() {
        System.out.println("Please Write your name and then PIN ");
        user = Username.nextLine();
        while (correctPin == false) {
            UserPassword = pin.nextInt();
            PinLength = String.valueOf(UserPassword).length();
            if (PinLength==4) {
                User.put(user, UserPassword);
                System.out.println("How much money would you like to deposit into your new account?");
                balance = money.nextInt();
                correctPin = true;
            } else {
                System.out.println("incorrect Pin - should be 4 characters long please try again");
                correctPin = false;
            }

        }
        correctPin=false;

    }
    public void show(){
        System.out.println(User);
    }

    public boolean CheckForAccount()
    {
        if(User.isEmpty())
            return false;
        else
            return true;
    }
*/
/*
    int balance;
    boolean correctPin=false;
    String user;
    String password;
    HashMap<String, String> User = new HashMap<String, String>();
    Scanner Username = new Scanner(System.in);
    Scanner Password = new Scanner(System.in);
    Scanner money = new Scanner(System.in);
    public void add() {
                System.out.println("Please Write your name and then PIN ");
                user = Username.nextLine();
                password = Password.nextLine();
                User.put(user, password);
                System.out.println("How much money would you like to deposit into your new account?");
                balance = money.nextInt();
                correctPin = true;
    }

    public boolean correctPassword (String password)
    {
       return this.password.equals(password);
    }
*/
}
