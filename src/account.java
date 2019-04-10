import java.util.ArrayList;
import java.util.Scanner;

public class account extends person {

    ArrayList<person> users = new ArrayList<person>();
    boolean LoggedIn=false;
    boolean AccountExists=false;
    Scanner Login = new Scanner(System.in);
    boolean go=true;
    int who;

    person Matt = new person("reapermat","Matthew", "Ferry", "halo",2000);
    person Jacek = new person("cjaca","Jacek","Ciuba","elo",1500);

    public void log_In()
    {

        if(LoggedIn==true)
        {
            System.out.println("You're already logged in");
        }
        else {
            if(users.isEmpty())
            {
                System.out.println("Please add an account before logging in");
            }
            else {
                while (LoggedIn==false) {
                    System.out.println("Enter your login");
                    String username = Login.nextLine();
                    for (int i = 0; i < users.size(); ++i) {
                        if (users.get(i).get_login().equals(username)) {
                            System.out.println("Enter your Password");
                            String Password = Login.nextLine();
                            if (users.get(i).get_password().equals(Password)) {
                                System.out.println("Congrats "+ users.get(i).getFirstname()+ "! you have logged into your account ");
                                System.out.println("What would you like to do now?");
                                LoggedIn = true;
                                AccountExists=true;
                                who=i;
                                i=users.size();
                            } else {
                                System.out.println("Error-Try again!");
                                i--;
                            }
                        }

                    }
                if (AccountExists==false)
                    System.out.println("account doesn't exist try again");
                }
                AccountExists=false;
            }
        }
    }
    public void add() {
        while(go==true) {
            Scanner acc = new Scanner(System.in);
            System.out.println("please write your login");
            String login = acc.nextLine();
            for (int i = 0; i < users.size();i++) {
                if (users.get(i).get_login().equals(login)) {
                    System.out.println("Sorry an account with this login already exists");
                    System.out.println("Try a different login");
                    AccountExists=true;
                }
            }
            if(AccountExists==false) {
                System.out.println("First name: ");
                String firstName = acc.nextLine();
                System.out.println("Last name: ");
                String lastName = acc.nextLine();
                System.out.println("Password: ");
                String password = acc.nextLine();
                System.out.println("and the amount of money you would like to deposit");
                int balance = acc.nextInt();

                person newP = new person(login, firstName, lastName, password, balance);
                users.add(newP);
                go=false;
            }
            AccountExists=false;
        }
        go=true;


    }
    public void show()
    {
        System.out.println(users);
    }


    public void log_Out()
    {
        if (LoggedIn==true)
        {
            LoggedIn = false;
            System.out.println("You have successfully Logged out");
        }

        else
            System.out.println("you are already Logged out");
    }

    public void Check_Balance()
    {
        if(LoggedIn==true) {
            System.out.println("your total balance is: " + users.get(who).balance+ "zl");
        }
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
            if(money>=0) {
                if (users.get(who).balance >= money) {
                    users.get(who).balance = users.get(who).balance - money;
                    System.out.println("You have just withdrawn: " + money + "zl your current balance is: " + users.get(who).balance + "zl");
                } else
                    System.out.println("insufficient funds");
            }
            else
                System.out.println("Please enter a positive number");

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
            if(money >=0) {
                users.get(who).balance = money + users.get(who).balance;
                System.out.println("You have just deposited: " + money + "zl your current balance is: " + users.get(who).balance + "zl");
            }
            else
                System.out.println("Please enter a positive number");
        }
        else
            System.out.println("Please Log in to deposit money");
    }

}
