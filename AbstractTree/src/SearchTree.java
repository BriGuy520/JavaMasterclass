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

        ListItem current = this.getRoot();

        while(current != null){

            int currentCompare = current.compareTo(item);

            if(currentCompare == 1){

                if(current.next() == null){
                    current.setNext(item);
                } else {
                    current = current.next();
                }

            } else if(currentCompare == -1){

                if(current.previous() == null){
                    current.setPrevious(item);
                } else {
                    current = current.previous();
                }

            } else {

                return false;
            }


        }


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
