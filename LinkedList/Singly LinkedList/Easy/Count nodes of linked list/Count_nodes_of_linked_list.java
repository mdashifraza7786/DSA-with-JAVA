class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}
class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        
       Node temp = head;
       
       int size = 0;
       
       while(temp!=null){
           size++;
           temp = temp.next;
       }
       return size;
    }
}