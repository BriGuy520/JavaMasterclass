public abstract class ProductForSale {
    
    protected String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description){
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity){
        return price * quantity;
    }

    public void printLineItem(int quantity){
        System.out.printf("%s %.2f %d", type, price, quantity);
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }

    public abstract void showDetails();

}
