import java.util.Scanner;

public class IndianResident extends Template{
    @Override
    void prepareDocuments() {

        System.out.println("Collect required document");

    }

    @Override
    void commute() {
        System.out.println();
    }

    @Override
    void verify() {
//        System.out.println("Get the document verified");
        Scanner input = new Scanner(System.in);
        System.out.println("\nSelect from following for passport validation");
        System.out.println("1.Visit police station");
        System.out.println("2.Wait for police call");
        System.out.print("Choice: ");
        int choice = input.nextInt();
        if (choice ==1){
            ValidationContext visitPoliceStationContext = new ValidationContext(new VisitPoliceStation());
            visitPoliceStationContext.executeStrategy();

        }else if (choice ==2){
            ValidationContext waitForPoliceCallContext = new ValidationContext(new WaitForPoliceCall());
            waitForPoliceCallContext.executeStrategy();
        }else {
            System.out.println("Invalid input");

        }
    }
}
