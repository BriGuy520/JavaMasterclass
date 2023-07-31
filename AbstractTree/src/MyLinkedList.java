public class MyLinkedList implements NodeList {

    private ListItem root;
    private ListItem tail;

    public MyLinkedList(ListItem root){
        this.root = root;
    }

    @Override
    public ListItem getRoot(){
        return root;
    }

    @Override 
    public ListItem getTail(){
        return tail;
    }

    public void setTail(ListItem tail){
        this.tail = tail;
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
        item.setPrevious(current);
        this.setTail(item);

        return true;
    }

    @Override
    public boolean removeItem(ListItem item){

        ListItem current = this.getRoot();

        while(current.value != item.value && current.value != null){

            current = current.next();
        }

        if(current.value != null){
            current.previous().setNext(current.next());
            current.next().setPrevious(current.previous());
        }

        return true;
    }

    @Override
    public void traverse(){

        ListItem current = this.getRoot();
        
     
        while(current.next() != null){
            
            System.out.printf("%d -> ", current.value);
            
            current = current.next();
        }

        System.out.printf("%d %n", current.value);
    
    }

    @Override
    public void reverseTraverse(){

        ListItem current = this.getTail();
     
        while(current.previous() != null){
            
            System.out.printf("%d -> ", current.value);
            
            current = current.previous();
        }

        System.out.printf("%d %n", current.value);
    
    }
}
