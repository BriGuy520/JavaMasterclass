public class MyLinkedList implements NodeList {

    private ListItem root;

    public MyLinkedList(ListItem root){
        this.root = root;
    }

    @Override
    public ListItem getRoot(){
        return root;
    }

    @Override
    public boolean addItem(ListItem item){

        ListItem current = this.getRoot();


        while(current.next() != null){

            if(current.value == item.value) return false;
            
            current = current.next();
        }

        if(current.value == item.value) return false;

        current.setNext(item);

        return true;
    }

    @Override
    public boolean removeItem(ListItem item){
        return true;
    }

    @Override
    public void traverse(){

        ListItem current = this.getRoot();
        
     
        while(current.rightLink != null){
            
            System.out.printf("%d -> ", current.value);
            
            current = current.next();
        }

        System.out.printf("%d %n", current.value);
    
    }
}
