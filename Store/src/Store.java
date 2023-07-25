import java.util.ArrayList;

public class Store {
    public static void main(String[] args) throws Exception {
        
        ArrayList<OrderItem> order = new ArrayList<>();
        ProductForSale basketball = new Basketball();
        order.add(new OrderItem(new Basketball(), 4));

        basketball.showDetails();


    }
}
