public class Linked_List {

    private Node Head;
    private Node Tail;

    private int size;

    public Linked_List() {
        this.size = 0;
    }

    public void Insert_value_at_the_first(int value)
    {
     Node node = new Node(value);
     node.next = Head;
     Head = node;
     if(Tail == null) {
         Tail = Head;
     }
     size += 1;
    }

    public void insert_at_end(int value){
        Node node = new Node(value);
        if(Tail == null){
            Insert_value_at_the_first(value);
            return;
        }
        Tail.next = node;
        Tail = node;
        size++;
    }
    public void insert(int value,int index){
        if(index == 0){
            Insert_value_at_the_first(value);
        }
        if(index == size){
            insert_at_end(value);
        }
        if(index > size){
            System.out.println("Enter the limit of findex num");
        }
        Node temp = Head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }

    public void display(){
        Node temp = Head;
        while (temp != null)
        {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");

    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value,Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
