package LinkedList;

public class ReverseList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        // test reverseList
        // add multiple nodes to test
        ListNode head = new ListNode(7);
        head.next = new ListNode(14);
        head.next.next = new ListNode(21);
        head.next.next.next = new ListNode(28);
        ListNode curr = head;


        System.out.println(reverseList(head).val);
        while(curr!=null){
        System.out.println(curr.next.val);
        curr = curr.next;
        }
    }

}
