public class Basketball extends ProductForSale {

    public Basketball(){
        super("Basketball", 24.99, "an orange round ball");
    }

    @Override 
    public void showDetails(){
        System.out.printf("%s is a %s that costs %.2f", type, getDescription(), getPrice());
    }
}
