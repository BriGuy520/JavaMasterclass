public class Node extends ListItem {

    public Node(Object value){
        super(value);
    }
    
    @Override 
    public ListItem next(){
        return rightLink;
    }

    @Override
    public ListItem setNext(ListItem rightLink){
        return rightLink;
    }

    @Override
    public ListItem previous(){
        return leftLink;
    }

    @Override
    public ListItem setPrevious(ListItem leftLink){
        return leftLink;
    }

    @Override
    public void compareTo(ListItem item){

    }
}
