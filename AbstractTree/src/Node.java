public class Node extends ListItem {

    public Node(Object value){
        super(value);
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

     int passedInValue = (int) item.value;
     int calledValue = (int) this.value;


      if(passedInValue > calledValue){
        return 1;
      } else if(passedInValue == calledValue) {
        return 0;
      } else {
        return -1;
      }
    }
}
