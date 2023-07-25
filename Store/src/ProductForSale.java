public abstract class ProductForSale {
    
    protected String type;
    private double price;
    private String description;

    public double getSalesPrice(int quantity){
        return price * quantity;
    }

    public void printLineItem(int quantity){
        
    }

}
