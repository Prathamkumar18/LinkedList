
package DoublyLinkedList;
public class DoublyLinkedList {
    Node head;
    Node tail;
    int size;
    DoublyLinkedList(){
        this.size=size;
    }
    class Node{
        int value;
        Node prev;
        Node next;
        Node(int value){
            this.value=value;
        }
        Node(int value,Node prev,Node next){
            this.value=value;
            this.prev=prev;
            this.next=next;
        }
    }
    
    void insertfirst(int value){
        if(head==null){
            Node node=new Node(value);
            node.prev=null;
            node.next=null;
            head=node;
            if(tail==null){
                tail=head;
            }
        }
        else{
            Node node=new Node(value);
            node.prev=null;
            node.next=head;
            head.prev=node;
            head=node;
        }
        size++;
    }
    
    void insertlast(int value){
        if(head==null){
            insertfirst(value);
        }
        else{
        Node node=new Node(value);
        node.next=null;
        node.prev=tail;
        tail.next=node;
        tail=node;
        }
        size++;
    }
    
    void display(){
        if(head==null){
            System.out.println("empty");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.value+"->");
                temp=temp.next;
            }
            System.out.println("END");
        }
        }
         
        void insert(int value,int index){
            Node temp=head;
            for(int i=1;i<index;i++){
                temp=temp.next;
            }
            Node node=new Node(value);
            node.prev=temp;
            node.next=temp.next;
            temp.next=node;
            temp.next.prev=node;
            size++;
        }
        
        void deletefirst(){
            head.next.prev=null;
            head=head.next;
            size--;
        }
        void dellast(){
            tail.prev.next=null;
            tail=tail.prev;
            size--;
        }
        void del(int index){
            Node temp=head;
            for(int i=1;i<index;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.next.prev=temp;
            size--;
        }
        
        void search(int value){
            Node temp=head;
            for(int i=0;i<size;i++){
                if(temp.value==value){
                    System.out.println("element found at:"+i);
                    break;
                }
                else{
                    temp=temp.next;
                }
            }
        }
}
