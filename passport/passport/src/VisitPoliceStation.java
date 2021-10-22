import java.util.Random;

public class VisitPoliceStation implements ValidationStrategy{
    @Override
    public void isValidated() {
        System.out.println("Visiting police station");


        Random rand = new Random();
        int rand_int1 = rand.nextInt(10);

        if(rand_int1<5){
            System.out.println("Congratulations! Your passport is validated");
        }else if(rand_int1>5){
            System.out.println("Your documents are invalid");
        }

    }
}
