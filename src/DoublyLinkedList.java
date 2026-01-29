public class DoublyLinkedList {
    
    private Node head, tail;

    public DoublyLinkedList() {
        this.head = this.tail = null;
    }

    /**
     * Adds a node at the end of the list
     * @param newNode new node to be added
     */
    public void add(Node newNode) {
        if (head == null && tail == null) {
            head = tail = newNode;
        }
        else {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
    }


    // wrapper
    private Node getRec(Node cursor, int index) {

        if (index == 0)
            return cursor;

        return getRec(cursor.getNext(), index-1);
    }

    /**
     * Gets the element in the specified position
     * @param index position to read
     * @return the element identified by the index
     * @throws IndexOutOfBoundsException
     */
    public Node get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException("Invalid index");

        return getRec(head, index);
    }

    // ------------ INSERT YOUR CODE HERE ----------------
//QUA INIZIA PRINT
    public void print(boolean forward) {
        if(forward){
            Node cursor = head;
            while (cursor != null){
                System.out.print(cursor.getData());
                cursor = cursor.getNext();
            }
        }else{
            Node cursor = tail;
            while(cursor != null){
                System.out.print(cursor.getData());
                cursor = cursor.getPrev();
            }
        }
        System.out.println();
    }
    
//QUA INIZIA SIZE
    public int size() {
        int count = 0;
        Node cursor = head;
        while(cursor != null){
            count++;
            cursor = cursor.getNext();
        }
        return count;
    }

//QUA INIZIA MERGE
    public void merge(DoublyLinkedList otherList) {
        if(otherList.head == null){
           return; 
        }

        if(this.head == null) {
            this.head = otherList.head;
            this.tail = otherList.tail;
        }else{
            this.tail.setNext(otherList.head);
            otherList.head.setPrev(this.tail);
            this.tail = otherList.tail;

    }


    public String slice(int start, int end) {
        Node cursor = head;

        int count = 0;
        return null;
    }

    // I'm recursive!
    public boolean palindrome() {

        return false;
    }

    public void shift(int amount) {
        if (head == null || amount <= 0){
            return;
        }

        Node cursor = head;
        int count = 0;
        while(cursor != null){
            cursor = cursor.getNext();
            count++;
        }
        if(cursor == null) return;

        int n = size();
        amount = amount % n;


      
    }

    public void trim(int newSize) {

    }
}
