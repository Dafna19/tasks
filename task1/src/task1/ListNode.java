package task1;

public class ListNode {
    int value;
    ListNode next;

    public ListNode() {
        next = null;
    }

    public void Insert(int newValue) {
        value = newValue;
    }

    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append(value + " ");
        ListNode p = next;
        while (p != null){
            string.append(p.value + " ");
            p = p.next;
        }
        return string.toString();
    }
}
