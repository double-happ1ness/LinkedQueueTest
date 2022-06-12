
public class LinkedQueue implements QueueADT {

    private class QueueNode {
        private Object object;
        private QueueNode next;
    }
    private QueueNode head;
    private QueueNode tail;

    public String toString() {
        /* algorithm
            set up a string to contain the queue details
            if queue is not empty then
                set current to the head node
                do
                    add the current object to the string
                    set current to the next node
                while node available
            else
                add empty queue message to the string
            end if
         */
        String queueDetails = new String();
        // add code here
        
        return queueDetails;
    }

    public void enqueue(Object object) {
        /* algorithm
            create new queue node
            copy object to new node's object
            if queue is empty then
                set the head and tail to refer to the new node
            else
                set the next node of the tail to refer to the new node
                set the tail to refer to the next node
            end if
         */
        // add code here
        
    }

    public Object dequeue() throws QueueEmptyException{
        /* algorithm
            if queue is empty then
                throw queue empty exception
            end if
            save the object at the head node
            save the node being removed // the head node
            set the head node to refer to the next node
            if queue is empty then
                set the tail node to null
            end if
            delete the removed node object
            set the removed node next to null
        */
        // add code here
        return null;
    }

}
