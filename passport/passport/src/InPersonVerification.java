import java.util.Random;

public class InPersonVerification extends VerificationStrategy{
    @Override
    public void isVerified() {
        System.out.println("\nWaiting for turn");
        System.out.println("Handing over passport");
        System.out.println("Details are being checked by officer");

        Random rand = new Random();
        int rand_int1 = rand.nextInt(10);

        if(rand_int1<5){
            System.out.println("Congratulations! Your passport is verified");
            nextAction();


        }else if(rand_int1>5){
            System.out.println("Your passport is expired");
        }

    }
}
