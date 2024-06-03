
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}

class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
       Node newNode = new Node(x);
       
       newNode.next = head;
       return newNode;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
       Node newNode = new Node(x);
       
       if(head == null){
           return newNode;
       }
       
       Node current = head;
       while(current.next!=null){
           current = current.next;
       }
       current.next = newNode;
       return head;
    }
}



