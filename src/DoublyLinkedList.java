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

    public void print(boolean forward) {

    }

    public int size() {

        return 0;
    }

    public void merge(DoublyLinkedList otherList) {

    }

    public String slice(int start, int end) {

        return null;
    }

    // I'm recursive!
    public boolean palindrome() {

        return false;
    }

    public void shift(int amount) {

    }

    public void trim(int newSize) {

    }
}
