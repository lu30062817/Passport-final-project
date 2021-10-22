
public class ValidationContext {
    private ValidationStrategy strategy;

    public ValidationContext(ValidationStrategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(){
        strategy.isValidated();
    }
}