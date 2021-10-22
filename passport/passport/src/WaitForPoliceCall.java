import java.util.Random;

public class WaitForPoliceCall implements ValidationStrategy{
    @Override
    public void isValidated() {

        Random rand = new Random();
        int rand_int1 = rand.nextInt(10);

        if(rand_int1<5){
            System.out.println("Visit police station with documents on Monday");
        }else if(rand_int1>5){
            System.out.println("Visit police station with documents on Thursday");
        }
    }
}
