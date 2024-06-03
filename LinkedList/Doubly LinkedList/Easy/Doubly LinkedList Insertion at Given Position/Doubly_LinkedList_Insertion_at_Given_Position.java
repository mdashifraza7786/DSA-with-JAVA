class GfG {
    // Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data) {
        Node temp = head_ref;
        // Create a new node with the given data
        Node newNode = new Node(data);
        
        // Traverse the list to find the position
        int i = 0;
        while (temp != null && i < pos) {
            temp = temp.next;
            i++;
        }
        
        // If position is out of bounds, do nothing
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        
        // Adjust pointers to insert the new node
        newNode.next = temp.next;
        if (temp.next != null)
            temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
    }
}