import java.util.Scanner;

public abstract class VerificationStrategy {
    public abstract void isVerified();

    public void nextAction(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nSelect from following");
        System.out.println("1.I am Indian resident");
        System.out.println("2.I am Overseas Indian");
        System.out.print("Choice: ");
        int choice = input.nextInt();
        if (choice ==1){
           Template indianResident=new IndianResident();
           indianResident.validationProcess();

        }else if (choice ==2){
           Template overseasIndian=new OverseasIndian();
           overseasIndian.validationProcess();
        }else {
            System.out.println("Invalid input");

        }



    }

//    public void nextAction(){
//        Scanner input = new Scanner(System.in);
//        System.out.println("\nSelect from following for passport validation");
//        System.out.println("1.Visit police station");
//        System.out.println("2.Wait for police call");
//        System.out.print("Choice: ");
//        int choice = input.nextInt();
//        if (choice ==1){
//           ValidationContext visitPoliceStationContext = new ValidationContext(new VisitPoliceStation());
//            visitPoliceStationContext.executeStrategy();
//
//        }else if (choice ==2){
//            ValidationContext waitForPoliceCallContext = new ValidationContext(new WaitForPoliceCall());
//            waitForPoliceCallContext.executeStrategy();
//        }else {
//            System.out.println("Invalid input");
//
//        }
//
//
//
//    }
}
