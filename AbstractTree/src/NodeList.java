interface NodeList {

    ListItem getRoot();
    
    ListItem getTail();

    boolean addItem(ListItem item);

    boolean removeItem(ListItem item);

    void traverse();

    void reverseTraverse();
    
}
