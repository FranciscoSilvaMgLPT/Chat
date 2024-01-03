import java.util.Scanner;

public class App {
    int option;
    User user;
    Scanner sc = new Scanner(System.in);
    UserManager userManager=new UserManager();


    public void start(){
        do{
            if(user==null) {
                System.out.println("1- Login\n2- Sign up\n0-Exit");
             switch (option=sc.nextInt()){
                 case 1:
                     user = userManager.login();
                     break;
                 case 2:

                     break;
                 case 0:
                     System.out.println("Goodbye!");
                     break;
                 default:
                     System.out.println("What?");
             }
            }else{
                System.out.println("1- Chat\n2- Who is online?\n0- Log out");
                switch (sc.nextInt()){
                    case 1:
                     //    User.connect();
                        break;
                    case 2:
                     //   User.showOnline;
                        break;
                    case 0:
                        System.out.println("Logging out! Bye "+user.name);
                        user=null;
                }



            }
        }while (option!=0);
    }

}
