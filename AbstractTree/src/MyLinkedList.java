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
        return true;

    }

    @Override
    public boolean removeItem(ListItem item){
        return true;
    }

    @Override
    public void traverse(ListItem root){
    
    }
}
