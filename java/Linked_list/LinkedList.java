public class ListNode<V> {
    //value
    V value;
    ListNode prev;
    ListNode next;
    //method
    public ListNode(int val){
        value=val;
        prev=null;
        next=null;

    }
    public ListNode(){
        this(0);

    }


    
}
public class LinkedList<E>{
    private ListNode<E> head;
    private ListNode<E> tail;
    private int size;
    public LinkedList(){
        head=null;
        tail=null;
        size=0;
    }
    public E getVal(int index){
        if(head==null||index<0||index>size-1) return null;
        ListNode<E> cur=head;
        while (index>0){
            cur=cur.next;
            index--;
        }


    }
    public void addHead(E num){
        
        ListNode<E> dummy=new ListNode(num);
        if (tail==null){
            head=dummy;
        } else{
            dummy.next=head;
            head.prev=dummy;


        }
        head=dummy;
        size++;
    }
    public void addTail(E num){
        ListNode<E> dummy=new ListNode(num);
        if(tail==null){
            head=dummy;
        }
        else{
            tail.next=dummy;
            dummy.prev=tail;
        }
        tail=dummy;
        size++;
    }
}
