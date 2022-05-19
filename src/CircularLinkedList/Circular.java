
package CircularLinkedList;

public class Circular {
    Node head;
    Node tail;
    int size;
    Circular(){
        this.size=0;
    }
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    
    void insertfirst(int value){
        if(head==null){
            Node node=new Node(value);
            head=node;
            node.next=head;
            tail=node;
        }
        else{
            Node node=new Node(value);
            node.next=head;
            head=node;
            tail.next=head;
        }
        size++;
    }
    void display(){
        Node temp=head;
        do{
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("END");
    }
    
    void insertlast(int value){
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        tail.next=head;
        size++;
        }
    
    void insert(int value,int index){
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(value);
        node.next=temp.next;
        temp.next=node;
        size++;
    }
    
    void delfirst(){
        head=head.next;
        tail.next=head;
        size--;
    }
    void dellast(){
        Node temp=head;
        for(int i=1;i<size-1;i++){
            temp=temp.next;
        }
        tail=temp;
        tail.next=head;
        size--;
    }
    void del(int index){
         Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
    
    void search(int value){
        Node temp=head;
        for(int i=0;i<size;i++){
            if(temp.value==value){
                System.out.println("Found at index:"+i);
            }
            else{
                temp=temp.next;
            }
            }
    }
}
