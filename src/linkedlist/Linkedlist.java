
package linkedlist;
public class Linkedlist {
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
        Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    Node head;
    Node tail;
    int size;
    Linkedlist(){
        this.size=0;
    }
    
    void insertfirst(int value){
        if(head==null){
            Node node=new Node(value);
            node.next=null;
            head=node;
            size++;
            if(tail==null){
                tail=head;
            }
        }
        else{
            Node node=new Node(value);
            node.next=head;
            head=node;
            size++;
        }
    }
    int displayr(){
        Node temp=head;
        if(temp.next==null){
            return temp.value;
        }
        else{
            temp=temp.next;
            return displayr();
        }
    }
    
    void display(){
        if(head==null){
            System.out.println("empty");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.value+" -> ");
                temp=temp.next;
            }
            System.out.println("END");
        }
    }
    
    void insertlast(int value){
        if(tail==null){
            insertfirst(value);
        }
        else{
            Node node=new Node(value);
            tail.next=node;
            tail=node;
            node.next=null;
            size++; 
        }
    }
    
    void insert(int value,int index){
        if(index==0){
            insertfirst(value);
        }
        else if(index==size-1){
            insertlast(value);
        }
        else{
            Node temp=head;
            for(int i=1;i<index;i++){
                temp=temp.next;
            }
            Node node=new Node(value);
            node.next=temp.next;
            temp.next=node;
        }
        size++;
    }
    
    void delfirst(){
        if(head==null){
            System.out.println("empty");
        }
        else if(head==tail){
            head=null;
        }
        else{
            head=head.next;
        }
        size--;
    }
    
    void dellast(){
        if(tail==null){
            delfirst();
        }
        else{
        Node temp=head;
        for(int i=1;i<size-1;i++){
            temp=temp.next;
        }
        tail=temp;
        temp.next=null;
        }
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
                System.out.println("element found at:"+i);
                break;
            }
            else{
            temp=temp.next;
            }
        }
        
    }
    
    
}
