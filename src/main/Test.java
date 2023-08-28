package main;

import doubleEndendQueue.Deque;

public class Test {

    public static void main(String[] args) {

        Deque myDeque = new Deque();

        System.out.println("Nodes in deque: " + myDeque.getSize());
        myDeque.peekFront();
        myDeque.peekRear();
        System.out.println("Deque is empty? " + myDeque.isEmpty());

        System.out.println();

        myDeque.insertAtFront(9);
        myDeque.insertAtRear(4);
        myDeque.insertAtRear(15);
        myDeque.insertAtFront(12);
        myDeque.print();

        System.out.println("\nNodes in deque: " + myDeque.getSize());
        System.out.println("Deque is empty? " + myDeque.isEmpty());
        myDeque.peekFront();
        myDeque.peekRear();
        System.out.println();

        myDeque.deleteAtFront();
        myDeque.deleteAtRear();
        myDeque.print();

        System.out.println("\nNodes in deque: " + myDeque.getSize());
        myDeque.peekFront();
        myDeque.peekRear();
        System.out.println();

        myDeque.insertAtRear(20);
        myDeque.print();

        myDeque.insertAtFront(11);
        myDeque.print();

        System.out.println("\nNodes in deque: " + myDeque.getSize());
        myDeque.peekFront();
        myDeque.peekRear();
        System.out.println();

        myDeque.deleteAtFront();
        myDeque.deleteAtFront();
        myDeque.deleteAtRear();
        myDeque.print();

        System.out.println("\nNodes in deque: " + myDeque.getSize());
        myDeque.peekFront();
        myDeque.peekRear();
        System.out.println("Deque is empty? " + myDeque.isEmpty());

        System.out.println();
        
        myDeque.deleteAtFront();
        myDeque.print();

        System.out.println("\nNodes in deque: " + myDeque.getSize());
        myDeque.peekFront();
        myDeque.peekRear();
        System.out.println("Deque is empty? " + myDeque.isEmpty());

    }

}
