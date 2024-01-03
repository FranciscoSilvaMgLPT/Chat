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
                     userManager.login();
                     break;
                 case 2:

             }
            }
        }while (option!=0);
    }

}
