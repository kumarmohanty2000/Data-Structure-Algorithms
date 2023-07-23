public class Main {
    public static void main(String[] args) {

       Linked_List ll = new Linked_List();

       ll.Insert_value_at_the_first(13);
       ll.Insert_value_at_the_first(12);
       ll.Insert_value_at_the_first(14);
       ll.Insert_value_at_the_first(124);

       ll.insert_at_end(134);
       ll.insert_at_end(100);

       ll.insert(200,4);

       ll.display();
    }
}