import java.util.Random;

public class OverseasIndian extends Template{
    @Override
    public void prepareDocuments() {
        System.out.println("Read embassy requirement document for passport validation");
        System.out.println("Collect required document");

    }

    @Override
    void commute() {
        System.out.println("Take taxi to embassy");
    }

    @Override
    void verify() {
        System.out.println("Visiting Indian Embassy");


        Random rand = new Random();
        int rand_int1 = rand.nextInt(10);

        if(rand_int1<5){
            System.out.println("Congratulations! Your passport is validated");
        }else if(rand_int1>5){
            System.out.println("Your documents are invalid");
        }
    }
}
