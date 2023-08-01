public class Main {
    public static void main(String[] args) throws Exception {

        MyLinkedList list1 = new MyLinkedList(new Node(10));

        list1.addItem(new Node(11));
        list1.addItem(new Node(8));
        list1.addItem(new Node(11));
        list1.addItem(new Node(32));

        list1.traverse();

        list1.removeItem(new Node(11));

        list1.traverse();
        System.out.println();
        list1.reverseTraverse();


        SearchTree tree1 = new SearchTree(new Node(30));

        tree1.addItem(new Node(39));
    }
}
