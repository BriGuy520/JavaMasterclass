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
        addItemToOrder(order, products.get(1), 2);


        System.out.println(order);

        printOrder(order);

    }

    public static void addItemToOrder(ArrayList<OrderItem> order, ProductForSale product, int quantity){

        order.add(new OrderItem(product, quantity));
    } 

    public static void printOrder(ArrayList<OrderItem> order){

        double total = 0;

        System.out.printf("Item        Quantity     Price     Total%n%n");

        for(OrderItem item : order){

            item.product.printLineItem(item.quantity);

            total += item.product.getSalesPrice(item.quantity);

        }

        System.out.println("=".repeat(40));

        System.out.printf("Final Total                   %.2f", total);




    }
}
