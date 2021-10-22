public class VerificationContext {
    private VerificationStrategy strategy;

    public VerificationContext(VerificationStrategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(){
        strategy.isVerified();
    }
}