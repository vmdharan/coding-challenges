public class LinkedList {
    private ListNode head;
    private ListNode tail;

    public LinkedList()
    {
        head = null;
        tail = null;
    }

    public void insertOne(int n)
    {
        ListNode node = new ListNode();
        node.setData(n);
        node.setNext(null);

        if(head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }

    public void setHead(ListNode _head)
    {
        head = _head;
    }

    public void setTail(ListNode _tail)
    {
        tail = _tail;
    }

    public ListNode getHead()
    {
        return this.head;
    }

    public ListNode getTail()
    {
        return this.tail;
    }

    public void printList()
    {
        int i=0;
        ListNode node = new ListNode();
        node = head;
        while(node != null)
        {
            if(i > 0)
            {
                System.out.print(", ");
            }
            System.out.print(node.getData());
            node = node.getNext();
            
            i++;
        }

        System.out.println("");
    }
}