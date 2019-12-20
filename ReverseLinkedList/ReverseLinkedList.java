public class ReverseLinkedList 
{
    private static LinkedList data;

    public static void main(String[] args)
    {
        data = new LinkedList();
        data.insertOne(1);
        data.insertOne(2);
        data.insertOne(3);
        data.insertOne(4);
        data.insertOne(5);

        data.printList();
        data.setTail(ReverseList(data.getHead()));
        data.printList();
    }

    public static ListNode ReverseList(ListNode list)
    {
        if(list == null) 
        {
            return null;
        }

        ListNode x = list;
        ListNode xs = list.getNext();

        x.setNext(null);

        ListNode elem = ReverseList(xs);

        if(elem == null)
        {
            data.setHead(x);
            return x;
        }
        else
        {
            elem.setNext(x);
        }

        if(elem.getNext() != null)
        {
            return elem.getNext();
        }

        return elem;
    }
}