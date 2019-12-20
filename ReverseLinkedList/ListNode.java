public class ListNode {
    private ListNode next;
    private int data;

    public ListNode()
    {
        next = null;
    }

    public ListNode(int _data)
    {
        next = null;
        data = _data;
    }

    public void setNext(ListNode _next)
    {
        next = _next;
    }

    public void setData(int _data)
    {
        data = _data;
    }

    public ListNode getNext()
    {
        return this.next;
    }

    public int getData()
    {
        return this.data;
    }
}