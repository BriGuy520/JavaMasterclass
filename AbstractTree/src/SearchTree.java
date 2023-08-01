public class SearchTree implements NodeList {

    private ListItem root;

    public SearchTree(ListItem root){
        this.root = root;
    }

    private void performRemoval(){

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
    public void traverse(){
    
    }
    
}
