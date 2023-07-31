public abstract class ListItem {

    protected ListItem leftLink = null;
    protected ListItem rightLink = null;
    protected Object value;

    public ListItem(Object value){
        this.value = value;
    }

    abstract ListItem next();

    abstract boolean setNext(ListItem rightLink);

    abstract ListItem previous();

    abstract ListItem setPrevious(ListItem leftLink);

    abstract int compareTo(ListItem value);

    public Object getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

}
