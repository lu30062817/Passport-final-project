import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static ArrayList<Passport> dummyPassportsdatabase = new ArrayList<Passport>();

    public static void main(String[] args) {

        //Dummy passports
//        Passport p1=new Passport("A123","Akshita","456712340094");
//        Passport p2=new Passport("A433","Ishaan","458732140094");
//        Passport p3=new Passport("A021","Ananya","452715340994");
//        Passport p4=new Passport("A428","Nikhil","456712343494");
//        Passport p5=new Passport("A325","Varun","456712348794");
//        Passport p6=new Passport("M723","Aditi","432712354094");
        Passport p1=new Passport("A22 18457","Akshita","456712340094");
        Passport p2=new Passport("A23 27757","Ishaan","458732140094");
        Passport p3=new Passport("A24 34537","Ananya","452715340994");
        Passport p4=new Passport("A25 42267","Nikhil","456712343494");
        Passport p5=new Passport("A26 52457","Varun","456712348794");
        Passport p6=new Passport("A28 70447","Aditi","432712354094");

        dummyPassportsdatabase.add(p1);
        dummyPassportsdatabase.add(p2);
        dummyPassportsdatabase.add(p3);
        dummyPassportsdatabase.add(p4);
        dummyPassportsdatabase.add(p5);
        dummyPassportsdatabase.add(p6);

        System.out.println("Hidden Passport database");
        System.out.println("-------------------------------------------------------------------------------------------");
        for (int i = 0; i < dummyPassportsdatabase.size(); i++) {
            System.out.println(dummyPassportsdatabase.get(i));
        }
        System.out.println("#########################################################################################");



        Scanner input =new Scanner(System.in);
        System.out.println("\nPassport Menu");
        System.out.println("-------------------");

        System.out.println("1. Online verification");
        System.out.println("2. In person verification");
        System.out.print("Choice : ");
        int choice = input.nextInt();
        if(choice == 1){
            VerificationContext onlineVerificationContext = new VerificationContext(new OnlineVerification());
            onlineVerificationContext.executeStrategy();
        }else if(choice == 2){
            VerificationContext inPersonVerificationContext = new VerificationContext(new InPersonVerification());
            inPersonVerificationContext.executeStrategy();
        }else {
            System.out.print("Invalid choice");

        }







    }
}
