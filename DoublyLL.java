
public class DoublyLL {
    Node head;
    Node tail;
    int size=0;
    public void insertElement(int data){
        Node node = new Node(data);
        size++;
        if(head==null)
        {
            tail=node;
            head = node;
//            head.prev=null;
//            tail.next=null;
        }
        else{
            Node n =tail;
            n.next = node;
            node.prev= n;
            tail=node;
//            tail.next= null;
        }
    }

    public int delete(int index){
        int value=0;

        Node n = head;
        if(index==0){

            head= n.next;
            head.prev=null;
            value = n.data;
            n=null;

        }
        else if(index==size-1){
            Node m = tail;
            tail= m.prev;
            tail.next=null;

            value = m.data;
            m=null;
        }
        else{
            for(int i =0;i<index-1;i++){
                n= n.next;
            }
            Node temp1 = n.next;
            n.next=temp1.next;

            Node temp2 = temp1.next;
            temp2.prev= n;

            value=temp1.data;
            temp1=null;
            temp2 = null;
        }

        size--;
        return value;
    }

    public void show (){
        Node n= head;
        if(head==null)
        {
            System.out.println("List is Empty !!!");
        }
        else {
            while (n.next != null) {
                System.out.print(n.data + " ");
                n = n.next;
            }
        }
        System.out.println(n.data);
    }
    public void revshow(){
        Node n= tail;
        if(tail==null)
        {
            System.out.println("List is Empty!!!");
        }
        else {
            while (n.prev != null) {
                System.out.print(n.data + " ");
                n = n.prev;
            }
        }
        System.out.println(n.data);

    }
}
