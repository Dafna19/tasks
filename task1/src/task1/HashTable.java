package task1;

public class HashTable {
    public ListNode[] values;
    public int N;

    public HashTable(int n) {
        N = n;
        values = new ListNode[N];
    }

    public void Insert(int newValue) {
        ListNode p = values[newValue % N];
        if (p != null) {
            while (p.next != null) {
                p = p.next;
            }
            p.next = new ListNode();
            p.next.Insert(newValue);
        } else {
            values[newValue % N] = new ListNode();
            values[newValue % N].Insert(newValue);
        }
    }

    public void print() {
        for (int i = 0; i < values.length; i++) {
            if (values[i] != null)
                System.out.println(i + ": " + values[i].toString());
            else
                System.out.println(i + ": ");
        }
    }
}
