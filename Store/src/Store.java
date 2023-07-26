import java.util.ArrayList;


public class Store {

    record OrderItem(ProductForSale product, int quantity){

        public OrderItem(ProductForSale product, int quantity){
            
            this.product = product;
            this.quantity = quantity;
        }
        
    }
    public static void main(String[] args) throws Exception {
        
        ArrayList<ProductForSale> products = new ArrayList<>();
        ArrayList<OrderItem> order = new ArrayList<>();

        products.add(new Basketball());
        products.add(new Football());

        addItemToOrder(order, products.get(0), 3);

        System.out.println(order);

        printOrder(order);

    }

    public static void addItemToOrder(ArrayList<OrderItem> order, ProductForSale product, int quantity){

        order.add(new OrderItem(product, quantity));
    } 

    public static void printOrder(ArrayList<OrderItem> order){

        for(OrderItem item : order){

            item.product().printLineItem(item.quantity);

        }


    }
}
