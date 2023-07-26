public class Football extends ProductForSale {

    public Football(){
        super("Football", 44.99, "an odd shaped ball made of pigskin");
    }

    @Override 
    public void showDetails(){
        System.out.printf("%s is a %s that costs %.2f", type, getDescription(), getPrice());
    }
}

