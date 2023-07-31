public abstract class ListItem {

    protected ListItem leftLink;
    protected ListItem rightLink;
    protected Object value;

    public ListItem(Object value, ListItem leftLink, ListItem rightLink){
        this.value = value;
        this.leftLink = null;
        this.rightLink = null;
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
