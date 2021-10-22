public abstract class Template {
    abstract void prepareDocuments();
    abstract void commute();
    abstract void verify();

    public void validationProcess(){
        prepareDocuments();
        commute();
        verify();
    }

}
