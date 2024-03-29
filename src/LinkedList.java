public class LinkedList<E> {
    Node<E> head, tail;
    int size;

    void add(E num) {
        Node<E> n = new Node<>(num);
        if (tail != null) {
            tail.next = n;
        } else {
            head = n;
        }
        tail = n;
        size++;
    }

    E set(E num, int pos) {
        if (pos <= 0 || pos > size) {
            throw new IllegalArgumentException();
        }
        int ctr = 1;
        Node<E> curr = head;
        while (ctr++ < pos) {
            curr = curr.next;
        }
        E orig = curr.elem;
        curr.elem = num;
        return orig;
    }
}
