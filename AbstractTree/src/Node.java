public class Node extends ListItem {

    public Node(Object value){
        super(value, null, null);
    }
    
    @Override 
    public ListItem next(){
        return rightLink;
    }

    @Override
    public boolean setNext(ListItem item){

        this.rightLink = item;

        return true;
    }

    @Override
    public ListItem previous(){
        return leftLink;
    }

    @Override
    public ListItem setPrevious(ListItem item){
        this.leftLink = item;
        return leftLink;
    }

    @Override
    public int compareTo(ListItem item){

        if(this.value == item.value){
            return 0;
        } else {
            return -1;
        }
    }
}
