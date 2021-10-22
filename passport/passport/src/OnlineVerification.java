import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OnlineVerification extends VerificationStrategy{
    @Override
    public void isVerified() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your passport number : ");
        String passIn=input.nextLine();

        if(isValidPassportNo(passIn)){
            boolean isAvailable = false;
            for (int i=0;i<Test.dummyPassportsdatabase.size();i++) {
                if(passIn.equals(Test.dummyPassportsdatabase.get(i).getPassportNo())){
                    isAvailable=true;
                    break;
                }
            }
            if(isAvailable){
                System.out.println("Congratulations! Your passport is verified");
                nextAction();
            }else {
                System.out.println("Your passport is invalid");
            }


        }else{
            System.out.println("Your passport is invalid");
            System.out.println("Please visit passport office");
        }

    }

    public static boolean isValidPassportNo(String str)
    {
        String regex = "^[A-PR-WYa-pr-wy][1-9]\\d" + "\\s?\\d{4}[1-9]$";
        Pattern p = Pattern.compile(regex);

        if (str == null) {
            return false;
        }
        Matcher m = p.matcher(str);
        return m.matches();
    }
}
