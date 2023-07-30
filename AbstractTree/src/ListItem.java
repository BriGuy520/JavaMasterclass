public abstract class ListItem {

    protected ListItem leftLink;
    protected ListItem rightLink;
    protected Object value;

    public ListItem(Object value){
        this.value = value;
    }

    abstract ListItem next();

    abstract ListItem setNext(ListItem rightLink);

    abstract ListItem previous();

    abstract ListItem setPrevious(ListItem leftLink);

    abstract void compareTo(ListItem value);

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }

}
