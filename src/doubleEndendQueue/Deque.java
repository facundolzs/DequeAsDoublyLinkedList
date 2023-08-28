package doubleEndendQueue;

public class Deque {

    private Node front;
    private Node rear;
    private int size;

    private class Node {

        private int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
        }

    }

    /**
     * Insert new node at front of linked list
     *
     * @param value (new value to add)
     */
    public void insertAtFront(int value) {

        Node newNode = new Node(value);

        if (front == null) {
            newNode.prev = null;
            newNode.next = null;
            front = rear = newNode;
        } else {
            newNode.prev = null;
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }

        System.out.println("Added (front): " + newNode.data);
        size++;
    }

    /**
     * Insert new node at rear of linked list
     *
     * @param value (new value to add)
     */
    public void insertAtRear(int value) {

        if (front == null) {
            insertAtRear(value);
            return;
        }

        Node newNode = new Node(value);

        newNode.prev = rear;
        newNode.next = null;
        rear.next = newNode;
        rear = newNode;

        System.out.println("Added (rear): " + newNode.data);
        size++;
    }

    /**
     * Delete from the front of linked list
     */
    public void deleteAtFront() {

        if (isEmpty()) {
            System.out.println("Deque is empty! Cannot delete nodes.");
            return;
        }

        Node tempNode = front;

        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            front.prev = null;
        }

        System.out.println("Deleted (front): " + tempNode.data);
        tempNode = null;
        size--;
    }

    /**
     * Delete from the rear of linked list
     */
    public void deleteAtRear() {

        if (isEmpty()) {
            System.out.println("Deque is empty! Cannot delete nodes.");
            return;
        }

        Node tempNode = rear;

        if (front == rear) {
            front = rear = null;
        } else {
            rear = rear.prev;
            rear.next = null;
        }
        System.out.println("Deleted (rear): " + tempNode.data);
        tempNode = null;

        size--;
    }

    /**
     * Returns the front node of the queue without removing it
     */
    public void peekFront() {

        if (front == null) {
            System.out.println("Cannot peek front node.");
        } else {
            System.out.println("Peek front node: " + front.data);
        }
    }

    /**
     * Returns the rear node of the queue without removing it
     */
    public void peekRear() {

        if (rear == null) {
            System.out.println("Cannot peek rear node.");
        } else {
            System.out.println("Peek rear node: " + rear.data);
        }
    }

    /**
     * Check if the deque is empty or not
     *
     * @return true if size is zero
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Get the size of the deque
     *
     * @return size value
     */
    public int getSize() {
        return size;
    }

    /**
     * Display the deque
     */
    public void print() {

        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return;
        }

        Node tempNode = front;

        while (tempNode != null) {
            System.out.print(tempNode.data + " <- ");
            tempNode = tempNode.next;
        }
        System.out.println("REAR");
    }

}
